package com.robinhood.android.redesign.accounttab.p228ui;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.redesign.accounttab.C26320R;
import com.robinhood.android.redesign.accounttab.common.NewUserExperienceStage;
import com.robinhood.android.redesign.accounttab.p228ui.NewUserExperiencePrompt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NewUserExperiencePrompt.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u001a\u001f\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001a3\u0010\u0014\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u001b\u001a3\u0010\u001c\u001a\u00020\u000e2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"INITIAL_DELAY", "", "ANIMATION_PAUSE", "POP_IN_DURATION", "", "MAIN_ANIMATION_DURATION", "RESTART_DELAY", "expandVerticallyAnimation", "Landroidx/compose/animation/EnterTransition;", "fadeInFastAnimation", "fadeInSlowAnimation", "fadeOutAnimation", "Landroidx/compose/animation/ExitTransition;", "NewUserExperiencePrompt", "", "stage", "Lcom/robinhood/android/redesign/accounttab/common/NewUserExperienceStage;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/redesign/accounttab/common/NewUserExperienceStage;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PullDownPrompt", "animatedOffset", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SwipePrompt", "lib-account-tab_externalDebug", "readyToShow", "", "displayedStage"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class NewUserExperiencePrompt {
    private static final long ANIMATION_PAUSE = 500;
    private static final long INITIAL_DELAY = 1000;
    private static final int MAIN_ANIMATION_DURATION = 900;
    private static final int POP_IN_DURATION = 200;
    private static final long RESTART_DELAY = 200;
    private static final EnterTransition expandVerticallyAnimation = EnterExitTransitionKt.expandVertically$default(new TweenSpec(200, 0, new CubicBezierEasing(0.0f, 0.0f, 0.0f, 1.0f), 2, null), Alignment.INSTANCE.getTop(), false, null, 12, null);
    private static final EnterTransition fadeInFastAnimation = EnterExitTransitionKt.fadeIn$default(new TweenSpec(200, 0, new CubicBezierEasing(0.17f, 0.17f, 0.83f, 0.83f), 2, null), 0.0f, 2, null);
    private static final EnterTransition fadeInSlowAnimation = EnterExitTransitionKt.fadeIn$default(new TweenSpec(500, 0, new CubicBezierEasing(0.17f, 0.17f, 0.83f, 0.83f), 2, null), 0.0f, 2, null);
    private static final ExitTransition fadeOutAnimation = EnterExitTransitionKt.fadeOut$default(new TweenSpec(200, 0, new CubicBezierEasing(0.17f, 0.17f, 0.83f, 0.83f), 2, null), 0.0f, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewUserExperiencePrompt$lambda$11(NewUserExperienceStage newUserExperienceStage, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NewUserExperiencePrompt(newUserExperienceStage, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewUserExperiencePrompt$lambda$6(NewUserExperienceStage newUserExperienceStage, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NewUserExperiencePrompt(newUserExperienceStage, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PullDownPrompt$lambda$16(Animatable animatable, Density density, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PullDownPrompt(animatable, density, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipePrompt$lambda$22(Animatable animatable, Density density, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SwipePrompt(animatable, density, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final boolean NewUserExperiencePrompt$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewUserExperienceStage NewUserExperiencePrompt$lambda$4(SnapshotState<NewUserExperienceStage> snapshotState) {
        return snapshotState.getValue();
    }

    public static final void NewUserExperiencePrompt(final NewUserExperienceStage stage, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(stage, "stage");
        Composer composerStartRestartGroup = composer.startRestartGroup(-889222575);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(stage.ordinal()) ? 4 : 2) | i;
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
                ComposerKt.traceEventStart(-889222575, i3, -1, "com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePrompt (NewUserExperiencePrompt.kt:86)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(stage, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            NewUserExperienceStage newUserExperienceStage = NewUserExperienceStage.DONE;
            if (stage == newUserExperienceStage && NewUserExperiencePrompt$lambda$4(snapshotState2) == newUserExperienceStage) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return NewUserExperiencePrompt.NewUserExperiencePrompt$lambda$6(stage, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            snapshotState2.setValue(stage);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = Animatable2.Animatable$default(0.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Animatable animatable = (Animatable) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(animatable);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new NewUserExperiencePrompt2(animatable, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
            Boolean boolValueOf = Boolean.valueOf(NewUserExperiencePrompt$lambda$1(snapshotState));
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NewUserExperiencePrompt.NewUserExperiencePrompt$lambda$10$lambda$9((AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(boolValueOf, null, (Function1) objRememberedValue5, null, null, null, ComposableLambda3.rememberComposableLambda(1728317076, true, new C263884(snapshotState2, animatable, density, modifier), composerStartRestartGroup, 54), composerStartRestartGroup, 1573248, 58);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NewUserExperiencePrompt.NewUserExperiencePrompt$lambda$11(stage, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NewUserExperiencePrompt$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform NewUserExperiencePrompt$lambda$10$lambda$9(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(expandVerticallyAnimation.plus(fadeInFastAnimation), fadeOutAnimation);
    }

    /* compiled from: NewUserExperiencePrompt.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$NewUserExperiencePrompt$4 */
    static final class C263884 implements Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit> {
        final /* synthetic */ Animatable<Float, AnimationVectors2> $animatedOffset;
        final /* synthetic */ Density $density;
        final /* synthetic */ SnapshotState<NewUserExperienceStage> $displayedStage$delegate;
        final /* synthetic */ Modifier $modifier;

        C263884(SnapshotState<NewUserExperienceStage> snapshotState, Animatable<Float, AnimationVectors2> animatable, Density density, Modifier modifier) {
            this.$displayedStage$delegate = snapshotState;
            this.$animatedOffset = animatable;
            this.$density = density;
            this.$modifier = modifier;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer, Integer num) {
            invoke(animatedContentScope, bool.booleanValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1728317076, i, -1, "com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePrompt.<anonymous> (NewUserExperiencePrompt.kt:136)");
            }
            if (z) {
                NewUserExperienceStage newUserExperienceStageNewUserExperiencePrompt$lambda$4 = NewUserExperiencePrompt.NewUserExperiencePrompt$lambda$4(this.$displayedStage$delegate);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$NewUserExperiencePrompt$4$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NewUserExperiencePrompt.C263884.invoke$lambda$3$lambda$2((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                final Animatable<Float, AnimationVectors2> animatable = this.$animatedOffset;
                final Density density = this.$density;
                final Modifier modifier = this.$modifier;
                AnimatedContentKt.AnimatedContent(newUserExperienceStageNewUserExperiencePrompt$lambda$4, null, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(843713554, true, new Function4<AnimatedContentScope, NewUserExperienceStage, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt.NewUserExperiencePrompt.4.2

                    /* compiled from: NewUserExperiencePrompt.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$NewUserExperiencePrompt$4$2$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[NewUserExperienceStage.values().length];
                            try {
                                iArr[NewUserExperienceStage.PULL_DOWN.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[NewUserExperienceStage.SWIPE.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[NewUserExperienceStage.DONE.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[NewUserExperienceStage.PENDING.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NewUserExperienceStage newUserExperienceStage, Composer composer2, Integer num) {
                        invoke(animatedContentScope, newUserExperienceStage, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedContentScope AnimatedContent2, NewUserExperienceStage currentStage, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(AnimatedContent2, "$this$AnimatedContent");
                        Intrinsics.checkNotNullParameter(currentStage, "currentStage");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(843713554, i2, -1, "com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePrompt.<anonymous>.<anonymous> (NewUserExperiencePrompt.kt:145)");
                        }
                        int i3 = WhenMappings.$EnumSwitchMapping$0[currentStage.ordinal()];
                        if (i3 == 1) {
                            composer2.startReplaceGroup(-940090173);
                            NewUserExperiencePrompt.PullDownPrompt(animatable, density, modifier, composer2, Animatable.$stable, 0);
                            composer2.endReplaceGroup();
                        } else if (i3 == 2) {
                            composer2.startReplaceGroup(-940087040);
                            NewUserExperiencePrompt.SwipePrompt(animatable, density, modifier, composer2, Animatable.$stable, 0);
                            composer2.endReplaceGroup();
                        } else {
                            if (i3 != 3 && i3 != 4) {
                                composer2.startReplaceGroup(-940092102);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(922237413);
                            BoxKt.Box(Modifier.INSTANCE, composer2, 6);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 1573248, 58);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ContentTransform invoke$lambda$3$lambda$2(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically$default(null, new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$NewUserExperiencePrompt$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(NewUserExperiencePrompt.C263884.invoke$lambda$3$lambda$2$lambda$0(((Integer) obj).intValue()));
                }
            }, 1, null).plus(NewUserExperiencePrompt.fadeInSlowAnimation), EnterExitTransitionKt.slideOutVertically$default(null, new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$NewUserExperiencePrompt$4$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(NewUserExperiencePrompt.C263884.invoke$lambda$3$lambda$2$lambda$1(((Integer) obj).intValue()));
                }
            }, 1, null).plus(NewUserExperiencePrompt.fadeOutAnimation));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$3$lambda$2$lambda$0(int i) {
            return (-i) / 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$3$lambda$2$lambda$1(int i) {
            return i / 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PullDownPrompt(final Animatable<Float, AnimationVectors2> animatable, final Density density, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        int i4;
        boolean z2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1777772370);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(animatable) : composerStartRestartGroup.changedInstance(animatable) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(density) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1777772370, i3, -1, "com.robinhood.android.redesign.accounttab.ui.PullDownPrompt (NewUserExperiencePrompt.kt:164)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                Modifier modifier5 = modifier4;
                z = true;
                i4 = i3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26320R.string.new_user_pull_down, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, FontWeight.INSTANCE.getNormal(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, 24576, 0, 8170);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z3 = (i4 & 112) != 32;
                if ((i4 & 14) != 4 && ((i4 & 8) == 0 || !composerStartRestartGroup.changedInstance(animatable))) {
                    z = false;
                }
                z2 = z3 | z;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NewUserExperiencePrompt.PullDownPrompt$lambda$15$lambda$14$lambda$13(density, animatable, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.SWIPE_DOWN_16), StringResources_androidKt.stringResource(C26320R.string.new_user_pull_down, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), GraphicsLayerModifier6.graphicsLayer(companion2, (Function1) objRememberedValue), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 48);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NewUserExperiencePrompt.PullDownPrompt$lambda$16(animatable, density, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
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
                Modifier modifier52 = modifier4;
                z = true;
                i4 = i3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26320R.string.new_user_pull_down, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21426getFg20d7_KjU()), null, FontWeight.INSTANCE.getNormal(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextS(), composerStartRestartGroup, 24576, 0, 8170);
                composerStartRestartGroup = composerStartRestartGroup;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                if ((i4 & 112) != 32) {
                }
                if ((i4 & 14) != 4) {
                    z = false;
                }
                z2 = z3 | z;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NewUserExperiencePrompt.PullDownPrompt$lambda$15$lambda$14$lambda$13(density, animatable, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.SWIPE_DOWN_16), StringResources_androidKt.stringResource(C26320R.string.new_user_pull_down, composerStartRestartGroup, 0), bentoTheme2.getColors(composerStartRestartGroup, i62).m21426getFg20d7_KjU(), GraphicsLayerModifier6.graphicsLayer(companion22, (Function1) objRememberedValue), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 48);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PullDownPrompt$lambda$15$lambda$14$lambda$13(Density density, Animatable animatable, GraphicsLayerScope graphicsLayer) {
        float fFloatValue;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setTranslationY(((Number) animatable.getValue()).floatValue() * density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(25)));
        if (((Number) animatable.getValue()).floatValue() <= 0.1f) {
            fFloatValue = ((Number) animatable.getValue()).floatValue() / 0.1f;
        } else {
            fFloatValue = ((Number) animatable.getValue()).floatValue() <= 0.8f ? 1.0f - ((((Number) animatable.getValue()).floatValue() - 0.1f) / 0.7f) : 0.0f;
        }
        graphicsLayer.setAlpha(fFloatValue);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SwipePrompt(final Animatable<Float, AnimationVectors2> animatable, final Density density, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean z;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-582496315);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(animatable) : composerStartRestartGroup.changedInstance(animatable) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(density) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-582496315, i3, -1, "com.robinhood.android.redesign.accounttab.ui.SwipePrompt (NewUserExperiencePrompt.kt:219)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 2, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getCenter(), centerVertically, composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(companion3, null, false, 3, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentSize$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z = ((i3 & 112) != 32) | ((i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(animatable)));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return NewUserExperiencePrompt.SwipePrompt$lambda$21$lambda$20$lambda$19$lambda$18(density, animatable, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.SWIPE_UP_16), StringResources_androidKt.stringResource(C26320R.string.new_user_swipe_to_view_accounts, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), GraphicsLayerModifier6.graphicsLayer(companion3, (Function1) objRememberedValue), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 48);
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26320R.string.new_user_swipe_to_view_accounts, composerStartRestartGroup, 0), companion3, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, FontWeight.INSTANCE.getNormal(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 24624, 0, 8168);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NewUserExperiencePrompt.SwipePrompt$lambda$22(animatable, density, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 2, null);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically2 = companion4.getCenterVertically();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getCenter(), centerVertically2, composerStartRestartGroup, 54);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierWrapContentSize$default2 = SizeKt.wrapContentSize$default(companion32, null, false, 3, null);
                MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWrapContentSize$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if ((i3 & 14) != 4) {
                        z = ((i3 & 112) != 32) | ((i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(animatable)));
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.NewUserExperiencePromptKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return NewUserExperiencePrompt.SwipePrompt$lambda$21$lambda$20$lambda$19$lambda$18(density, animatable, (GraphicsLayerScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.SWIPE_UP_16), StringResources_androidKt.stringResource(C26320R.string.new_user_swipe_to_view_accounts, composerStartRestartGroup, 0), bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), GraphicsLayerModifier6.graphicsLayer(companion32, (Function1) objRememberedValue), null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 48);
                            Modifier modifier52 = modifier4;
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C26320R.string.new_user_swipe_to_view_accounts, composerStartRestartGroup, 0), companion32, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, FontWeight.INSTANCE.getNormal(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 24624, 0, 8168);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipePrompt$lambda$21$lambda$20$lambda$19$lambda$18(Density density, Animatable animatable, GraphicsLayerScope graphicsLayer) {
        float fFloatValue;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setRotationZ(-90.0f);
        graphicsLayer.setTranslationX((-1) * ((Number) animatable.getValue()).floatValue() * density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(25)));
        if (((Number) animatable.getValue()).floatValue() <= 0.1f) {
            fFloatValue = ((Number) animatable.getValue()).floatValue() / 0.1f;
        } else {
            fFloatValue = ((Number) animatable.getValue()).floatValue() <= 0.8f ? 1.0f - ((((Number) animatable.getValue()).floatValue() - 0.1f) / 0.7f) : 0.0f;
        }
        graphicsLayer.setAlpha(fFloatValue);
        return Unit.INSTANCE;
    }
}
