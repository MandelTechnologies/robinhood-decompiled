package com.robinhood.android.ticker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.viewinterop.AndroidViewBinding;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.viewbinding.ViewBinding;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.ticker.TickerTextState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WrappedTicker.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0006\u001a~\u0010\u0007\u001a\u00020\u0001\"\b\b\u0000\u0010\b*\u00020\t2K\u0010\n\u001aG\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u0002H\b0\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0015\u001a/\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\"\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006$²\u0006\n\u0010\u0014\u001a\u00020\u0012X\u008a\u008e\u0002"}, m3636d2 = {"InternalTickerText", "", "state", "Lcom/robinhood/android/ticker/TickerTextState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/ticker/TickerTextState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "WrappedTicker", "T", "Landroidx/viewbinding/ViewBinding;", "factory", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Lkotlin/ParameterName;", "name", "inflater", "Landroid/view/ViewGroup;", "parent", "", "attachToParent", "shouldAnimate", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/ticker/TickerTextState;ZLandroidx/compose/runtime/Composer;II)V", "LocalTickerTextProvider", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/android/ticker/TickerTextProvider;", "getLocalTickerTextProvider", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "TickerText", "text", "", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", ResourceTypes.STYLE, "Lcom/robinhood/android/ticker/TickerTextState$Style;", "TickerText-FNF3uiM", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;JLcom/robinhood/android/ticker/TickerTextState$Style;Landroidx/compose/runtime/Composer;I)V", "lib-ticker_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class WrappedTickerKt {
    private static final CompositionLocal6<TickerTextProvider> LocalTickerTextProvider = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.ticker.WrappedTickerKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DefaultTickerTextProvider.INSTANCE;
        }
    });

    /* compiled from: WrappedTicker.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TickerTextState.Style.values().length];
            try {
                iArr[TickerTextState.Style.DISPLAY_LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TickerTextState.Style.DISPLAY_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TickerTextState.Style.REGULAR_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TickerTextState.Style.REGULAR_LARGE_BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TickerTextState.Style.REGULAR_MEDIUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TickerTextState.Style.REGULAR_MEDIUM_BOLD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TickerTextState.Style.REGULAR_MEDIUM_LARGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TickerTextState.Style.REGULAR_SMALL_BOLD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TickerTextState.Style.REGULAR_SMALL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalTickerText$lambda$13(TickerTextState tickerTextState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InternalTickerText(tickerTextState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerText$lambda$20(TickerTextState tickerTextState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TickerText(tickerTextState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TickerText_FNF3uiM$lambda$19(Modifier modifier, String str, long j, TickerTextState.Style style, int i, Composer composer, int i2) {
        m19244TickerTextFNF3uiM(modifier, str, j, style, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WrappedTicker$lambda$17(Function3 function3, Modifier modifier, TickerTextState tickerTextState, boolean z, int i, int i2, Composer composer, int i3) {
        WrappedTicker(function3, modifier, tickerTextState, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InternalTickerText(TickerTextState tickerTextState, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        KFunction kFunction;
        final TickerTextState tickerTextState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1518686106);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(tickerTextState) ? 4 : 2) | i;
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
            tickerTextState2 = tickerTextState;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1518686106, i3, -1, "com.robinhood.android.ticker.InternalTickerText (WrappedTicker.kt:62)");
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
            Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(modifier, false, null, 3, null);
            switch (WhenMappings.$EnumSwitchMapping$0[tickerTextState.getStyle().ordinal()]) {
                case 1:
                    composerStartRestartGroup.startReplaceGroup(-7381849);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = WrappedTickerKt$InternalTickerText$1$1.INSTANCE;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    kFunction = (KFunction) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 2:
                    composerStartRestartGroup.startReplaceGroup(-7296351);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = WrappedTickerKt$InternalTickerText$2$1.INSTANCE;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    kFunction = (KFunction) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 3:
                    composerStartRestartGroup.startReplaceGroup(-7206110);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = WrappedTickerKt$InternalTickerText$3$1.INSTANCE;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    kFunction = (KFunction) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 4:
                    composerStartRestartGroup.startReplaceGroup(-7111746);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = WrappedTickerKt$InternalTickerText$4$1.INSTANCE;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    kFunction = (KFunction) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 5:
                    composerStartRestartGroup.startReplaceGroup(-7017599);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = WrappedTickerKt$InternalTickerText$5$1.INSTANCE;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    kFunction = (KFunction) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 6:
                    composerStartRestartGroup.startReplaceGroup(-6921251);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = WrappedTickerKt$InternalTickerText$6$1.INSTANCE;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    kFunction = (KFunction) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 7:
                    composerStartRestartGroup.startReplaceGroup(-6819013);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = WrappedTickerKt$InternalTickerText$7$1.INSTANCE;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    kFunction = (KFunction) objRememberedValue8;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 8:
                    composerStartRestartGroup.startReplaceGroup(-6717922);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == companion.getEmpty()) {
                        objRememberedValue9 = WrappedTickerKt$InternalTickerText$8$1.INSTANCE;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    kFunction = (KFunction) objRememberedValue9;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                case 9:
                    composerStartRestartGroup.startReplaceGroup(-6624798);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue10 == companion.getEmpty()) {
                        objRememberedValue10 = WrappedTickerKt$InternalTickerText$9$1.INSTANCE;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    kFunction = (KFunction) objRememberedValue10;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                    break;
                default:
                    composerStartRestartGroup.startReplaceGroup(-831523571);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
            }
            tickerTextState2 = tickerTextState;
            WrappedTicker((Function3) kFunction, modifierWithBentoPlaceholder$default, tickerTextState2, InternalTickerText$lambda$1(snapshotState), composerStartRestartGroup, (i3 << 6) & 896, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue11 == companion.getEmpty()) {
                objRememberedValue11 = new WrappedTickerKt$InternalTickerText$10$1(snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect((Object) 1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.ticker.WrappedTickerKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WrappedTickerKt.InternalTickerText$lambda$13(tickerTextState2, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InternalTickerText$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final boolean InternalTickerText$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final <T extends ViewBinding> void WrappedTicker(Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> function3, Modifier modifier, final TickerTextState tickerTextState, final boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Function3<? super LayoutInflater, ? super ViewGroup, ? super Boolean, ? extends T> function32;
        Composer composerStartRestartGroup = composer.startRestartGroup(1499260452);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(tickerTextState) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function32 = function3;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1499260452, i3, -1, "com.robinhood.android.ticker.WrappedTicker (WrappedTicker.kt:97)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.ticker.WrappedTickerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WrappedTickerKt.WrappedTicker$lambda$16$lambda$15(tickerTextState, z, (ViewBinding) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidViewBinding.AndroidViewBinding(function3, modifier2, (Function1) objRememberedValue, composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
            function32 = function3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.ticker.WrappedTickerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WrappedTickerKt.WrappedTicker$lambda$17(function32, modifier3, tickerTextState, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WrappedTicker$lambda$16$lambda$15(TickerTextState tickerTextState, boolean z, ViewBinding AndroidViewBinding) {
        Intrinsics.checkNotNullParameter(AndroidViewBinding, "$this$AndroidViewBinding");
        View root = AndroidViewBinding.getRoot();
        AnimatedRhTextView animatedRhTextView = root instanceof AnimatedRhTextView ? (AnimatedRhTextView) root : null;
        if (animatedRhTextView != null) {
            animatedRhTextView.setTextColor(Color2.m6735toArgb8_81llA(tickerTextState.m19241getTextColor0d7_KjU()));
            animatedRhTextView.setText(tickerTextState.getText(), z);
            animatedRhTextView.setContentDescription(tickerTextState.getContentDescription());
        }
        return Unit.INSTANCE;
    }

    public static final CompositionLocal6<TickerTextProvider> getLocalTickerTextProvider() {
        return LocalTickerTextProvider;
    }

    /* renamed from: TickerText-FNF3uiM, reason: not valid java name */
    public static final void m19244TickerTextFNF3uiM(final Modifier modifier, final String text, final long j, final TickerTextState.Style style, Composer composer, final int i) {
        int i2;
        long j2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1201811222);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i2 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        } else {
            j2 = j;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(style.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1201811222, i2, -1, "com.robinhood.android.ticker.TickerText (WrappedTicker.kt:156)");
            }
            if (((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(-310569697);
                BentoText2.m20747BentoText38GnDrw(text, modifier, Color.m6701boximpl(j2), null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, ((i2 >> 3) & 14) | ((i2 << 3) & 112) | (i2 & 896), 0, 16376);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-310441853);
                ((TickerTextProvider) composerStartRestartGroup.consume(LocalTickerTextProvider)).mo19237TickerTextFNF3uiM(modifier, text, j, style, composerStartRestartGroup, i2 & 8190);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.ticker.WrappedTickerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WrappedTickerKt.TickerText_FNF3uiM$lambda$19(modifier, text, j, style, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TickerText(final TickerTextState state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1344208873);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
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
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1344208873, i3, -1, "com.robinhood.android.ticker.TickerText (WrappedTicker.kt:177)");
                }
                if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(948667554);
                    int i5 = i3 & 112;
                    Modifier modifier4 = modifier3;
                    BentoText2.m20747BentoText38GnDrw(state.getText(), modifier4, Color.m6701boximpl(state.m19241getTextColor0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i5, 0, 16376);
                    modifier3 = modifier4;
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(948808418);
                    InternalTickerText(state, modifier3, composer2, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.ticker.WrappedTickerKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return WrappedTickerKt.TickerText$lambda$20(state, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
