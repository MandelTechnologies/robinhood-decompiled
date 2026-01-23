package com.robinhood.android.internalassettransfers.customselection.equity;

import android.content.res.Resources;
import android.view.KeyEvent;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEdit4;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayout;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.compose.keyboard.DisableKeyboard;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InternalAssetTransferEquityEdit.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u008b\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\t2\u0016\u0010\u0010\u001a\u0012\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001ae\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"InternalAssetTransferEquityEdit", "", "instrumentTicker", "", "availableShares", "Ljava/math/BigDecimal;", "viewState", "Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditViewState;", "onSelectionTypeTapped", "Lkotlin/Function1;", "Lcom/robinhood/android/internalassettransfers/customselection/equity/SelectionType;", "onCloseClick", "Lkotlin/Function0;", "onConfirmClicked", "updateUserCurrentlyEditing", "", "onKeyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EquityEditMainContent", "(Ljava/lang/String;Ljava/math/BigDecimal;Lcom/robinhood/android/internalassettransfers/customselection/equity/InternalAssetTransferEquityEditViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InternalAssetTransferEquityEdit4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityEditMainContent$lambda$1(String str, BigDecimal bigDecimal, InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewState, Function1 function1, Function0 function0, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EquityEditMainContent(str, bigDecimal, internalAssetTransferEquityEditViewState, function1, function0, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalAssetTransferEquityEdit$lambda$0(String str, BigDecimal bigDecimal, InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewState, Function1 function1, Function0 function0, Function0 function02, Function1 function12, Function1 function13, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InternalAssetTransferEquityEdit(str, bigDecimal, internalAssetTransferEquityEditViewState, function1, function0, function02, function12, function13, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalAssetTransferEquityEdit(final String instrumentTicker, final BigDecimal availableShares, final InternalAssetTransferEquityEditViewState viewState, final Function1<? super ShareSelection2, Unit> onSelectionTypeTapped, final Function0<Unit> onCloseClick, final Function0<Unit> onConfirmClicked, final Function1<? super Boolean, Unit> updateUserCurrentlyEditing, final Function1<? super KeyEvent, Unit> onKeyEvent, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(availableShares, "availableShares");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onSelectionTypeTapped, "onSelectionTypeTapped");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onConfirmClicked, "onConfirmClicked");
        Intrinsics.checkNotNullParameter(updateUserCurrentlyEditing, "updateUserCurrentlyEditing");
        Intrinsics.checkNotNullParameter(onKeyEvent, "onKeyEvent");
        Composer composerStartRestartGroup = composer.startRestartGroup(925293994);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(instrumentTicker) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(availableShares) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSelectionTypeTapped) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onConfirmClicked) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(updateUserCurrentlyEditing) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onKeyEvent) ? 8388608 : 4194304;
        }
        int i4 = i2 & 256;
        if (i4 == 0) {
            if ((100663296 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
            }
            if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(925293994, i3, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEdit (InternalAssetTransferEquityEdit.kt:55)");
                }
                final Modifier modifier4 = modifier2;
                DisableKeyboard.DisableSoftKeyboard(false, ComposableLambda3.rememberComposableLambda(923059933, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt.InternalAssetTransferEquityEdit.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(923059933, i5, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEdit.<anonymous> (InternalAssetTransferEquityEdit.kt:57)");
                        }
                        long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU();
                        Modifier modifier5 = modifier4;
                        final Function0<Unit> function0 = onCloseClick;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1972594015, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt.InternalAssetTransferEquityEdit.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1972594015, i6, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEdit.<anonymous>.<anonymous> (InternalAssetTransferEquityEdit.kt:60)");
                                }
                                Function2<Composer, Integer, Unit> function2M2088xceb148fa = InternalAssetTransferEquityEdit.INSTANCE.m2088xceb148fa();
                                final Function0<Unit> function02 = function0;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2088xceb148fa, null, ComposableLambda3.rememberComposableLambda(-1567058654, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt.InternalAssetTransferEquityEdit.1.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                        invoke(bentoAppBarScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i7 & 6) == 0) {
                                            i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1567058654, i7, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEdit.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferEquityEdit.kt:63)");
                                        }
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function02, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final String str = instrumentTicker;
                        final BigDecimal bigDecimal = availableShares;
                        final InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewState = viewState;
                        final Function1<ShareSelection2, Unit> function1 = onSelectionTypeTapped;
                        final Function0<Unit> function02 = onConfirmClicked;
                        final Function1<Boolean, Unit> function12 = updateUserCurrentlyEditing;
                        final Function1<KeyEvent, Unit> function13 = onKeyEvent;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, 0L, null, ComposableLambda3.rememberComposableLambda(292121260, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt.InternalAssetTransferEquityEdit.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues innerPadding, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                                if ((i6 & 6) == 0) {
                                    i6 |= composer3.changed(innerPadding) ? 4 : 2;
                                }
                                if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(292121260, i6, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEdit.<anonymous>.<anonymous> (InternalAssetTransferEquityEdit.kt:71)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, innerPadding);
                                final String str2 = str;
                                final BigDecimal bigDecimal2 = bigDecimal;
                                final InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewState2 = internalAssetTransferEquityEditViewState;
                                final Function1<ShareSelection2, Unit> function14 = function1;
                                final Function0<Unit> function03 = function02;
                                final Function1<Boolean, Unit> function15 = function12;
                                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(125929103, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt.InternalAssetTransferEquityEdit.1.2.1
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
                                            ComposerKt.traceEventStart(125929103, i7, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEdit.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferEquityEdit.kt:74)");
                                        }
                                        InternalAssetTransferEquityEdit4.EquityEditMainContent(str2, bigDecimal2, internalAssetTransferEquityEditViewState2, function14, function03, function15, null, composer4, StringResource.$stable << 6, 64);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                final InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewState3 = internalAssetTransferEquityEditViewState;
                                final Function1<KeyEvent, Unit> function16 = function13;
                                BentoNumpadScreenLayout.BentoNumpadScreenLayout(modifierPadding, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(962766207, true, new Function3<BentoNumpad4, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt.InternalAssetTransferEquityEdit.1.2.2
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
                                            ComposerKt.traceEventStart(962766207, i7, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEdit.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferEquityEdit.kt:84)");
                                        }
                                        AnimatedVisibilityKt.AnimatedVisibility(internalAssetTransferEquityEditViewState3.isUserCurrentlyEditing(), (Modifier) null, EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), "numpadAnimation", ComposableLambda3.rememberComposableLambda(-1371868761, true, new AnonymousClass1(BentoNumpadScreenLayout, function16), composer4, 54), composer4, 224640, 2);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* compiled from: InternalAssetTransferEquityEdit.kt */
                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @SourceDebugExtension
                                    /* renamed from: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt$InternalAssetTransferEquityEdit$1$2$2$1, reason: invalid class name */
                                    static final class AnonymousClass1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                                        final /* synthetic */ Function1<KeyEvent, Unit> $onKeyEvent;
                                        final /* synthetic */ BentoNumpad4 $this_BentoNumpadScreenLayout;

                                        /* JADX WARN: Multi-variable type inference failed */
                                        AnonymousClass1(BentoNumpad4 bentoNumpad4, Function1<? super KeyEvent, Unit> function1) {
                                            this.$this_BentoNumpadScreenLayout = bentoNumpad4;
                                            this.$onKeyEvent = function1;
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                                            invoke(animatedVisibilityScope, composer, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1371868761, i, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEdit.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferEquityEdit.kt:90)");
                                            }
                                            BentoNumpad4 bentoNumpad4 = this.$this_BentoNumpadScreenLayout;
                                            composer.startReplaceGroup(5004770);
                                            boolean zChanged = composer.changed(this.$onKeyEvent);
                                            final Function1<KeyEvent, Unit> function1 = this.$onKeyEvent;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt$InternalAssetTransferEquityEdit$1$2$2$1$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj) {
                                                        return InternalAssetTransferEquityEdit4.C191901.AnonymousClass2.C502212.AnonymousClass1.invoke$lambda$1$lambda$0(function1, (KeyEvent) obj);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            composer.endReplaceGroup();
                                            bentoNumpad4.BentoNumpadOnly(null, (Function1) objRememberedValue, true, true, false, null, composer, (BentoNumpad4.$stable << 18) | 224640, 1);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, KeyEvent it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            function1.invoke(it);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }, composer3, 54), composer3, 432, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306416, 444);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InternalAssetTransferEquityEdit4.InternalAssetTransferEquityEdit$lambda$0(instrumentTicker, availableShares, viewState, onSelectionTypeTapped, onCloseClick, onConfirmClicked, updateUserCurrentlyEditing, onKeyEvent, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 100663296;
        modifier2 = modifier;
        if ((38347923 & i3) == 38347922) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Modifier modifier42 = modifier2;
            DisableKeyboard.DisableSoftKeyboard(false, ComposableLambda3.rememberComposableLambda(923059933, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt.InternalAssetTransferEquityEdit.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(923059933, i5, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEdit.<anonymous> (InternalAssetTransferEquityEdit.kt:57)");
                    }
                    long jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU();
                    Modifier modifier5 = modifier42;
                    final Function0<Unit> function0 = onCloseClick;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1972594015, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt.InternalAssetTransferEquityEdit.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1972594015, i6, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEdit.<anonymous>.<anonymous> (InternalAssetTransferEquityEdit.kt:60)");
                            }
                            Function2<Composer, Integer, Unit> function2M2088xceb148fa = InternalAssetTransferEquityEdit.INSTANCE.m2088xceb148fa();
                            final Function0<Unit> function02 = function0;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M2088xceb148fa, null, ComposableLambda3.rememberComposableLambda(-1567058654, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt.InternalAssetTransferEquityEdit.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i7 & 6) == 0) {
                                        i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1567058654, i7, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEdit.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferEquityEdit.kt:63)");
                                    }
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function02, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final String str = instrumentTicker;
                    final BigDecimal bigDecimal = availableShares;
                    final InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewState = viewState;
                    final Function1<? super ShareSelection2, Unit> function1 = onSelectionTypeTapped;
                    final Function0<Unit> function02 = onConfirmClicked;
                    final Function1<? super Boolean, Unit> function12 = updateUserCurrentlyEditing;
                    final Function1<? super KeyEvent, Unit> function13 = onKeyEvent;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, composableLambdaRememberComposableLambda, null, null, null, 0, jM21371getBg0d7_KjU, 0L, null, ComposableLambda3.rememberComposableLambda(292121260, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt.InternalAssetTransferEquityEdit.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues innerPadding, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
                            if ((i6 & 6) == 0) {
                                i6 |= composer3.changed(innerPadding) ? 4 : 2;
                            }
                            if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(292121260, i6, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEdit.<anonymous>.<anonymous> (InternalAssetTransferEquityEdit.kt:71)");
                            }
                            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, innerPadding);
                            final String str2 = str;
                            final BigDecimal bigDecimal2 = bigDecimal;
                            final InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewState2 = internalAssetTransferEquityEditViewState;
                            final Function1<? super ShareSelection2, Unit> function14 = function1;
                            final Function0<Unit> function03 = function02;
                            final Function1<? super Boolean, Unit> function15 = function12;
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(125929103, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt.InternalAssetTransferEquityEdit.1.2.1
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
                                        ComposerKt.traceEventStart(125929103, i7, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEdit.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferEquityEdit.kt:74)");
                                    }
                                    InternalAssetTransferEquityEdit4.EquityEditMainContent(str2, bigDecimal2, internalAssetTransferEquityEditViewState2, function14, function03, function15, null, composer4, StringResource.$stable << 6, 64);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54);
                            final InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewState3 = internalAssetTransferEquityEditViewState;
                            final Function1<? super KeyEvent, Unit> function16 = function13;
                            BentoNumpadScreenLayout.BentoNumpadScreenLayout(modifierPadding, composableLambdaRememberComposableLambda2, ComposableLambda3.rememberComposableLambda(962766207, true, new Function3<BentoNumpad4, Composer, Integer, Unit>() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt.InternalAssetTransferEquityEdit.1.2.2
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
                                        ComposerKt.traceEventStart(962766207, i7, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEdit.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferEquityEdit.kt:84)");
                                    }
                                    AnimatedVisibilityKt.AnimatedVisibility(internalAssetTransferEquityEditViewState3.isUserCurrentlyEditing(), (Modifier) null, EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), "numpadAnimation", ComposableLambda3.rememberComposableLambda(-1371868761, true, new AnonymousClass1(BentoNumpadScreenLayout, function16), composer4, 54), composer4, 224640, 2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: InternalAssetTransferEquityEdit.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt$InternalAssetTransferEquityEdit$1$2$2$1, reason: invalid class name */
                                static final class AnonymousClass1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
                                    final /* synthetic */ Function1<KeyEvent, Unit> $onKeyEvent;
                                    final /* synthetic */ BentoNumpad4 $this_BentoNumpadScreenLayout;

                                    /* JADX WARN: Multi-variable type inference failed */
                                    AnonymousClass1(BentoNumpad4 bentoNumpad4, Function1<? super KeyEvent, Unit> function1) {
                                        this.$this_BentoNumpadScreenLayout = bentoNumpad4;
                                        this.$onKeyEvent = function1;
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
                                        invoke(animatedVisibilityScope, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
                                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1371868761, i, -1, "com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEdit.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferEquityEdit.kt:90)");
                                        }
                                        BentoNumpad4 bentoNumpad4 = this.$this_BentoNumpadScreenLayout;
                                        composer.startReplaceGroup(5004770);
                                        boolean zChanged = composer.changed(this.$onKeyEvent);
                                        final Function1 function1 = this.$onKeyEvent;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt$InternalAssetTransferEquityEdit$1$2$2$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return InternalAssetTransferEquityEdit4.C191901.AnonymousClass2.C502212.AnonymousClass1.invoke$lambda$1$lambda$0(function1, (KeyEvent) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        bentoNumpad4.BentoNumpadOnly(null, (Function1) objRememberedValue, true, true, false, null, composer, (BentoNumpad4.$stable << 18) | 224640, 1);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, KeyEvent it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        function1.invoke(it);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer3, 54), composer3, 432, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 805306416, 444);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: InternalAssetTransferEquityEdit.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt$EquityEditMainContent$2 */
    static final class C191882 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ BigDecimal $availableShares;
        final /* synthetic */ String $instrumentTicker;
        final /* synthetic */ Function1<ShareSelection2, Unit> $onSelectionTypeTapped;
        final /* synthetic */ Function1<Boolean, Unit> $updateUserCurrentlyEditing;
        final /* synthetic */ InternalAssetTransferEquityEditViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        C191882(String str, BigDecimal bigDecimal, InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewState, Function1<? super ShareSelection2, Unit> function1, Function1<? super Boolean, Unit> function12) {
            this.$instrumentTicker = str;
            this.$availableShares = bigDecimal;
            this.$viewState = internalAssetTransferEquityEditViewState;
            this.$onSelectionTypeTapped = function1;
            this.$updateUserCurrentlyEditing = function12;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) throws Resources.NotFoundException {
            String strStringResource;
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(661588661, i, -1, "com.robinhood.android.internalassettransfers.customselection.equity.EquityEditMainContent.<anonymous> (InternalAssetTransferEquityEdit.kt:120)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierVerticalScroll$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 7, null);
            String str = this.$instrumentTicker;
            BigDecimal bigDecimal = this.$availableShares;
            InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewState = this.$viewState;
            final Function1<ShareSelection2, Unit> function1 = this.$onSelectionTypeTapped;
            Function1<Boolean, Unit> function12 = this.$updateUserCurrentlyEditing;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
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
            BentoText2.m20747BentoText38GnDrw(str, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8184);
            if (Intrinsics.areEqual(bigDecimal, BigDecimal.ZERO)) {
                composer.startReplaceGroup(-1400264179);
                strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_custom_selection_shares_singular_text, new Object[]{zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal).toString()}, composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1399994417);
                strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_custom_selection_shares_plural_text, new Object[]{zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal).toString()}, composer, 0);
                composer.endReplaceGroup();
            }
            BentoText2.m20747BentoText38GnDrw(strStringResource, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextL(), composer, 0, 0, 8184);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), composer, 0);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_custom_selection_quantity, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 24576, 0, 8168);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
            BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
            BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_custom_selection_all_shares_in_account, composer, 0), internalAssetTransferEquityEditViewState.getSelectionType() == ShareSelection2.ALL_SHARES, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2040, (DefaultConstructorMarker) null);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt$EquityEditMainContent$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAssetTransferEquityEdit4.C191882.invoke$lambda$6$lambda$1$lambda$0(function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            int i3 = BentoSelectionRowState.$stable;
            BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composer, i3 << 3, 1);
            BentoSelectionRowState bentoSelectionRowState2 = new BentoSelectionRowState(type2, StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_custom_selection_specific_amount, composer, 0), internalAssetTransferEquityEditViewState.getSelectionType() == ShareSelection2.SPECIFIC_AMOUNT, (BentoBaseRowState.Text) null, false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2040, (DefaultConstructorMarker) null);
            composer.startReplaceGroup(5004770);
            boolean zChanged2 = composer.changed(function1);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt$EquityEditMainContent$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAssetTransferEquityEdit4.C191882.invoke$lambda$6$lambda$3$lambda$2(function1);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState2, (Function0) objRememberedValue2, composer, i3 << 3, 1);
            Composer composer2 = composer;
            composer2.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer2.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = new FocusRequester();
                composer2.updateRememberedValue(objRememberedValue3);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue3;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1340386916);
            if (internalAssetTransferEquityEditViewState.getShowAmountInput()) {
                BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, InternalAssetTransferEquityEdit.INSTANCE.m2089xf3d17dc5(), null, null, ComposableLambda3.rememberComposableLambda(212723142, true, new InternalAssetTransferEquityEdit5(internalAssetTransferEquityEditViewState, focusRequester), composer2, 54), false, false, false, null, composer, 1575936, 0, 1975);
                composer2 = composer;
                Unit unit = Unit.INSTANCE;
                composer2.startReplaceGroup(5004770);
                boolean zChanged3 = composer2.changed(function12);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue4 == companion3.getEmpty()) {
                    objRememberedValue4 = new InternalAssetTransferEquityEdit6(function12, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 6);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$1$lambda$0(Function1 function1) {
            function1.invoke(ShareSelection2.ALL_SHARES);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$3$lambda$2(Function1 function1) {
            function1.invoke(ShareSelection2.SPECIFIC_AMOUNT);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityEditMainContent(final String str, final BigDecimal bigDecimal, final InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewState, final Function1<? super ShareSelection2, Unit> function1, final Function0<Unit> function0, final Function1<? super Boolean, Unit> function12, Modifier modifier, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        BigDecimal bigDecimal2;
        Function1<? super ShareSelection2, Unit> function13;
        Function1<? super Boolean, Unit> function14;
        int i4;
        Modifier modifier2;
        int i5;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(759792077);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 6) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                bigDecimal2 = bigDecimal;
                i3 |= composerStartRestartGroup.changedInstance(bigDecimal2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(internalAssetTransferEquityEditViewState) : composerStartRestartGroup.changedInstance(internalAssetTransferEquityEditViewState) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function13 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else {
                    if ((i & 196608) == 0) {
                        function14 = function12;
                        i3 |= composerStartRestartGroup.changedInstance(function14) ? 131072 : 65536;
                    }
                    i4 = i2 & 64;
                    if (i4 != 0) {
                        if ((1572864 & i) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                        }
                        i5 = i3;
                        if ((599187 & i5) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(759792077, i5, -1, "com.robinhood.android.internalassettransfers.customselection.equity.EquityEditMainContent (InternalAssetTransferEquityEdit.kt:115)");
                            }
                            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier4, false, ComposableLambda3.rememberComposableLambda(780163906, true, new C191871(internalAssetTransferEquityEditViewState, function0), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(661588661, true, new C191882(str2, bigDecimal2, internalAssetTransferEquityEditViewState, function13, function14), composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 18) & 14) | 3504, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return InternalAssetTransferEquityEdit4.EquityEditMainContent$lambda$1(str, bigDecimal, internalAssetTransferEquityEditViewState, function1, function0, function12, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    modifier2 = modifier;
                    i5 = i3;
                    if ((599187 & i5) != 599186) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier4, false, ComposableLambda3.rememberComposableLambda(780163906, true, new C191871(internalAssetTransferEquityEditViewState, function0), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(661588661, true, new C191882(str2, bigDecimal2, internalAssetTransferEquityEditViewState, function13, function14), composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 18) & 14) | 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function14 = function12;
                i4 = i2 & 64;
                if (i4 != 0) {
                }
                modifier2 = modifier;
                i5 = i3;
                if ((599187 & i5) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function13 = function1;
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            function14 = function12;
            i4 = i2 & 64;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            i5 = i3;
            if ((599187 & i5) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        bigDecimal2 = bigDecimal;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        function13 = function1;
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        function14 = function12;
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((599187 & i5) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: InternalAssetTransferEquityEdit.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt$EquityEditMainContent$1 */
    static final class C191871 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onConfirmClicked;
        final /* synthetic */ InternalAssetTransferEquityEditViewState $viewState;

        C191871(InternalAssetTransferEquityEditViewState internalAssetTransferEquityEditViewState, Function0<Unit> function0) {
            this.$viewState = internalAssetTransferEquityEditViewState;
            this.$onConfirmClicked = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
            long jM21426getFg20d7_KjU;
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(780163906, i, -1, "com.robinhood.android.internalassettransfers.customselection.equity.EquityEditMainContent.<anonymous> (InternalAssetTransferEquityEdit.kt:235)");
            }
            InputErrorMessage inputErrorMessage = this.$viewState.getInputErrorMessage();
            composer2.startReplaceGroup(-1881761145);
            if (inputErrorMessage != null) {
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM()), 0.0f, 1, null);
                String string2 = StringResources6.getText(inputErrorMessage.getMessage(), composer2, StringResource.$stable).toString();
                TextStyle textS = bentoTheme.getTypography(composer2, i2).getTextS();
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                if (inputErrorMessage.getUseNegativeColor()) {
                    composer2.startReplaceGroup(-564027654);
                    jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i2).m21452getNegative0d7_KjU();
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-563948449);
                    jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i2).m21426getFg20d7_KjU();
                    composer2.endReplaceGroup();
                }
                BentoText2.m20747BentoText38GnDrw(string2, modifierFillMaxWidth$default, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textS, composer, 0, 0, 8120);
                composer2 = composer;
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_confirm, composer2, 0);
            boolean zIsConfirmEnabled = this.$viewState.isConfirmEnabled();
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), 0.0f, 1, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, this.$viewState.getSelectionType().getIdentifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
            composer2.startReplaceGroup(5004770);
            boolean zChanged = composer2.changed(this.$onConfirmClicked);
            final Function0<Unit> function0 = this.$onConfirmClicked;
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.customselection.equity.InternalAssetTransferEquityEditKt$EquityEditMainContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAssetTransferEquityEdit4.C191871.invoke$lambda$2$lambda$1(function0);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierAutoLogEvents$default, null, null, zIsConfirmEnabled, false, null, null, null, null, false, null, composer2, 0, 0, 8152);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }
}
