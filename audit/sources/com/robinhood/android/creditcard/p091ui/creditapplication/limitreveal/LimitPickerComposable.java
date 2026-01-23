package com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal;

import android.content.res.Resources;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal.LimitPickerComposable;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LimitPickerComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\f\"\u000e\u0010\r\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, m3636d2 = {"AnimatedCreditLimitPicker", "", "limit", "", "higherLimit", "depositBy", "", "duxo", "Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "initialDelay", "(JJLjava/lang/String;Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealDuxo;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "ANIMATED_CREDIT_LIMIT_PICKER_OPTION", "ANIMATED_CREDIT_LIMIT_PICKER_OPTION_WITH_DEPOSIT", "feature-credit-card_externalDebug", "step", "", "alpha2", "", "offsetY", "Landroidx/compose/ui/unit/Dp;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitPickerComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class LimitPickerComposable {
    public static final String ANIMATED_CREDIT_LIMIT_PICKER_OPTION = "animated-credit-limit-picker-option";
    public static final String ANIMATED_CREDIT_LIMIT_PICKER_OPTION_WITH_DEPOSIT = "animated-credit-limit-picker-option-with-deposit";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedCreditLimitPicker$lambda$5(long j, long j2, String str, LimitRevealDuxo limitRevealDuxo, Modifier modifier, long j3, int i, int i2, Composer composer, int i3) {
        AnimatedCreditLimitPicker(j, j2, str, limitRevealDuxo, modifier, j3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AnimatedCreditLimitPicker(final long j, final long j2, final String depositBy, final LimitRevealDuxo duxo, Modifier modifier, long j3, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long j4;
        long j5;
        Object objRememberedValue;
        Composer.Companion companion;
        Composer composer2;
        SnapshotIntState2 snapshotIntState2;
        boolean zChanged;
        Object objRememberedValue2;
        final Modifier modifier3;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(depositBy, "depositBy");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(1483872741);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(depositBy) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(duxo) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    j4 = j3;
                    i3 |= composerStartRestartGroup.changed(j4) ? 131072 : 65536;
                }
                if ((i3 & 74899) != 74898 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    long j7 = i4 == 0 ? 0L : j4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1483872741, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.AnimatedCreditLimitPicker (LimitPickerComposable.kt:34)");
                    }
                    j5 = j7;
                    Object[] objArr = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitPickerComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LimitPickerComposable.AnimatedCreditLimitPicker$lambda$1$lambda$0();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composer2, 3072, 6);
                    Unit unit = Unit.INSTANCE;
                    composer2.startReplaceGroup(-1633490746);
                    zChanged = ((i3 & 458752) != 131072) | composer2.changed(snapshotIntState2);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new LimitPickerComposable2(j5, snapshotIntState2, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 6);
                    Modifier modifier5 = modifier4;
                    AnimatedVisibilityKt.AnimatedVisibility(snapshotIntState2.getIntValue() <= 0, (Modifier) null, EnterExitTransitionKt.slideInVertically$default(null, null, 3, null), (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(988480189, true, new C124782(modifier5, j2, depositBy, duxo, j, snapshotIntState2), composer2, 54), composer2, 196992, 26);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    j6 = j5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    j6 = j4;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitPickerComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LimitPickerComposable.AnimatedCreditLimitPicker$lambda$5(j, j2, depositBy, duxo, modifier3, j6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            j4 = j3;
            if ((i3 & 74899) != 74898) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                j5 = j7;
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composer2, 3072, 6);
                Unit unit2 = Unit.INSTANCE;
                composer2.startReplaceGroup(-1633490746);
                zChanged = ((i3 & 458752) != 131072) | composer2.changed(snapshotIntState2);
                objRememberedValue2 = composer2.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new LimitPickerComposable2(j5, snapshotIntState2, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 6);
                    if (snapshotIntState2.getIntValue() <= 0) {
                    }
                    Modifier modifier52 = modifier4;
                    AnimatedVisibilityKt.AnimatedVisibility(snapshotIntState2.getIntValue() <= 0, (Modifier) null, EnterExitTransitionKt.slideInVertically$default(null, null, 3, null), (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(988480189, true, new C124782(modifier52, j2, depositBy, duxo, j, snapshotIntState2), composer2, 54), composer2, 196992, 26);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                    j6 = j5;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        j4 = j3;
        if ((i3 & 74899) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 AnimatedCreditLimitPicker$lambda$1$lambda$0() {
        return SnapshotIntState3.mutableIntStateOf(0);
    }

    /* compiled from: LimitPickerComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitPickerComposableKt$AnimatedCreditLimitPicker$2 */
    static final class C124782 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ String $depositBy;
        final /* synthetic */ LimitRevealDuxo $duxo;
        final /* synthetic */ long $higherLimit;
        final /* synthetic */ long $limit;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ SnapshotIntState2 $step$delegate;

        C124782(Modifier modifier, long j, String str, LimitRevealDuxo limitRevealDuxo, long j2, SnapshotIntState2 snapshotIntState2) {
            this.$modifier = modifier;
            this.$higherLimit = j;
            this.$depositBy = str;
            this.$duxo = limitRevealDuxo;
            this.$limit = j2;
            this.$step$delegate = snapshotIntState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(988480189, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.AnimatedCreditLimitPicker.<anonymous> (LimitPickerComposable.kt:50)");
            }
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(this.$modifier, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 1, null);
            long j = this.$higherLimit;
            String str = this.$depositBy;
            final LimitRevealDuxo limitRevealDuxo = this.$duxo;
            long j2 = this.$limit;
            SnapshotIntState2 snapshotIntState2 = this.$step$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion2, LimitPickerComposable.ANIMATED_CREDIT_LIMIT_PICKER_OPTION_WITH_DEPOSIT);
            String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_upsell_premium_title, new Object[]{LimitRevealComposable2.toDollars(j)}, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_upsell_premium_subtitle, new Object[]{str}, composer, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_upsell_premium_label, composer, 0);
            BentoColor bentoColor = BentoColor.INSTANCE;
            long jM21138getCCGoldAccent0d7_KjU = bentoColor.m21138getCCGoldAccent0d7_KjU();
            boolean selectedPremium = ((LimitRevealState) FlowExtKt.collectAsStateWithLifecycle(limitRevealDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7).getValue()).getSelectedPremium();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(limitRevealDuxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitPickerComposableKt$AnimatedCreditLimitPicker$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LimitPickerComposable.C124782.invoke$lambda$8$lambda$1$lambda$0(limitRevealDuxo);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LimitOptionComposable.m12776LimitOptionComposableyZUFuyM(selectedPremium, (Function0) objRememberedValue, strStringResource, strStringResource2, strStringResource3, Color.m6701boximpl(jM21138getCCGoldAccent0d7_KjU), modifierTestTag, composer, 1572864, 0);
            final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(LimitPickerComposable.AnimatedCreditLimitPicker$lambda$2(snapshotIntState2) >= 2 ? 1.0f : 0.0f, AnimationSpecKt.tween$default(400, 0, null, 6, null), 0.0f, null, null, composer, 48, 28);
            final SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI = AnimateAsState.m4812animateDpAsStateAjpBEmI(C2002Dp.m7995constructorimpl(LimitPickerComposable.AnimatedCreditLimitPicker$lambda$2(snapshotIntState2) >= 2 ? 0 : 30), AnimationSpecKt.tween$default(400, 0, null, 6, null), null, null, composer, 48, 12);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(snapshotState4M4812animateDpAsStateAjpBEmI) | composer.changed(snapshotState4AnimateFloatAsState);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitPickerComposableKt$AnimatedCreditLimitPicker$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LimitPickerComposable.C124782.invoke$lambda$8$lambda$5$lambda$4(snapshotState4M4812animateDpAsStateAjpBEmI, snapshotState4AnimateFloatAsState, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierTestTag2 = TestTag3.testTag(GraphicsLayerModifier6.graphicsLayer(companion2, (Function1) objRememberedValue2), LimitPickerComposable.ANIMATED_CREDIT_LIMIT_PICKER_OPTION);
            String dollars = LimitRevealComposable2.toDollars(j2);
            String strStringResource4 = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_upsell_regular_subtitle, composer, 0);
            String strStringResource5 = StringResources_androidKt.stringResource(C12201R.string.credit_app_limit_reveal_upsell_regular_label, composer, 0);
            long jM21144getCCGoldFG20d7_KjU = bentoColor.m21144getCCGoldFG20d7_KjU();
            boolean z = !((LimitRevealState) FlowExtKt.collectAsStateWithLifecycle(limitRevealDuxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7).getValue()).getSelectedPremium();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(limitRevealDuxo);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitPickerComposableKt$AnimatedCreditLimitPicker$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LimitPickerComposable.C124782.invoke$lambda$8$lambda$7$lambda$6(limitRevealDuxo);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            LimitOptionComposable.m12776LimitOptionComposableyZUFuyM(z, (Function0) objRememberedValue3, dollars, strStringResource4, strStringResource5, Color.m6701boximpl(jM21144getCCGoldFG20d7_KjU), modifierTestTag2, composer, 0, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$1$lambda$0(LimitRevealDuxo limitRevealDuxo) {
            limitRevealDuxo.onPremiumSelected();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$5$lambda$4(SnapshotState4 snapshotState4, SnapshotState4 snapshotState42, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setTranslationY(graphicsLayer.mo5016toPx0680j_4(invoke$lambda$8$lambda$3(snapshotState4)));
            graphicsLayer.setAlpha(invoke$lambda$8$lambda$2(snapshotState42));
            return Unit.INSTANCE;
        }

        private static final float invoke$lambda$8$lambda$2(SnapshotState4<Float> snapshotState4) {
            return snapshotState4.getValue().floatValue();
        }

        private static final float invoke$lambda$8$lambda$3(SnapshotState4<C2002Dp> snapshotState4) {
            return snapshotState4.getValue().getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7$lambda$6(LimitRevealDuxo limitRevealDuxo) {
            limitRevealDuxo.onStandardSelected();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AnimatedCreditLimitPicker$lambda$2(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }
}
