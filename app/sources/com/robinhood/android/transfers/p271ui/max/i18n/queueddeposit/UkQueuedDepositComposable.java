package com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit;

import android.view.KeyEvent;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.SwitchableTickerInputView2;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.SwitchableTickerInputViewData;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.UkRowItem;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.UkTransferReviewFxRows;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.UkQueuedDepositComposable;
import com.robinhood.android.transfers.p271ui.max.i18n.queueddeposit.UkQueuedDepositViewState;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.component.numpad.BentoNumpad3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.util.AnnotatedStringResource;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UkQueuedDepositComposable.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0011\u001aO\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0014\u001aI\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"UkQueuedDepositScreen", "", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "state", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState;", "onCurrencySwitcherClick", "Lkotlin/Function0;", "onReviewClick", "onFxLabelClick", "onEditClick", "onSubmitClick", "modifier", "Landroidx/compose/ui/Modifier;", "onNumpadKeyPress", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "UkQueuedDepositEditMode", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$EditModeData;", "(Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$EditModeData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "UkQueuedDepositReviewMode", "Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$ReviewModeData;", "onContinueClick", "(Lcom/robinhood/android/transfers/ui/max/i18n/queueddeposit/UkQueuedDepositViewState$ReviewModeData;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UkQueuedDepositComposable {

    /* compiled from: UkQueuedDepositComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UkQueuedDepositViewState.EditModeData.PrimaryButtonAction.values().length];
            try {
                iArr[UkQueuedDepositViewState.EditModeData.PrimaryButtonAction.REVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UkQueuedDepositViewState.EditModeData.PrimaryButtonAction.SUBMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UkQueuedDepositEditMode$lambda$2(UkQueuedDepositViewState.EditModeData editModeData, Function0 function0, Function0 function02, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UkQueuedDepositEditMode(editModeData, function0, function02, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UkQueuedDepositReviewMode$lambda$6(UkQueuedDepositViewState.ReviewModeData reviewModeData, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UkQueuedDepositReviewMode(reviewModeData, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UkQueuedDepositScreen$lambda$0(Screen screen, UkQueuedDepositViewState ukQueuedDepositViewState, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        UkQueuedDepositScreen(screen, ukQueuedDepositViewState, function0, function02, function03, function04, function05, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UkQueuedDepositScreen(final Screen eventScreen, final UkQueuedDepositViewState state, final Function0<Unit> onCurrencySwitcherClick, final Function0<Unit> onReviewClick, final Function0<Unit> onFxLabelClick, final Function0<Unit> onEditClick, final Function0<Unit> onSubmitClick, Modifier modifier, final Function1<? super KeyEvent, Unit> onNumpadKeyPress, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onCurrencySwitcherClick, "onCurrencySwitcherClick");
        Intrinsics.checkNotNullParameter(onReviewClick, "onReviewClick");
        Intrinsics.checkNotNullParameter(onFxLabelClick, "onFxLabelClick");
        Intrinsics.checkNotNullParameter(onEditClick, "onEditClick");
        Intrinsics.checkNotNullParameter(onSubmitClick, "onSubmitClick");
        Intrinsics.checkNotNullParameter(onNumpadKeyPress, "onNumpadKeyPress");
        Composer composerStartRestartGroup = composer.startRestartGroup(-732994329);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(eventScreen) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCurrencySwitcherClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onReviewClick) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFxLabelClick) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEditClick) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSubmitClick) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 == 0) {
            if ((12582912 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
            if ((i2 & 256) == 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onNumpadKeyPress) ? 67108864 : 33554432;
            }
            if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-732994329, i3, -1, "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositScreen (UkQueuedDepositComposable.kt:50)");
                }
                composer2 = composerStartRestartGroup;
                final Modifier modifier5 = modifier4;
                AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default(state.getUserInteractionEventDescriptor(), null, eventScreen, null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-328390190, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt.UkQueuedDepositScreen.1

                    /* compiled from: UkQueuedDepositComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$UkQueuedDepositScreen$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ Function0<Unit> $onCurrencySwitcherClick;
                        final /* synthetic */ Function0<Unit> $onEditClick;
                        final /* synthetic */ Function0<Unit> $onFxLabelClick;
                        final /* synthetic */ Function1<KeyEvent, Unit> $onNumpadKeyPress;
                        final /* synthetic */ Function0<Unit> $onReviewClick;
                        final /* synthetic */ Function0<Unit> $onSubmitClick;
                        final /* synthetic */ UkQueuedDepositViewState $state;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(Modifier modifier, UkQueuedDepositViewState ukQueuedDepositViewState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super KeyEvent, Unit> function1, Function0<Unit> function04, Function0<Unit> function05) {
                            this.$modifier = modifier;
                            this.$state = ukQueuedDepositViewState;
                            this.$onCurrencySwitcherClick = function0;
                            this.$onReviewClick = function02;
                            this.$onSubmitClick = function03;
                            this.$onNumpadKeyPress = function1;
                            this.$onEditClick = function04;
                            this.$onFxLabelClick = function05;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final int invoke$lambda$8$lambda$1$lambda$0(int i) {
                            return -i;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final int invoke$lambda$8$lambda$3$lambda$2(int i) {
                            return i;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final int invoke$lambda$8$lambda$5$lambda$4(int i) {
                            return i;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final int invoke$lambda$8$lambda$7$lambda$6(int i) {
                            return i;
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
                                ComposerKt.traceEventStart(-1967113625, i, -1, "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositScreen.<anonymous>.<anonymous> (UkQueuedDepositComposable.kt:57)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.autoLogEvents$default(this.$modifier, (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), 0.0f, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxSize$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            final UkQueuedDepositViewState ukQueuedDepositViewState = this.$state;
                            Function0<Unit> function0 = this.$onCurrencySwitcherClick;
                            final Function0<Unit> function02 = this.$onReviewClick;
                            final Function0<Unit> function03 = this.$onSubmitClick;
                            final Function1<KeyEvent, Unit> function1 = this.$onNumpadKeyPress;
                            final Function0<Unit> function04 = this.$onEditClick;
                            final Function0<Unit> function05 = this.$onFxLabelClick;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
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
                            BentoText2.m20747BentoText38GnDrw("Transfer to Robinhood", null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 6, 0, 8190);
                            SwitchableTickerInputView2.SwitchableTickerInputView(ukQueuedDepositViewState.getSwitcherDisplayData(), function0, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composer, i2).m21596getXxlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 5, null), composer, SwitchableTickerInputViewData.$stable, 0);
                            boolean z = ukQueuedDepositViewState.getEditModeData() != null;
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue = composer.rememberedValue();
                            Composer.Companion companion2 = Composer.INSTANCE;
                            if (objRememberedValue == companion2.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$UkQueuedDepositScreen$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Integer.valueOf(UkQueuedDepositComposable.C308301.AnonymousClass1.invoke$lambda$8$lambda$1$lambda$0(((Integer) obj).intValue()));
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            EnterTransition enterTransitionSlideInHorizontally$default = EnterExitTransitionKt.slideInHorizontally$default(null, (Function1) objRememberedValue, 1, null);
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (objRememberedValue2 == companion2.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$UkQueuedDepositScreen$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Integer.valueOf(UkQueuedDepositComposable.C308301.AnonymousClass1.invoke$lambda$8$lambda$3$lambda$2(((Integer) obj).intValue()));
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            AnimatedVisibilityKt.AnimatedVisibility(column6, z, (Modifier) null, enterTransitionSlideInHorizontally$default, EnterExitTransitionKt.slideOutHorizontally$default(null, (Function1) objRememberedValue2, 1, null), (String) null, ComposableLambda3.rememberComposableLambda(1821523417, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$UkQueuedDepositScreen$1$1$1$3
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                    invoke(animatedVisibilityScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i3) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1821523417, i3, -1, "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UkQueuedDepositComposable.kt:89)");
                                    }
                                    UkQueuedDepositViewState.EditModeData editModeData = ukQueuedDepositViewState.getEditModeData();
                                    if (editModeData != null) {
                                        UkQueuedDepositComposable.UkQueuedDepositEditMode(editModeData, function02, function03, function1, null, composer2, StringResource.$stable, 16);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), composer, 1600518, 18);
                            boolean z2 = ukQueuedDepositViewState.getReviewModeData() != null;
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (objRememberedValue3 == companion2.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$UkQueuedDepositScreen$1$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Integer.valueOf(UkQueuedDepositComposable.C308301.AnonymousClass1.invoke$lambda$8$lambda$5$lambda$4(((Integer) obj).intValue()));
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            EnterTransition enterTransitionSlideInHorizontally$default2 = EnterExitTransitionKt.slideInHorizontally$default(null, (Function1) objRememberedValue3, 1, null);
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (objRememberedValue4 == companion2.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$UkQueuedDepositScreen$1$1$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return Integer.valueOf(UkQueuedDepositComposable.C308301.AnonymousClass1.invoke$lambda$8$lambda$7$lambda$6(((Integer) obj).intValue()));
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            composer.endReplaceGroup();
                            AnimatedVisibilityKt.AnimatedVisibility(column6, z2, (Modifier) null, enterTransitionSlideInHorizontally$default2, EnterExitTransitionKt.slideOutHorizontally$default(null, (Function1) objRememberedValue4, 1, null), (String) null, ComposableLambda3.rememberComposableLambda(-572221054, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$UkQueuedDepositScreen$1$1$1$6
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                    invoke(animatedVisibilityScope, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i3) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-572221054, i3, -1, "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UkQueuedDepositComposable.kt:107)");
                                    }
                                    UkQueuedDepositViewState.ReviewModeData reviewModeData = ukQueuedDepositViewState.getReviewModeData();
                                    if (reviewModeData != null) {
                                        UkQueuedDepositComposable.UkQueuedDepositReviewMode(reviewModeData, function03, function04, function05, null, composer2, 0, 16);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), composer, 1600518, 18);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-328390190, i5, -1, "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositScreen.<anonymous> (UkQueuedDepositComposable.kt:56)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1967113625, true, new AnonymousClass1(modifier5, state, onCurrencySwitcherClick, onReviewClick, onSubmitClick, onNumpadKeyPress, onEditClick, onFxLabelClick), composer3, 54), composer3, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, 48);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UkQueuedDepositComposable.UkQueuedDepositScreen$lambda$0(eventScreen, state, onCurrencySwitcherClick, onReviewClick, onFxLabelClick, onEditClick, onSubmitClick, modifier3, onNumpadKeyPress, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 12582912;
        modifier2 = modifier;
        if ((i2 & 256) == 0) {
        }
        if ((38347923 & i3) == 38347922) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            final Modifier modifier52 = modifier4;
            AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default(state.getUserInteractionEventDescriptor(), null, eventScreen, null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-328390190, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt.UkQueuedDepositScreen.1

                /* compiled from: UkQueuedDepositComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$UkQueuedDepositScreen$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Modifier $modifier;
                    final /* synthetic */ Function0<Unit> $onCurrencySwitcherClick;
                    final /* synthetic */ Function0<Unit> $onEditClick;
                    final /* synthetic */ Function0<Unit> $onFxLabelClick;
                    final /* synthetic */ Function1<KeyEvent, Unit> $onNumpadKeyPress;
                    final /* synthetic */ Function0<Unit> $onReviewClick;
                    final /* synthetic */ Function0<Unit> $onSubmitClick;
                    final /* synthetic */ UkQueuedDepositViewState $state;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(Modifier modifier, UkQueuedDepositViewState ukQueuedDepositViewState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super KeyEvent, Unit> function1, Function0<Unit> function04, Function0<Unit> function05) {
                        this.$modifier = modifier;
                        this.$state = ukQueuedDepositViewState;
                        this.$onCurrencySwitcherClick = function0;
                        this.$onReviewClick = function02;
                        this.$onSubmitClick = function03;
                        this.$onNumpadKeyPress = function1;
                        this.$onEditClick = function04;
                        this.$onFxLabelClick = function05;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final int invoke$lambda$8$lambda$1$lambda$0(int i) {
                        return -i;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final int invoke$lambda$8$lambda$3$lambda$2(int i) {
                        return i;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final int invoke$lambda$8$lambda$5$lambda$4(int i) {
                        return i;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final int invoke$lambda$8$lambda$7$lambda$6(int i) {
                        return i;
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
                            ComposerKt.traceEventStart(-1967113625, i, -1, "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositScreen.<anonymous>.<anonymous> (UkQueuedDepositComposable.kt:57)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.autoLogEvents$default(this.$modifier, (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxSize$default, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        final UkQueuedDepositViewState ukQueuedDepositViewState = this.$state;
                        Function0<Unit> function0 = this.$onCurrencySwitcherClick;
                        final Function0<Unit> function02 = this.$onReviewClick;
                        final Function0<Unit> function03 = this.$onSubmitClick;
                        final Function1<? super KeyEvent, Unit> function1 = this.$onNumpadKeyPress;
                        final Function0<Unit> function04 = this.$onEditClick;
                        final Function0<Unit> function05 = this.$onFxLabelClick;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
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
                        BentoText2.m20747BentoText38GnDrw("Transfer to Robinhood", null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 6, 0, 8190);
                        SwitchableTickerInputView2.SwitchableTickerInputView(ukQueuedDepositViewState.getSwitcherDisplayData(), function0, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composer, i2).m21596getXxlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM(), 5, null), composer, SwitchableTickerInputViewData.$stable, 0);
                        boolean z = ukQueuedDepositViewState.getEditModeData() != null;
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion2 = Composer.INSTANCE;
                        if (objRememberedValue == companion2.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$UkQueuedDepositScreen$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Integer.valueOf(UkQueuedDepositComposable.C308301.AnonymousClass1.invoke$lambda$8$lambda$1$lambda$0(((Integer) obj).intValue()));
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        EnterTransition enterTransitionSlideInHorizontally$default = EnterExitTransitionKt.slideInHorizontally$default(null, (Function1) objRememberedValue, 1, null);
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == companion2.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$UkQueuedDepositScreen$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Integer.valueOf(UkQueuedDepositComposable.C308301.AnonymousClass1.invoke$lambda$8$lambda$3$lambda$2(((Integer) obj).intValue()));
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        AnimatedVisibilityKt.AnimatedVisibility(column6, z, (Modifier) null, enterTransitionSlideInHorizontally$default, EnterExitTransitionKt.slideOutHorizontally$default(null, (Function1) objRememberedValue2, 1, null), (String) null, ComposableLambda3.rememberComposableLambda(1821523417, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$UkQueuedDepositScreen$1$1$1$3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i3) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1821523417, i3, -1, "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UkQueuedDepositComposable.kt:89)");
                                }
                                UkQueuedDepositViewState.EditModeData editModeData = ukQueuedDepositViewState.getEditModeData();
                                if (editModeData != null) {
                                    UkQueuedDepositComposable.UkQueuedDepositEditMode(editModeData, function02, function03, function1, null, composer2, StringResource.$stable, 16);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 1600518, 18);
                        boolean z2 = ukQueuedDepositViewState.getReviewModeData() != null;
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (objRememberedValue3 == companion2.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$UkQueuedDepositScreen$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Integer.valueOf(UkQueuedDepositComposable.C308301.AnonymousClass1.invoke$lambda$8$lambda$5$lambda$4(((Integer) obj).intValue()));
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        EnterTransition enterTransitionSlideInHorizontally$default2 = EnterExitTransitionKt.slideInHorizontally$default(null, (Function1) objRememberedValue3, 1, null);
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (objRememberedValue4 == companion2.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$UkQueuedDepositScreen$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return Integer.valueOf(UkQueuedDepositComposable.C308301.AnonymousClass1.invoke$lambda$8$lambda$7$lambda$6(((Integer) obj).intValue()));
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        composer.endReplaceGroup();
                        AnimatedVisibilityKt.AnimatedVisibility(column6, z2, (Modifier) null, enterTransitionSlideInHorizontally$default2, EnterExitTransitionKt.slideOutHorizontally$default(null, (Function1) objRememberedValue4, 1, null), (String) null, ComposableLambda3.rememberComposableLambda(-572221054, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$UkQueuedDepositScreen$1$1$1$6
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                                invoke(animatedVisibilityScope, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i3) {
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-572221054, i3, -1, "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UkQueuedDepositComposable.kt:107)");
                                }
                                UkQueuedDepositViewState.ReviewModeData reviewModeData = ukQueuedDepositViewState.getReviewModeData();
                                if (reviewModeData != null) {
                                    UkQueuedDepositComposable.UkQueuedDepositReviewMode(reviewModeData, function03, function04, function05, null, composer2, 0, 16);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 1600518, 18);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-328390190, i5, -1, "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositScreen.<anonymous> (UkQueuedDepositComposable.kt:56)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1967113625, true, new AnonymousClass1(modifier52, state, onCurrencySwitcherClick, onReviewClick, onSubmitClick, onNumpadKeyPress, onEditClick, onFxLabelClick), composer3, 54), composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UkQueuedDepositEditMode(final UkQueuedDepositViewState.EditModeData state, final Function0<Unit> onReviewClick, final Function0<Unit> onSubmitClick, final Function1<? super KeyEvent, Unit> onNumpadKeyPress, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        int i5;
        Function0<Unit> function0;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onReviewClick, "onReviewClick");
        Intrinsics.checkNotNullParameter(onSubmitClick, "onSubmitClick");
        Intrinsics.checkNotNullParameter(onNumpadKeyPress, "onNumpadKeyPress");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1231941114);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onReviewClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSubmitClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNumpadKeyPress) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) != 9362 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1231941114, i3, -1, "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositEditMode (UkQueuedDepositComposable.kt:128)");
                }
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(modifier4, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getBottom(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
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
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.REVIEW_QUEUED_DEPOSIT, null, null, null, 59, null), false, false, false, true, false, null, 110, null), 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 0);
                String string2 = StringResource2.getString(state.getPrimaryButtonText(), composerStartRestartGroup, StringResource.$stable);
                boolean zIsPrimaryButtonEnabled = state.isPrimaryButtonEnabled();
                boolean zIsPrimaryButtonLoading = state.isPrimaryButtonLoading();
                i4 = WhenMappings.$EnumSwitchMapping$0[state.getPrimaryButtonAction().ordinal()];
                if (i4 != 1) {
                    i5 = i3;
                    function0 = onReviewClick;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5 = i3;
                    function0 = onSubmitClick;
                }
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                BentoButtonKt.m20586BentoButtonEikTQX8(function0, string2, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, zIsPrimaryButtonEnabled, zIsPrimaryButtonLoading, null, null, null, null, false, null, composer2, 0, 0, 8088);
                BentoNumpad3.BentoNumpad(null, onNumpadKeyPress, true, null, true, false, composer2, ((i5 >> 6) & 112) | 28032, 33);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UkQueuedDepositComposable.UkQueuedDepositEditMode$lambda$2(state, onReviewClick, onSubmitClick, onNumpadKeyPress, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getBottom(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default2);
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
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.REVIEW_QUEUED_DEPOSIT, null, null, null, 59, null), false, false, false, true, false, null, 110, null), 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 0, 0);
                String string22 = StringResource2.getString(state.getPrimaryButtonText(), composerStartRestartGroup, StringResource.$stable);
                boolean zIsPrimaryButtonEnabled2 = state.isPrimaryButtonEnabled();
                boolean zIsPrimaryButtonLoading2 = state.isPrimaryButtonLoading();
                i4 = WhenMappings.$EnumSwitchMapping$0[state.getPrimaryButtonAction().ordinal()];
                if (i4 != 1) {
                }
                composer2 = composerStartRestartGroup;
                Modifier modifier52 = modifier4;
                BentoButtonKt.m20586BentoButtonEikTQX8(function0, string22, modifierM21623defaultHorizontalPaddingrAjV9yQ2, null, null, zIsPrimaryButtonEnabled2, zIsPrimaryButtonLoading2, null, null, null, null, false, null, composer2, 0, 0, 8088);
                BentoNumpad3.BentoNumpad(null, onNumpadKeyPress, true, null, true, false, composer2, ((i5 >> 6) & 112) | 28032, 33);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0313  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UkQueuedDepositReviewMode(final UkQueuedDepositViewState.ReviewModeData state, final Function0<Unit> onContinueClick, final Function0<Unit> onEditClick, final Function0<Unit> onFxLabelClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        UIComponent<GenericAction> disclosureComponent;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
        Intrinsics.checkNotNullParameter(onEditClick, "onEditClick");
        Intrinsics.checkNotNullParameter(onFxLabelClick, "onFxLabelClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(574101445);
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
            i3 |= composerStartRestartGroup.changedInstance(onContinueClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEditClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFxLabelClick) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(574101445, i4, -1, "com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositReviewMode (UkQueuedDepositComposable.kt:167)");
                }
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(modifier4, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String strStringResource = StringResources_androidKt.stringResource(C30065R.string.edit, composerStartRestartGroup, 0);
                boolean zIsEditButtonEnabled = state.isEditButtonEnabled();
                BentoTextButton3.Size size = BentoTextButton3.Size.f5148S;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierAlign = column6.align(companion3, companion.getCenterHorizontally());
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifier5 = modifier4;
                BentoTextButton2.m20715BentoTextButtonPIknLig(onEditClick, strStringResource, PaddingKt.m5146paddingqDBjuR0$default(modifierAlign, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 7, null), null, size, zIsEditButtonEnabled, null, composerStartRestartGroup, ((i4 >> 6) & 14) | 24576, 72);
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                UkRowItem.UkRowItem(AnnotatedStringResource.m22060annotatedStringResourceRIQooxk(C30065R.string.transfer_from, bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU(), 0L, composerStartRestartGroup, 0, 4), AnnotatedStringResource.m22060annotatedStringResourceRIQooxk(C30065R.string.new_bank_account, bentoTheme.getColors(composerStartRestartGroup, i6).m21427getFg30d7_KjU(), 0L, composerStartRestartGroup, 0, 4), null, null, composerStartRestartGroup, 0, 12);
                UkTransferReviewFxRows.UkTransferReviewFxRows(state.getExpectedExchangeRate(), state.getExpectedValue(), state.getLastUpdated(), onFxLabelClick, null, composerStartRestartGroup, StringResource.$stable | (i4 & 7168), 16);
                Composer composer2 = composerStartRestartGroup;
                composer2.endNode();
                disclosureComponent = state.getDisclosureComponent();
                composer2.startReplaceGroup(-2033291193);
                if (disclosureComponent != null) {
                    SduiComponent3.SduiComponent(disclosureComponent, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composer2, 6, 1), null, composer2, 0, 4);
                    composer2 = composer2;
                }
                composer2.endReplaceGroup();
                Composer composer3 = composer2;
                BentoButtonKt.m20586BentoButtonEikTQX8(onContinueClick, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion3, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.SUBMIT_QUEUED_DEPOSIT, null, null, null, 59, null), false, false, false, true, false, null, 110, null), 0.0f, 1, null), bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM(), composer2, 0, 0), null, null, state.isContinueButtonEnabled(), state.isContinueButtonLoading(), null, null, null, null, false, null, composer3, (i4 >> 3) & 14, 0, 8088);
                composerStartRestartGroup = composer3;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.i18n.queueddeposit.UkQueuedDepositComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UkQueuedDepositComposable.UkQueuedDepositReviewMode$lambda$6(state, onContinueClick, onEditClick, onFxLabelClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(modifier4, 0.0f, 1, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxHeight$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                String strStringResource2 = StringResources_androidKt.stringResource(C30065R.string.edit, composerStartRestartGroup, 0);
                boolean zIsEditButtonEnabled2 = state.isEditButtonEnabled();
                BentoTextButton3.Size size2 = BentoTextButton3.Size.f5148S;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierAlign2 = column62.align(companion32, companion4.getCenterHorizontally());
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifier52 = modifier4;
                BentoTextButton2.m20715BentoTextButtonPIknLig(onEditClick, strStringResource2, PaddingKt.m5146paddingqDBjuR0$default(modifierAlign2, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 7, null), null, size2, zIsEditButtonEnabled2, null, composerStartRestartGroup, ((i4 >> 6) & 14) | 24576, 72);
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(Column5.weight$default(column62, SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    UkRowItem.UkRowItem(AnnotatedStringResource.m22060annotatedStringResourceRIQooxk(C30065R.string.transfer_from, bentoTheme2.getColors(composerStartRestartGroup, i62).m21427getFg30d7_KjU(), 0L, composerStartRestartGroup, 0, 4), AnnotatedStringResource.m22060annotatedStringResourceRIQooxk(C30065R.string.new_bank_account, bentoTheme2.getColors(composerStartRestartGroup, i62).m21427getFg30d7_KjU(), 0L, composerStartRestartGroup, 0, 4), null, null, composerStartRestartGroup, 0, 12);
                    UkTransferReviewFxRows.UkTransferReviewFxRows(state.getExpectedExchangeRate(), state.getExpectedValue(), state.getLastUpdated(), onFxLabelClick, null, composerStartRestartGroup, StringResource.$stable | (i4 & 7168), 16);
                    Composer composer22 = composerStartRestartGroup;
                    composer22.endNode();
                    disclosureComponent = state.getDisclosureComponent();
                    composer22.startReplaceGroup(-2033291193);
                    if (disclosureComponent != null) {
                    }
                    composer22.endReplaceGroup();
                    Composer composer32 = composer22;
                    BentoButtonKt.m20586BentoButtonEikTQX8(onContinueClick, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer22, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion32, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer22.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.SUBMIT_QUEUED_DEPOSIT, null, null, null, 59, null), false, false, false, true, false, null, 110, null), 0.0f, 1, null), bentoTheme2.getSpacing(composer22, i62).m21590getDefaultD9Ej5fM(), composer22, 0, 0), null, null, state.isContinueButtonEnabled(), state.isContinueButtonLoading(), null, null, null, null, false, null, composer32, (i4 >> 3) & 14, 0, 8088);
                    composerStartRestartGroup = composer32;
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
}
