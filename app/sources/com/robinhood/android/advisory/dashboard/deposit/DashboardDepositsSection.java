package com.robinhood.android.advisory.dashboard.deposit;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.dashboard.C8626R;
import com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsSection;
import com.robinhood.android.advisory.dashboard.deposit.promo.DepositPromoCardComposable;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.transfers.contracts.RecurringDepositsListKey;
import com.robinhood.android.transfers.contracts.TransferShim;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.advisory.p304db.card.StrategiesDashboardCard;
import com.robinhood.models.p355ui.bonfire.dashboardsection.UiGetDepositsSummaryRow;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DashboardDepositsSection.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a/\u0010\t\u001a\u00020\u0001*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"DashboardDepositsSection", "", "accountNumber", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDuxo;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsDuxo;Landroidx/compose/runtime/Composer;II)V", "DepositSummaryRows", "Landroidx/compose/foundation/layout/ColumnScope;", "serverDrivenDepositSummaryRows", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/models/ui/bonfire/dashboardsection/UiGetDepositsSummaryRow;", "topRowMetaValue", "bottomRowMetaValue", "(Landroidx/compose/foundation/layout/ColumnScope;Lkotlinx/collections/immutable/PersistentList;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "lib-advisory-dashboard_externalDebug", "viewState", "Lcom/robinhood/android/advisory/dashboard/deposit/DashboardDepositsViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsSectionKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class DashboardDepositsSection {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashboardDepositsSection$lambda$2(String str, Modifier modifier, DashboardDepositsDuxo dashboardDepositsDuxo, int i, int i2, Composer composer, int i3) {
        DashboardDepositsSection(str, modifier, dashboardDepositsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DepositSummaryRows$lambda$5(Column5 column5, ImmutableList3 immutableList3, String str, String str2, int i, Composer composer, int i2) {
        DepositSummaryRows(column5, immutableList3, str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DashboardDepositsSection(String str, Modifier modifier, DashboardDepositsDuxo dashboardDepositsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DashboardDepositsDuxo dashboardDepositsDuxo2;
        Modifier modifier3;
        boolean z;
        int i4;
        DashboardDepositsDuxo dashboardDepositsDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier4;
        final DashboardDepositsDuxo dashboardDepositsDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final String accountNumber = str;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(1245810490);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
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
                    dashboardDepositsDuxo2 = dashboardDepositsDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(dashboardDepositsDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    dashboardDepositsDuxo2 = dashboardDepositsDuxo;
                }
                i3 |= i6;
            } else {
                dashboardDepositsDuxo2 = dashboardDepositsDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        CreationExtras defaultViewModelCreationExtras = current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                        z = false;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DashboardDepositsDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsSectionKt$DashboardDepositsSection$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsSectionKt$DashboardDepositsSection$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i3 &= -897;
                        i4 = -1633490746;
                        dashboardDepositsDuxo2 = (DashboardDepositsDuxo) baseDuxo;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1245810490, i3, -1, "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsSection (DashboardDepositsSection.kt:52)");
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(dashboardDepositsDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, DashboardDepositsSection$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEventContext(), null, null, 55, null));
                    dashboardDepositsDuxo3 = dashboardDepositsDuxo2;
                    boolean z2 = z;
                    Modifier modifier5 = modifier3;
                    C86421 c86421 = new C86421(modifier5, navigator, context, accountNumber, snapshotState4CollectAsStateWithLifecycle);
                    accountNumber = accountNumber;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorUpdateWith, ComposableLambda3.rememberComposableLambda(-1706887067, true, c86421, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceGroup(i4);
                    int i7 = i3 & 14;
                    zChangedInstance = composerStartRestartGroup.changedInstance(dashboardDepositsDuxo3) | (i7 == 4 ? true : z2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new DashboardDepositsSection2(dashboardDepositsDuxo3, accountNumber, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(accountNumber, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                    dashboardDepositsDuxo4 = dashboardDepositsDuxo3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                i4 = -1633490746;
                z = false;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(dashboardDepositsDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith2 = UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, DashboardDepositsSection$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getEventContext(), null, null, 55, null));
                dashboardDepositsDuxo3 = dashboardDepositsDuxo2;
                boolean z22 = z;
                Modifier modifier52 = modifier3;
                C86421 c864212 = new C86421(modifier52, navigator2, context2, accountNumber, snapshotState4CollectAsStateWithLifecycle2);
                accountNumber = accountNumber;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorUpdateWith2, ComposableLambda3.rememberComposableLambda(-1706887067, true, c864212, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceGroup(i4);
                int i72 = i3 & 14;
                zChangedInstance = composerStartRestartGroup.changedInstance(dashboardDepositsDuxo3) | (i72 == 4 ? true : z22);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue = new DashboardDepositsSection2(dashboardDepositsDuxo3, accountNumber, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(accountNumber, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i72);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier52;
                    dashboardDepositsDuxo4 = dashboardDepositsDuxo3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                dashboardDepositsDuxo4 = dashboardDepositsDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsSectionKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DashboardDepositsSection.DashboardDepositsSection$lambda$2(accountNumber, modifier4, dashboardDepositsDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                    i4 = -1633490746;
                    z = false;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(dashboardDepositsDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Navigator navigator22 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                Context context22 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith22 = UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, DashboardDepositsSection$lambda$0(snapshotState4CollectAsStateWithLifecycle22).getEventContext(), null, null, 55, null));
                dashboardDepositsDuxo3 = dashboardDepositsDuxo2;
                boolean z222 = z;
                Modifier modifier522 = modifier3;
                C86421 c8642122 = new C86421(modifier522, navigator22, context22, accountNumber, snapshotState4CollectAsStateWithLifecycle22);
                accountNumber = accountNumber;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptorUpdateWith22, ComposableLambda3.rememberComposableLambda(-1706887067, true, c8642122, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceGroup(i4);
                int i722 = i3 & 14;
                zChangedInstance = composerStartRestartGroup.changedInstance(dashboardDepositsDuxo3) | (i722 == 4 ? true : z222);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: DashboardDepositsSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsSectionKt$DashboardDepositsSection$1 */
    static final class C86421 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ Context $context;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ SnapshotState4<DashboardDepositsViewState> $viewState$delegate;

        C86421(Modifier modifier, Navigator navigator, Context context, String str, SnapshotState4<DashboardDepositsViewState> snapshotState4) {
            this.$modifier = modifier;
            this.$navigator = navigator;
            this.$context = context;
            this.$accountNumber = str;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$1$lambda$0(Navigator navigator, Context context, String str) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.TRANSFERS, null, str, false, null, 53, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            String str;
            final String str2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1706887067, i, -1, "com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsSection.<anonymous> (DashboardDepositsSection.kt:65)");
            }
            Modifier modifier = this.$modifier;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            final String str3 = this.$accountNumber;
            final SnapshotState4<DashboardDepositsViewState> snapshotState4 = this.$viewState$delegate;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composer, 0);
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
            Modifier.Companion companion3 = Modifier.INSTANCE;
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(str3);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsSectionKt$DashboardDepositsSection$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DashboardDepositsSection.C86421.invoke$lambda$8$lambda$1$lambda$0(navigator, context, str3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion3, false, null, null, (Function0) objRememberedValue, 7, null), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, "deposits", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
            float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM();
            composer.startReplaceGroup(-1279119049);
            StrategiesDashboardCard.Alignment promoCardLocation = DashboardDepositsSection.DashboardDepositsSection$lambda$0(snapshotState4).getPromoCardLocation();
            StrategiesDashboardCard.Alignment alignment = StrategiesDashboardCard.Alignment.ABOVE_DEPOSIT;
            float fM7995constructorimpl = promoCardLocation == alignment ? C2002Dp.m7995constructorimpl(0) : bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM();
            composer.endReplaceGroup();
            Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(modifierAutoLogEvents$default, fM21590getDefaultD9Ej5fM, fM7995constructorimpl);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), companion.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM21620defaultFillMaxWidthPaddingVpY3zN4);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8626R.string.advisory_dashboard_deposits_section_title, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8190);
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), StringResources_androidKt.stringResource(C8626R.string.advisory_dashboard_deposits_section_title_content_description, composer, 0), bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), null, null, false, composer, BentoIcon4.Size16.$stable, 56);
            Spacer2.Spacer(Row5.weight$default(row6, companion3, 1.0f, false, 2, null), composer, 0);
            String goldValuePropsPillTitle = DashboardDepositsSection.DashboardDepositsSection$lambda$0(snapshotState4).getGoldValuePropsPillTitle();
            composer.startReplaceGroup(-2076449995);
            if (goldValuePropsPillTitle == null) {
                str = str3;
            } else {
                AdvisoryDepositsGoldPill.AdvisoryDepositsGoldPill(goldValuePropsPillTitle, str3, null, composer, 0, 4);
                str = str3;
                Unit unit = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            composer.endNode();
            composer.startReplaceGroup(-1279076831);
            if (DashboardDepositsSection.DashboardDepositsSection$lambda$0(snapshotState4).getPromoCardLocation() == alignment) {
                DepositPromoCardComposable.DepositPromoCardComposable(str, null, null, composer, 0, 6);
                str2 = str;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0);
            } else {
                str2 = str;
            }
            composer.endReplaceGroup();
            ImmutableList3<UiGetDepositsSummaryRow> depositSummaryRows = DashboardDepositsSection.DashboardDepositsSection$lambda$0(snapshotState4).getDepositSummaryRows();
            StringResource lastDepositValueText = DashboardDepositsSection.DashboardDepositsSection$lambda$0(snapshotState4).getLastDepositValueText();
            int i3 = StringResource.$stable;
            DashboardDepositsSection.DepositSummaryRows(column6, depositSummaryRows, StringResource2.getString(lastDepositValueText, composer, i3), StringResource2.getString(DashboardDepositsSection.DashboardDepositsSection$lambda$0(snapshotState4).getNextDepositValueText(), composer, i3), composer, 6);
            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
            String strStringResource = StringResources_androidKt.stringResource(C8626R.string.advisory_dashboard_deposits_section_one_time, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C8626R.string.advisory_dashboard_deposits_section_recurring, composer, 0);
            boolean z = DashboardDepositsSection.DashboardDepositsSection$lambda$0(snapshotState4).getPromoCardLocation() == StrategiesDashboardCard.Alignment.BELOW_DEPOSIT;
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(snapshotState4);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsSectionKt$DashboardDepositsSection$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DashboardDepositsSection.C86421.invoke$lambda$8$lambda$5$lambda$4(navigator, context, snapshotState4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance3 = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(str2) | composer.changed(snapshotState4);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsSectionKt$DashboardDepositsSection$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DashboardDepositsSection.C86421.invoke$lambda$8$lambda$7$lambda$6(navigator, context, str2, snapshotState4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            DepositCtaBlock.DepositCtaBlock(str2, strStringResource, strStringResource2, "one_time", "recurring", z, function0, (Function0) objRememberedValue3, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, composer, 27648, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$5$lambda$4(Navigator navigator, Context context, SnapshotState4 snapshotState4) {
            Navigator.DefaultImpls.startActivity$default(navigator, context, new TransferShim(null, DashboardDepositsSection.DashboardDepositsSection$lambda$0(snapshotState4).getTransferConfig(), null, 5, null), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7$lambda$6(Navigator navigator, Context context, String str, SnapshotState4 snapshotState4) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new RecurringDepositsListKey(str, DashboardDepositsSection.DashboardDepositsSection$lambda$0(snapshotState4).getRecurringDepositToSelection()), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DashboardDepositsViewState DashboardDepositsSection$lambda$0(SnapshotState4<DashboardDepositsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DepositSummaryRows(final Column5 column5, final ImmutableList3<UiGetDepositsSummaryRow> immutableList3, final String str, final String str2, Composer composer, final int i) {
        Composer composer2;
        BentoBaseRowState.Meta singleLine;
        Composer composerStartRestartGroup = composer.startRestartGroup(282386709);
        int i2 = (i & 48) == 0 ? (composerStartRestartGroup.changedInstance(immutableList3) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i2 & 1169) != 1168 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(282386709, i2, -1, "com.robinhood.android.advisory.dashboard.deposit.DepositSummaryRows (DashboardDepositsSection.kt:181)");
            }
            if (!immutableList3.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(-1258208430);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1683074533);
                for (UiGetDepositsSummaryRow uiGetDepositsSummaryRow : immutableList3) {
                    String secondaryValue = uiGetDepositsSummaryRow.getSecondaryValue();
                    String primaryLabel = uiGetDepositsSummaryRow.getPrimaryLabel();
                    String secondaryLabel = uiGetDepositsSummaryRow.getSecondaryLabel();
                    if (secondaryValue != null) {
                        singleLine = new BentoBaseRowState.Meta.TwoLine(uiGetDepositsSummaryRow.getPrimaryValue(), secondaryValue);
                    } else {
                        singleLine = new BentoBaseRowState.Meta.SingleLine(uiGetDepositsSummaryRow.getPrimaryValue());
                    }
                    BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, primaryLabel, secondaryLabel, (String) null, singleLine, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, null, composerStartRestartGroup, BentoBaseRowState.$stable << 3, 125);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1257330541);
                String strStringResource = StringResources_androidKt.stringResource(C8626R.string.advisory_dashboard_deposits_section_last_deposit_label, composerStartRestartGroup, 0);
                BentoBaseRowState.Meta.SingleLine singleLine2 = new BentoBaseRowState.Meta.SingleLine(str);
                int i3 = BentoBaseRowState.Meta.SingleLine.$stable;
                composer2 = composerStartRestartGroup;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource, null, null, singleLine2, null, false, false, false, 0L, null, composer2, i3 << 15, 0, 4059);
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, StringResources_androidKt.stringResource(C8626R.string.advisory_dashboard_deposits_section_next_deposit_label, composer2, 0), null, null, new BentoBaseRowState.Meta.SingleLine(str2), null, false, false, false, 0L, null, composer2, i3 << 15, 0, 4059);
                composer2.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.deposit.DashboardDepositsSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DashboardDepositsSection.DepositSummaryRows$lambda$5(column5, immutableList3, str, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
