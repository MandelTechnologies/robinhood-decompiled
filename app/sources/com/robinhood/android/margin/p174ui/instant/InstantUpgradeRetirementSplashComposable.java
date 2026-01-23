package com.robinhood.android.margin.p174ui.instant;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldDefaults;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.instant.p160ui.InstantRetirementSplashScreen;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeRetirementSplashComposable;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeRetirementSplashDuxo2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.compose.extensions.WindowInsetsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstantUpgradeRetirementSplashComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00012\b\b\u0001\u0010\u0011\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"InstantUpgradeRetirementSplashComposable", "", "state", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashState;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "onPrimaryButtonClick", "Lkotlin/Function0;", "onSecondaryButtonClick", "onError", "Lkotlin/Function1;", "", "(Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashState;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/rosetta/eventlogging/Screen;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "InstantUpgradeRetirementSplashComposablePreview", "viewState", "(Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashState;Landroidx/compose/runtime/Composer;I)V", "feature-margin_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class InstantUpgradeRetirementSplashComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstantUpgradeRetirementSplashComposable$lambda$0(InstantUpgradeRetirementSplashDuxo2 instantUpgradeRetirementSplashDuxo2, SduiActionHandler sduiActionHandler, Screen screen, Function0 function0, Function0 function02, Function1 function1, int i, Composer composer, int i2) {
        InstantUpgradeRetirementSplashComposable(instantUpgradeRetirementSplashDuxo2, sduiActionHandler, screen, function0, function02, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstantUpgradeRetirementSplashComposablePreview$lambda$1(InstantUpgradeRetirementSplashDuxo2 instantUpgradeRetirementSplashDuxo2, int i, Composer composer, int i2) {
        InstantUpgradeRetirementSplashComposablePreview(instantUpgradeRetirementSplashDuxo2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InstantUpgradeRetirementSplashComposable(InstantUpgradeRetirementSplashDuxo2 instantUpgradeRetirementSplashDuxo2, final SduiActionHandler<? super GenericAction> sduiActionHandler, final Screen screen, final Function0<Unit> onPrimaryButtonClick, final Function0<Unit> onSecondaryButtonClick, final Function1<? super Throwable, Unit> onError, Composer composer, final int i) {
        int i2;
        final SduiActionHandler<? super GenericAction> sduiActionHandler2;
        final InstantUpgradeRetirementSplashDuxo2 state = instantUpgradeRetirementSplashDuxo2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onSecondaryButtonClick, "onSecondaryButtonClick");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Composer composerStartRestartGroup = composer.startRestartGroup(-170690066);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            sduiActionHandler2 = sduiActionHandler;
            i2 |= composerStartRestartGroup.changedInstance(sduiActionHandler2) ? 32 : 16;
        } else {
            sduiActionHandler2 = sduiActionHandler;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(screen) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPrimaryButtonClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSecondaryButtonClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onError) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-170690066, i2, -1, "com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposable (InstantUpgradeRetirementSplashComposable.kt:36)");
            }
            if (state instanceof InstantUpgradeRetirementSplashDuxo2.Loading) {
                composerStartRestartGroup.startReplaceGroup(-824384061);
                LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, true, true, composerStartRestartGroup, 3456, 3);
                composerStartRestartGroup.endReplaceGroup();
            } else if (state instanceof InstantUpgradeRetirementSplashDuxo2.ShowInstantSplash) {
                composerStartRestartGroup.startReplaceGroup(-824377372);
                Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposableKt.InstantUpgradeRetirementSplashComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i3) {
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1365431206, i3, -1, "com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposable.<anonymous> (InstantUpgradeRetirementSplashComposable.kt:44)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i4 = BentoTheme.$stable;
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i4).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU();
                        WindowInsets windowInsetsExcludeTop = WindowInsetsKt.excludeTop(ScaffoldDefaults.INSTANCE.getContentWindowInsets(composer2, ScaffoldDefaults.$stable));
                        final Screen screen2 = screen;
                        final InstantUpgradeRetirementSplashDuxo2 instantUpgradeRetirementSplashDuxo22 = state;
                        final SduiActionHandler<GenericAction> sduiActionHandler3 = sduiActionHandler2;
                        final Function0<Unit> function0 = onPrimaryButtonClick;
                        final Function0<Unit> function02 = onSecondaryButtonClick;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(null, null, null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, windowInsetsExcludeTop, ComposableLambda3.rememberComposableLambda(185830697, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposableKt.InstantUpgradeRetirementSplashComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(final PaddingValues paddingValues, Composer composer3, int i5) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i5 & 6) == 0) {
                                    i5 |= composer3.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i5 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(185830697, i5, -1, "com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposable.<anonymous>.<anonymous> (InstantUpgradeRetirementSplashComposable.kt:49)");
                                }
                                UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen2, null, null, null, null, 61, null);
                                final InstantUpgradeRetirementSplashDuxo2 instantUpgradeRetirementSplashDuxo23 = instantUpgradeRetirementSplashDuxo22;
                                final SduiActionHandler<GenericAction> sduiActionHandler4 = sduiActionHandler3;
                                final Function0<Unit> function03 = function0;
                                final Function0<Unit> function04 = function02;
                                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(-17584418, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposableKt.InstantUpgradeRetirementSplashComposable.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i6) {
                                        if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-17584418, i6, -1, "com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposable.<anonymous>.<anonymous>.<anonymous> (InstantUpgradeRetirementSplashComposable.kt:50)");
                                        }
                                        InstantRetirementSplashScreen.InstantRetirementSplashScreen(((InstantUpgradeRetirementSplashDuxo2.ShowInstantSplash) instantUpgradeRetirementSplashDuxo23).getViewModel(), sduiActionHandler4, PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), function03, function04, composer4, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), composer3, 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306368, 63);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                };
                state = state;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1365431206, true, function2, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(state instanceof InstantUpgradeRetirementSplashDuxo2.Error)) {
                    composerStartRestartGroup.startReplaceGroup(-824385344);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-824350010);
                composerStartRestartGroup.endReplaceGroup();
                onError.invoke(((InstantUpgradeRetirementSplashDuxo2.Error) state).getThrowable());
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstantUpgradeRetirementSplashComposable.InstantUpgradeRetirementSplashComposable$lambda$0(state, sduiActionHandler, screen, onPrimaryButtonClick, onSecondaryButtonClick, onError, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void InstantUpgradeRetirementSplashComposablePreview(final InstantUpgradeRetirementSplashDuxo2 viewState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1717691907);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1717691907, i2, -1, "com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposablePreview (InstantUpgradeRetirementSplashComposable.kt:70)");
            }
            CompositionLocal3.CompositionLocalProvider(AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE), ComposableLambda3.rememberComposableLambda(80285373, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposableKt.InstantUpgradeRetirementSplashComposablePreview.1

                /* compiled from: InstantUpgradeRetirementSplashComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposableKt$InstantUpgradeRetirementSplashComposablePreview$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ InstantUpgradeRetirementSplashDuxo2 $viewState;

                    AnonymousClass1(InstantUpgradeRetirementSplashDuxo2 instantUpgradeRetirementSplashDuxo2) {
                        this.$viewState = instantUpgradeRetirementSplashDuxo2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1646230411, i, -1, "com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposablePreview.<anonymous>.<anonymous> (InstantUpgradeRetirementSplashComposable.kt:75)");
                        }
                        InstantUpgradeRetirementSplashDuxo2 instantUpgradeRetirementSplashDuxo2 = this.$viewState;
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposableKt$InstantUpgradeRetirementSplashComposablePreview$1$1$1$1
                                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                public final boolean mo15941handle(GenericAction it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return true;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposableKt$InstantUpgradeRetirementSplashComposablePreview$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function0 = (Function0) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposableKt$InstantUpgradeRetirementSplashComposablePreview$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function02 = (Function0) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposableKt$InstantUpgradeRetirementSplashComposablePreview$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return InstantUpgradeRetirementSplashComposable.C210641.AnonymousClass1.invoke$lambda$6$lambda$5((Throwable) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        composer.endReplaceGroup();
                        InstantUpgradeRetirementSplashComposable.InstantUpgradeRetirementSplashComposable(instantUpgradeRetirementSplashDuxo2, sduiActionHandler, null, function0, function02, (Function1) objRememberedValue4, composer, 224640);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$5(Throwable it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(80285373, i3, -1, "com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposablePreview.<anonymous> (InstantUpgradeRetirementSplashComposable.kt:74)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1646230411, true, new AnonymousClass1(viewState), composer2, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstantUpgradeRetirementSplashComposable.InstantUpgradeRetirementSplashComposablePreview$lambda$1(viewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
