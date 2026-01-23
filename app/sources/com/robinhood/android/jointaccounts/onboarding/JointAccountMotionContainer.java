package com.robinhood.android.jointaccounts.onboarding;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.Updater;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieClipSpec;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.android.jointaccounts.onboarding.JointAccountOnboardingAsset;
import com.robinhood.android.responsive.WindowSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: JointAccountMotionContainer.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ap\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u001f\u0010\u0010\u001a\u001b\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0017²\u0006\u000e\u0010\u0014\u001a\u0004\u0018\u00010\u00138\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0016\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset;", "asset", "", "showCloseButton", "Lkotlin/Function0;", "", "onCloseClicked", "Landroidx/compose/ui/Modifier;", "modifier", "", "animationLoopStartFrame", "animationLoopEndFrame", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Lkotlin/ExtensionFunctionType;", "bodyContent", "JointAccountMotionContainer", "(Lcom/robinhood/android/jointaccounts/onboarding/JointAccountOnboardingAsset;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "Lcom/airbnb/lottie/LottieComposition;", "lottieComposition", "startFrame", "lottieProgress", "feature-joint-account-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.jointaccounts.onboarding.JointAccountMotionContainerKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class JointAccountMotionContainer {

    /* compiled from: JointAccountMotionContainer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.jointaccounts.onboarding.JointAccountMotionContainerKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WindowSize.values().length];
            try {
                iArr[WindowSize.Compact.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WindowSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WindowSize.Expanded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit JointAccountMotionContainer$lambda$14(JointAccountOnboardingAsset jointAccountOnboardingAsset, boolean z, Function0 function0, Modifier modifier, Integer num, Integer num2, Function4 function4, int i, int i2, Composer composer, int i3) {
        JointAccountMotionContainer(jointAccountOnboardingAsset, z, function0, modifier, num, num2, function4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void JointAccountMotionContainer(final JointAccountOnboardingAsset asset, final boolean z, final Function0<Unit> onCloseClicked, Modifier modifier, Integer num, Integer num2, final Function4<? super Column5, ? super Float, ? super Composer, ? super Integer, Unit> bodyContent, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        Integer num3;
        int i6;
        Integer num4;
        boolean z2;
        Object objRememberedValue;
        float f;
        Integer num5;
        int i7;
        Integer num6;
        boolean z3;
        Float f2;
        boolean z4;
        SnapshotIntState2 snapshotIntState2;
        int i8;
        final Integer num7;
        final Modifier modifier3;
        final Integer num8;
        ContentScale fillWidth;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(onCloseClicked, "onCloseClicked");
        Intrinsics.checkNotNullParameter(bodyContent, "bodyContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1073641087);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(asset) : composerStartRestartGroup.changedInstance(asset) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onCloseClicked) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        num3 = num;
                        i3 |= composerStartRestartGroup.changed(num3) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((196608 & i) == 0) {
                            num4 = num2;
                            i3 |= composerStartRestartGroup.changed(num4) ? 131072 : 65536;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(bodyContent) ? 1048576 : 524288;
                        }
                        if ((i3 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            num7 = num3;
                            num8 = num4;
                        } else {
                            Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            Integer num9 = i5 == 0 ? null : num3;
                            Integer num10 = i6 == 0 ? null : num4;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1073641087, i3, -1, "com.robinhood.android.jointaccounts.onboarding.JointAccountMotionContainer (JointAccountMotionContainer.kt:35)");
                            }
                            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(asset.getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            int i9 = 57344 & i3;
                            z2 = i9 != 16384;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(JointAccountMotionContainer$lambda$0(lottieCompositionResultRememberLottieComposition), false, false, false, new LottieClipSpec.Frame(Integer.valueOf(snapshotIntState22.getIntValue()), num10, true), 0.0f, num10 == null ? Integer.MAX_VALUE : 1, null, false, false, composerStartRestartGroup, (LottieClipSpec.Frame.$stable << 12) | 384, 938);
                            LottieComposition lottieCompositionJointAccountMotionContainer$lambda$0 = JointAccountMotionContainer$lambda$0(lottieCompositionResultRememberLottieComposition);
                            Float fValueOf = lottieCompositionJointAccountMotionContainer$lambda$0 == null ? Float.valueOf(lottieCompositionJointAccountMotionContainer$lambda$0.getFrameForProgress(JointAccountMotionContainer$lambda$4(lottieAnimationStateAnimateLottieCompositionAsState))) : null;
                            Integer num11 = num9;
                            if (asset instanceof JointAccountOnboardingAsset.Fullscreen) {
                                int i10 = i3;
                                f = 0.0f;
                                num5 = num10;
                                Float f3 = fValueOf;
                                i7 = 6;
                                if (!(asset instanceof JointAccountOnboardingAsset.Hero)) {
                                    composerStartRestartGroup.startReplaceGroup(976967333);
                                    composerStartRestartGroup.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composerStartRestartGroup.startReplaceGroup(222722915);
                                Modifier modifierGradientBackground = Components5.gradientBackground(modifier4);
                                Alignment.Companion companion = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierGradientBackground);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                JointAccountOnboardingAsset.Hero hero = (JointAccountOnboardingAsset.Hero) asset;
                                Modifier modifierWeight$default = Column5.weight$default(column6, companion3, hero.getWeight(), false, 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor2);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                LottieComposition lottieCompositionJointAccountMotionContainer$lambda$02 = JointAccountMotionContainer$lambda$0(lottieCompositionResultRememberLottieComposition);
                                ContentScale fit = ContentScale.INSTANCE.getFit();
                                Alignment center = companion.getCenter();
                                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion3, hero.getPadding(composerStartRestartGroup, 0));
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.JointAccountMotionContainerKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Float.valueOf(JointAccountMotionContainer.JointAccountMotionContainer$lambda$4(lottieAnimationStateAnimateLottieCompositionAsState));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                num6 = num11;
                                LottieAnimation2.LottieAnimation(lottieCompositionJointAccountMotionContainer$lambda$02, (Function0) objRememberedValue2, modifierM5142padding3ABfNKs, false, false, false, null, false, null, center, fit, false, false, null, null, false, composerStartRestartGroup, 805306368, 6, 63992);
                                composerStartRestartGroup = composerStartRestartGroup;
                                z3 = true;
                                f2 = f3;
                                z4 = false;
                                snapshotIntState2 = snapshotIntState22;
                                i8 = i9;
                                Components5.m15754JointAccountOnboardingAppBaruDo3WH8(onCloseClicked, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), z, 0L, true, composerStartRestartGroup, ((i10 >> 6) & 14) | 24624 | ((i10 << 3) & 896), 8);
                                composerStartRestartGroup.endNode();
                                bodyContent.invoke(column6, f2, composerStartRestartGroup, Integer.valueOf(6 | ((i10 >> 12) & 896)));
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                composerStartRestartGroup.startReplaceGroup(221249144);
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Components5.gradientBackground(modifier4), 0.0f, 1, null);
                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor3);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                LottieComposition lottieCompositionJointAccountMotionContainer$lambda$03 = JointAccountMotionContainer$lambda$0(lottieCompositionResultRememberLottieComposition);
                                int i11 = WhenMappings.$EnumSwitchMapping$0[WindowSize.INSTANCE.getCurrentWidth(composerStartRestartGroup, 6).ordinal()];
                                if (i11 == 1) {
                                    fillWidth = ContentScale.INSTANCE.getFillWidth();
                                } else {
                                    if (i11 != 2 && i11 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    fillWidth = ContentScale.INSTANCE.getFillHeight();
                                }
                                ContentScale contentScale = fillWidth;
                                Alignment center2 = companion4.getCenter();
                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                JointAccountOnboardingAsset.Fullscreen fullscreen = (JointAccountOnboardingAsset.Fullscreen) asset;
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, fullscreen.getTopPadding(composerStartRestartGroup, 0), 0.0f, 0.0f, 13, null);
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                boolean zChanged2 = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.jointaccounts.onboarding.JointAccountMotionContainerKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Float.valueOf(JointAccountMotionContainer.JointAccountMotionContainer$lambda$4(lottieAnimationStateAnimateLottieCompositionAsState));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Float f4 = fValueOf;
                                LottieAnimation2.LottieAnimation(lottieCompositionJointAccountMotionContainer$lambda$03, (Function0) objRememberedValue3, modifierM5146paddingqDBjuR0$default, false, false, false, null, false, null, center2, contentScale, false, false, null, null, false, composerStartRestartGroup, 805306368, 0, 63992);
                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion4.getCenterHorizontally(), composerStartRestartGroup, 48);
                                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor4);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                f = 0.0f;
                                composerStartRestartGroup = composerStartRestartGroup;
                                num5 = num10;
                                i7 = 6;
                                Components5.m15754JointAccountOnboardingAppBaruDo3WH8(onCloseClicked, SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), z, 0L, true, composerStartRestartGroup, ((i3 << 3) & 896) | ((i3 >> 6) & 14) | 24624, 8);
                                Spacer2.Spacer(Column5.weight$default(column62, companion6, fullscreen.getSpacerWeight(), false, 2, null), composerStartRestartGroup, 0);
                                bodyContent.invoke(column62, f4, composerStartRestartGroup, Integer.valueOf(6 | ((i3 >> 12) & 896)));
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endReplaceGroup();
                                z4 = false;
                                f2 = f4;
                                num6 = num11;
                                snapshotIntState2 = snapshotIntState22;
                                i8 = i9;
                                z3 = true;
                            }
                            if (num6 != null) {
                                if ((f2 != null ? f2.floatValue() : f) > num6.intValue() && snapshotIntState2.getIntValue() == 0) {
                                    Unit unit = Unit.INSTANCE;
                                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                                    boolean zChanged3 = composerStartRestartGroup.changed(snapshotIntState2);
                                    if (i8 != 16384) {
                                        z3 = z4;
                                    }
                                    boolean z5 = zChanged3 | z3;
                                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (z5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new JointAccountMotionContainer2(num6, snapshotIntState2, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i7);
                                }
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            num7 = num6;
                            modifier3 = modifier4;
                            num8 = num5;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.jointaccounts.onboarding.JointAccountMotionContainerKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return JointAccountMotionContainer.JointAccountMotionContainer$lambda$14(asset, z, onCloseClicked, modifier3, num7, num8, bodyContent, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    num4 = num2;
                    if ((i2 & 64) != 0) {
                    }
                    if ((i3 & 599187) == 599186) {
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(asset.getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        int i92 = 57344 & i3;
                        if (i92 != 16384) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z2) {
                            objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            SnapshotIntState2 snapshotIntState222 = (SnapshotIntState2) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState2 = animateLottieCompositionAsState.animateLottieCompositionAsState(JointAccountMotionContainer$lambda$0(lottieCompositionResultRememberLottieComposition2), false, false, false, new LottieClipSpec.Frame(Integer.valueOf(snapshotIntState222.getIntValue()), num10, true), 0.0f, num10 == null ? Integer.MAX_VALUE : 1, null, false, false, composerStartRestartGroup, (LottieClipSpec.Frame.$stable << 12) | 384, 938);
                            LottieComposition lottieCompositionJointAccountMotionContainer$lambda$04 = JointAccountMotionContainer$lambda$0(lottieCompositionResultRememberLottieComposition2);
                            if (lottieCompositionJointAccountMotionContainer$lambda$04 == null) {
                            }
                            Integer num112 = num9;
                            if (asset instanceof JointAccountOnboardingAsset.Fullscreen) {
                            }
                            if (num6 != null) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            num7 = num6;
                            modifier3 = modifier4;
                            num8 = num5;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                num3 = num;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                num4 = num2;
                if ((i2 & 64) != 0) {
                }
                if ((i3 & 599187) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            num3 = num;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            num4 = num2;
            if ((i2 & 64) != 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        num3 = num;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        num4 = num2;
        if ((i2 & 64) != 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final LottieComposition JointAccountMotionContainer$lambda$0(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float JointAccountMotionContainer$lambda$4(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }
}
