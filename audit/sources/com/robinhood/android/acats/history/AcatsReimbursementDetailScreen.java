package com.robinhood.android.acats.history;

import acats_aggregation.service.p001v1.FeeReimbursementsHistoryDetailRowDto;
import acats_aggregation.service.p001v1.FeeReimbursementsHistoryDetailsResponseDto;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.robinhood.android.acats.history.AcatsReimbursementDetailScreen;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.utils.datetime.format.InstantFormatter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.i18n.ErrorBundle;
import p479j$.time.Instant;

/* compiled from: AcatsReimbursementDetailScreen.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\r\u001a)\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"ReimbursementLoadingTag", "", "ReimbursementBackTag", "AcatsReimbursementDetailScreen", "", "state", "Lcom/robinhood/android/acats/history/AcatsReimbursementDetailViewState;", "onBackPressed", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/acats/history/AcatsReimbursementDetailViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadingState", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "LoadedState", ErrorBundle.DETAIL_ENTRY, "Lacats_aggregation/service/v1/FeeReimbursementsHistoryDetailsResponseDto;", "completionDate", "(Lacats_aggregation/service/v1/FeeReimbursementsHistoryDetailsResponseDto;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-acats-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsReimbursementDetailScreen {
    public static final String ReimbursementBackTag = "reimbursement-back";
    public static final String ReimbursementLoadingTag = "reimbursement-loading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsReimbursementDetailScreen$lambda$1(AcatsReimbursementDetailViewState acatsReimbursementDetailViewState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AcatsReimbursementDetailScreen(acatsReimbursementDetailViewState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedState$lambda$7(FeeReimbursementsHistoryDetailsResponseDto feeReimbursementsHistoryDetailsResponseDto, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadedState(feeReimbursementsHistoryDetailsResponseDto, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingState$lambda$2(Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadingState(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AcatsReimbursementDetailScreen(final AcatsReimbursementDetailViewState state, final Function0<Unit> onBackPressed, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SystemUiController systemUiControllerRememberSystemUiController;
        long jM21371getBg0d7_KjU;
        boolean zChanged;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(1577205994);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1577205994, i3, -1, "com.robinhood.android.acats.history.AcatsReimbursementDetailScreen (AcatsReimbursementDetailScreen.kt:34)");
                }
                systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new AcatsReimbursementDetailScreen2(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                int i6 = ((i3 >> 6) & 14) | 805306416;
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(-954441554, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt.AcatsReimbursementDetailScreen.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-954441554, i7, -1, "com.robinhood.android.acats.history.AcatsReimbursementDetailScreen.<anonymous> (AcatsReimbursementDetailScreen.kt:45)");
                        }
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(AcatsReimbursementDetailScreen4.INSTANCE.m10629getLambda$1182543397$feature_acats_history_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-150888913, true, new AnonymousClass1(onBackPressed), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AcatsReimbursementDetailScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt$AcatsReimbursementDetailScreen$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $onBackPressed;

                        AnonymousClass1(Function0<Unit> function0) {
                            this.$onBackPressed = function0;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                            invoke(bentoAppBarScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 6) == 0) {
                                i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-150888913, i, -1, "com.robinhood.android.acats.history.AcatsReimbursementDetailScreen.<anonymous>.<anonymous> (AcatsReimbursementDetailScreen.kt:48)");
                            }
                            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, AcatsReimbursementDetailScreen.ReimbursementBackTag);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$onBackPressed);
                            final Function0<Unit> function0 = this.$onBackPressed;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt$AcatsReimbursementDetailScreen$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AcatsReimbursementDetailScreen.C74222.AnonymousClass1.invoke$lambda$1$lambda$0(function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(modifierTestTag, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | 6 | ((i << 12) & 57344), 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(135565753, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt.AcatsReimbursementDetailScreen.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i7 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(135565753, i7, -1, "com.robinhood.android.acats.history.AcatsReimbursementDetailScreen.<anonymous> (AcatsReimbursementDetailScreen.kt:57)");
                        }
                        FeeReimbursementsHistoryDetailsResponseDto reimbursementDetails = state.getReimbursementDetails();
                        if (reimbursementDetails == null) {
                            composer3.startReplaceGroup(1429672913);
                            AcatsReimbursementDetailScreen.LoadingState(PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(1429675550);
                            Instant completionDate = state.getCompletionDate();
                            AcatsReimbursementDetailScreen.LoadedState(reimbursementDetails, completionDate != null ? InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) completionDate) : null, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i6, 444);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AcatsReimbursementDetailScreen.AcatsReimbursementDetailScreen$lambda$1(state, onBackPressed, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            jM21371getBg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU();
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = new AcatsReimbursementDetailScreen2(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
                int i62 = ((i3 >> 6) & 14) | 805306416;
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(-954441554, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt.AcatsReimbursementDetailScreen.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-954441554, i7, -1, "com.robinhood.android.acats.history.AcatsReimbursementDetailScreen.<anonymous> (AcatsReimbursementDetailScreen.kt:45)");
                        }
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(AcatsReimbursementDetailScreen4.INSTANCE.m10629getLambda$1182543397$feature_acats_history_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-150888913, true, new AnonymousClass1(onBackPressed), composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AcatsReimbursementDetailScreen.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt$AcatsReimbursementDetailScreen$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                        final /* synthetic */ Function0<Unit> $onBackPressed;

                        AnonymousClass1(Function0<Unit> function0) {
                            this.$onBackPressed = function0;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                            invoke(bentoAppBarScope, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 6) == 0) {
                                i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-150888913, i, -1, "com.robinhood.android.acats.history.AcatsReimbursementDetailScreen.<anonymous>.<anonymous> (AcatsReimbursementDetailScreen.kt:48)");
                            }
                            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, AcatsReimbursementDetailScreen.ReimbursementBackTag);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$onBackPressed);
                            final Function0 function0 = this.$onBackPressed;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt$AcatsReimbursementDetailScreen$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return AcatsReimbursementDetailScreen.C74222.AnonymousClass1.invoke$lambda$1$lambda$0(function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoAppBar.m20575BentoBackButtondrOMvmE(modifierTestTag, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | 6 | ((i << 12) & 57344), 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(135565753, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt.AcatsReimbursementDetailScreen.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i7 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(135565753, i7, -1, "com.robinhood.android.acats.history.AcatsReimbursementDetailScreen.<anonymous> (AcatsReimbursementDetailScreen.kt:57)");
                        }
                        FeeReimbursementsHistoryDetailsResponseDto reimbursementDetails = state.getReimbursementDetails();
                        if (reimbursementDetails == null) {
                            composer3.startReplaceGroup(1429672913);
                            AcatsReimbursementDetailScreen.LoadingState(PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(1429675550);
                            Instant completionDate = state.getCompletionDate();
                            AcatsReimbursementDetailScreen.LoadedState(reimbursementDetails, completionDate != null ? InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format((InstantFormatter) completionDate) : null, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer3, 0, 0);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i62, 444);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LoadingState(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1940631219);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1940631219, i3, -1, "com.robinhood.android.acats.history.LoadingState (AcatsReimbursementDetailScreen.kt:71)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(TestTag3.testTag(modifier, ReimbursementLoadingTag), true, false, 2, composerStartRestartGroup, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsReimbursementDetailScreen.LoadingState$lambda$2(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadedState(final FeeReimbursementsHistoryDetailsResponseDto feeReimbursementsHistoryDetailsResponseDto, String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        final String str2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(214040848);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(feeReimbursementsHistoryDetailsResponseDto) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(214040848, i3, -1, "com.robinhood.android.acats.history.LoadedState (AcatsReimbursementDetailScreen.kt:85)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String title = feeReimbursementsHistoryDetailsResponseDto.getTitle();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8188);
                BentoText2.m20747BentoText38GnDrw(feeReimbursementsHistoryDetailsResponseDto.getSubtitle(), PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16380);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(feeReimbursementsHistoryDetailsResponseDto) | ((i3 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    str2 = str;
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AcatsReimbursementDetailScreen.LoadedState$lambda$6$lambda$5$lambda$4(feeReimbursementsHistoryDetailsResponseDto, str2, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    str2 = str;
                }
                composerStartRestartGroup.endReplaceGroup();
                LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 511);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                str2 = str;
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final String str3 = str2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AcatsReimbursementDetailScreen.LoadedState$lambda$7(feeReimbursementsHistoryDetailsResponseDto, str3, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                String title2 = feeReimbursementsHistoryDetailsResponseDto.getTitle();
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium();
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifier52 = modifier4;
                BentoText2.m20747BentoText38GnDrw(title2, PaddingKt.m5144paddingVpY3zN4$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8188);
                BentoText2.m20747BentoText38GnDrw(feeReimbursementsHistoryDetailsResponseDto.getSubtitle(), PaddingKt.m5144paddingVpY3zN4$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16380);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(feeReimbursementsHistoryDetailsResponseDto) | ((i3 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    str2 = str;
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AcatsReimbursementDetailScreen.LoadedState$lambda$6$lambda$5$lambda$4(feeReimbursementsHistoryDetailsResponseDto, str2, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 511);
                    composer2 = composerStartRestartGroup;
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedState$lambda$6$lambda$5$lambda$4(FeeReimbursementsHistoryDetailsResponseDto feeReimbursementsHistoryDetailsResponseDto, final String str, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List<FeeReimbursementsHistoryDetailRowDto> rows = feeReimbursementsHistoryDetailsResponseDto.getRows();
        final C7417x945f977d c7417x945f977d = new Function1() { // from class: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt$LoadedState$lambda$6$lambda$5$lambda$4$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(FeeReimbursementsHistoryDetailRowDto feeReimbursementsHistoryDetailRowDto) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((FeeReimbursementsHistoryDetailRowDto) obj);
            }
        };
        LazyColumn.items(rows.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt$LoadedState$lambda$6$lambda$5$lambda$4$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c7417x945f977d.invoke(rows.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt$LoadedState$lambda$6$lambda$5$lambda$4$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                FeeReimbursementsHistoryDetailRowDto feeReimbursementsHistoryDetailRowDto = (FeeReimbursementsHistoryDetailRowDto) rows.get(i);
                composer.startReplaceGroup(-1664899398);
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(feeReimbursementsHistoryDetailRowDto.getLabel(), null, 2, null), null, null, null, new AnnotatedString(feeReimbursementsHistoryDetailRowDto.getValue(), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composer, BentoDataRowState.$stable, 6);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (str != null && str.length() != 0) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(987516458, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acats.history.AcatsReimbursementDetailScreenKt$LoadedState$1$1$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(987516458, i, -1, "com.robinhood.android.acats.history.LoadedState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AcatsReimbursementDetailScreen.kt:111)");
                    }
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C7427R.string.acats_reimbursement_detail_completion_date, composer, 0), null, 2, null), null, null, null, new AnnotatedString(str, null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composer, BentoDataRowState.$stable, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }
}
