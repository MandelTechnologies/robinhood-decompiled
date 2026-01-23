package com.robinhood.android.mcw.mcwcurrencyconverterreceipt;

import android.content.res.Resources;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.RippleKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.mcw.contracts.CurrencyConversionDeeplinkSource;
import com.robinhood.android.mcw.contracts.CurrencyConverterReceiptKey;
import com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptEvent;
import com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.Currency;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CurrencyConverterReceiptComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a3\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\u001a[\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0017\u001aK\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u001c\u001a\u0099\u0001\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\n28\b\u0002\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110%¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\b0!2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\b0(2\b\b\u0002\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\u0010,\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006-²\u0006\n\u0010\u0010\u001a\u00020.X\u008a\u0084\u0002²\u0006\u0012\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100X\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0004\u0018\u000103X\u008a\u0084\u0002"}, m3636d2 = {"TAG_ARROW_ANIMATION_LOTTIE", "", "TAG_ROOT_CONTAINER", "TAG_CONTENT_CONTAINER", "LOG_ID_FX_RATE_INFO", "LOG_ID_DONE", "LOG_ID_VIEW_DETAILS", "ContentBottomBar", "", "onDoneClick", "Lkotlin/Function0;", "onViewDetailsClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CompletedStateContent", "viewState", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState$Complete;", "source", "Lcom/robinhood/android/mcw/contracts/CurrencyConversionDeeplinkSource;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "onRateClick", "(Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState$Complete;Lcom/robinhood/android/mcw/contracts/CurrencyConversionDeeplinkSource;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PendingStateContent", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState$Pending;", "toCurrency", "Ljava/util/Currency;", "(Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState$Pending;Ljava/util/Currency;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CurrencyConverterReceiptComposable", "arg", "Lcom/robinhood/android/mcw/contracts/CurrencyConverterReceiptKey;", "onBackClick", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "accountNumber", "Ljava/util/UUID;", "orderId", "onApiError", "Lkotlin/Function1;", "", "duxo", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptDuxo;", "(Lcom/robinhood/android/mcw/contracts/CurrencyConverterReceiptKey;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-mcw-currency-converter-receipt_externalDebug", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/mcw/mcwcurrencyconverterreceipt/CurrencyConverterReceiptEvent;", "lottieComposition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class CurrencyConverterReceiptComposable3 {
    private static final String LOG_ID_DONE = "currency_conversion_success_done";
    private static final String LOG_ID_FX_RATE_INFO = "currency_conversion_fx_rate_info_button";
    private static final String LOG_ID_VIEW_DETAILS = "currency_conversion_success_view_details";
    public static final String TAG_ARROW_ANIMATION_LOTTIE = "arrow_animation_lottie";
    public static final String TAG_CONTENT_CONTAINER = "content_container";
    public static final String TAG_ROOT_CONTAINER = "root_container";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompletedStateContent$lambda$8(CurrencyConverterReceiptViewState.Complete complete, CurrencyConversionDeeplinkSource currencyConversionDeeplinkSource, ScrollState scrollState, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        CompletedStateContent(complete, currencyConversionDeeplinkSource, scrollState, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContentBottomBar$lambda$4(Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContentBottomBar(function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CurrencyConverterReceiptComposable$lambda$28(CurrencyConverterReceiptKey currencyConverterReceiptKey, Modifier modifier, Function0 function0, Function2 function2, Function0 function02, Function1 function1, CurrencyConverterReceiptDuxo currencyConverterReceiptDuxo, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        CurrencyConverterReceiptComposable(currencyConverterReceiptKey, modifier, function0, function2, function02, function1, currencyConverterReceiptDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingStateContent$lambda$11(CurrencyConverterReceiptViewState.Pending pending, Currency currency, ScrollState scrollState, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PendingStateContent(pending, currency, scrollState, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ContentBottomBar(final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        final EventLogger current;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1671972387);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
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
                    ComposerKt.traceEventStart(1671972387, i3, -1, "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.ContentBottomBar (CurrencyConverterReceiptComposable.kt:84)");
                }
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CurrencyConverterReceiptComposable3.ContentBottomBar$lambda$1$lambda$0(function0, current, userInteractionEventDescriptor);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function03 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CurrencyConverterReceiptComposable3.ContentBottomBar$lambda$3$lambda$2(function02, current, userInteractionEventDescriptor);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i5 = (i3 >> 6) & 14;
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                BentoButtonBar2.BentoButtonBar(modifier5, null, null, false, null, null, function03, strStringResource, false, null, false, (Function0) objRememberedValue2, StringResources_androidKt.stringResource(C21775R.string.view_details_button_label, composerStartRestartGroup, 0), false, null, false, composer2, i5, 0, 59198);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CurrencyConverterReceiptComposable3.ContentBottomBar$lambda$4(function0, function02, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CurrencyConverterReceiptComposable3.ContentBottomBar$lambda$1$lambda$0(function0, current, userInteractionEventDescriptor);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                Function0 function032 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CurrencyConverterReceiptComposable3.ContentBottomBar$lambda$3$lambda$2(function02, current, userInteractionEventDescriptor);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    int i52 = (i3 >> 6) & 14;
                    Modifier modifier52 = modifier4;
                    composer2 = composerStartRestartGroup;
                    BentoButtonBar2.BentoButtonBar(modifier52, null, null, false, null, null, function032, strStringResource2, false, null, false, (Function0) objRememberedValue2, StringResources_androidKt.stringResource(C21775R.string.view_details_button_label, composerStartRestartGroup, 0), false, null, false, composer2, i52, 0, 59198);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final CurrencyConverterReceiptViewState CurrencyConverterReceiptComposable$lambda$12(SnapshotState4<? extends CurrencyConverterReceiptViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CurrencyConverterReceiptEvent> CurrencyConverterReceiptComposable$lambda$13(SnapshotState4<Event<CurrencyConverterReceiptEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final LottieComposition CurrencyConverterReceiptComposable$lambda$14(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContentBottomBar$lambda$1$lambda$0(Function0 function0, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        function0.invoke();
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.DONE, null, new Component(Component.ComponentType.BUTTON, LOG_ID_DONE, null, 4, null), null, 43, null)), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContentBottomBar$lambda$3$lambda$2(Function0 function0, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        function0.invoke();
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.VIEW_FX_ORDER_DETAILS, null, new Component(Component.ComponentType.BUTTON, LOG_ID_VIEW_DETAILS, null, 4, null), null, 43, null)), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CompletedStateContent(final CurrencyConverterReceiptViewState.Complete complete, final CurrencyConversionDeeplinkSource currencyConversionDeeplinkSource, final ScrollState scrollState, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        ScrollState scrollState2;
        Function0<Unit> function04;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        String strStringResource;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1251895816);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(complete) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(currencyConversionDeeplinkSource == null ? -1 : currencyConversionDeeplinkSource.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            scrollState2 = scrollState;
        } else {
            scrollState2 = scrollState;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(scrollState2) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function04 = function02;
                    i3 |= composerStartRestartGroup.changedInstance(function04) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else {
                    if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function03) ? 131072 : 65536;
                    }
                    i4 = i2 & 64;
                    if (i4 != 0) {
                        if ((1572864 & i) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        } else {
                            Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1251895816, i3, -1, "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CompletedStateContent (CurrencyConverterReceiptComposable.kt:136)");
                            }
                            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            int i5 = i3;
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
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Modifier modifierTestTag = TestTag3.testTag(Column5.weight$default(column6, ScrollKt.verticalScroll$default(companion3, scrollState2, false, null, false, 14, null), 1.0f, false, 2, null), TAG_CONTENT_CONTAINER);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
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
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            Modifier modifier5 = modifier4;
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21594getXlargeD9Ej5fM()), composerStartRestartGroup, 0);
                            BentoText2.m20747BentoText38GnDrw(UtilKt.formatWithCurrencyCode(complete.getToAmount()), PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i6).getBookCoverCapsuleSmall(), 0L, 0L, FontWeight.INSTANCE.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, 0, 0, 8188);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                            if (currencyConversionDeeplinkSource != CurrencyConversionDeeplinkSource.PDT_RESOLUTION) {
                                composerStartRestartGroup.startReplaceGroup(-637611637);
                                strStringResource = StringResources_androidKt.stringResource(C21775R.string.pdt_resolution_description, composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-637505369);
                                strStringResource = StringResources_androidKt.stringResource(C21775R.string.description, new Object[]{StringResources6.getTextAsString(UtilKt.toDisplayName(complete.getToAmount().getCurrency(), false), composerStartRestartGroup, StringResource.$stable), Money.format$default(complete.getToBalance(), null, false, null, false, 2, 2, false, null, false, false, 975, null)}, composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextL(), composerStartRestartGroup, 0, 0, 8188);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, StringResources_androidKt.stringResource(C11048R.string.general_label_from, composerStartRestartGroup, 0), null, null, new BentoBaseRowState.Meta.SingleLine(UtilKt.formatWithCurrencyCode(complete.getFromAmount())), null, false, false, false, 0L, null, composerStartRestartGroup, BentoBaseRowState.Meta.SingleLine.$stable << 15, 0, 4059);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSource2.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoBaseRowLayout.BentoBaseRowLayout(ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(companion3, (InteractionSource3) objRememberedValue, RippleKt.m5937rippleH2RKhps$default(false, 0.0f, bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), 3, null), false, null, null, function03, 28, null), UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.LEARN_MORE, null, new Component(Component.ComponentType.BUTTON, LOG_ID_FX_RATE_INFO, null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null), null, CurrencyConverterReceiptComposable.INSTANCE.m2179x897a5ad8(), null, null, ComposableLambda3.rememberComposableLambda(-164457795, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CompletedStateContent$1$1$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i7) {
                                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-164457795, i7, -1, "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CompletedStateContent.<anonymous>.<anonymous>.<anonymous> (CurrencyConverterReceiptComposable.kt:210)");
                                    }
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21775R.string.rate_amount, new Object[]{complete.getFromAmount().getCurrency().getCurrencyCode(), complete.getForwardRate().toPlainString(), complete.getToAmount().getCurrency().getCurrencyCode()}, composer2, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), null, false, false, false, null, composerStartRestartGroup, 196992, 0, 2010);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endNode();
                            ContentBottomBar(function0, function04, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composerStartRestartGroup, 6, 1), composerStartRestartGroup, (i5 >> 9) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CurrencyConverterReceiptComposable3.CompletedStateContent$lambda$8(complete, currencyConversionDeeplinkSource, scrollState, function0, function02, function03, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    modifier2 = modifier;
                    if ((599187 & i3) == 599186) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        Arrangement.Vertical top2 = arrangement2.getTop();
                        Alignment.Companion companion4 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        int i52 = i3;
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
                            Modifier.Companion companion32 = Modifier.INSTANCE;
                            Modifier modifierTestTag2 = TestTag3.testTag(Column5.weight$default(column62, ScrollKt.verticalScroll$default(companion32, scrollState2, false, null, false, 14, null), 1.0f, false, 2, null), TAG_CONTENT_CONTAINER);
                            MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag2);
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
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i62 = BentoTheme.$stable;
                                Modifier modifier52 = modifier4;
                                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21594getXlargeD9Ej5fM()), composerStartRestartGroup, 0);
                                BentoText2.m20747BentoText38GnDrw(UtilKt.formatWithCurrencyCode(complete.getToAmount()), PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion32, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composerStartRestartGroup, i62).getBookCoverCapsuleSmall(), 0L, 0L, FontWeight.INSTANCE.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, 0, 0, 8188);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                                if (currencyConversionDeeplinkSource != CurrencyConversionDeeplinkSource.PDT_RESOLUTION) {
                                }
                                BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion32, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextL(), composerStartRestartGroup, 0, 0, 8188);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, StringResources_androidKt.stringResource(C11048R.string.general_label_from, composerStartRestartGroup, 0), null, null, new BentoBaseRowState.Meta.SingleLine(UtilKt.formatWithCurrencyCode(complete.getFromAmount())), null, false, false, false, 0L, null, composerStartRestartGroup, BentoBaseRowState.Meta.SingleLine.$stable << 15, 0, 4059);
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                BentoBaseRowLayout.BentoBaseRowLayout(ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(companion32, (InteractionSource3) objRememberedValue, RippleKt.m5937rippleH2RKhps$default(false, 0.0f, bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), 3, null), false, null, null, function03, 28, null), UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.LEARN_MORE, null, new Component(Component.ComponentType.BUTTON, LOG_ID_FX_RATE_INFO, null, 4, null), null, 43, null)), false, false, false, true, false, null, 110, null), null, CurrencyConverterReceiptComposable.INSTANCE.m2179x897a5ad8(), null, null, ComposableLambda3.rememberComposableLambda(-164457795, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CompletedStateContent$1$1$2
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i7) {
                                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                            composer2.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-164457795, i7, -1, "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CompletedStateContent.<anonymous>.<anonymous>.<anonymous> (CurrencyConverterReceiptComposable.kt:210)");
                                        }
                                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21775R.string.rate_amount, new Object[]{complete.getFromAmount().getCurrency().getCurrencyCode(), complete.getForwardRate().toPlainString(), complete.getToAmount().getCurrency().getCurrencyCode()}, composer2, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), null, false, false, false, null, composerStartRestartGroup, 196992, 0, 2010);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endNode();
                                ContentBottomBar(function0, function04, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, 0.0f, composerStartRestartGroup, 6, 1), composerStartRestartGroup, (i52 >> 9) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i4 = i2 & 64;
                if (i4 != 0) {
                }
                modifier2 = modifier;
                if ((599187 & i3) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function04 = function02;
            if ((i2 & 32) != 0) {
            }
            i4 = i2 & 64;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 16) == 0) {
        }
        function04 = function02;
        if ((i2 & 32) != 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PendingStateContent(final CurrencyConverterReceiptViewState.Pending pending, final Currency currency, final ScrollState scrollState, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        ScrollState scrollState2;
        Function0<Unit> function03;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-371388113);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(pending) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(currency) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            scrollState2 = scrollState;
        } else {
            scrollState2 = scrollState;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(scrollState2) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function03 = function02;
                    i3 |= composerStartRestartGroup.changedInstance(function03) ? 16384 : 8192;
                }
                i4 = i2 & 32;
                if (i4 == 0) {
                    if ((196608 & i) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-371388113, i3, -1, "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.PendingStateContent (CurrencyConverterReceiptComposable.kt:237)");
                        }
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierTestTag = TestTag3.testTag(Column5.weight$default(column6, ScrollKt.verticalScroll$default(companion3, scrollState2, false, null, false, 14, null), 1.0f, false, 2, null), TAG_CONTENT_CONTAINER);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
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
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        Modifier modifier5 = modifier4;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composerStartRestartGroup, i5).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21594getXlargeD9Ej5fM()), composerStartRestartGroup, 0);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21775R.string.conversion_pending_title, composerStartRestartGroup, 0), PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8188);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                        composer2 = composerStartRestartGroup;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21775R.string.conversion_pending_desc, new Object[]{Money.format$default(pending.getFromAmount(), null, false, null, false, 2, 2, false, null, false, false, 975, null), StringResources6.getTextAsString(UtilKt.toDisplayName(currency, true), composerStartRestartGroup, StringResource.$stable)}, composerStartRestartGroup, 0), PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextL(), composer2, 0, 0, 8188);
                        composer2.endNode();
                        ContentBottomBar(function0, function03, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, 0.0f, composer2, 6, 1), composer2, (i3 >> 9) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CurrencyConverterReceiptComposable3.PendingStateContent$lambda$11(pending, currency, scrollState, function0, function02, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                modifier2 = modifier;
                if ((74899 & i3) == 74898) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        Modifier modifierTestTag2 = TestTag3.testTag(Column5.weight$default(column62, ScrollKt.verticalScroll$default(companion32, scrollState2, false, null, false, 14, null), 1.0f, false, 2, null), TAG_CONTENT_CONTAINER);
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag2);
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
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i52 = BentoTheme.$stable;
                            Modifier modifier52 = modifier4;
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme2.getColors(composerStartRestartGroup, i52).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21594getXlargeD9Ej5fM()), composerStartRestartGroup, 0);
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21775R.string.conversion_pending_title, composerStartRestartGroup, 0), PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion32, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleLarge(), composerStartRestartGroup, 0, 0, 8188);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                            composer2 = composerStartRestartGroup;
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21775R.string.conversion_pending_desc, new Object[]{Money.format$default(pending.getFromAmount(), null, false, null, false, 2, 2, false, null, false, false, 975, null), StringResources6.getTextAsString(UtilKt.toDisplayName(currency, true), composerStartRestartGroup, StringResource.$stable)}, composerStartRestartGroup, 0), PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion32, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextL(), composer2, 0, 0, 8188);
                            composer2.endNode();
                            ContentBottomBar(function0, function03, PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, 0.0f, composer2, 6, 1), composer2, (i3 >> 9) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function03 = function02;
            i4 = i2 & 32;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 16) == 0) {
        }
        function03 = function02;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CurrencyConverterReceiptComposable(final CurrencyConverterReceiptKey arg, Modifier modifier, Function0<Unit> function0, Function2<? super String, ? super UUID, Unit> function2, Function0<Unit> function02, Function1<? super Throwable, Unit> function1, CurrencyConverterReceiptDuxo currencyConverterReceiptDuxo, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        Function0<Unit> function0CurrentBackPressedAction;
        final Function2<? super String, ? super UUID, Unit> function2CurrentViewDetailsAction;
        Function0<Unit> function03;
        Function1<? super Throwable, Unit> function12;
        CurrencyConverterReceiptDuxo currencyConverterReceiptDuxo2;
        Modifier modifier3;
        Function0<Unit> function0CurrentFxRateBottomSheetAction;
        int i4;
        final Function1<? super Throwable, Unit> function1CurrentActivityErrorHandler;
        CurrencyConverterReceiptDuxo currencyConverterReceiptDuxo3;
        int i5;
        Event<CurrencyConverterReceiptEvent> event;
        ScrollState scrollStateRememberScrollState;
        Object objRememberedValue;
        Composer.Companion companion;
        final Animatable animatable;
        final Event<CurrencyConverterReceiptEvent> eventCurrencyConverterReceiptComposable$lambda$13;
        boolean zChangedInstance;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        CurrencyConverterReceiptViewState currencyConverterReceiptViewStateCurrencyConverterReceiptComposable$lambda$12;
        Function0<Unit> function04;
        Function0<Unit> function05;
        final Function2<? super String, ? super UUID, Unit> function22;
        final Function0<Unit> function06;
        final Function0<Unit> function07;
        final CurrencyConverterReceiptDuxo currencyConverterReceiptDuxo4;
        final Function1<? super Throwable, Unit> function13;
        final Modifier modifier4;
        EventConsumer<CurrencyConverterReceiptEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(arg, "arg");
        Composer composerStartRestartGroup = composer.startRestartGroup(1805096082);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(arg) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    function0CurrentBackPressedAction = function0;
                    int i7 = composerStartRestartGroup.changedInstance(function0CurrentBackPressedAction) ? 256 : 128;
                    i3 |= i7;
                } else {
                    function0CurrentBackPressedAction = function0;
                }
                i3 |= i7;
            } else {
                function0CurrentBackPressedAction = function0;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    function2CurrentViewDetailsAction = function2;
                    int i8 = composerStartRestartGroup.changedInstance(function2CurrentViewDetailsAction) ? 2048 : 1024;
                    i3 |= i8;
                } else {
                    function2CurrentViewDetailsAction = function2;
                }
                i3 |= i8;
            } else {
                function2CurrentViewDetailsAction = function2;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    function03 = function02;
                    int i9 = composerStartRestartGroup.changedInstance(function03) ? 16384 : 8192;
                    i3 |= i9;
                } else {
                    function03 = function02;
                }
                i3 |= i9;
            } else {
                function03 = function02;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    function12 = function1;
                    int i10 = composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
                    i3 |= i10;
                } else {
                    function12 = function1;
                }
                i3 |= i10;
            } else {
                function12 = function1;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    currencyConverterReceiptDuxo2 = currencyConverterReceiptDuxo;
                    int i11 = composerStartRestartGroup.changedInstance(currencyConverterReceiptDuxo2) ? 1048576 : 524288;
                    i3 |= i11;
                } else {
                    currencyConverterReceiptDuxo2 = currencyConverterReceiptDuxo;
                }
                i3 |= i11;
            } else {
                currencyConverterReceiptDuxo2 = currencyConverterReceiptDuxo;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                        function0CurrentBackPressedAction = ComposeActions.currentBackPressedAction(composerStartRestartGroup, 0);
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        function2CurrentViewDetailsAction = ComposeActions.currentViewDetailsAction(composerStartRestartGroup, 0);
                    }
                    if ((i2 & 16) == 0) {
                        function0CurrentFxRateBottomSheetAction = ComposeActions.currentFxRateBottomSheetAction(composerStartRestartGroup, 0);
                        i3 &= -57345;
                    } else {
                        function0CurrentFxRateBottomSheetAction = function03;
                    }
                    if ((i2 & 32) == 0) {
                        i4 = i3 & (-458753);
                        function1CurrentActivityErrorHandler = ComposeActions.currentActivityErrorHandler(composerStartRestartGroup, 0);
                    } else {
                        i4 = i3;
                        function1CurrentActivityErrorHandler = function12;
                    }
                    if ((i2 & 64) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, arg)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CurrencyConverterReceiptDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        currencyConverterReceiptDuxo3 = (CurrencyConverterReceiptDuxo) baseDuxo;
                        i5 = i4 & (-3670017);
                    } else {
                        currencyConverterReceiptDuxo3 = currencyConverterReceiptDuxo2;
                        i5 = i4;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    function0CurrentFxRateBottomSheetAction = function03;
                    function1CurrentActivityErrorHandler = function12;
                    currencyConverterReceiptDuxo3 = currencyConverterReceiptDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1805096082, i5, -1, "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposable (CurrencyConverterReceiptComposable.kt:285)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(currencyConverterReceiptDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<CurrencyConverterReceiptEvent>> eventFlow = currencyConverterReceiptDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                int i12 = i5;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$$inlined$collectEventAsStateWithLifecycle$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CurrencyConverterReceiptComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof CurrencyConverterReceiptEvent) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                Event<CurrencyConverterReceiptEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof CurrencyConverterReceiptEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C21775R.raw.conversion_loader)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                composerStartRestartGroup.startReplaceGroup(-469424720);
                float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() & 4294967295L));
                composerStartRestartGroup.endReplaceGroup();
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(0.725f * fMo5013toDpu2uoSUM);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = Animatable2.Animatable$default(-1500.0f, 0.0f, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                animatable = (Animatable) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                eventCurrencyConverterReceiptComposable$lambda$13 = CurrencyConverterReceiptComposable$lambda$13(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCurrencyConverterReceiptComposable$lambda$13 != null) {
                    if ((eventCurrencyConverterReceiptComposable$lambda$13.getData() instanceof CurrencyConverterReceiptEvent.Error) && (eventConsumerInvoke = eventCurrencyConverterReceiptComposable$lambda$13.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventCurrencyConverterReceiptComposable$lambda$13, new Function1() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m16520invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m16520invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                function1CurrentActivityErrorHandler.invoke(((CurrencyConverterReceiptEvent.Error) eventCurrencyConverterReceiptComposable$lambda$13.getData()).getT());
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new CurrencyConverterReceiptComposable5(scrollStateRememberScrollState, animatable, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                Modifier modifierTestTag = TestTag3.testTag(ScrollKt.verticalScroll$default(modifier3, scrollStateRememberScrollState, ((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue(), null, false, 12, null), TAG_ROOT_CONTAINER);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Function1<? super Throwable, Unit> function14 = function1CurrentActivityErrorHandler;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
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
                Modifier modifier5 = modifier3;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion4, fMo5013toDpu2uoSUM);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i13 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierM5156height3ABfNKs, bentoTheme.getColors(composerStartRestartGroup, i13).getJet(), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                Function0<Unit> function08 = function0CurrentFxRateBottomSheetAction;
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
                Function0<Unit> function09 = function0CurrentBackPressedAction;
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                LottieAnimation2.LottieAnimation(CurrencyConverterReceiptComposable$lambda$14(lottieCompositionResultRememberLottieComposition), TestTag3.testTag(companion4, TAG_ARROW_ANIMATION_LOTTIE), false, false, null, 0.0f, 0, false, true, false, null, false, false, null, null, ContentScale.INSTANCE.getFillHeight(), false, false, null, false, null, composerStartRestartGroup, 100663344, 196608, 0, 2064124);
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(animatable);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CurrencyConverterReceiptComposable3.m2180x7bd36545(animatable, (GraphicsLayerScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierGraphicsLayer = GraphicsLayerModifier6.graphicsLayer(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, (Function1) objRememberedValue3);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getSpaceBetween(), companion2.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer);
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
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                String currencyCode = arg.getFromCurrency().getCurrencyCode();
                Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
                boolean z = true;
                BentoText2.m20747BentoText38GnDrw(currencyCode, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i13).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i13).getBookCoverCapsuleLarge(), composerStartRestartGroup, 0, 0, 8186);
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size40(ServerToBentoAssetMapper2.ARROW_RIGHT_24), "", bentoTheme.getColors(composerStartRestartGroup, i13).getPrime(), null, null, false, composerStartRestartGroup, BentoIcon4.Size40.$stable | 48, 56);
                String currencyCode2 = arg.getToCurrency().getCurrencyCode();
                Intrinsics.checkNotNullExpressionValue(currencyCode2, "getCurrencyCode(...)");
                BentoText2.m20747BentoText38GnDrw(currencyCode2, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i13).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i13).getBookCoverCapsuleLarge(), composerStartRestartGroup, 0, 0, 8186);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                currencyConverterReceiptViewStateCurrencyConverterReceiptComposable$lambda$12 = CurrencyConverterReceiptComposable$lambda$12(snapshotState4CollectAsStateWithLifecycle);
                if (currencyConverterReceiptViewStateCurrencyConverterReceiptComposable$lambda$12 instanceof CurrencyConverterReceiptViewState.Complete) {
                    function04 = function08;
                    if (currencyConverterReceiptViewStateCurrencyConverterReceiptComposable$lambda$12 instanceof CurrencyConverterReceiptViewState.Loading) {
                        composerStartRestartGroup.startReplaceGroup(-61764614);
                        LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(122342155, true, new CurrencyConverterReceiptComposable6(arg, scrollStateRememberScrollState2, fM7995constructorimpl), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
                        composerStartRestartGroup.endReplaceGroup();
                        function05 = function09;
                    } else {
                        if (!(currencyConverterReceiptViewStateCurrencyConverterReceiptComposable$lambda$12 instanceof CurrencyConverterReceiptViewState.Pending)) {
                            composerStartRestartGroup.startReplaceGroup(-1110394704);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-61027434);
                        CurrencyConverterReceiptViewState.Pending pending = (CurrencyConverterReceiptViewState.Pending) currencyConverterReceiptViewStateCurrencyConverterReceiptComposable$lambda$12;
                        Currency toCurrency = arg.getToCurrency();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        if ((((i12 & 7168) ^ 3072) <= 2048 || !composerStartRestartGroup.changed(function2CurrentViewDetailsAction)) && (i12 & 3072) != 2048) {
                            z = false;
                        }
                        boolean zChangedInstance4 = z | composerStartRestartGroup.changedInstance(arg);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CurrencyConverterReceiptComposable3.CurrencyConverterReceiptComposable$lambda$27$lambda$26$lambda$25(function2CurrentViewDetailsAction, arg);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function05 = function09;
                        PendingStateContent(pending, toCurrency, scrollStateRememberScrollState2, function05, (Function0) objRememberedValue5, Background3.m4872backgroundbw27NRU$default(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.m5156height3ABfNKs(companion4, fM7995constructorimpl)), bentoTheme.getColors(composerStartRestartGroup, i13).m21371getBg0d7_KjU(), null, 2, null), composerStartRestartGroup, (i12 << 3) & 7168, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(-62455635);
                    CurrencyConverterReceiptViewState.Complete complete = (CurrencyConverterReceiptViewState.Complete) currencyConverterReceiptViewStateCurrencyConverterReceiptComposable$lambda$12;
                    CurrencyConversionDeeplinkSource source = arg.getSource();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if ((((i12 & 7168) ^ 3072) <= 2048 || !composerStartRestartGroup.changed(function2CurrentViewDetailsAction)) && (i12 & 3072) != 2048) {
                        z = false;
                    }
                    boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(arg) | z;
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CurrencyConverterReceiptComposable3.CurrencyConverterReceiptComposable$lambda$27$lambda$24$lambda$23(function2CurrentViewDetailsAction, arg);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function05 = function09;
                    CompletedStateContent(complete, source, scrollStateRememberScrollState2, function05, (Function0) objRememberedValue6, function08, Background3.m4872backgroundbw27NRU$default(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.m5156height3ABfNKs(companion4, fM7995constructorimpl)), bentoTheme.getColors(composerStartRestartGroup, i13).m21371getBg0d7_KjU(), null, 2, null), composerStartRestartGroup, (i12 << 3) & 465920, 0);
                    function04 = function08;
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function22 = function2CurrentViewDetailsAction;
                function06 = function05;
                function07 = function04;
                currencyConverterReceiptDuxo4 = currencyConverterReceiptDuxo3;
                function13 = function14;
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                function06 = function0CurrentBackPressedAction;
                function22 = function2CurrentViewDetailsAction;
                function07 = function03;
                function13 = function12;
                currencyConverterReceiptDuxo4 = currencyConverterReceiptDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CurrencyConverterReceiptComposable3.CurrencyConverterReceiptComposable$lambda$28(arg, modifier4, function06, function22, function07, function13, currencyConverterReceiptDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) != 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((599187 & i3) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                if ((i2 & 16) == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(currencyConverterReceiptDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow2 = currencyConverterReceiptDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                int i122 = i5;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$$inlined$collectEventAsStateWithLifecycle$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CurrencyConverterReceiptComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$CurrencyConverterReceiptComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof CurrencyConverterReceiptEvent) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                Event<CurrencyConverterReceiptEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof CurrencyConverterReceiptEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                ScrollState scrollStateRememberScrollState22 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C21775R.raw.conversion_loader)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                composerStartRestartGroup.startReplaceGroup(-469424720);
                float fMo5013toDpu2uoSUM2 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() & 4294967295L));
                composerStartRestartGroup.endReplaceGroup();
                float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(0.725f * fMo5013toDpu2uoSUM2);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                animatable = (Animatable) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                eventCurrencyConverterReceiptComposable$lambda$13 = CurrencyConverterReceiptComposable$lambda$13(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCurrencyConverterReceiptComposable$lambda$13 != null) {
                }
                Unit unit22 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new CurrencyConverterReceiptComposable5(scrollStateRememberScrollState, animatable, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                    Modifier modifierTestTag2 = TestTag3.testTag(ScrollKt.verticalScroll$default(modifier3, scrollStateRememberScrollState, ((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue(), null, false, 12, null), TAG_ROOT_CONTAINER);
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.Vertical top2 = arrangement2.getTop();
                    Alignment.Companion companion22 = Alignment.INSTANCE;
                    Function1<? super Throwable, Unit> function142 = function1CurrentActivityErrorHandler;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag2);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Modifier modifier52 = modifier3;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier.Companion companion42 = Modifier.INSTANCE;
                        Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(companion42, fMo5013toDpu2uoSUM2);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i132 = BentoTheme.$stable;
                        Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifierM5156height3ABfNKs2, bentoTheme2.getColors(composerStartRestartGroup, i132).getJet(), null, 2, null);
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getCenter(), false);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
                        Function0<Unit> function082 = function0CurrentFxRateBottomSheetAction;
                        Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Function0<Unit> function092 = function0CurrentBackPressedAction;
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            LottieAnimation2.LottieAnimation(CurrencyConverterReceiptComposable$lambda$14(lottieCompositionResultRememberLottieComposition2), TestTag3.testTag(companion42, TAG_ARROW_ANIMATION_LOTTIE), false, false, null, 0.0f, 0, false, true, false, null, false, false, null, null, ContentScale.INSTANCE.getFillHeight(), false, false, null, false, null, composerStartRestartGroup, 100663344, 196608, 0, 2064124);
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion42, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(animatable);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance2) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.mcw.mcwcurrencyconverterreceipt.CurrencyConverterReceiptComposableKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CurrencyConverterReceiptComposable3.m2180x7bd36545(animatable, (GraphicsLayerScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierGraphicsLayer2 = GraphicsLayerModifier6.graphicsLayer(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, (Function1) objRememberedValue3);
                                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getSpaceBetween(), companion22.getCenterVertically(), composerStartRestartGroup, 54);
                                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierGraphicsLayer2);
                                Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion32.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                                setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl3.getInserting()) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                                    Row6 row62 = Row6.INSTANCE;
                                    String currencyCode3 = arg.getFromCurrency().getCurrencyCode();
                                    Intrinsics.checkNotNullExpressionValue(currencyCode3, "getCurrencyCode(...)");
                                    boolean z2 = true;
                                    BentoText2.m20747BentoText38GnDrw(currencyCode3, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i132).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i132).getBookCoverCapsuleLarge(), composerStartRestartGroup, 0, 0, 8186);
                                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size40(ServerToBentoAssetMapper2.ARROW_RIGHT_24), "", bentoTheme2.getColors(composerStartRestartGroup, i132).getPrime(), null, null, false, composerStartRestartGroup, BentoIcon4.Size40.$stable | 48, 56);
                                    String currencyCode22 = arg.getToCurrency().getCurrencyCode();
                                    Intrinsics.checkNotNullExpressionValue(currencyCode22, "getCurrencyCode(...)");
                                    BentoText2.m20747BentoText38GnDrw(currencyCode22, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i132).getNova()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i132).getBookCoverCapsuleLarge(), composerStartRestartGroup, 0, 0, 8186);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    composerStartRestartGroup.endNode();
                                    composerStartRestartGroup.endNode();
                                    currencyConverterReceiptViewStateCurrencyConverterReceiptComposable$lambda$12 = CurrencyConverterReceiptComposable$lambda$12(snapshotState4CollectAsStateWithLifecycle3);
                                    if (currencyConverterReceiptViewStateCurrencyConverterReceiptComposable$lambda$12 instanceof CurrencyConverterReceiptViewState.Complete) {
                                    }
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    function22 = function2CurrentViewDetailsAction;
                                    function06 = function05;
                                    function07 = function04;
                                    currencyConverterReceiptDuxo4 = currencyConverterReceiptDuxo3;
                                    function13 = function142;
                                    modifier4 = modifier52;
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CurrencyConverterReceiptComposable$lambda$27$lambda$22$lambda$20$lambda$19 */
    public static final Unit m2180x7bd36545(Animatable animatable, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setTranslationX(((Number) animatable.getValue()).floatValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CurrencyConverterReceiptComposable$lambda$27$lambda$24$lambda$23(Function2 function2, CurrencyConverterReceiptKey currencyConverterReceiptKey) {
        function2.invoke(currencyConverterReceiptKey.getAccountNumber(), currencyConverterReceiptKey.getOrderId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CurrencyConverterReceiptComposable$lambda$27$lambda$26$lambda$25(Function2 function2, CurrencyConverterReceiptKey currencyConverterReceiptKey) {
        function2.invoke(currencyConverterReceiptKey.getAccountNumber(), currencyConverterReceiptKey.getOrderId());
        return Unit.INSTANCE;
    }
}
