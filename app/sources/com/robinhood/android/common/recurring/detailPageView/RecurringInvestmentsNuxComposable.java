package com.robinhood.android.common.recurring.detailPageView;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxDuxo;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.p094ui.detail.recurring.CryptoDetailRecurringComposable7;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.recurring.contracts.investflow.AllocationStrategy;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowFrequency;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowIntentKey;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowLoggingParams;
import com.robinhood.android.recurring.contracts.investflow.InvestFlowStep;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: RecurringInvestmentsNuxComposable.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a-\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a7\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0001¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, m3636d2 = {"RecurringInvestmentsEquityNuxComposable", "", "id", "Ljava/util/UUID;", "symbol", "", "accountNumber", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", CryptoDetailRecurringComposable7.NUX_SECTION, "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "onLaunchRecurringClicked", "Lkotlin/Function0;", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RecurringInvestmentsNuxComposable", "initArgs", "Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo$InitArgs;", "duxo", "Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo;", "(Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo$InitArgs;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxDuxo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-lib-recurring_externalDebug", "viewState", "Lcom/robinhood/android/common/recurring/detailPageView/RecurringInvestmentsNuxViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RecurringInvestmentsNuxComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringInvestmentsCryptoNuxComposable$lambda$3(UiCurrencyPair uiCurrencyPair, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        RecurringInvestmentsCryptoNuxComposable(uiCurrencyPair, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringInvestmentsEquityNuxComposable$lambda$2(UUID uuid, String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RecurringInvestmentsEquityNuxComposable(uuid, str, str2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringInvestmentsNuxComposable$lambda$8(RecurringInvestmentsNuxDuxo.InitArgs initArgs, Modifier modifier, RecurringInvestmentsNuxDuxo recurringInvestmentsNuxDuxo, Function0 function0, int i, int i2, Composer composer, int i3) {
        RecurringInvestmentsNuxComposable(initArgs, modifier, recurringInvestmentsNuxDuxo, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecurringInvestmentsEquityNuxComposable(final UUID id, final String symbol, final String accountNumber, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final Navigator navigator;
        final Context context;
        boolean zChangedInstance;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(503458744);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(id) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(symbol) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(accountNumber) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(503458744, i3, -1, "com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsEquityNuxComposable (RecurringInvestmentsNuxComposable.kt:35)");
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                RecurringInvestmentsNuxDuxo.InitArgs.Equity equity = new RecurringInvestmentsNuxDuxo.InitArgs.Equity(id, symbol, accountNumber);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(id);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RecurringInvestmentsNuxComposable.RecurringInvestmentsEquityNuxComposable$lambda$1$lambda$0(navigator, context, id, accountNumber);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                RecurringInvestmentsNuxComposable(equity, modifier3, null, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 6) & 112, 4);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecurringInvestmentsNuxComposable.RecurringInvestmentsEquityNuxComposable$lambda$2(id, symbol, accountNumber, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            RecurringInvestmentsNuxDuxo.InitArgs.Equity equity2 = new RecurringInvestmentsNuxDuxo.InitArgs.Equity(id, symbol, accountNumber);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(id);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RecurringInvestmentsNuxComposable.RecurringInvestmentsEquityNuxComposable$lambda$1$lambda$0(navigator, context, id, accountNumber);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                RecurringInvestmentsNuxComposable(equity2, modifier3, null, (Function0) objRememberedValue, composerStartRestartGroup, (i3 >> 6) & 112, 4);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringInvestmentsEquityNuxComposable$lambda$1$lambda$0(Navigator navigator, Context context, UUID uuid, String str) {
        Navigator.DefaultImpls.startActivity$default(navigator, context, new InvestFlowIntentKey((InvestFlowStep) InvestFlowStep.Frequency.INSTANCE, true, false, false, CollectionsKt.listOf(uuid), str, (BigDecimal) null, (InvestFlowFrequency) null, false, (AllocationStrategy) null, (InvestFlowLoggingParams) null, 1996, (DefaultConstructorMarker) null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    public static final void RecurringInvestmentsCryptoNuxComposable(final UiCurrencyPair currencyPair, Modifier modifier, Function0<Unit> onLaunchRecurringClicked, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function0;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(onLaunchRecurringClicked, "onLaunchRecurringClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1659188268);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(currencyPair) ? 4 : 2) | i;
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
            i3 |= composerStartRestartGroup.changedInstance(onLaunchRecurringClicked) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function0 = onLaunchRecurringClicked;
            modifier2 = modifier;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1659188268, i3, -1, "com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsCryptoNuxComposable (RecurringInvestmentsNuxComposable.kt:65)");
            }
            RecurringInvestmentsNuxComposable(new RecurringInvestmentsNuxDuxo.InitArgs.Crypto(currencyPair), modifier3, null, onLaunchRecurringClicked, composerStartRestartGroup, (i3 & 112) | ((i3 << 3) & 7168), 4);
            function0 = onLaunchRecurringClicked;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringInvestmentsNuxComposable.RecurringInvestmentsCryptoNuxComposable$lambda$3(currencyPair, modifier2, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0314  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecurringInvestmentsNuxComposable(final RecurringInvestmentsNuxDuxo.InitArgs initArgs, Modifier modifier, RecurringInvestmentsNuxDuxo recurringInvestmentsNuxDuxo, Function0<Unit> onLaunchRecurringClicked, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        RecurringInvestmentsNuxDuxo recurringInvestmentsNuxDuxo2;
        Modifier modifier3;
        Composer composer2;
        int i4;
        RecurringInvestmentsNuxDuxo recurringInvestmentsNuxDuxo3;
        Composer composer3;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        final EventLogger current;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Function0<Unit> function0;
        Composer composer4;
        final RecurringInvestmentsNuxDuxo recurringInvestmentsNuxDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(initArgs, "initArgs");
        Intrinsics.checkNotNullParameter(onLaunchRecurringClicked, "onLaunchRecurringClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1818837775);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(initArgs) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    recurringInvestmentsNuxDuxo2 = recurringInvestmentsNuxDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(recurringInvestmentsNuxDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    recurringInvestmentsNuxDuxo2 = recurringInvestmentsNuxDuxo;
                }
                i3 |= i6;
            } else {
                recurringInvestmentsNuxDuxo2 = recurringInvestmentsNuxDuxo;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onLaunchRecurringClicked) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current2 == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(RecurringInvestmentsNuxDuxo.class), current2, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxComposableKt$RecurringInvestmentsNuxComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxComposableKt$RecurringInvestmentsNuxComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer2, 0);
                        composer2.endReplaceGroup();
                        i4 = i3 & (-897);
                        recurringInvestmentsNuxDuxo3 = (RecurringInvestmentsNuxDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = i3;
                        recurringInvestmentsNuxDuxo3 = recurringInvestmentsNuxDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    recurringInvestmentsNuxDuxo3 = recurringInvestmentsNuxDuxo2;
                    composer2 = composerStartRestartGroup;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1818837775, i4, -1, "com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxComposable (RecurringInvestmentsNuxComposable.kt:83)");
                }
                composer3 = composer2;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(recurringInvestmentsNuxDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer3, AutoLoggingCompositionLocals4.$stable);
                String str = null;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composer3, (i4 >> 3) & 14, 1), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), RecurringInvestmentsNuxComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle).getRefId().toString(), new Screen(RecurringInvestmentsNuxComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle).getScreenName(), str, null, null, 14, null), UserInteractionEventData.Action.ENTER_RECURRING_CREATION, null, new Component(Component.ComponentType.BUTTON, str, 0 == true ? 1 : 0, 6, null), null, 40, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierAutoLogEvents$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer3.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.useNode();
                } else {
                    composer3.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, i7).m21593getSmallD9Ej5fM(), 7, null);
                StringResource descriptionText = RecurringInvestmentsNuxComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle).getDescriptionText();
                int i8 = StringResource.$stable;
                RecurringInvestmentsNuxDuxo recurringInvestmentsNuxDuxo5 = recurringInvestmentsNuxDuxo3;
                Modifier modifier5 = modifier3;
                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(descriptionText, composer3, i8), modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 0, 0, 8184);
                String string2 = StringResource2.getString(RecurringInvestmentsNuxComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle).getLaunchRecurringButtonText(), composer3, i8);
                long jM21368getAccent0d7_KjU = bentoTheme.getColors(composer3, i7).m21368getAccent0d7_KjU();
                composer3.startReplaceGroup(-1746271574);
                zChangedInstance = composer3.changedInstance(current) | composer3.changed(snapshotState4CollectAsStateWithLifecycle) | ((i4 & 7168) != 2048);
                objRememberedValue = composer3.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    function0 = onLaunchRecurringClicked;
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RecurringInvestmentsNuxComposable.RecurringInvestmentsNuxComposable$lambda$7$lambda$6$lambda$5(current, function0, snapshotState4CollectAsStateWithLifecycle);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue);
                } else {
                    function0 = onLaunchRecurringClicked;
                }
                composer3.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, string2, null, null, null, false, Color.m6701boximpl(jM21368getAccent0d7_KjU), composer3, 0, 60);
                composer4 = composer3;
                composer4.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                recurringInvestmentsNuxDuxo4 = recurringInvestmentsNuxDuxo5;
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function0 = onLaunchRecurringClicked;
                modifier4 = modifier2;
                recurringInvestmentsNuxDuxo4 = recurringInvestmentsNuxDuxo2;
                composer4 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function0<Unit> function02 = function0;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RecurringInvestmentsNuxComposable.RecurringInvestmentsNuxComposable$lambda$8(initArgs, modifier4, recurringInvestmentsNuxDuxo4, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composer3 = composer2;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(recurringInvestmentsNuxDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer3, AutoLoggingCompositionLocals4.$stable);
                String str2 = null;
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composer3, (i4 >> 3) & 14, 1), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), RecurringInvestmentsNuxComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle).getRefId().toString(), new Screen(RecurringInvestmentsNuxComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle).getScreenName(), str2, null, null, 14, null), UserInteractionEventData.Action.ENTER_RECURRING_CREATION, null, new Component(Component.ComponentType.BUTTON, str2, 0 == true ? 1 : 0, 6, null), null, 40, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierAutoLogEvents$default2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer3.getApplier() == null) {
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer3, i72).m21593getSmallD9Ej5fM(), 7, null);
                    StringResource descriptionText2 = RecurringInvestmentsNuxComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle).getDescriptionText();
                    int i82 = StringResource.$stable;
                    RecurringInvestmentsNuxDuxo recurringInvestmentsNuxDuxo52 = recurringInvestmentsNuxDuxo3;
                    Modifier modifier52 = modifier3;
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(descriptionText2, composer3, i82), modifierM5146paddingqDBjuR0$default2, Color.m6701boximpl(bentoTheme2.getColors(composer3, i72).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i72).getTextM(), composer3, 0, 0, 8184);
                    String string22 = StringResource2.getString(RecurringInvestmentsNuxComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle).getLaunchRecurringButtonText(), composer3, i82);
                    long jM21368getAccent0d7_KjU2 = bentoTheme2.getColors(composer3, i72).m21368getAccent0d7_KjU();
                    composer3.startReplaceGroup(-1746271574);
                    zChangedInstance = composer3.changedInstance(current) | composer3.changed(snapshotState4CollectAsStateWithLifecycle) | ((i4 & 7168) != 2048);
                    objRememberedValue = composer3.rememberedValue();
                    if (zChangedInstance) {
                        function0 = onLaunchRecurringClicked;
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RecurringInvestmentsNuxComposable.RecurringInvestmentsNuxComposable$lambda$7$lambda$6$lambda$5(current, function0, snapshotState4CollectAsStateWithLifecycle);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                        composer3.endReplaceGroup();
                        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, string22, null, null, null, false, Color.m6701boximpl(jM21368getAccent0d7_KjU2), composer3, 0, 60);
                        composer4 = composer3;
                        composer4.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        recurringInvestmentsNuxDuxo4 = recurringInvestmentsNuxDuxo52;
                        modifier4 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final RecurringInvestmentsNuxViewState RecurringInvestmentsNuxComposable$lambda$4(SnapshotState4<RecurringInvestmentsNuxViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringInvestmentsNuxComposable$lambda$7$lambda$6$lambda$5(EventLogger eventLogger, Function0 function0, SnapshotState4 snapshotState4) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        ByteString byteString = null;
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.ENTER_RECURRING_CREATION, new Screen(RecurringInvestmentsNuxComposable$lambda$4(snapshotState4).getScreenName(), null, str, byteString, 14, defaultConstructorMarker), new Component(Component.ComponentType.BUTTON, str, byteString, 6, defaultConstructorMarker), null, null, false, 56, null);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
