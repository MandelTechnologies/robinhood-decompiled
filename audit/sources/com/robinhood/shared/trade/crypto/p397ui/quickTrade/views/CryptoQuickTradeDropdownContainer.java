package com.robinhood.shared.trade.crypto.p397ui.quickTrade.views;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.MenuDefaults;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.crypto.contracts.CryptoOrderIntentKey;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.crypto.p375ui.C38572R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoQuickTradeDropdownContainer.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\bH\u0000¨\u0006\u0010"}, m3636d2 = {"CryptoQuickTradeDropdownContainer", "", "show", "", "onDismissRequest", "Lkotlin/Function0;", "onOrderTypeClicked", "Lkotlin/Function1;", "Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$OrderType;", "state", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CryptoQuickTradeDropdownState;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/robinhood/shared/trade/crypto/ui/quickTrade/views/CryptoQuickTradeDropdownState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toDisplayStringRes", "", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainerKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoQuickTradeDropdownContainer {

    /* compiled from: CryptoQuickTradeDropdownContainer.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainerKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoOrderIntentKey.OrderType.values().length];
            try {
                iArr[CryptoOrderIntentKey.OrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoOrderIntentKey.OrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoOrderIntentKey.OrderType.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CryptoOrderIntentKey.OrderType.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CryptoOrderIntentKey.OrderType.RECURRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CryptoOrderIntentKey.OrderType.TAX_LOTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CryptoQuickTradeDropdownContainer$lambda$7$lambda$4$lambda$3(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CryptoQuickTradeDropdownContainer$lambda$7$lambda$6$lambda$5(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoQuickTradeDropdownContainer$lambda$8(boolean z, Function0 function0, Function1 function1, CryptoQuickTradeDropdownState cryptoQuickTradeDropdownState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoQuickTradeDropdownContainer(z, function0, function1, cryptoQuickTradeDropdownState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoQuickTradeDropdownContainer(final boolean z, final Function0<Unit> onDismissRequest, final Function1<? super CryptoOrderIntentKey.OrderType, Unit> onOrderTypeClicked, final CryptoQuickTradeDropdownState state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifierTestTag;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(onOrderTypeClicked, "onOrderTypeClicked");
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-586693092);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOrderTypeClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-586693092, i3, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainer (CryptoQuickTradeDropdownContainer.kt:48)");
                }
                composerStartRestartGroup.startReplaceGroup(-1171328460);
                if (z) {
                    modifierTestTag = Modifier.INSTANCE;
                } else {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue3 == companion3.getEmpty()) {
                        objRememberedValue3 = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean z2 = (i3 & 112) == 32;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue4 == companion3.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainerKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoQuickTradeDropdownContainer.CryptoQuickTradeDropdownContainer$lambda$2$lambda$1(onDismissRequest);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifierTestTag = TestTag3.testTag(ClickableKt.m4891clickableO2vRcR0$default(companion2, interactionSource3, null, false, null, null, (Function0) objRememberedValue4, 28, null), CryptoQuickTradeDropdownContainer4.DROPDOWN_BACKGROUND);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen = modifier4.then(modifierTestTag);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion5.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(CryptoQuickTradeDropdownContainer.CryptoQuickTradeDropdownContainer$lambda$7$lambda$4$lambda$3(((Integer) obj).intValue()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EnterTransition enterTransitionPlus = EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue, 1, null).plus(EnterExitTransitionKt.expandVertically$default(null, companion4.getBottom(), false, null, 13, null)).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(CryptoQuickTradeDropdownContainer.CryptoQuickTradeDropdownContainer$lambda$7$lambda$6$lambda$5(((Integer) obj).intValue()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                AnimatedVisibilityKt.AnimatedVisibility(z, PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance.align(Modifier.INSTANCE, companion4.getTopEnd()), 0.0f, C2002Dp.m7995constructorimpl(46), C2002Dp.m7995constructorimpl(16), 0.0f, 9, null), enterTransitionPlus, EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue2, 1, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, companion4.getBottom(), false, null, 13, null)).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambda3.rememberComposableLambda(1624458234, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainerKt$CryptoQuickTradeDropdownContainer$3$3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: CryptoQuickTradeDropdownContainer.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainerKt$CryptoQuickTradeDropdownContainer$3$3$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Function1<CryptoOrderIntentKey.OrderType, Unit> $onOrderTypeClicked;
                        final /* synthetic */ CryptoQuickTradeDropdownState $state;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(CryptoQuickTradeDropdownState cryptoQuickTradeDropdownState, Function1<? super CryptoOrderIntentKey.OrderType, Unit> function1) {
                            this.$state = cryptoQuickTradeDropdownState;
                            this.$onOrderTypeClicked = function1;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            Composer composer2 = composer;
                            int i2 = 2;
                            if ((i & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-578688939, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainer.<anonymous>.<anonymous>.<anonymous> (CryptoQuickTradeDropdownContainer.kt:92)");
                            }
                            int i3 = 0;
                            int i4 = 1;
                            float f = 0.0f;
                            Object obj = null;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null);
                            CryptoQuickTradeDropdownState cryptoQuickTradeDropdownState = this.$state;
                            final Function1<CryptoOrderIntentKey.OrderType, Unit> function1 = this.$onOrderTypeClicked;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composer2.startReplaceGroup(577643835);
                            int i5 = 0;
                            for (CryptoOrderIntentKey.OrderType orderType : cryptoQuickTradeDropdownState.getTypes()) {
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                final CryptoOrderIntentKey.OrderType orderType2 = orderType;
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                composer2.startReplaceGroup(1849434622);
                                Object objRememberedValue = composer2.rememberedValue();
                                Composer.Companion companion3 = Composer.INSTANCE;
                                if (objRememberedValue == companion3.getEmpty()) {
                                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChanged = composer2.changed(function1) | composer2.changed(orderType2.ordinal());
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                                    objRememberedValue2 = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x012f: CONSTRUCTOR (r11v8 'objRememberedValue2' java.lang.Object) = 
                                          (r8v2 'function1' kotlin.jvm.functions.Function1<com.robinhood.android.crypto.contracts.CryptoOrderIntentKey$OrderType, kotlin.Unit> A[DONT_INLINE])
                                          (r4v9 'orderType2' com.robinhood.android.crypto.contracts.CryptoOrderIntentKey$OrderType A[DONT_INLINE])
                                         A[MD:(kotlin.jvm.functions.Function1, com.robinhood.android.crypto.contracts.CryptoOrderIntentKey$OrderType):void (m)] (LINE:104) call: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainerKt$CryptoQuickTradeDropdownContainer$3$3$1$$ExternalSyntheticLambda0.<init>(kotlin.jvm.functions.Function1, com.robinhood.android.crypto.contracts.CryptoOrderIntentKey$OrderType):void type: CONSTRUCTOR in method: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainerKt$CryptoQuickTradeDropdownContainer$3$3.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes12.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:207)
                                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainerKt$CryptoQuickTradeDropdownContainer$3$3$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 31 more
                                        */
                                    /*
                                        Method dump skipped, instructions count: 784
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoQuickTradeDropdownContainer2.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$5$lambda$4$lambda$2$lambda$1(Function1 function1, CryptoOrderIntentKey.OrderType orderType) {
                                    function1.invoke(orderType);
                                    return Unit.INSTANCE;
                                }
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1624458234, i5, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainer.<anonymous>.<anonymous> (CryptoQuickTradeDropdownContainer.kt:87)");
                                }
                                SurfaceKt.m5967SurfaceT9BRK9s(null, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(16)), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, 0.0f, MenuDefaults.INSTANCE.m5880getShadowElevationD9Ej5fM(), null, ComposableLambda3.rememberComposableLambda(-578688939, true, new AnonymousClass1(state, onOrderTypeClicked), composer2, 54), composer2, 12582912, 89);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 200064 | (i3 & 14), 16);
                        composerStartRestartGroup.endNode();
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
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainerKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoQuickTradeDropdownContainer.CryptoQuickTradeDropdownContainer$lambda$8(z, onDismissRequest, onOrderTypeClicked, state, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                modifier2 = modifier;
                if ((i3 & 9363) == 9362) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(-1171328460);
                    if (z) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierThen2 = modifier4.then(modifierTestTag);
                    Alignment.Companion companion42 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion42.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
                    ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion52.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion52.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion52.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion52.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion52.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EnterTransition enterTransitionPlus2 = EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue, 1, null).plus(EnterExitTransitionKt.expandVertically$default(null, companion42.getBottom(), false, null, 13, null)).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        AnimatedVisibilityKt.AnimatedVisibility(z, PaddingKt.m5146paddingqDBjuR0$default(boxScopeInstance2.align(Modifier.INSTANCE, companion42.getTopEnd()), 0.0f, C2002Dp.m7995constructorimpl(46), C2002Dp.m7995constructorimpl(16), 0.0f, 9, null), enterTransitionPlus2, EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue2, 1, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, companion42.getBottom(), false, null, 13, null)).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambda3.rememberComposableLambda(1624458234, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainerKt$CryptoQuickTradeDropdownContainer$3$3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* compiled from: CryptoQuickTradeDropdownContainer.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainerKt$CryptoQuickTradeDropdownContainer$3$3$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ Function1<CryptoOrderIntentKey.OrderType, Unit> $onOrderTypeClicked;
                                final /* synthetic */ CryptoQuickTradeDropdownState $state;

                                /* JADX WARN: Multi-variable type inference failed */
                                AnonymousClass1(CryptoQuickTradeDropdownState cryptoQuickTradeDropdownState, Function1<? super CryptoOrderIntentKey.OrderType, Unit> function1) {
                                    this.$state = cryptoQuickTradeDropdownState;
                                    this.$onOrderTypeClicked = function1;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x012f: CONSTRUCTOR (r11v8 'objRememberedValue2' java.lang.Object) = 
                                      (r8v2 'function1' kotlin.jvm.functions.Function1<com.robinhood.android.crypto.contracts.CryptoOrderIntentKey$OrderType, kotlin.Unit> A[DONT_INLINE])
                                      (r4v9 'orderType2' com.robinhood.android.crypto.contracts.CryptoOrderIntentKey$OrderType A[DONT_INLINE])
                                     A[MD:(kotlin.jvm.functions.Function1, com.robinhood.android.crypto.contracts.CryptoOrderIntentKey$OrderType):void (m)] (LINE:104) call: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainerKt$CryptoQuickTradeDropdownContainer$3$3$1$$ExternalSyntheticLambda0.<init>(kotlin.jvm.functions.Function1, com.robinhood.android.crypto.contracts.CryptoOrderIntentKey$OrderType):void type: CONSTRUCTOR in method: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainerKt$CryptoQuickTradeDropdownContainer$3$3.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes12.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:207)
                                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainerKt$CryptoQuickTradeDropdownContainer$3$3$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 26 more
                                    */
                                public final void invoke(androidx.compose.runtime.Composer r56, int r57) {
                                    /*
                                        Method dump skipped, instructions count: 784
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoQuickTradeDropdownContainer2.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$5$lambda$4$lambda$2$lambda$1(Function1 function1, CryptoOrderIntentKey.OrderType orderType) {
                                    function1.invoke(orderType);
                                    return Unit.INSTANCE;
                                }
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i5) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1624458234, i5, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeDropdownContainer.<anonymous>.<anonymous> (CryptoQuickTradeDropdownContainer.kt:87)");
                                }
                                SurfaceKt.m5967SurfaceT9BRK9s(null, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(16)), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, 0.0f, MenuDefaults.INSTANCE.m5880getShadowElevationD9Ej5fM(), null, ComposableLambda3.rememberComposableLambda(-578688939, true, new AnonymousClass1(state, onOrderTypeClicked), composer2, 54), composer2, 12582912, 89);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 200064 | (i3 & 14), 16);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit CryptoQuickTradeDropdownContainer$lambda$2$lambda$1(Function0 function0) {
                function0.invoke();
                return Unit.INSTANCE;
            }

            public static final int toDisplayStringRes(CryptoOrderIntentKey.OrderType orderType) {
                Intrinsics.checkNotNullParameter(orderType, "<this>");
                switch (WhenMappings.$EnumSwitchMapping$0[orderType.ordinal()]) {
                    case 1:
                        return C38572R.string.crypto_order_type_market_label;
                    case 2:
                        return C38572R.string.crypto_order_type_limit_label;
                    case 3:
                        return C38572R.string.crypto_order_type_stop_loss_label;
                    case 4:
                        return C38572R.string.crypto_order_type_stop_limit_label;
                    case 5:
                        return C38572R.string.crypto_order_type_recurring_label;
                    case 6:
                        return C38572R.string.crypto_order_type_tax_lots_label;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }
