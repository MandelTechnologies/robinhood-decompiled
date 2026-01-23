package com.robinhood.android.portfolio.pnl.composable;

import android.content.res.Resources;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.C25673R;
import com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposable2;
import com.robinhood.android.portfolio.pnl.composable.banners.CryptoTransferredInBanner;
import com.robinhood.android.portfolio.pnl.composable.banners.MultiDayExecutionBanner;
import com.robinhood.android.portfolio.pnl.composable.crypto.CryptoPnlDetails9;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossOrderDetails;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.LocalDate;

/* compiled from: PnlTradeDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001aQ\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0015\u001a\u001d\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010\u001c\u001a%\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0003¢\u0006\u0002\u0010 \u001a\f\u0010!\u001a\u00020\u0001*\u00020\u0019H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\""}, m3636d2 = {"TEST_TAG_OPEN_PRICE", "", "TEST_TAG_OPEN_PRICE_CALCULATION", "TEST_TAG_CLOSE_PRICE", "TEST_TAG_CLOSE_PRICE_CALCULATION", "PnlTradeDetailBottomSheet", "", "state", "Lcom/robinhood/android/portfolio/pnl/composable/PnlTradeDetailBottomSheetState;", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onViewInstrument", "onViewPnlHub", "(Lcom/robinhood/android/portfolio/pnl/composable/PnlTradeDetailBottomSheetState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DefaultPnlDetails", ErrorResponse.DETAIL, "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "(Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;Landroidx/compose/runtime/Composer;I)V", "getOpenPriceCalculation", "(Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "getClosePriceCalculation", "formatEquityCalculation", "averagePrice", "Lcom/robinhood/models/util/Money;", "quantity", "Ljava/math/BigDecimal;", "(Lcom/robinhood/models/util/Money;Ljava/math/BigDecimal;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatOptionCalculation", "tvm", "", "(Lcom/robinhood/models/util/Money;ILjava/math/BigDecimal;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatRealizedReturn", "lib-profit-and-loss_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PnlTradeDetailComposable2 {
    public static final String TEST_TAG_CLOSE_PRICE = "closePrice";
    public static final String TEST_TAG_CLOSE_PRICE_CALCULATION = "closePriceCalculation";
    public static final String TEST_TAG_OPEN_PRICE = "openPrice";
    public static final String TEST_TAG_OPEN_PRICE_CALCULATION = "openPriceCalculation";

    /* compiled from: PnlTradeDetailComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetClass.values().length];
            try {
                iArr[AssetClass.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetClass.OPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DefaultPnlDetails$lambda$4(ProfitAndLossTradeItem profitAndLossTradeItem, int i, Composer composer, int i2) {
        DefaultPnlDetails(profitAndLossTradeItem, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PnlTradeDetailBottomSheet$lambda$3(PnlTradeDetailBottomSheetState pnlTradeDetailBottomSheetState, Function0 function0, Modifier modifier, Function0 function02, Function0 function03, int i, int i2, Composer composer, int i3) {
        PnlTradeDetailBottomSheet(pnlTradeDetailBottomSheetState, function0, modifier, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PnlTradeDetailBottomSheet(final PnlTradeDetailBottomSheetState state, final Function0<Unit> onDismiss, Modifier modifier, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function03;
        int i5;
        Function0<Unit> function04;
        ProfitAndLossTradeItem detail;
        boolean zChanged;
        Object objRememberedValue;
        boolean z;
        boolean zChanged2;
        Object objRememberedValue2;
        boolean zChanged3;
        Object objRememberedValue3;
        ProfitAndLossOrderDetails.CryptoOrderDetails cryptoOrderDetails;
        final Modifier modifier3;
        final Function0<Unit> function05;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1981145611);
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
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function03 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function03) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function04 = function02;
                        i3 |= composerStartRestartGroup.changedInstance(function04) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            function03 = null;
                        }
                        if (i5 != 0) {
                            function04 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1981145611, i3, -1, "com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailBottomSheet (PnlTradeDetailComposable.kt:60)");
                        }
                        detail = state.getDetail();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(detail);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        z = false;
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            LocalDate localDate$default = Instants.toLocalDate$default(detail.getFirstExecutionTimeStamp(), null, 1, null);
                            LocalDate localDate$default2 = Instants.toLocalDate$default(detail.getCloseTimestamp(), null, 1, null);
                            objRememberedValue = Boolean.valueOf(localDate$default.getYear() == localDate$default2.getYear() || localDate$default.getDayOfYear() != localDate$default2.getDayOfYear());
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged2 = composerStartRestartGroup.changed(detail);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = Boolean.valueOf(!(detail.getOrderDetails() instanceof ProfitAndLossOrderDetails.CryptoOrderDetails) && detail.getOpenAveragePrice() == null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        boolean zBooleanValue2 = ((Boolean) objRememberedValue2).booleanValue();
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged3 = composerStartRestartGroup.changed(detail);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            ProfitAndLossOrderDetails orderDetails = detail.getOrderDetails();
                            cryptoOrderDetails = !(orderDetails instanceof ProfitAndLossOrderDetails.CryptoOrderDetails) ? (ProfitAndLossOrderDetails.CryptoOrderDetails) orderDetails : null;
                            if ((cryptoOrderDetails != null ? cryptoOrderDetails.getTransferred() : null) != null && cryptoOrderDetails.getAcquired() != null) {
                                z = true;
                            }
                            objRememberedValue3 = Boolean.valueOf(z);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        boolean zBooleanValue3 = ((Boolean) objRememberedValue3).booleanValue();
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier5 = modifier4;
                        Function0<Unit> function06 = function03;
                        AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.PNL_DETAIL_BOTTOM_SHEET, null, null, 6, null), null, 47, null), ComposableLambda3.rememberComposableLambda(605441898, true, new C256871(modifier5, detail, zBooleanValue2, state, zBooleanValue, zBooleanValue3, onDismiss, function06, function04), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        function05 = function06;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        function05 = function03;
                    }
                    final Function0<Unit> function07 = function04;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PnlTradeDetailComposable2.PnlTradeDetailBottomSheet$lambda$3(state, onDismiss, modifier3, function05, function07, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function04 = function02;
                if ((i3 & 9363) == 9362) {
                    if (i6 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    detail = state.getDetail();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(detail);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    z = false;
                    if (!zChanged) {
                        LocalDate localDate$default3 = Instants.toLocalDate$default(detail.getFirstExecutionTimeStamp(), null, 1, null);
                        LocalDate localDate$default22 = Instants.toLocalDate$default(detail.getCloseTimestamp(), null, 1, null);
                        if (localDate$default3.getYear() == localDate$default22.getYear()) {
                            objRememberedValue = Boolean.valueOf(localDate$default3.getYear() == localDate$default22.getYear() || localDate$default3.getDayOfYear() != localDate$default22.getDayOfYear());
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            boolean zBooleanValue4 = ((Boolean) objRememberedValue).booleanValue();
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged2 = composerStartRestartGroup.changed(detail);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                if (detail.getOrderDetails() instanceof ProfitAndLossOrderDetails.CryptoOrderDetails) {
                                    objRememberedValue2 = Boolean.valueOf(!(detail.getOrderDetails() instanceof ProfitAndLossOrderDetails.CryptoOrderDetails) && detail.getOpenAveragePrice() == null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    boolean zBooleanValue22 = ((Boolean) objRememberedValue2).booleanValue();
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(5004770);
                                    zChanged3 = composerStartRestartGroup.changed(detail);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged3) {
                                        ProfitAndLossOrderDetails orderDetails2 = detail.getOrderDetails();
                                        if (!(orderDetails2 instanceof ProfitAndLossOrderDetails.CryptoOrderDetails)) {
                                        }
                                        if ((cryptoOrderDetails != null ? cryptoOrderDetails.getTransferred() : null) != null) {
                                            z = true;
                                        }
                                        objRememberedValue3 = Boolean.valueOf(z);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                        boolean zBooleanValue32 = ((Boolean) objRememberedValue3).booleanValue();
                                        composerStartRestartGroup.endReplaceGroup();
                                        Modifier modifier52 = modifier4;
                                        Function0<Unit> function062 = function03;
                                        AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.PNL_DETAIL_BOTTOM_SHEET, null, null, 6, null), null, 47, null), ComposableLambda3.rememberComposableLambda(605441898, true, new C256871(modifier52, detail, zBooleanValue22, state, zBooleanValue4, zBooleanValue32, onDismiss, function062, function04), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        modifier3 = modifier52;
                                        function05 = function062;
                                    }
                                }
                            }
                        }
                    }
                }
                final Function0 function072 = function04;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function03 = function0;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function04 = function02;
            if ((i3 & 9363) == 9362) {
            }
            final Function0 function0722 = function04;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function03 = function0;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function04 = function02;
        if ((i3 & 9363) == 9362) {
        }
        final Function0 function07222 = function04;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: PnlTradeDetailComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposableKt$PnlTradeDetailBottomSheet$1 */
    static final class C256871 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ boolean $containsCryptoAcquiredAndTransferredLots;
        final /* synthetic */ boolean $containsCryptoTransferredInLots;
        final /* synthetic */ ProfitAndLossTradeItem $detail;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ boolean $multiDayExecution;
        final /* synthetic */ Function0<Unit> $onDismiss;
        final /* synthetic */ Function0<Unit> $onViewInstrument;
        final /* synthetic */ Function0<Unit> $onViewPnlHub;
        final /* synthetic */ PnlTradeDetailBottomSheetState $state;

        /* compiled from: PnlTradeDetailComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposableKt$PnlTradeDetailBottomSheet$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AssetClass.values().length];
                try {
                    iArr[AssetClass.CRYPTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AssetClass.FOREX.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C256871(Modifier modifier, ProfitAndLossTradeItem profitAndLossTradeItem, boolean z, PnlTradeDetailBottomSheetState pnlTradeDetailBottomSheetState, boolean z2, boolean z3, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            this.$modifier = modifier;
            this.$detail = profitAndLossTradeItem;
            this.$containsCryptoTransferredInLots = z;
            this.$state = pnlTradeDetailBottomSheetState;
            this.$multiDayExecution = z2;
            this.$containsCryptoAcquiredAndTransferredLots = z3;
            this.$onDismiss = function0;
            this.$onViewInstrument = function02;
            this.$onViewPnlHub = function03;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:76:0x0441  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0454  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0533  */
        /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
            ProfitAndLossTradeItem profitAndLossTradeItem;
            Modifier.Companion companion;
            int i2;
            float f;
            Modifier modifier;
            int i3;
            int i4;
            int i5;
            String symbol;
            BentoTheme bentoTheme;
            Modifier.Companion companion2;
            int i6;
            String strStringResource;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(605441898, i, -1, "com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailBottomSheet.<anonymous> (PnlTradeDetailComposable.kt:81)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(ModifiersKt.autoLogEvents$default(this.$modifier, null, true, false, false, false, false, null, 125, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            ProfitAndLossTradeItem profitAndLossTradeItem2 = this.$detail;
            boolean z = this.$containsCryptoTransferredInLots;
            PnlTradeDetailBottomSheetState pnlTradeDetailBottomSheetState = this.$state;
            boolean z2 = this.$multiDayExecution;
            boolean z3 = this.$containsCryptoAcquiredAndTransferredLots;
            Function0<Unit> function0 = this.$onDismiss;
            final Function0<Unit> function02 = this.$onViewInstrument;
            final Function0<Unit> function03 = this.$onViewPnlHub;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
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
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(profitAndLossTradeItem2.getSymbol() + PlaceholderUtils.XXShortPlaceholderText + profitAndLossTradeItem2.getDetailDisplayName(), PaddingKt.m5145paddingqDBjuR0(companion4, bentoTheme2.getSpacing(composer, i7).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer, i7).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer, i7).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer, i7).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i7).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25673R.string.pnl_hub_trade_detail_closed_on, new Object[]{LocalDateFormatter.MEDIUM.format(Instants.toLocalDate$default(profitAndLossTradeItem2.getCloseTimestamp(), null, 1, null))}, composer, 0), PaddingKt.m5144paddingVpY3zN4$default(companion4, bentoTheme2.getSpacing(composer, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer, i7).getTextM(), composer, 0, 0, 8188);
            if (z) {
                composer.startReplaceGroup(-185374611);
                i2 = i7;
                companion = companion4;
                f = 0.0f;
                modifier = null;
                i3 = 2;
                CryptoTransferredInBanner.CryptoTransferredInBanner(profitAndLossTradeItem2, pnlTradeDetailBottomSheetState.getPnlUpdatesEnabled(), Boolean.valueOf(pnlTradeDetailBottomSheetState.getCryptoCostBasisEnabled()), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme2.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), composer, 0, 0);
                profitAndLossTradeItem = profitAndLossTradeItem2;
                composer.endReplaceGroup();
                i4 = 0;
            } else {
                profitAndLossTradeItem = profitAndLossTradeItem2;
                companion = companion4;
                i2 = i7;
                f = 0.0f;
                modifier = null;
                i3 = 2;
                if (z2) {
                    composer.startReplaceGroup(-185359186);
                    i4 = 0;
                    MultiDayExecutionBanner.MultiDayExecutionBanner(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme2.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), composer, 0, 0);
                    composer.endReplaceGroup();
                } else {
                    i4 = 0;
                    if (z3) {
                        composer.startReplaceGroup(-185349180);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-185344883);
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme2.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 8, null), bentoTheme2.getColors(composer, i2).m21373getBg30d7_KjU(), 0.0f, composer, 0, 4);
                        composer.endReplaceGroup();
                    }
                }
            }
            AssetClass assetClass = profitAndLossTradeItem.getAssetClass();
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i8 = iArr[assetClass.ordinal()];
            if (i8 == 1 || i8 == i3) {
                composer.startReplaceGroup(-185330015);
                CryptoPnlDetails9.CryptoPnlDetails(profitAndLossTradeItem, modifier, composer, i4, i3);
                composer.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
            } else {
                composer.startReplaceGroup(-185328158);
                PnlTradeDetailComposable2.DefaultPnlDetails(profitAndLossTradeItem, composer, i4);
                composer.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            int i9 = i2;
            Modifier.Companion companion5 = companion;
            ProfitAndLossTradeItem profitAndLossTradeItem3 = profitAndLossTradeItem;
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, i4), PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, f, 1, modifier), bentoTheme2.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), f, i3, modifier), null, null, false, false, Color.m6701boximpl(bentoTheme2.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, null, false, null, composer, 0, 0, 8056);
            ProfitAndLossOrderDetails orderDetails = profitAndLossTradeItem3.getOrderDetails();
            if (orderDetails instanceof ProfitAndLossOrderDetails.EquityOrderDetails) {
                symbol = profitAndLossTradeItem3.getSymbol();
            } else if (orderDetails instanceof ProfitAndLossOrderDetails.OptionOrderDetails) {
                ProfitAndLossOrderDetails.Instrument instrument = (ProfitAndLossOrderDetails.Instrument) CollectionsKt.firstOrNull((List) ((ProfitAndLossOrderDetails.OptionOrderDetails) orderDetails).getUnderlyings());
                symbol = instrument != null ? instrument.getSymbol() : null;
            } else {
                if (!(orderDetails instanceof ProfitAndLossOrderDetails.CryptoOrderDetails)) {
                    if (orderDetails != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i10 = iArr[profitAndLossTradeItem3.getAssetClass().ordinal()];
                    i5 = 2;
                    symbol = (i10 == 1 || i10 == 2) ? profitAndLossTradeItem3.getSymbol() : null;
                    composer.startReplaceGroup(-185293092);
                    if (function02 != null || symbol == null || symbol.length() == 0) {
                        bentoTheme = bentoTheme2;
                        companion2 = companion5;
                        i6 = i9;
                    } else {
                        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), bentoTheme2.getSpacing(composer, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer, i9).m21593getSmallD9Ej5fM());
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        int i11 = iArr[profitAndLossTradeItem3.getAssetClass().ordinal()];
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM5143paddingVpY3zN4, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, (i11 == 1 || i11 == i5) ? UserInteractionEventData.Action.VIEW_CRYPTO_DETAIL_PAGE : UserInteractionEventData.Action.VIEW_STOCK_DETAIL_PAGE, null, null, null, 59, null), false, false, false, true, false, null, 110, null);
                        long jM21425getFg0d7_KjU = bentoTheme2.getColors(composer, i9).m21425getFg0d7_KjU();
                        long jM21371getBg0d7_KjU = bentoTheme2.getColors(composer, i9).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer, i9).m21425getFg0d7_KjU();
                        String strStringResource2 = StringResources_androidKt.stringResource(C25673R.string.pnl_hub_trade_detail_view_underlying, new Object[]{symbol}, composer, 0);
                        composer.startReplaceGroup(5004770);
                        boolean zChanged = composer.changed(function02);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposableKt$PnlTradeDetailBottomSheet$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PnlTradeDetailComposable2.C256871.invoke$lambda$4$lambda$1$lambda$0(function02);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        companion2 = companion5;
                        bentoTheme = bentoTheme2;
                        i6 = i9;
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierAutoLogEvents$default, null, null, false, false, Color.m6701boximpl(jM21371getBg0d7_KjU), Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM21425getFg0d7_KjU2), null, false, null, composer, 0, 0, 7288);
                    }
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-185250872);
                    if (function03 != null) {
                        BentoTheme bentoTheme3 = bentoTheme;
                        int i12 = i6;
                        Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme3.getSpacing(composer, i12).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composer, i12).m21593getSmallD9Ej5fM()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.VIEW_PNL_HUB, null, null, null, 59, null), false, false, false, true, false, null, 110, null);
                        long jM21425getFg0d7_KjU3 = bentoTheme3.getColors(composer, i12).m21425getFg0d7_KjU();
                        long jM21371getBg0d7_KjU2 = bentoTheme3.getColors(composer, i12).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU4 = bentoTheme3.getColors(composer, i12).m21425getFg0d7_KjU();
                        if (pnlTradeDetailBottomSheetState.getPnlUpdatesEnabled()) {
                            composer.startReplaceGroup(-1446855151);
                            strStringResource = StringResources_androidKt.stringResource(C25673R.string.closed_pnl_hub_trade_detail_view_pnl_hub, composer, 0);
                            composer.endReplaceGroup();
                        } else {
                            composer.startReplaceGroup(-1446737320);
                            strStringResource = StringResources_androidKt.stringResource(C25673R.string.pnl_hub_trade_detail_view_pnl_hub, composer, 0);
                            composer.endReplaceGroup();
                        }
                        String str = strStringResource;
                        composer.startReplaceGroup(5004770);
                        boolean zChanged2 = composer.changed(function03);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposableKt$PnlTradeDetailBottomSheet$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PnlTradeDetailComposable2.C256871.invoke$lambda$4$lambda$3$lambda$2(function03);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, str, modifierAutoLogEvents$default2, null, null, false, false, Color.m6701boximpl(jM21371getBg0d7_KjU2), Color.m6701boximpl(jM21425getFg0d7_KjU3), Color.m6701boximpl(jM21425getFg0d7_KjU4), null, false, null, composer, 0, 0, 7288);
                    }
                    composer.endReplaceGroup();
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        return;
                    }
                    ComposerKt.traceEventEnd();
                    return;
                }
                symbol = ((ProfitAndLossOrderDetails.CryptoOrderDetails) orderDetails).getAssetSymbol();
            }
            i5 = 2;
            composer.startReplaceGroup(-185293092);
            if (function02 != null) {
                bentoTheme = bentoTheme2;
                companion2 = companion5;
                i6 = i9;
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(-185250872);
            if (function03 != null) {
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultPnlDetails(final ProfitAndLossTradeItem profitAndLossTradeItem, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1654457099);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(profitAndLossTradeItem) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1654457099, i2, -1, "com.robinhood.android.portfolio.pnl.composable.DefaultPnlDetails (PnlTradeDetailComposable.kt:221)");
            }
            final Money realizedReturn = profitAndLossTradeItem.getRealizedReturn();
            if (realizedReturn == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, ComposableLambda3.rememberComposableLambda(-1207909902, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposableKt.DefaultPnlDetails.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1207909902, i3, -1, "com.robinhood.android.portfolio.pnl.composable.DefaultPnlDetails.<anonymous> (PnlTradeDetailComposable.kt:228)");
                    }
                    Money openAveragePrice = profitAndLossTradeItem.getOpenAveragePrice();
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource((openAveragePrice == null || !openAveragePrice.isNegative()) ? C25673R.string.pnl_hub_trade_credit_at_open : C25673R.string.pnl_hub_trade_cost_at_open, composer2, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), composer2, 0, 0, 8190);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(1940646581, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposableKt.DefaultPnlDetails.2
                public final void invoke(Composer composer2, int i3) throws Resources.NotFoundException {
                    String str;
                    Money.Adjustment normalizedAdjustment;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1940646581, i3, -1, "com.robinhood.android.portfolio.pnl.composable.DefaultPnlDetails.<anonymous> (PnlTradeDetailComposable.kt:242)");
                    }
                    Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                    ProfitAndLossTradeItem profitAndLossTradeItem2 = profitAndLossTradeItem;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                    Modifier modifierTestTag = TestTag3.testTag(companion, PnlTradeDetailComposable2.TEST_TAG_OPEN_PRICE);
                    Money openingAmount = profitAndLossTradeItem2.getOpeningAmount();
                    if (openingAmount == null || (normalizedAdjustment = openingAmount.toNormalizedAdjustment()) == null || (str = Money.Adjustment.format$default(normalizedAdjustment, false, null, 3, null)) == null) {
                        str = "—";
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(str, modifierTestTag, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextM(), composer2, 48, 0, 8188);
                    Modifier modifierTestTag2 = TestTag3.testTag(companion, PnlTradeDetailComposable2.TEST_TAG_OPEN_PRICE_CALCULATION);
                    String openPriceCalculation = PnlTradeDetailComposable2.getOpenPriceCalculation(profitAndLossTradeItem2, composer2, 0);
                    if (openPriceCalculation == null) {
                        openPriceCalculation = "—";
                    }
                    BentoText2.m20747BentoText38GnDrw(openPriceCalculation, modifierTestTag2, Color.m6701boximpl(bentoTheme.getColors(composer2, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextS(), composer2, 48, 0, 8184);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), false, false, false, null, composerStartRestartGroup, 1575936, 0, 1975);
            BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, ComposableLambda3.rememberComposableLambda(-1308946199, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposableKt.DefaultPnlDetails.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1308946199, i3, -1, "com.robinhood.android.portfolio.pnl.composable.DefaultPnlDetails.<anonymous> (PnlTradeDetailComposable.kt:259)");
                    }
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(profitAndLossTradeItem.getCloseAveragePrice().isNegative() ? C25673R.string.pnl_hub_trade_cost_at_close : C25673R.string.pnl_hub_trade_credit_at_close, composer2, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), composer2, 0, 0, 8190);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(796857580, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposableKt.DefaultPnlDetails.4
                public final void invoke(Composer composer2, int i3) throws Resources.NotFoundException {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(796857580, i3, -1, "com.robinhood.android.portfolio.pnl.composable.DefaultPnlDetails.<anonymous> (PnlTradeDetailComposable.kt:273)");
                    }
                    Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                    ProfitAndLossTradeItem profitAndLossTradeItem2 = profitAndLossTradeItem;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                    Modifier modifierTestTag = TestTag3.testTag(companion, PnlTradeDetailComposable2.TEST_TAG_CLOSE_PRICE);
                    String str = Money.Adjustment.format$default(profitAndLossTradeItem2.getClosingAmount().toNormalizedAdjustment(), false, null, 3, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(str, modifierTestTag, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextM(), composer2, 48, 0, 8188);
                    Modifier modifierTestTag2 = TestTag3.testTag(companion, PnlTradeDetailComposable2.TEST_TAG_CLOSE_PRICE_CALCULATION);
                    String closePriceCalculation = PnlTradeDetailComposable2.getClosePriceCalculation(profitAndLossTradeItem2, composer2, 0);
                    if (closePriceCalculation == null) {
                        closePriceCalculation = "—";
                    }
                    BentoText2.m20747BentoText38GnDrw(closePriceCalculation, modifierTestTag2, Color.m6701boximpl(bentoTheme.getColors(composer2, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i4).getTextS(), composer2, 48, 0, 8184);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), false, false, false, null, composerStartRestartGroup, 1575936, 0, 1975);
            BentoBaseRowLayout.BentoBaseRowLayout(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), null, null, ComposableLambda3.rememberComposableLambda(1538014250, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposableKt.DefaultPnlDetails.5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1538014250, i3, -1, "com.robinhood.android.portfolio.pnl.composable.DefaultPnlDetails.<anonymous> (PnlTradeDetailComposable.kt:291)");
                    }
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource((realizedReturn.isZero() || realizedReturn.isPositive()) ? C25673R.string.pnl_hub_trade_realized_profit : C25673R.string.pnl_hub_trade_realized_loss, composer2, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 0, 0, 8190);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, ComposableLambda3.rememberComposableLambda(-651149267, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposableKt.DefaultPnlDetails.6
                public final void invoke(Composer composer2, int i3) {
                    long jM21452getNegative0d7_KjU;
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-651149267, i3, -1, "com.robinhood.android.portfolio.pnl.composable.DefaultPnlDetails.<anonymous> (PnlTradeDetailComposable.kt:303)");
                    }
                    Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                    Money money = realizedReturn;
                    ProfitAndLossTradeItem profitAndLossTradeItem2 = profitAndLossTradeItem;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer2, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                    String realizedReturn2 = PnlTradeDetailComposable2.formatRealizedReturn(money);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(realizedReturn2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer2, i4).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 0, 0, 8190);
                    String str = Formats.m2149x4a8e6258(null, 1, null).format(profitAndLossTradeItem2.getRealizedReturnPercentage());
                    TextStyle textS = bentoTheme.getTypography(composer2, i4).getTextS();
                    if (money.isZero()) {
                        composer2.startReplaceGroup(-1808472645);
                        jM21452getNegative0d7_KjU = bentoTheme.getColors(composer2, i4).m21425getFg0d7_KjU();
                        composer2.endReplaceGroup();
                    } else if (money.isPositive()) {
                        composer2.startReplaceGroup(-1808366315);
                        jM21452getNegative0d7_KjU = bentoTheme.getColors(composer2, i4).m21456getPositive0d7_KjU();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-1808286955);
                        jM21452getNegative0d7_KjU = bentoTheme.getColors(composer2, i4).m21452getNegative0d7_KjU();
                        composer2.endReplaceGroup();
                    }
                    BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21452getNegative0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer2, 0, 0, 8186);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), false, false, false, null, composerStartRestartGroup, 1575936, 0, 1974);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PnlTradeDetailComposable2.DefaultPnlDetails$lambda$4(profitAndLossTradeItem, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getOpenPriceCalculation(ProfitAndLossTradeItem profitAndLossTradeItem, Composer composer, int i) throws Resources.NotFoundException {
        composer.startReplaceGroup(1279409341);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1279409341, i, -1, "com.robinhood.android.portfolio.pnl.composable.getOpenPriceCalculation (PnlTradeDetailComposable.kt:326)");
        }
        Money openAveragePrice = profitAndLossTradeItem.getOpenAveragePrice();
        String equityCalculation = null;
        if (openAveragePrice == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[profitAndLossTradeItem.getAssetClass().ordinal()];
        if (i2 == 1) {
            composer.startReplaceGroup(1151736460);
            equityCalculation = formatEquityCalculation(openAveragePrice, profitAndLossTradeItem.getQuantity(), composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(1344175036);
            ProfitAndLossOrderDetails orderDetails = profitAndLossTradeItem.getOrderDetails();
            ProfitAndLossOrderDetails.OptionOrderDetails optionOrderDetails = orderDetails instanceof ProfitAndLossOrderDetails.OptionOrderDetails ? (ProfitAndLossOrderDetails.OptionOrderDetails) orderDetails : null;
            if (optionOrderDetails == null) {
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return null;
            }
            equityCalculation = formatOptionCalculation(openAveragePrice, optionOrderDetails.getTradeValueMultiplier(), profitAndLossTradeItem.getQuantity(), composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1344447680);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return equityCalculation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getClosePriceCalculation(ProfitAndLossTradeItem profitAndLossTradeItem, Composer composer, int i) throws Resources.NotFoundException {
        String equityCalculation;
        composer.startReplaceGroup(-554045731);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554045731, i, -1, "com.robinhood.android.portfolio.pnl.composable.getClosePriceCalculation (PnlTradeDetailComposable.kt:344)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[profitAndLossTradeItem.getAssetClass().ordinal()];
        if (i2 != 1) {
            equityCalculation = null;
            if (i2 == 2) {
                composer.startReplaceGroup(-16820137);
                ProfitAndLossOrderDetails orderDetails = profitAndLossTradeItem.getOrderDetails();
                ProfitAndLossOrderDetails.OptionOrderDetails optionOrderDetails = orderDetails instanceof ProfitAndLossOrderDetails.OptionOrderDetails ? (ProfitAndLossOrderDetails.OptionOrderDetails) orderDetails : null;
                if (optionOrderDetails == null) {
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return null;
                }
                equityCalculation = formatOptionCalculation(profitAndLossTradeItem.getCloseAveragePrice(), optionOrderDetails.getTradeValueMultiplier(), profitAndLossTradeItem.getQuantity(), composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-16542688);
                composer.endReplaceGroup();
            }
        } else {
            composer.startReplaceGroup(138001905);
            equityCalculation = formatEquityCalculation(profitAndLossTradeItem.getCloseAveragePrice(), profitAndLossTradeItem.getQuantity(), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return equityCalculation;
    }

    private static final String formatEquityCalculation(Money money, BigDecimal bigDecimal, Composer composer, int i) throws Resources.NotFoundException {
        composer.startReplaceGroup(1967130014);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1967130014, i, -1, "com.robinhood.android.portfolio.pnl.composable.formatEquityCalculation (PnlTradeDetailComposable.kt:361)");
        }
        String strPluralStringResource = StringResources_androidKt.pluralStringResource(C25673R.plurals.pnl_hub_trade_equity_price_calculation, Math.abs(bigDecimal.intValue()), new Object[]{Money.format$default(money.abs(), null, true, null, false, 0, null, false, null, false, false, 1021, null), bigDecimal.abs()}, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strPluralStringResource;
    }

    private static final String formatOptionCalculation(Money money, int i, BigDecimal bigDecimal, Composer composer, int i2) throws Resources.NotFoundException {
        composer.startReplaceGroup(543567953);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(543567953, i2, -1, "com.robinhood.android.portfolio.pnl.composable.formatOptionCalculation (PnlTradeDetailComposable.kt:369)");
        }
        int i3 = C25673R.plurals.pnl_hub_trade_option_price_calculation;
        int iIntValue = bigDecimal.intValue();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        String strPluralStringResource = StringResources_androidKt.pluralStringResource(i3, iIntValue, new Object[]{Money.format$default(money.div(bigDecimalValueOf).abs(), null, true, null, false, 0, null, false, null, false, false, 1021, null), Integer.valueOf(i), bigDecimal}, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return strPluralStringResource;
    }

    public static final String formatRealizedReturn(Money money) {
        Intrinsics.checkNotNullParameter(money, "<this>");
        if (money.isZero()) {
            return Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
        }
        return Money.Adjustment.format$default(money.toNormalizedAdjustment(), false, null, 3, null);
    }
}
