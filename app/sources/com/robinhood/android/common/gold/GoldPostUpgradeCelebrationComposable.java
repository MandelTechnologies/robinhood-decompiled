package com.robinhood.android.common.gold;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.gold.GoldPostUpgradeCelebrationComposable;
import com.robinhood.android.common.gold.GoldPostUpgradeCelebrationViewState;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.models.serverdriven.experimental.api.DismissAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldPostUpgradeCelebrationComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aD\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032#\u0010\u0004\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001aD\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2#\u0010\u0004\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0010\u001a#\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"GoldUpgradeCelebrationComposable", "", "state", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState;", "onAction", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Lkotlin/ParameterName;", "name", "action", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GoldUpgradeCelebration", "goldCelebration", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$PostTransferGoldCelebration;", "(Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$PostTransferGoldCelebration;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CelebrationFailed", "errorDescription", "", "onClickFailedCta", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-lib-gold_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class GoldPostUpgradeCelebrationComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CelebrationFailed$lambda$5(String str, Function0 function0, int i, Composer composer, int i2) {
        CelebrationFailed(str, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeCelebration$lambda$4(UiPostTransferPage.PostTransferGoldCelebration postTransferGoldCelebration, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldUpgradeCelebration(postTransferGoldCelebration, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeCelebrationComposable$lambda$2(GoldPostUpgradeCelebrationViewState goldPostUpgradeCelebrationViewState, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GoldUpgradeCelebrationComposable(goldPostUpgradeCelebrationViewState, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void GoldUpgradeCelebrationComposable(final GoldPostUpgradeCelebrationViewState state, final Function1<? super GenericAction, Unit> onAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1580875611);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAction) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1580875611, i3, -1, "com.robinhood.android.common.gold.GoldUpgradeCelebrationComposable (GoldPostUpgradeCelebrationComposable.kt:37)");
            }
            if (Intrinsics.areEqual(state, GoldPostUpgradeCelebrationViewState.Loading.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(1196969157);
                LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(1617686445, true, new C111631(modifier), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                modifier2 = modifier;
            } else if (state instanceof GoldPostUpgradeCelebrationViewState.Loaded) {
                composerStartRestartGroup.startReplaceGroup(1196979470);
                modifier2 = modifier;
                GoldUpgradeCelebration(((GoldPostUpgradeCelebrationViewState.Loaded) state).getGoldCelebration(), onAction, modifier2, composerStartRestartGroup, i3 & 1008, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                modifier2 = modifier;
                if (!(state instanceof GoldPostUpgradeCelebrationViewState.Error)) {
                    composerStartRestartGroup.startReplaceGroup(1196967403);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1196984757);
                String message = ((GoldPostUpgradeCelebrationViewState.Error) state).getError().getMessage();
                if (message == null) {
                    message = "";
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z = (i3 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GoldPostUpgradeCelebrationComposable.GoldUpgradeCelebrationComposable$lambda$1$lambda$0(onAction);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                CelebrationFailed(message, (Function0) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldPostUpgradeCelebrationComposable.GoldUpgradeCelebrationComposable$lambda$2(state, onAction, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GoldPostUpgradeCelebrationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationComposableKt$GoldUpgradeCelebrationComposable$1 */
    static final class C111631 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;

        C111631(Modifier modifier) {
            this.$modifier = modifier;
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
                ComposerKt.traceEventStart(1617686445, i, -1, "com.robinhood.android.common.gold.GoldUpgradeCelebrationComposable.<anonymous> (GoldPostUpgradeCelebrationComposable.kt:40)");
            }
            UiPostTransferPage.PostTransferGoldCelebration goldCelebration = GoldPostUpgradeCelebrationViewState.INSTANCE.getLoadingMock().getGoldCelebration();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationComposableKt$GoldUpgradeCelebrationComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GoldPostUpgradeCelebrationComposable.C111631.invoke$lambda$1$lambda$0((GenericAction) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            GoldPostUpgradeCelebrationComposable.GoldUpgradeCelebration(goldCelebration, (Function1) objRememberedValue, this.$modifier, composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(GenericAction genericAction) {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeCelebrationComposable$lambda$1$lambda$0(Function1 function1) {
        function1.invoke(new GenericAction.Dismiss(new DismissAction(false)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GoldUpgradeCelebration(final UiPostTransferPage.PostTransferGoldCelebration postTransferGoldCelebration, final Function1<? super GenericAction, Unit> function1, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(433574321);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(postTransferGoldCelebration) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(433574321, i3, -1, "com.robinhood.android.common.gold.GoldUpgradeCelebration (GoldPostUpgradeCelebrationComposable.kt:62)");
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(886307521, true, new GoldPostUpgradeCelebrationComposable2(postTransferGoldCelebration, function1), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1969345426, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationComposableKt$GoldUpgradeCelebration$1$2
                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1969345426, i5, -1, "com.robinhood.android.common.gold.GoldUpgradeCelebration.<anonymous>.<anonymous> (GoldPostUpgradeCelebrationComposable.kt:101)");
                    }
                    Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(modifier, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(modifierFillMaxHeight$default, bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), composer2, 0, 0);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical bottom = arrangement.getBottom();
                    UiPostTransferPage.PostTransferGoldCelebration postTransferGoldCelebration2 = postTransferGoldCelebration;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(bottom, centerHorizontally, composer2, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierWeight$default = Column5.weight$default(column6, companion3, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getBottom(), companion.getStart(), composer2, 6);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    LegacyGoldWelcomeLottieComposable.GoldWelcomeLottie(postTransferGoldCelebration2.getLottieAnimationPath(), SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1, composer2, 432, 0);
                    composer2.endNode();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i6).m21591getLargeD9Ej5fM()), composer2, 0);
                    String title = postTransferGoldCelebration2.getTitle();
                    TextStyle displayCapsuleLarge = bentoTheme.getTypography(composer2, i6).getDisplayCapsuleLarge();
                    TextAlign.Companion companion4 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer2, 0, 0, 8126);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM()), composer2, 0);
                    BentoText2.m20747BentoText38GnDrw(postTransferGoldCelebration2.getDescription(), null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16318);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldPostUpgradeCelebrationComposable.GoldUpgradeCelebration$lambda$4(postTransferGoldCelebration, function1, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CelebrationFailed(final String str, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1628435738);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1628435738, i2, -1, "com.robinhood.android.common.gold.CelebrationFailed (GoldPostUpgradeCelebrationComposable.kt:133)");
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), false, ComposableLambda3.rememberComposableLambda(-73470513, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationComposableKt.CelebrationFailed.1
                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-73470513, i3, -1, "com.robinhood.android.common.gold.CelebrationFailed.<anonymous> (GoldPostUpgradeCelebrationComposable.kt:137)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer2, 6, 0));
                    Function0<Unit> function02 = function0;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierNavigationBarsPadding);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoButtonKt.m20586BentoButtonEikTQX8(function02, StringResources_androidKt.stringResource(C11048R.string.general_label_got_it, composer2, 0), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composer2, 384, 0, 8184);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(131483650, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationComposableKt.CelebrationFailed.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(131483650, i3, -1, "com.robinhood.android.common.gold.CelebrationFailed.<anonymous> (GoldPostUpgradeCelebrationComposable.kt:150)");
                    }
                    LegacyGoldUpgradeWelcomeIncompleteComposable.GoldUpgradeWelcomeIncompleteComposable(str, null, composer2, 0, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.gold.GoldPostUpgradeCelebrationComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldPostUpgradeCelebrationComposable.CelebrationFailed$lambda$5(str, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
