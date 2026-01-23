package com.robinhood.android.transfers.p271ui.common;

import android.view.KeyEvent;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ScaffoldKt;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.transfers.p271ui.common.TransferAmountEntryLayout2;
import com.robinhood.compose.bento.component.numpad.BentoNumpad3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferAmountEntryLayout.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001am\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0011\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/common/AmountEntryState;", "state", "Lkotlin/Function0;", "", "topBar", "amountContent", "reviewContent", "numpadButtonContent", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "onNumpadKeyPress", "Landroidx/compose/ui/Modifier;", "modifier", "TransferAmountEntryLayout", "(Lcom/robinhood/android/transfers/ui/common/AmountEntryState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "buttonContent", "onKeyPress", "NumpadArea", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.common.TransferAmountEntryLayoutKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferAmountEntryLayout2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NumpadArea$lambda$2(Function2 function2, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NumpadArea(function2, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferAmountEntryLayout$lambda$0(TransferAmountEntryLayout transferAmountEntryLayout, Function2 function2, Function2 function22, Function2 function23, Function2 function24, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TransferAmountEntryLayout(transferAmountEntryLayout, function2, function22, function23, function24, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TransferAmountEntryLayout(final TransferAmountEntryLayout state, final Function2<? super Composer, ? super Integer, Unit> topBar, final Function2<? super Composer, ? super Integer, Unit> amountContent, final Function2<? super Composer, ? super Integer, Unit> reviewContent, final Function2<? super Composer, ? super Integer, Unit> numpadButtonContent, final Function1<? super KeyEvent, Unit> onNumpadKeyPress, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(topBar, "topBar");
        Intrinsics.checkNotNullParameter(amountContent, "amountContent");
        Intrinsics.checkNotNullParameter(reviewContent, "reviewContent");
        Intrinsics.checkNotNullParameter(numpadButtonContent, "numpadButtonContent");
        Intrinsics.checkNotNullParameter(onNumpadKeyPress, "onNumpadKeyPress");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1800862014);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(topBar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(amountContent) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(reviewContent) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(numpadButtonContent) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNumpadKeyPress) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            i4 = i3;
            if ((599187 & i4) == 599186 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1800862014, i4, -1, "com.robinhood.android.transfers.ui.common.TransferAmountEntryLayout (TransferAmountEntryLayout.kt:38)");
                }
                Modifier modifier4 = modifier2;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier4, topBar, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(66463891, true, new C305771(state, amountContent, numpadButtonContent, onNumpadKeyPress, reviewContent), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 18) & 14) | 805306368 | (i4 & 112), 508);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.common.TransferAmountEntryLayoutKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TransferAmountEntryLayout2.TransferAmountEntryLayout$lambda$0(state, topBar, amountContent, reviewContent, numpadButtonContent, onNumpadKeyPress, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        i4 = i3;
        if ((599187 & i4) == 599186) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifier42 = modifier2;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier42, topBar, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(66463891, true, new C305771(state, amountContent, numpadButtonContent, onNumpadKeyPress, reviewContent), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 18) & 14) | 805306368 | (i4 & 112), 508);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: TransferAmountEntryLayout.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.common.TransferAmountEntryLayoutKt$TransferAmountEntryLayout$1 */
    static final class C305771 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ Function2<Composer, Integer, Unit> $amountContent;
        final /* synthetic */ Function2<Composer, Integer, Unit> $numpadButtonContent;
        final /* synthetic */ Function1<KeyEvent, Unit> $onNumpadKeyPress;
        final /* synthetic */ Function2<Composer, Integer, Unit> $reviewContent;
        final /* synthetic */ TransferAmountEntryLayout $state;

        /* compiled from: TransferAmountEntryLayout.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ui.common.TransferAmountEntryLayoutKt$TransferAmountEntryLayout$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TransferAmountEntryLayout.values().length];
                try {
                    iArr[TransferAmountEntryLayout.INPUT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TransferAmountEntryLayout.REVIEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C305771(TransferAmountEntryLayout transferAmountEntryLayout, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function1<? super KeyEvent, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function23) {
            this.$state = transferAmountEntryLayout;
            this.$amountContent = function2;
            this.$numpadButtonContent = function22;
            this.$onNumpadKeyPress = function1;
            this.$reviewContent = function23;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$7$lambda$6$lambda$5$lambda$1(int i) {
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$7$lambda$6$lambda$5$lambda$2(int i) {
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$7$lambda$6$lambda$5$lambda$3(int i) {
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int invoke$lambda$7$lambda$6$lambda$5$lambda$4(int i) {
            return i;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ContentTransform invoke$lambda$7$lambda$6$lambda$5(TransferAmountEntryLayout transferAmountEntryLayout, AnimatedContentTransitionScope AnimatedContent) {
            ContentTransform contentTransform;
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            int i = WhenMappings.$EnumSwitchMapping$0[transferAmountEntryLayout.ordinal()];
            if (i == 1) {
                contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.transfers.ui.common.TransferAmountEntryLayoutKt$TransferAmountEntryLayout$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(TransferAmountEntryLayout2.C305771.invoke$lambda$7$lambda$6$lambda$5$lambda$1(((Integer) obj).intValue()));
                    }
                }).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 0, null, 6, null), 0.0f, 2, null)), EnterExitTransitionKt.slideOutVertically(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.transfers.ui.common.TransferAmountEntryLayoutKt$TransferAmountEntryLayout$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(TransferAmountEntryLayout2.C305771.invoke$lambda$7$lambda$6$lambda$5$lambda$2(((Integer) obj).intValue()));
                    }
                }).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 0, null, 6, null), 0.0f, 2, null)));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                contentTransform = AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInVertically(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.transfers.ui.common.TransferAmountEntryLayoutKt$TransferAmountEntryLayout$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(TransferAmountEntryLayout2.C305771.invoke$lambda$7$lambda$6$lambda$5$lambda$3(((Integer) obj).intValue()));
                    }
                }).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 0, null, 6, null), 0.0f, 2, null)), EnterExitTransitionKt.slideOutVertically(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.transfers.ui.common.TransferAmountEntryLayoutKt$TransferAmountEntryLayout$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(TransferAmountEntryLayout2.C305771.invoke$lambda$7$lambda$6$lambda$5$lambda$4(((Integer) obj).intValue()));
                    }
                }).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 0, null, 6, null), 0.0f, 2, null)));
            }
            return AnimatedContent.using(contentTransform, AnimatedContentKt.SizeTransform$default(false, null, 2, null));
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(66463891, i2, -1, "com.robinhood.android.transfers.ui.common.TransferAmountEntryLayout.<anonymous> (TransferAmountEntryLayout.kt:43)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion, paddingValues), 0.0f, 1, null);
            final TransferAmountEntryLayout transferAmountEntryLayout = this.$state;
            Function2<Composer, Integer, Unit> function2 = this.$amountContent;
            final Function2<Composer, Integer, Unit> function22 = this.$numpadButtonContent;
            final Function1<KeyEvent, Unit> function1 = this.$onNumpadKeyPress;
            final Function2<Composer, Integer, Unit> function23 = this.$reviewContent;
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(AnimationModifier.animateContentSize$default(Column6.INSTANCE.weight(companion, 1.0f, true), AnimationSpecKt.tween$default(EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 0, null, 6, null), null, 2, null), 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composer, 0);
            composer.endNode();
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(transferAmountEntryLayout.ordinal());
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.ui.common.TransferAmountEntryLayoutKt$TransferAmountEntryLayout$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TransferAmountEntryLayout2.C305771.invoke$lambda$7$lambda$6$lambda$5(transferAmountEntryLayout, (AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(transferAmountEntryLayout, modifierFillMaxWidth$default2, (Function1) objRememberedValue, null, null, null, ComposableLambda3.rememberComposableLambda(53085081, true, new Function4<AnimatedContentScope, TransferAmountEntryLayout, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.common.TransferAmountEntryLayoutKt$TransferAmountEntryLayout$1$1$3

                /* compiled from: TransferAmountEntryLayout.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.android.transfers.ui.common.TransferAmountEntryLayoutKt$TransferAmountEntryLayout$1$1$3$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[TransferAmountEntryLayout.values().length];
                        try {
                            iArr[TransferAmountEntryLayout.INPUT.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[TransferAmountEntryLayout.REVIEW.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, TransferAmountEntryLayout transferAmountEntryLayout2, Composer composer2, Integer num) {
                    invoke(animatedContentScope, transferAmountEntryLayout2, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, TransferAmountEntryLayout state, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(state, "state");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(53085081, i3, -1, "com.robinhood.android.transfers.ui.common.TransferAmountEntryLayout.<anonymous>.<anonymous>.<anonymous> (TransferAmountEntryLayout.kt:89)");
                    }
                    int i4 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                    if (i4 == 1) {
                        composer2.startReplaceGroup(909781539);
                        TransferAmountEntryLayout2.NumpadArea(function22, function1, SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), composer2, 384, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (i4 != 2) {
                            composer2.startReplaceGroup(-524843298);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(910176138);
                        function23.invoke(composer2, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 1572912, 56);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NumpadArea(final Function2<? super Composer, ? super Integer, Unit> function2, final Function1<? super KeyEvent, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1464546115);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1464546115, i3, -1, "com.robinhood.android.transfers.ui.common.NumpadArea (TransferAmountEntryLayout.kt:114)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                function2.invoke(composerStartRestartGroup, Integer.valueOf(i3 & 14));
                BentoNumpad3.BentoNumpad(null, function1, true, null, true, false, composerStartRestartGroup, (i3 & 112) | 28032, 33);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.common.TransferAmountEntryLayoutKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TransferAmountEntryLayout2.NumpadArea$lambda$2(function2, function1, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                function2.invoke(composerStartRestartGroup, Integer.valueOf(i3 & 14));
                BentoNumpad3.BentoNumpad(null, function1, true, null, true, false, composerStartRestartGroup, (i3 & 112) | 28032, 33);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
