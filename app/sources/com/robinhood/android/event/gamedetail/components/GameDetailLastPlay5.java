package com.robinhood.android.event.gamedetail.components;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GameDetailLastPlay.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a:\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00040\tH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/GameDetailLastPlayState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "GameDetailLastPlay", "(Lcom/robinhood/android/event/gamedetail/components/GameDetailLastPlayState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "text", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "targetState", "content", "AnimatedText", "(Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "GameDetailLastPlayPreview", "(Landroidx/compose/runtime/Composer;I)V", "", "LivePlayDescriptionAnimationDuration", "I", "LivePlayDescriptionAnimationOffset", "feature-game-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.gamedetail.components.GameDetailLastPlayKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GameDetailLastPlay5 {
    private static final int LivePlayDescriptionAnimationDuration = 400;
    private static final int LivePlayDescriptionAnimationOffset = 20;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AnimatedText$lambda$6$lambda$5$lambda$3(int i) {
        return 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AnimatedText$lambda$6$lambda$5$lambda$4(int i) {
        return -20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedText$lambda$7(String str, Function3 function3, int i, Composer composer, int i2) {
        AnimatedText(str, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailLastPlay$lambda$2(GameDetailLastPlayState gameDetailLastPlayState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GameDetailLastPlay(gameDetailLastPlayState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameDetailLastPlayPreview$lambda$8(int i, Composer composer, int i2) {
        GameDetailLastPlayPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GameDetailLastPlay(final GameDetailLastPlayState state, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-526623330);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-526623330, i3, -1, "com.robinhood.android.event.gamedetail.components.GameDetailLastPlay (GameDetailLastPlay.kt:38)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String textAsString = StringResources6.getTextAsString(state.getTitle(), composerStartRestartGroup, StringResource.$stable);
            GameDetailLastPlay gameDetailLastPlay = GameDetailLastPlay.INSTANCE;
            AnimatedText(textAsString, gameDetailLastPlay.m14189getLambda$179083455$feature_game_detail_externalDebug(), composerStartRestartGroup, 48);
            String description = state.getDescription();
            composerStartRestartGroup.startReplaceGroup(212317995);
            if (description != null) {
                AnimatedText(description, gameDetailLastPlay.getLambda$1825804297$feature_game_detail_externalDebug(), composerStartRestartGroup, 48);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailLastPlayKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GameDetailLastPlay5.GameDetailLastPlay$lambda$2(state, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void AnimatedText(String str, final Function3<? super String, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        final String str2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2012999731);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2012999731, i2, -1, "com.robinhood.android.event.gamedetail.components.AnimatedText (GameDetailLastPlay.kt:71)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailLastPlayKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GameDetailLastPlay5.AnimatedText$lambda$6$lambda$5((AnimatedContentTransitionScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            str2 = str;
            AnimatedContentKt.AnimatedContent(str2, null, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(660777719, true, new Function4<AnimatedContentScope, String, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailLastPlayKt.AnimatedText.2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, String str3, Composer composer2, Integer num) {
                    invoke(animatedContentScope, str3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, String targetState, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(targetState, "targetState");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(660777719, i3, -1, "com.robinhood.android.event.gamedetail.components.AnimatedText.<anonymous> (GameDetailLastPlay.kt:89)");
                    }
                    function3.invoke(targetState, composer2, Integer.valueOf((i3 >> 3) & 14));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 1573248, 58);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str2 = str;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailLastPlayKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GameDetailLastPlay5.AnimatedText$lambda$7(str2, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform AnimatedText$lambda$6$lambda$5(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContent.using(AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(400, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(400, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailLastPlayKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(GameDetailLastPlay5.AnimatedText$lambda$6$lambda$5$lambda$3(((Integer) obj).intValue()));
            }
        })), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(400, 0, null, 6, null), 0.0f, 2, null).plus(EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(400, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailLastPlayKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(GameDetailLastPlay5.AnimatedText$lambda$6$lambda$5$lambda$4(((Integer) obj).intValue()));
            }
        }))), AnimatedContentKt.SizeTransform$default(false, null, 2, null));
    }

    private static final void GameDetailLastPlayPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1733128557);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1733128557, i, -1, "com.robinhood.android.event.gamedetail.components.GameDetailLastPlayPreview (GameDetailLastPlay.kt:95)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, GameDetailLastPlay.INSTANCE.getLambda$545338037$feature_game_detail_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.gamedetail.components.GameDetailLastPlayKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GameDetailLastPlay5.GameDetailLastPlayPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
