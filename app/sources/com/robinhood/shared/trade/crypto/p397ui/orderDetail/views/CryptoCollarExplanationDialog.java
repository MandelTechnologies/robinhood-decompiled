package com.robinhood.shared.trade.crypto.p397ui.orderDetail.views;

import android.content.Context;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.FormatsLocalized;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.trade.crypto.C40095R;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoCollarExplanationDialog.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0006\"\u001c\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u001c\u0010\r\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0010"}, m3636d2 = {"CryptoCollarExplanationDialog", "", "orderSide", "Lcom/robinhood/models/db/OrderSide;", "onDismiss", "Lkotlin/Function0;", "(Lcom/robinhood/models/db/OrderSide;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BUY_COLLAR_RATIO", "Ljava/math/BigDecimal;", "getBUY_COLLAR_RATIO$annotations", "()V", "getBUY_COLLAR_RATIO", "()Ljava/math/BigDecimal;", "SELL_COLLAR_RATIO", "getSELL_COLLAR_RATIO$annotations", "getSELL_COLLAR_RATIO", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoCollarExplanationDialogKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoCollarExplanationDialog {
    private static final BigDecimal BUY_COLLAR_RATIO = new BigDecimal("0.01");
    private static final BigDecimal SELL_COLLAR_RATIO = new BigDecimal("0.05");

    /* compiled from: CryptoCollarExplanationDialog.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoCollarExplanationDialogKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoCollarExplanationDialog$lambda$2(OrderSide orderSide, Function0 function0, int i, Composer composer, int i2) {
        CryptoCollarExplanationDialog(orderSide, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getBUY_COLLAR_RATIO$annotations() {
    }

    public static /* synthetic */ void getSELL_COLLAR_RATIO$annotations() {
    }

    public static final void CryptoCollarExplanationDialog(final OrderSide orderSide, final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        String strStringResource;
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-163389557);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(orderSide.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-163389557, i2, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoCollarExplanationDialog (CryptoCollarExplanationDialog.kt:21)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.url_crypto_market_price_faq, composerStartRestartGroup, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(C40095R.string.crypto_order_collar_explanation_dialog_title, composerStartRestartGroup, 0);
            int i3 = WhenMappings.$EnumSwitchMapping$0[orderSide.ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(1896443056);
                strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_collar_explanation_dialog_message_buy, new Object[]{FormatsLocalized.getPercentFormat().format(BUY_COLLAR_RATIO)}, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 2) {
                    composerStartRestartGroup.startReplaceGroup(1896441093);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1896451154);
                strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_collar_explanation_dialog_message_sell, new Object[]{FormatsLocalized.getPercentFormat().format(SELL_COLLAR_RATIO)}, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(strStringResource);
            String strStringResource4 = StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(strStringResource2);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoCollarExplanationDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoCollarExplanationDialog.CryptoCollarExplanationDialog$lambda$1$lambda$0(navigator, context, strStringResource2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource4, (Function0) objRememberedValue);
            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composerStartRestartGroup, 0), onDismiss);
            int i4 = BentoAlertDialog2.Body.Text.$stable << 3;
            int i5 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(strStringResource3, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, onDismiss, composerStartRestartGroup, i4 | (i5 << 6) | (i5 << 12) | ((i2 << 21) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoCollarExplanationDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoCollarExplanationDialog.CryptoCollarExplanationDialog$lambda$2(orderSide, onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoCollarExplanationDialog$lambda$1$lambda$0(Navigator navigator, Context context, String str) {
        Navigators3.showHelpCenterWebViewFragment(navigator, context, str);
        return Unit.INSTANCE;
    }

    public static final BigDecimal getBUY_COLLAR_RATIO() {
        return BUY_COLLAR_RATIO;
    }

    public static final BigDecimal getSELL_COLLAR_RATIO() {
        return SELL_COLLAR_RATIO;
    }
}
