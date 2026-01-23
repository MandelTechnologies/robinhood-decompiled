package com.robinhood.android.internalassettransfers.cashselection;

import android.view.KeyEvent;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Focusable2;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.TextAlign;
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
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection5;
import com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionViewState;
import com.robinhood.android.internalassettransfers.cashselection.models.CashBalanceQuantity;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoRadioButton2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayout;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAssetTransferCashSelection.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\f\u001a\u001d\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0010\u001a\u001d\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u000e\u001a5\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0018\u001a\u001f\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"InternalAssetTransferCashSelection", "", "viewState", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionViewState;", "callbacks", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionViewState;Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InternalAssetTransferCashSelectionToolbar", "onNavigationBackClick", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "InternalAssetTransferCashSelectionScaffoldContentNumpadContent", "(Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionViewState;Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionCallbacks;Landroidx/compose/runtime/Composer;I)V", "InternalAssetTransferCashSelectionErrorMessage", "(Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionViewState;Landroidx/compose/runtime/Composer;I)V", "InternalAssetTransferCashSelectionContent", "CustomSelectionRow", "primaryText", "", "selected", "", "onClick", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CustomTextInputRow", "(Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferCashSelection5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomSelectionRow$lambda$12(String str, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CustomSelectionRow(str, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomTextInputRow$lambda$13(InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CustomTextInputRow(internalAssetTransferCashSelectionViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferCashSelection$lambda$0(InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState, InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InternalAssetTransferCashSelection(internalAssetTransferCashSelectionViewState, internalAssetTransferCashSelection4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferCashSelectionContent$lambda$11(InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState, InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4, int i, Composer composer, int i2) {
        InternalAssetTransferCashSelectionContent(internalAssetTransferCashSelectionViewState, internalAssetTransferCashSelection4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferCashSelectionErrorMessage$lambda$4(InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState, int i, Composer composer, int i2) {
        InternalAssetTransferCashSelectionErrorMessage(internalAssetTransferCashSelectionViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InternalAssetTransferCashSelectionScaffoldContentNumpadContent$lambda$3 */
    public static final Unit m2074x380466f6(InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState, InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4, int i, Composer composer, int i2) {
        InternalAssetTransferCashSelectionScaffoldContentNumpadContent(internalAssetTransferCashSelectionViewState, internalAssetTransferCashSelection4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferCashSelectionToolbar$lambda$2(Function0 function0, int i, Composer composer, int i2) {
        InternalAssetTransferCashSelectionToolbar(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalAssetTransferCashSelection(final InternalAssetTransferCashSelectionViewState viewState, final InternalAssetTransferCashSelection4 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-414756743);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
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
                    ComposerKt.traceEventStart(-414756743, i3, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection (InternalAssetTransferCashSelection.kt:65)");
                }
                int i5 = ((i3 >> 6) & 14) | 805306416;
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(-500527563, true, new C190791(callbacks), composerStartRestartGroup, 54), null, null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(-589254582, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt.InternalAssetTransferCashSelection.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i6 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-589254582, i6, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection.<anonymous> (InternalAssetTransferCashSelection.kt:74)");
                        }
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        final InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState = viewState;
                        final InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4 = callbacks;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        BentoNumpadScreenLayout.BentoNumpadScreenLayout(null, ComposableLambda3.rememberComposableLambda(381645517, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$2$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i7) {
                                if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(381645517, i7, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferCashSelection.kt:82)");
                                }
                                InternalAssetTransferCashSelection5.InternalAssetTransferCashSelectionScaffoldContentNumpadContent(internalAssetTransferCashSelectionViewState, internalAssetTransferCashSelection4, composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), ComposableLambda3.rememberComposableLambda(-415075875, true, new Function3<BentoNumpad4, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$2$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer4, Integer num) {
                                invoke(bentoNumpad4, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer4.changed(BentoNumpadScreenLayout) : composer4.changedInstance(BentoNumpadScreenLayout) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-415075875, i7, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferCashSelection.kt:85)");
                                }
                                AnimatedVisibilityKt.AnimatedVisibility(Intrinsics.areEqual(internalAssetTransferCashSelectionViewState.getCashBalanceQuantity(), CashBalanceQuantity.SpecificAmount.INSTANCE), (Modifier) null, EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), "numpadAnimation", ComposableLambda3.rememberComposableLambda(1875708597, true, new AnonymousClass1(BentoNumpadScreenLayout, internalAssetTransferCashSelection4), composer4, 54), composer4, 224640, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: InternalAssetTransferCashSelection.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$2$1$2$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                                final /* synthetic */ InternalAssetTransferCashSelection4 $callbacks;
                                final /* synthetic */ BentoNumpad4 $this_BentoNumpadScreenLayout;

                                AnonymousClass1(BentoNumpad4 bentoNumpad4, InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4) {
                                    this.$this_BentoNumpadScreenLayout = bentoNumpad4;
                                    this.$callbacks = internalAssetTransferCashSelection4;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                                    invoke(animatedVisibilityScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1875708597, i, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferCashSelection.kt:91)");
                                    }
                                    BentoNumpad4 bentoNumpad4 = this.$this_BentoNumpadScreenLayout;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(this.$callbacks);
                                    final InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4 = this.$callbacks;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0034: CONSTRUCTOR (r0v2 'objRememberedValue' java.lang.Object) = 
                                              (r15v1 'internalAssetTransferCashSelection4' com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionCallbacks A[DONT_INLINE])
                                             A[MD:(com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionCallbacks):void (m)] (LINE:93) call: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$2$1$2$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionCallbacks):void type: CONSTRUCTOR in method: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$2$1$2.1.invoke(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void, file: classes10.dex
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
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$2$1$2$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 21 more
                                            */
                                        /*
                                            this = this;
                                            java.lang.String r0 = "$this$AnimatedVisibility"
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                                            boolean r13 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                            if (r13 == 0) goto L14
                                            r13 = -1
                                            java.lang.String r0 = "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferCashSelection.kt:91)"
                                            r1 = 1875708597(0x6fcd0ab5, float:1.2691474E29)
                                            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r15, r13, r0)
                                        L14:
                                            com.robinhood.compose.bento.component.numpad.BentoNumpadScope r2 = r12.$this_BentoNumpadScreenLayout
                                            r13 = 5004770(0x4c5de2, float:7.013177E-39)
                                            r14.startReplaceGroup(r13)
                                            com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionCallbacks r13 = r12.$callbacks
                                            boolean r13 = r14.changedInstance(r13)
                                            com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionCallbacks r15 = r12.$callbacks
                                            java.lang.Object r0 = r14.rememberedValue()
                                            if (r13 != 0) goto L32
                                            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.INSTANCE
                                            java.lang.Object r13 = r13.getEmpty()
                                            if (r0 != r13) goto L3a
                                        L32:
                                            com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$2$1$2$1$$ExternalSyntheticLambda0 r0 = new com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$2$1$2$1$$ExternalSyntheticLambda0
                                            r0.<init>(r15)
                                            r14.updateRememberedValue(r0)
                                        L3a:
                                            r4 = r0
                                            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
                                            r14.endReplaceGroup()
                                            int r13 = com.robinhood.compose.bento.component.numpad.BentoNumpad4.$stable
                                            int r13 = r13 << 18
                                            r15 = 224640(0x36d80, float:3.14788E-40)
                                            r10 = r13 | r15
                                            r11 = 1
                                            r3 = 0
                                            r5 = 1
                                            r6 = 1
                                            r7 = 0
                                            r8 = 0
                                            r9 = r14
                                            r2.BentoNumpadOnly(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                                            boolean r13 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                            if (r13 == 0) goto L5c
                                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                                        L5c:
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection7.AnonymousClass1.invoke(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void");
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4, KeyEvent it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        internalAssetTransferCashSelection4.onCashAmountValueChanged(it);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer3, 54), composer3, 432, 1);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, i5, 444);
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
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InternalAssetTransferCashSelection5.InternalAssetTransferCashSelection$lambda$0(viewState, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                int i52 = ((i3 >> 6) & 14) | 805306416;
                composer2 = composerStartRestartGroup;
                Modifier modifier52 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(-500527563, true, new C190791(callbacks), composerStartRestartGroup, 54), null, null, null, 0, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(-589254582, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt.InternalAssetTransferCashSelection.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i6 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-589254582, i6, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection.<anonymous> (InternalAssetTransferCashSelection.kt:74)");
                        }
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        final InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState = viewState;
                        final InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4 = callbacks;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        BentoNumpadScreenLayout.BentoNumpadScreenLayout(null, ComposableLambda3.rememberComposableLambda(381645517, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$2$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i7) {
                                if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(381645517, i7, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferCashSelection.kt:82)");
                                }
                                InternalAssetTransferCashSelection5.InternalAssetTransferCashSelectionScaffoldContentNumpadContent(internalAssetTransferCashSelectionViewState, internalAssetTransferCashSelection4, composer4, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), ComposableLambda3.rememberComposableLambda(-415075875, true, new Function3<BentoNumpad4, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$2$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer4, Integer num) {
                                invoke(bentoNumpad4, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer4.changed(BentoNumpadScreenLayout) : composer4.changedInstance(BentoNumpadScreenLayout) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-415075875, i7, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferCashSelection.kt:85)");
                                }
                                AnimatedVisibilityKt.AnimatedVisibility(Intrinsics.areEqual(internalAssetTransferCashSelectionViewState.getCashBalanceQuantity(), CashBalanceQuantity.SpecificAmount.INSTANCE), (Modifier) null, EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), "numpadAnimation", ComposableLambda3.rememberComposableLambda(1875708597, true, new AnonymousClass1(BentoNumpadScreenLayout, internalAssetTransferCashSelection4), composer4, 54), composer4, 224640, 2);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: InternalAssetTransferCashSelection.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$2$1$2$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                                final /* synthetic */ InternalAssetTransferCashSelection4 $callbacks;
                                final /* synthetic */ BentoNumpad4 $this_BentoNumpadScreenLayout;

                                AnonymousClass1(BentoNumpad4 bentoNumpad4, InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4) {
                                    this.$this_BentoNumpadScreenLayout = bentoNumpad4;
                                    this.$callbacks = internalAssetTransferCashSelection4;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                                    invoke(animatedVisibilityScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0034: CONSTRUCTOR (r0v2 'objRememberedValue' java.lang.Object) = 
                                      (r15v1 'internalAssetTransferCashSelection4' com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionCallbacks A[DONT_INLINE])
                                     A[MD:(com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionCallbacks):void (m)] (LINE:93) call: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$2$1$2$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionCallbacks):void type: CONSTRUCTOR in method: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$2$1$2.1.invoke(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void, file: classes10.dex
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
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$2$1$2$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 16 more
                                    */
                                public final void invoke(androidx.compose.animation.AnimatedVisibilityScope r13, androidx.compose.runtime.Composer r14, int r15) {
                                    /*
                                        r12 = this;
                                        java.lang.String r0 = "$this$AnimatedVisibility"
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                                        boolean r13 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                        if (r13 == 0) goto L14
                                        r13 = -1
                                        java.lang.String r0 = "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferCashSelection.kt:91)"
                                        r1 = 1875708597(0x6fcd0ab5, float:1.2691474E29)
                                        androidx.compose.runtime.ComposerKt.traceEventStart(r1, r15, r13, r0)
                                    L14:
                                        com.robinhood.compose.bento.component.numpad.BentoNumpadScope r2 = r12.$this_BentoNumpadScreenLayout
                                        r13 = 5004770(0x4c5de2, float:7.013177E-39)
                                        r14.startReplaceGroup(r13)
                                        com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionCallbacks r13 = r12.$callbacks
                                        boolean r13 = r14.changedInstance(r13)
                                        com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionCallbacks r15 = r12.$callbacks
                                        java.lang.Object r0 = r14.rememberedValue()
                                        if (r13 != 0) goto L32
                                        androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.INSTANCE
                                        java.lang.Object r13 = r13.getEmpty()
                                        if (r0 != r13) goto L3a
                                    L32:
                                        com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$2$1$2$1$$ExternalSyntheticLambda0 r0 = new com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$2$1$2$1$$ExternalSyntheticLambda0
                                        r0.<init>(r15)
                                        r14.updateRememberedValue(r0)
                                    L3a:
                                        r4 = r0
                                        kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
                                        r14.endReplaceGroup()
                                        int r13 = com.robinhood.compose.bento.component.numpad.BentoNumpad4.$stable
                                        int r13 = r13 << 18
                                        r15 = 224640(0x36d80, float:3.14788E-40)
                                        r10 = r13 | r15
                                        r11 = 1
                                        r3 = 0
                                        r5 = 1
                                        r6 = 1
                                        r7 = 0
                                        r8 = 0
                                        r9 = r14
                                        r2.BentoNumpadOnly(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                                        boolean r13 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                        if (r13 == 0) goto L5c
                                        androidx.compose.runtime.ComposerKt.traceEventEnd()
                                    L5c:
                                        return
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection7.AnonymousClass1.invoke(androidx.compose.animation.AnimatedVisibilityScope, androidx.compose.runtime.Composer, int):void");
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4, KeyEvent it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    internalAssetTransferCashSelection4.onCashAmountValueChanged(it);
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer3, 54), composer3, 432, 1);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i52, 444);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }

        /* compiled from: InternalAssetTransferCashSelection.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$1 */
        static final class C190791 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ InternalAssetTransferCashSelection4 $callbacks;

            C190791(InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4) {
                this.$callbacks = internalAssetTransferCashSelection4;
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
                    ComposerKt.traceEventStart(-500527563, i, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelection.<anonymous> (InternalAssetTransferCashSelection.kt:69)");
                }
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.$callbacks);
                final InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4 = this.$callbacks;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelection$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalAssetTransferCashSelection5.C190791.invoke$lambda$1$lambda$0(internalAssetTransferCashSelection4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                InternalAssetTransferCashSelection5.InternalAssetTransferCashSelectionToolbar((Function0) objRememberedValue, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4) {
                internalAssetTransferCashSelection4.onNavigationBackClicked();
                return Unit.INSTANCE;
            }
        }

        /* compiled from: InternalAssetTransferCashSelection.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelectionScaffoldContentNumpadContent$1 */
        static final class C190831 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
            final /* synthetic */ InternalAssetTransferCashSelection4 $callbacks;
            final /* synthetic */ InternalAssetTransferCashSelectionViewState $viewState;

            C190831(InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState, InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4) {
                this.$viewState = internalAssetTransferCashSelectionViewState;
                this.$callbacks = internalAssetTransferCashSelection4;
            }

            public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1560762356, i, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionScaffoldContentNumpadContent.<anonymous> (InternalAssetTransferCashSelection.kt:134)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState = this.$viewState;
                final InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4 = this.$callbacks;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composer.startReplaceGroup(-877323232);
                if (internalAssetTransferCashSelectionViewState.getShowErrorMessage()) {
                    InternalAssetTransferCashSelection5.InternalAssetTransferCashSelectionErrorMessage(internalAssetTransferCashSelectionViewState, composer, 0);
                    Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
                }
                composer.endReplaceGroup();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, internalAssetTransferCashSelectionViewState.getCashBalanceQuantity().getIdentifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                String bottomBarButtonText = internalAssetTransferCashSelectionViewState.getBottomBarButtonText(composer, 0);
                boolean enableBottomButton = internalAssetTransferCashSelectionViewState.getEnableBottomButton();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(internalAssetTransferCashSelection4);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelectionScaffoldContentNumpadContent$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalAssetTransferCashSelection5.C190831.invoke$lambda$2$lambda$1$lambda$0(internalAssetTransferCashSelection4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, bottomBarButtonText, modifierAutoLogEvents$default, null, null, enableBottomButton, false, null, null, null, null, false, null, composer, 0, 0, 8152);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                invoke(bentoButtonBar3, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$2$lambda$1$lambda$0(InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4) {
                internalAssetTransferCashSelection4.onUpdateButtonClicked();
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void InternalAssetTransferCashSelectionToolbar(final Function0<Unit> function0, Composer composer, final int i) {
            int i2;
            Composer composerStartRestartGroup = composer.startRestartGroup(1253459265);
            if ((i & 6) == 0) {
                i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1253459265, i2, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionToolbar (InternalAssetTransferCashSelection.kt:108)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(InternalAssetTransferCashSelection.INSTANCE.m2071x5594923c(), null, ComposableLambda3.rememberComposableLambda(2066548394, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$InternalAssetTransferCashSelectionToolbar$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer2, Integer num) {
                        invoke(bentoAppBarScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer2, int i3) {
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i3 & 6) == 0) {
                            i3 |= (i3 & 8) == 0 ? composer2.changed(BentoAppBar) : composer2.changedInstance(BentoAppBar) ? 4 : 2;
                        }
                        if ((i3 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2066548394, i3, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionToolbar.<anonymous>.<anonymous> (InternalAssetTransferCashSelection.kt:113)");
                        }
                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer2, (BentoAppBarScope.$stable << 12) | ((i3 << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, false, false, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU()), 0L, null, composerStartRestartGroup, 390, 0, 1786);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InternalAssetTransferCashSelection5.InternalAssetTransferCashSelectionToolbar$lambda$2(function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void InternalAssetTransferCashSelectionScaffoldContentNumpadContent(final InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState, final InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4, Composer composer, final int i) {
            int i2;
            Composer composerStartRestartGroup = composer.startRestartGroup(-341416991);
            if ((i & 6) == 0) {
                i2 = (composerStartRestartGroup.changedInstance(internalAssetTransferCashSelectionViewState) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(internalAssetTransferCashSelection4) : composerStartRestartGroup.changedInstance(internalAssetTransferCashSelection4) ? 32 : 16;
            }
            if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-341416991, i2, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionScaffoldContentNumpadContent (InternalAssetTransferCashSelection.kt:124)");
                }
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-1560762356, true, new C190831(internalAssetTransferCashSelectionViewState, internalAssetTransferCashSelection4), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1446850553, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt.InternalAssetTransferCashSelectionScaffoldContentNumpadContent.2
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
                            ComposerKt.traceEventStart(1446850553, i3, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionScaffoldContentNumpadContent.<anonymous> (InternalAssetTransferCashSelection.kt:128)");
                        }
                        InternalAssetTransferCashSelection5.InternalAssetTransferCashSelectionContent(internalAssetTransferCashSelectionViewState, internalAssetTransferCashSelection4, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3504, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InternalAssetTransferCashSelection5.m2074x380466f6(internalAssetTransferCashSelectionViewState, internalAssetTransferCashSelection4, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void InternalAssetTransferCashSelectionErrorMessage(final InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState, Composer composer, final int i) {
            int i2;
            Composer composer2;
            Composer composerStartRestartGroup = composer.startRestartGroup(487761266);
            if ((i & 6) == 0) {
                i2 = (composerStartRestartGroup.changedInstance(internalAssetTransferCashSelectionViewState) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(487761266, i2, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionErrorMessage (InternalAssetTransferCashSelection.kt:168)");
                }
                if (internalAssetTransferCashSelectionViewState.getCashInputError() instanceof InternalAssetTransferCashSelectionViewState.CashInputError.CashInputExceeded) {
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(((InternalAssetTransferCashSelectionViewState.CashInputError.CashInputExceeded) internalAssetTransferCashSelectionViewState.getCashInputError()).getMessage(composerStartRestartGroup, 0), PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(internalAssetTransferCashSelectionViewState.getCashInputColor(composerStartRestartGroup, i2 & 14)), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composer2, 0, 0, 8120);
                } else {
                    composer2 = composerStartRestartGroup;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InternalAssetTransferCashSelection5.InternalAssetTransferCashSelectionErrorMessage$lambda$4(internalAssetTransferCashSelectionViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:71:0x033e  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x03c6  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x03d5  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x03f8  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0401  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0412  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void InternalAssetTransferCashSelectionContent(InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState, InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4, Composer composer, final int i) {
            int i2;
            final InternalAssetTransferCashSelection4 internalAssetTransferCashSelection42;
            boolean z;
            Object objRememberedValue;
            final InternalAssetTransferCashSelection4 internalAssetTransferCashSelection43;
            boolean z2;
            Object objRememberedValue2;
            final InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState2;
            Composer composerStartRestartGroup = composer.startRestartGroup(-1050612637);
            if ((i & 6) == 0) {
                i2 = i | (composerStartRestartGroup.changedInstance(internalAssetTransferCashSelectionViewState) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(internalAssetTransferCashSelection4) : composerStartRestartGroup.changedInstance(internalAssetTransferCashSelection4) ? 32 : 16;
            }
            if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                internalAssetTransferCashSelectionViewState2 = internalAssetTransferCashSelectionViewState;
                internalAssetTransferCashSelection43 = internalAssetTransferCashSelection4;
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1050612637, i2, -1, "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionContent (InternalAssetTransferCashSelection.kt:190)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                int i4 = i2;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(internalAssetTransferCashSelectionViewState.isMarginBalance() ? C18977R.string.internal_asset_transfer_cash_selection_margin_balance_title_text : C18977R.string.internal_asset_transfer_cash_selection_cash_balance_title_text, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8186);
                BentoText2.m20747BentoText38GnDrw(Money.format$default(Money3.toMoney(internalAssetTransferCashSelectionViewState.getTransferableAssets().getCash(), internalAssetTransferCashSelectionViewState.getCurrency()), null, false, null, false, 0, null, false, null, false, false, 1023, null), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextL(), composerStartRestartGroup, 0, 0, 8186);
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_cash_selection_quantity_title_text, composerStartRestartGroup, 0), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, 0, 0, 8186);
                composerStartRestartGroup = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component.ComponentType componentType = Component.ComponentType.BUTTON;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierFillMaxWidth$default2, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(componentType, CashBalanceQuantity.EntireBalance.INSTANCE.getIdentifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                String strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_cash_selection_cash_quantity_all, composerStartRestartGroup, 0);
                boolean z3 = internalAssetTransferCashSelectionViewState.getCashBalanceQuantity() instanceof CashBalanceQuantity.EntireBalance;
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i5 = i4 & 112;
                if (i5 != 32) {
                    int i6 = i4 & 64;
                    internalAssetTransferCashSelection42 = internalAssetTransferCashSelection4;
                    if (i6 == 0 || !composerStartRestartGroup.changedInstance(internalAssetTransferCashSelection42)) {
                        z = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InternalAssetTransferCashSelection5.m2072x60605fc9(internalAssetTransferCashSelection42);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    CustomSelectionRow(strStringResource, z3, (Function0) objRememberedValue, modifierAutoLogEvents$default, composerStartRestartGroup, 0, 0);
                    internalAssetTransferCashSelection43 = internalAssetTransferCashSelection4;
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(componentType, CashBalanceQuantity.SpecificAmount.INSTANCE.getIdentifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                    String strStringResource2 = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_cash_selection_cash_quantity_specific, composerStartRestartGroup, 0);
                    boolean z4 = internalAssetTransferCashSelectionViewState.getCashBalanceQuantity() instanceof CashBalanceQuantity.SpecificAmount;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z2 = i5 != 32 || ((i4 & 64) != 0 && composerStartRestartGroup.changedInstance(internalAssetTransferCashSelection43));
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InternalAssetTransferCashSelection5.m2073x48f34209(internalAssetTransferCashSelection43);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    CustomSelectionRow(strStringResource2, z4, (Function0) objRememberedValue2, modifierAutoLogEvents$default2, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.startReplaceGroup(-51252031);
                    if (internalAssetTransferCashSelectionViewState.getCashBalanceQuantity() instanceof CashBalanceQuantity.SpecificAmount) {
                        internalAssetTransferCashSelectionViewState2 = internalAssetTransferCashSelectionViewState;
                    } else {
                        internalAssetTransferCashSelectionViewState2 = internalAssetTransferCashSelectionViewState;
                        CustomTextInputRow(internalAssetTransferCashSelectionViewState2, null, composerStartRestartGroup, i4 & 14, 2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    internalAssetTransferCashSelection42 = internalAssetTransferCashSelection4;
                }
                z = true;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalAssetTransferCashSelection5.m2072x60605fc9(internalAssetTransferCashSelection42);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    CustomSelectionRow(strStringResource, z3, (Function0) objRememberedValue, modifierAutoLogEvents$default, composerStartRestartGroup, 0, 0);
                    internalAssetTransferCashSelection43 = internalAssetTransferCashSelection4;
                    Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(componentType, CashBalanceQuantity.SpecificAmount.INSTANCE.getIdentifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                    String strStringResource22 = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_cash_selection_cash_quantity_specific, composerStartRestartGroup, 0);
                    boolean z42 = internalAssetTransferCashSelectionViewState.getCashBalanceQuantity() instanceof CashBalanceQuantity.SpecificAmount;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if (i5 != 32) {
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z2) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InternalAssetTransferCashSelection5.m2073x48f34209(internalAssetTransferCashSelection43);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            CustomSelectionRow(strStringResource22, z42, (Function0) objRememberedValue2, modifierAutoLogEvents$default22, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.startReplaceGroup(-51252031);
                            if (internalAssetTransferCashSelectionViewState.getCashBalanceQuantity() instanceof CashBalanceQuantity.SpecificAmount) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    }
                }
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InternalAssetTransferCashSelection5.InternalAssetTransferCashSelectionContent$lambda$11(internalAssetTransferCashSelectionViewState2, internalAssetTransferCashSelection43, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: InternalAssetTransferCashSelectionContent$lambda$10$lambda$9$lambda$6$lambda$5 */
        public static final Unit m2072x60605fc9(InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4) {
            internalAssetTransferCashSelection4.onEntireBalanceQuantityClicked();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: InternalAssetTransferCashSelectionContent$lambda$10$lambda$9$lambda$8$lambda$7 */
        public static final Unit m2073x48f34209(InternalAssetTransferCashSelection4 internalAssetTransferCashSelection4) {
            internalAssetTransferCashSelection4.onSpecificAmountQuantityClicked();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final void CustomSelectionRow(final String str, final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
            int i3;
            Function0<Unit> function02;
            Modifier modifier2;
            Composer composer2;
            final Modifier modifier3;
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
            Composer composerStartRestartGroup = composer.startRestartGroup(1569493332);
            if ((i2 & 1) != 0) {
                i3 = i | 6;
            } else if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            if ((i2 & 2) != 0) {
                i3 |= 48;
            } else if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                i3 |= 384;
                function02 = function0;
            } else {
                function02 = function0;
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
                }
            }
            int i4 = i2 & 8;
            if (i4 == 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1569493332, i3, -1, "com.robinhood.android.internalassettransfers.cashselection.CustomSelectionRow (InternalAssetTransferCashSelection.kt:269)");
                    }
                    Modifier modifier4 = modifier2;
                    composer2 = composerStartRestartGroup;
                    BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, function02, 7, null), null, null, ComposableLambda3.rememberComposableLambda(669964049, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt.CustomSelectionRow.1
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
                                ComposerKt.traceEventStart(669964049, i5, -1, "com.robinhood.android.internalassettransfers.cashselection.CustomSelectionRow.<anonymous> (InternalAssetTransferCashSelection.kt:273)");
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(-1410619629, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt.CustomSelectionRow.2
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
                                ComposerKt.traceEventStart(-1410619629, i5, -1, "com.robinhood.android.internalassettransfers.cashselection.CustomSelectionRow.<anonymous> (InternalAssetTransferCashSelection.kt:280)");
                            }
                            BentoRadioButton2.BentoRadioButton(z, null, false, composer3, 0, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, false, false, true, null, composer2, 805506048, 0, 1494);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InternalAssetTransferCashSelection5.CustomSelectionRow$lambda$12(str, z, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier42 = modifier2;
                composer2 = composerStartRestartGroup;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(modifier2, false, null, null, function02, 7, null), null, null, ComposableLambda3.rememberComposableLambda(669964049, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt.CustomSelectionRow.1
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
                            ComposerKt.traceEventStart(669964049, i5, -1, "com.robinhood.android.internalassettransfers.cashselection.CustomSelectionRow.<anonymous> (InternalAssetTransferCashSelection.kt:273)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composer3, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i6).getTextM(), composer3, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(-1410619629, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt.CustomSelectionRow.2
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
                            ComposerKt.traceEventStart(-1410619629, i5, -1, "com.robinhood.android.internalassettransfers.cashselection.CustomSelectionRow.<anonymous> (InternalAssetTransferCashSelection.kt:280)");
                        }
                        BentoRadioButton2.BentoRadioButton(z, null, false, composer3, 0, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, false, false, true, null, composer2, 805506048, 0, 1494);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static final void CustomTextInputRow(final InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState, Modifier modifier, Composer composer, final int i, final int i2) {
            int i3;
            Modifier modifier2;
            final Modifier modifier3;
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
            Composer composerStartRestartGroup = composer.startRestartGroup(-1245459515);
            if ((i2 & 1) != 0) {
                i3 = i | 6;
            } else if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changedInstance(internalAssetTransferCashSelectionViewState) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
            int i4 = i2 & 2;
            if (i4 == 0) {
                if ((i & 48) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
                }
                if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1245459515, i3, -1, "com.robinhood.android.internalassettransfers.cashselection.CustomTextInputRow (InternalAssetTransferCashSelection.kt:290)");
                    }
                    modifier3 = modifier4;
                    BentoBaseRowLayout.BentoBaseRowLayout(Focusable2.focusable$default(modifier4, false, null, 2, null), null, null, InternalAssetTransferCashSelection.INSTANCE.m2070xc71a2c0b(), null, null, ComposableLambda3.rememberComposableLambda(1163130373, true, new C190781(internalAssetTransferCashSelectionViewState), composerStartRestartGroup, 54), false, false, true, null, composerStartRestartGroup, 806882304, 0, 1462);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InternalAssetTransferCashSelection5.CustomTextInputRow$lambda$13(internalAssetTransferCashSelectionViewState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 48;
            modifier2 = modifier;
            if ((i3 & 19) == 18) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                BentoBaseRowLayout.BentoBaseRowLayout(Focusable2.focusable$default(modifier4, false, null, 2, null), null, null, InternalAssetTransferCashSelection.INSTANCE.m2070xc71a2c0b(), null, null, ComposableLambda3.rememberComposableLambda(1163130373, true, new C190781(internalAssetTransferCashSelectionViewState), composerStartRestartGroup, 54), false, false, true, null, composerStartRestartGroup, 806882304, 0, 1462);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }

        /* compiled from: InternalAssetTransferCashSelection.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$CustomTextInputRow$1 */
        static final class C190781 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ InternalAssetTransferCashSelectionViewState $viewState;

            C190781(InternalAssetTransferCashSelectionViewState internalAssetTransferCashSelectionViewState) {
                this.$viewState = internalAssetTransferCashSelectionViewState;
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
                    ComposerKt.traceEventStart(1163130373, i, -1, "com.robinhood.android.internalassettransfers.cashselection.CustomTextInputRow.<anonymous> (InternalAssetTransferCashSelection.kt:302)");
                }
                String cashAmountTextValue = this.$viewState.getCashAmountTextValue();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                SolidColor solidColor = new SolidColor(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null);
                TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextM(), this.$viewState.getCashInputColor(composer, 0), 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7920getEnde0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744442, null);
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, Boolean.FALSE, KeyboardType.INSTANCE.m7781getNumberPjHm6EE(), 0, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, null);
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionKt$CustomTextInputRow$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InternalAssetTransferCashSelection5.C190781.invoke$lambda$1$lambda$0((String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BasicTextFieldKt.BasicTextField(cashAmountTextValue, (Function1<? super String, Unit>) objRememberedValue, (Modifier) null, false, false, textStyleM7655copyp1EtxEg$default, keyboardOptions, (KeyboardActions) null, true, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composer, 907545648, 0, 48276);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.INSTANCE;
            }
        }
    }
