package com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet;

import android.view.KeyEvent;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.contracts.CryptoOrderIntentKey;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRow3;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.sheet.CryptoQuickTradeRow;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoQuickTradeActionBar4;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoQuickTradeAmountInputRow4;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoQuickTradeAmountInputRowState;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoQuickTradeDropdownContainer;
import com.robinhood.shared.trade.crypto.p397ui.quickTrade.views.CryptoQuickTradeDropdownState;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState;
import com.robinhood.shared.trade.crypto.views.CryptoOrderAppBarOrderTypeComposable;
import com.robinhood.shared.trade.crypto.views.CryptoOrderAppBarOrderTypeState;
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

/* compiled from: CryptoQuickTradeInputContent.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a£\u0001\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a%\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010!\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010 \u001a\u00020\u0018H\u0003¢\u0006\u0004\b!\u0010\"\u001a5\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0003¢\u0006\u0004\b%\u0010&¨\u0006*²\u0006\u000e\u0010'\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\f\u0010)\u001a\u00020(8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetViewState;", "viewState", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "", "onKeyPress", "Lkotlin/Function0;", "onCurrencySwitcherClick", "Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey$OrderType;", "onTypeSelected", "onOpenDisclosuresClicked", "Lkotlin/Function2;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "", "onButtonPressed", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "onOrderReviewRowTapped", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetEvent;", "event", "Landroidx/compose/ui/Modifier;", "modifier", "CryptoQuickTradeInputContent", "(Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeSheetViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/udf/event/Event;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "visible", "content", "SlideInVisibility", "(ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "", "title", "onOrderTypeSelectorClicked", "showingOrderTypeSelector", "Header", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeRow$Input;", "inputRow", "InputRowContent", "(Lcom/robinhood/shared/trade/crypto/ui/quickTrade/sheet/CryptoQuickTradeRow$Input;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/udf/event/Event;Landroidx/compose/runtime/Composer;I)V", "shouldShowOrderTypeSelector", "", "scrimAlpha", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoQuickTradeInputContent3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoQuickTradeInputContent$lambda$15(CryptoQuickTradeSheetViewState cryptoQuickTradeSheetViewState, Function1 function1, Function0 function0, Function1 function12, Function0 function02, Function2 function2, Function1 function13, Event event, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoQuickTradeInputContent(cryptoQuickTradeSheetViewState, function1, function0, function12, function02, function2, function13, event, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$24(String str, Function0 function0, boolean z, int i, Composer composer, int i2) {
        Header(str, function0, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputRowContent$lambda$25(CryptoQuickTradeRow.Input input, Function0 function0, Event event, int i, Composer composer, int i2) {
        InputRowContent(input, function0, event, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SlideInVisibility$lambda$17$lambda$16(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SlideInVisibility$lambda$19$lambda$18(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SlideInVisibility$lambda$20(boolean z, Function2 function2, int i, Composer composer, int i2) {
        SlideInVisibility(z, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x037a A[LOOP:0: B:163:0x0371->B:165:0x037a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoQuickTradeInputContent(final CryptoQuickTradeSheetViewState viewState, final Function1<? super KeyEvent, Unit> onKeyPress, final Function0<Unit> onCurrencySwitcherClick, final Function1<? super CryptoOrderIntentKey.OrderType, Unit> onTypeSelected, final Function0<Unit> onOpenDisclosuresClicked, final Function2<? super ActionViewState, ? super Integer, Unit> onButtonPressed, final Function1<? super CryptoOrderReviewRowState.TapAction, Unit> onOrderReviewRowTapped, final Event<CryptoQuickTradeSheetEvent> event, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zChanged;
        Object objRememberedValue2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        boolean zChanged2;
        Object objRememberedValue3;
        boolean z;
        Object objRememberedValue4;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onKeyPress, "onKeyPress");
        Intrinsics.checkNotNullParameter(onCurrencySwitcherClick, "onCurrencySwitcherClick");
        Intrinsics.checkNotNullParameter(onTypeSelected, "onTypeSelected");
        Intrinsics.checkNotNullParameter(onOpenDisclosuresClicked, "onOpenDisclosuresClicked");
        Intrinsics.checkNotNullParameter(onButtonPressed, "onButtonPressed");
        Intrinsics.checkNotNullParameter(onOrderReviewRowTapped, "onOrderReviewRowTapped");
        Composer composerStartRestartGroup = composer.startRestartGroup(1582761518);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onKeyPress) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCurrencySwitcherClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTypeSelected) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOpenDisclosuresClicked) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onButtonPressed) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOrderReviewRowTapped) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(event) ? 8388608 : 4194304;
        }
        int i4 = i2 & 256;
        if (i4 == 0) {
            if ((100663296 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 67108864 : 33554432;
            }
            if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1582761518, i3, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContent (CryptoQuickTradeInputContent.kt:64)");
                }
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoQuickTradeInputContent3.CryptoQuickTradeInputContent$lambda$1$lambda$0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(!CryptoQuickTradeInputContent$lambda$2(snapshotState) ? 0.15f : 1.0f, null, 0.0f, "DropdownMenuAlphaAnimation", null, composerStartRestartGroup, 3072, 22);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                int i5 = i3;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Modifier modifier5 = modifier4;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                StringResource inputStageHeader = viewState.getInputStageHeader();
                composerStartRestartGroup.startReplaceGroup(-798696163);
                String string2 = inputStageHeader != null ? null : StringResource2.getString(inputStageHeader, composerStartRestartGroup, StringResource.$stable);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(snapshotState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoQuickTradeInputContent3.m2876x67d6a11c(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Header(string2, (Function0) objRememberedValue2, CryptoQuickTradeInputContent$lambda$2(snapshotState), composerStartRestartGroup, 0);
                Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
                Modifier modifierAlpha = Alpha.alpha(companion4, CryptoQuickTradeInputContent$lambda$4(snapshotState4AnimateFloatAsState));
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlpha);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                composerStartRestartGroup.startReplaceGroup(803350348);
                for (final CryptoQuickTradeRow cryptoQuickTradeRow : viewState.getInputStageRows()) {
                    SlideInVisibility(cryptoQuickTradeRow.getVisible(), ComposableLambda3.rememberComposableLambda(-1929414411, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$CryptoQuickTradeInputContent$1$1$2$1$1
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
                                ComposerKt.traceEventStart(-1929414411, i6, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoQuickTradeInputContent.kt:91)");
                            }
                            CryptoQuickTradeRow cryptoQuickTradeRow2 = cryptoQuickTradeRow;
                            if (cryptoQuickTradeRow2 instanceof CryptoQuickTradeRow.Input) {
                                composer3.startReplaceGroup(1258627333);
                                CryptoQuickTradeInputContent3.InputRowContent((CryptoQuickTradeRow.Input) cryptoQuickTradeRow, onCurrencySwitcherClick, event, composer3, 0);
                                composer3.endReplaceGroup();
                            } else {
                                if (!(cryptoQuickTradeRow2 instanceof CryptoQuickTradeRow.OrderReviewRow)) {
                                    composer3.startReplaceGroup(1258624469);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(363082599);
                                CryptoOrderReviewRow3.CryptoOrderReviewRow(((CryptoQuickTradeRow.OrderReviewRow) cryptoQuickTradeRow).getState(), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer3, 6, 1), onOrderReviewRowTapped, composer3, CryptoOrderReviewRowState.$stable, 0);
                                composer3.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                }
                composerStartRestartGroup.endReplaceGroup();
                SlideInVisibility(viewState.getDisclosureVisible(), ComposableLambda3.rememberComposableLambda(-1487532576, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$CryptoQuickTradeInputContent$1$1$2$2
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
                            ComposerKt.traceEventStart(-1487532576, i6, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoQuickTradeInputContent.kt:111)");
                        }
                        String strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_quick_trade_disclosure_text, composer3, 0);
                        Modifier.Companion companion5 = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion5, 0.0f, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 1, null);
                        BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource, StringResources_androidKt.stringResource(C40095R.string.crypto_quick_trade_disclosure_link_text, composer3, 0), onOpenDisclosuresClicked, modifierM5144paddingVpY3zN4$default, bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU(), 0L, bentoTheme.getTypography(composer3, i7).getTextS(), 0, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                ActionViewState actionBarState = viewState.getActionBarState();
                Modifier.Companion companion5 = Modifier.INSTANCE;
                CryptoQuickTradeActionBar4.CryptoQuickTradeActionBar(actionBarState, onButtonPressed, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion5, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), composerStartRestartGroup, (i5 >> 12) & 112, 0);
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1073625391, true, new CryptoQuickTradeInputContent6(viewState, onKeyPress), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                boolean zCryptoQuickTradeInputContent$lambda$2 = CryptoQuickTradeInputContent$lambda$2(snapshotState);
                CryptoQuickTradeDropdownState orderTypeDropdownSelectorState = viewState.getOrderTypeDropdownSelectorState();
                Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion5);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(snapshotState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoQuickTradeInputContent3.CryptoQuickTradeInputContent$lambda$14$lambda$11$lambda$10(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function0 function0 = (Function0) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChanged3 = composerStartRestartGroup.changed(snapshotState);
                z = ((i5 & 7168) == 2048) | zChanged3;
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoQuickTradeInputContent3.CryptoQuickTradeInputContent$lambda$14$lambda$13$lambda$12(onTypeSelected, snapshotState, (CryptoOrderIntentKey.OrderType) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                CryptoQuickTradeDropdownContainer.CryptoQuickTradeDropdownContainer(zCryptoQuickTradeInputContent$lambda$2, function0, (Function1) objRememberedValue4, orderTypeDropdownSelectorState, modifierMatchParentSize, composer2, 0, 0);
                composer2.endNode();
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoQuickTradeInputContent3.CryptoQuickTradeInputContent$lambda$15(viewState, onKeyPress, onCurrencySwitcherClick, onTypeSelected, onOpenDisclosuresClicked, onButtonPressed, onOrderReviewRowTapped, event, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 100663296;
        modifier2 = modifier;
        if ((i3 & 38347923) == 38347922) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(!CryptoQuickTradeInputContent$lambda$2(snapshotState) ? 0.15f : 1.0f, null, 0.0f, "DropdownMenuAlphaAnimation", null, composerStartRestartGroup, 3072, 22);
            Alignment.Companion companion22 = Alignment.INSTANCE;
            int i52 = i3;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Modifier modifier52 = modifier4;
            Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Alignment.Horizontal centerHorizontally3 = companion22.getCenterHorizontally();
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally3, composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    StringResource inputStageHeader2 = viewState.getInputStageHeader();
                    composerStartRestartGroup.startReplaceGroup(-798696163);
                    if (inputStageHeader2 != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(snapshotState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoQuickTradeInputContent3.m2876x67d6a11c(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        Header(string2, (Function0) objRememberedValue2, CryptoQuickTradeInputContent$lambda$2(snapshotState), composerStartRestartGroup, 0);
                        Alignment.Horizontal centerHorizontally22 = companion22.getCenterHorizontally();
                        Modifier modifierAlpha2 = Alpha.alpha(companion42, CryptoQuickTradeInputContent$lambda$4(snapshotState4AnimateFloatAsState2));
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally22, composerStartRestartGroup, 48);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlpha2);
                        Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                            composerStartRestartGroup.startReplaceGroup(803350348);
                            while (r6.hasNext()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            SlideInVisibility(viewState.getDisclosureVisible(), ComposableLambda3.rememberComposableLambda(-1487532576, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$CryptoQuickTradeInputContent$1$1$2$2
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
                                        ComposerKt.traceEventStart(-1487532576, i6, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoQuickTradeInputContent.kt:111)");
                                    }
                                    String strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_quick_trade_disclosure_text, composer3, 0);
                                    Modifier.Companion companion52 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i7 = BentoTheme.$stable;
                                    Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion52, 0.0f, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 1, null);
                                    BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource, StringResources_androidKt.stringResource(C40095R.string.crypto_quick_trade_disclosure_link_text, composer3, 0), onOpenDisclosuresClicked, modifierM5144paddingVpY3zN4$default, bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU(), 0L, bentoTheme.getTypography(composer3, i7).getTextS(), 0, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                            ActionViewState actionBarState2 = viewState.getActionBarState();
                            Modifier.Companion companion52 = Modifier.INSTANCE;
                            CryptoQuickTradeActionBar4.CryptoQuickTradeActionBar(actionBarState2, onButtonPressed, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion52, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), composerStartRestartGroup, (i52 >> 12) & 112, 0);
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1073625391, true, new CryptoQuickTradeInputContent6(viewState, onKeyPress), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            boolean zCryptoQuickTradeInputContent$lambda$22 = CryptoQuickTradeInputContent$lambda$2(snapshotState);
                            CryptoQuickTradeDropdownState orderTypeDropdownSelectorState2 = viewState.getOrderTypeDropdownSelectorState();
                            Modifier modifierMatchParentSize2 = boxScopeInstance2.matchParentSize(companion52);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged2 = composerStartRestartGroup.changed(snapshotState);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoQuickTradeInputContent3.CryptoQuickTradeInputContent$lambda$14$lambda$11$lambda$10(snapshotState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                Function0 function02 = (Function0) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChanged32 = composerStartRestartGroup.changed(snapshotState);
                                if ((i52 & 7168) == 2048) {
                                }
                                z = ((i52 & 7168) == 2048) | zChanged32;
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (!z) {
                                    objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CryptoQuickTradeInputContent3.CryptoQuickTradeInputContent$lambda$14$lambda$13$lambda$12(onTypeSelected, snapshotState, (CryptoOrderIntentKey.OrderType) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    composerStartRestartGroup.endReplaceGroup();
                                    composer2 = composerStartRestartGroup;
                                    CryptoQuickTradeDropdownContainer.CryptoQuickTradeDropdownContainer(zCryptoQuickTradeInputContent$lambda$22, function02, (Function1) objRememberedValue4, orderTypeDropdownSelectorState2, modifierMatchParentSize2, composer2, 0, 0);
                                    composer2.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier52;
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState CryptoQuickTradeInputContent$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void CryptoQuickTradeInputContent$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoQuickTradeInputContent$lambda$14$lambda$9$lambda$6$lambda$5 */
    public static final Unit m2876x67d6a11c(SnapshotState snapshotState) {
        CryptoQuickTradeInputContent$lambda$3(snapshotState, !CryptoQuickTradeInputContent$lambda$2(snapshotState));
        return Unit.INSTANCE;
    }

    private static final boolean CryptoQuickTradeInputContent$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float CryptoQuickTradeInputContent$lambda$4(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoQuickTradeInputContent$lambda$14$lambda$11$lambda$10(SnapshotState snapshotState) {
        CryptoQuickTradeInputContent$lambda$3(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoQuickTradeInputContent$lambda$14$lambda$13$lambda$12(Function1 function1, SnapshotState snapshotState, CryptoOrderIntentKey.OrderType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CryptoQuickTradeInputContent$lambda$3(snapshotState, false);
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    private static final void SlideInVisibility(final boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1014820777);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1014820777, i2, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.SlideInVisibility (CryptoQuickTradeInputContent.kt:165)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(CryptoQuickTradeInputContent3.SlideInVisibility$lambda$17$lambda$16(((Integer) obj).intValue()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EnterTransition enterTransitionSlideInVertically$default = EnterExitTransitionKt.slideInVertically$default(null, (Function1) objRememberedValue, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            EnterTransition enterTransitionPlus = enterTransitionSlideInVertically$default.plus(EnterExitTransitionKt.expandVertically$default(null, companion2.getBottom(), false, null, 13, null)).plus(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null));
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(CryptoQuickTradeInputContent3.SlideInVisibility$lambda$19$lambda$18(((Integer) obj).intValue()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, enterTransitionPlus, EnterExitTransitionKt.slideOutVertically$default(null, (Function1) objRememberedValue2, 1, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, companion2.getBottom(), false, null, 13, null)).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambda3.rememberComposableLambda(-1827317457, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt.SlideInVisibility.3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1827317457, i3, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.SlideInVisibility.<anonymous> (CryptoQuickTradeInputContent.kt:178)");
                    }
                    function2.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeInputContent3.SlideInVisibility$lambda$20(z, function2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Header(final String str, final Function0<Unit> function0, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-577643996);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-577643996, i3, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.Header (CryptoQuickTradeInputContent.kt:186)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), 0.0f, C2002Dp.m7995constructorimpl(14), 5, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            LocalShowPlaceholder.Loadable(str == null, null, null, ComposableLambda3.rememberComposableLambda(-2107066088, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$Header$1$1
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
                        ComposerKt.traceEventStart(-2107066088, i5, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.Header.<anonymous>.<anonymous> (CryptoQuickTradeInputContent.kt:199)");
                    }
                    String str2 = str;
                    if (str2 == null) {
                        str2 = "----";
                    }
                    BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getDisplayCapsuleSmall(), composer2, 0, 0, 8190);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            composerStartRestartGroup = composerStartRestartGroup;
            CryptoOrderAppBarOrderTypeState cryptoOrderAppBarOrderTypeState = new CryptoOrderAppBarOrderTypeState(new CryptoOrderAppBarOrderTypeState.Type.OrderType(CryptoOrderType.MARKET), z);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoQuickTradeInputContent3.Header$lambda$23$lambda$22$lambda$21(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            CryptoOrderAppBarOrderTypeComposable.CryptoOrderAppBarOrderTypeComposable(cryptoOrderAppBarOrderTypeState, (Function0) objRememberedValue, null, composerStartRestartGroup, 0, 4);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeInputContent3.Header$lambda$24(str, function0, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Header$lambda$23$lambda$22$lambda$21(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InputRowContent(final CryptoQuickTradeRow.Input input, Function0<Unit> function0, Event<CryptoQuickTradeSheetEvent> event, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function02;
        final Event<CryptoQuickTradeSheetEvent> event2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-949244203);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(input) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(event) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-949244203, i2, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.InputRowContent (CryptoQuickTradeInputContent.kt:224)");
            }
            CryptoQuickTradeAmountInputRowState inputRowState = input.getInputRowState();
            if (inputRowState == null) {
                composerStartRestartGroup.startReplaceGroup(-869110091);
                LocalShowPlaceholder.Loadable(true, null, null, CryptoQuickTradeInputContent.INSTANCE.m25944getLambda$280055872$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 3078, 6);
                composerStartRestartGroup.endReplaceGroup();
                function02 = function0;
                event2 = event;
            } else {
                composerStartRestartGroup.startReplaceGroup(-868642425);
                function02 = function0;
                event2 = event;
                CryptoQuickTradeAmountInputRow4.CryptoQuickTradeAmountInputRow(inputRowState, event2, androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null), function02, composerStartRestartGroup, ((i2 >> 3) & 112) | ((i2 << 6) & 7168), 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
            event2 = event;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.sheet.CryptoQuickTradeInputContentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeInputContent3.InputRowContent$lambda$25(input, function02, event2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
