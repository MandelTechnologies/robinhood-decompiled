package com.robinhood.android.mcw.mcwcurrencyconverterreceipt;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.FragmentManager;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.mcw.contracts.ConversionOrderDetailsKey;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.common.contracts.SduiInfoSheetKey;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: ComposeActions.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0002\u0010\u0005\u001a=\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00040\u0007H\u0001¢\u0006\u0002\u0010\r\u001a\u0019\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000fH\u0001¢\u0006\u0002\u0010\u0011\u001a\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0002\u0010\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"FX_RATE_BOTTOM_SHEET_ID", "", "currentBackPressedAction", "Lkotlin/Function0;", "", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "currentViewDetailsAction", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "accountNumber", "Ljava/util/UUID;", "orderId", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "currentActivityErrorHandler", "Lkotlin/Function1;", "", "(Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "currentFxRateBottomSheetAction", "feature-mcw-currency-converter-receipt_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.ComposeActionsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ComposeActions {
    private static final String FX_RATE_BOTTOM_SHEET_ID = "exchange_rate_details_bid";

    public static final Function0<Unit> currentBackPressedAction(Composer composer, int i) {
        KFunction kFunction;
        Function0<Unit> function0;
        composer.startReplaceGroup(1525384864);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1525384864, i, -1, "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.currentBackPressedAction (ComposeActions.kt:17)");
        }
        OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composer, BackHandler5.$stable);
        composer.startReplaceGroup(1311010045);
        if (current == null) {
            kFunction = null;
        } else {
            OnBackPressedDispatcher onBackPressedDispatcher = current.getOnBackPressedDispatcher();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(onBackPressedDispatcher);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ComposeActions2(onBackPressedDispatcher);
                composer.updateRememberedValue(objRememberedValue);
            }
            kFunction = (KFunction) objRememberedValue;
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        if (kFunction != null) {
            function0 = (Function0) kFunction;
        } else {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("LocalOnBackPressedDispatcherOwner not set"), true, null, 4, null);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.ComposeActionsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function0;
    }

    public static final Function2<String, UUID, Unit> currentViewDetailsAction(Composer composer, int i) {
        composer.startReplaceGroup(240640256);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(240640256, i, -1, "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.currentViewDetailsAction (ComposeActions.kt:28)");
        }
        final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.ComposeActionsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeActions.currentViewDetailsAction$lambda$6$lambda$5(navigator, context, (String) obj, (UUID) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2<String, UUID, Unit> function2 = (Function2) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit currentViewDetailsAction$lambda$6$lambda$5(Navigator navigator, Context context, String accountNumber, UUID orderId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Navigator.DefaultImpls.showFragment$default(navigator, context, new ConversionOrderDetailsKey(accountNumber, orderId), false, false, false, null, false, null, true, false, null, null, 3836, null);
        return Unit.INSTANCE;
    }

    public static final Function1<Throwable, Unit> currentActivityErrorHandler(Composer composer, int i) {
        composer.startReplaceGroup(-655481611);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-655481611, i, -1, "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.currentActivityErrorHandler (ComposeActions.kt:42)");
        }
        final AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(appCompatActivityRequireActivityBaseContext);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.ComposeActionsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ComposeActions.currentActivityErrorHandler$lambda$8$lambda$7(appCompatActivityRequireActivityBaseContext, (Throwable) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1<Throwable, Unit> function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit currentActivityErrorHandler$lambda$8$lambda$7(AppCompatActivity appCompatActivity, Throwable error) throws Throwable {
        Intrinsics.checkNotNullParameter(error, "error");
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, appCompatActivity, error, false, true, 0, null, 52, null);
        return Unit.INSTANCE;
    }

    public static final Function0<Unit> currentFxRateBottomSheetAction(Composer composer, int i) {
        composer.startReplaceGroup(1827921319);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827921319, i, -1, "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.currentFxRateBottomSheetAction (ComposeActions.kt:55)");
        }
        final FragmentManager supportFragmentManager = BaseContexts.requireActivityBaseContext((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(supportFragmentManager) | composer.changedInstance(navigator);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.ComposeActionsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ComposeActions.currentFxRateBottomSheetAction$lambda$10$lambda$9(supportFragmentManager, navigator);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0<Unit> function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit currentFxRateBottomSheetAction$lambda$10$lambda$9(FragmentManager fragmentManager, Navigator navigator) {
        if (fragmentManager.findFragmentByTag(FX_RATE_BOTTOM_SHEET_ID) == null) {
            Navigator.DefaultImpls.createDialogFragment$default(navigator, new SduiInfoSheetKey(FX_RATE_BOTTOM_SHEET_ID, FX_RATE_BOTTOM_SHEET_ID, null, null, 12, null), null, 2, null).show(fragmentManager, FX_RATE_BOTTOM_SHEET_ID);
        }
        return Unit.INSTANCE;
    }
}
