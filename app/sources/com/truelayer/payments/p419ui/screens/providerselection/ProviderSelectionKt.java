package com.truelayer.payments.p419ui.screens.providerselection;

import androidx.compose.p011ui.text.intl.Locale;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.truelayer.payments.analytics.TrueLayerAnalytics;
import com.truelayer.payments.analytics.events.AnalyticsEvents;
import com.truelayer.payments.core.domain.errors.CoreError;
import com.truelayer.payments.core.domain.experience.scheme.Scheme;
import com.truelayer.payments.core.logger.Logger6;
import com.truelayer.payments.core.network.Network;
import com.truelayer.payments.core.store.Store;
import com.truelayer.payments.p419ui.TrueLayerUI;
import com.truelayer.payments.p419ui.components.LoadingDialog4;
import com.truelayer.payments.p419ui.models.Country;
import com.truelayer.payments.p419ui.screens.components.NetworkErrorView;
import com.truelayer.payments.p419ui.screens.confirmation.ConfirmationContainer;
import com.truelayer.payments.p419ui.screens.confirmation.ConfirmationViewData;
import com.truelayer.payments.p419ui.screens.coordinator.PaymentCancellationReason;
import com.truelayer.payments.p419ui.screens.providerselection.ProviderSelectionScreen;
import com.truelayer.payments.p419ui.screens.providerselection.components.SaveAccountDetailsDialog6;
import com.truelayer.payments.p419ui.screens.providerselection.components.SaveAccountDetailsDialogViewData;
import com.truelayer.payments.p419ui.screens.providerselection.countrylist.CountrySelectionContainer;
import com.truelayer.payments.p419ui.screens.providerselection.priming.PrimingContainer4;
import com.truelayer.payments.p419ui.screens.providerselection.providerlist.ProviderSelectionContainerKt;
import com.truelayer.payments.p419ui.screens.providerselection.scheme.SchemeSelectionContainer4;
import com.truelayer.payments.p419ui.utils.AnalyticsExtensions3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ProviderSelection.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u001a\u0087\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032'\b\u0002\u0010\u0004\u001a!\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0005j\u0002`\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2#\b\u0002\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0014*@\u0010\u0015\"\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u00052\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00010\u0005¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u008a\u0084\u0002"}, m3636d2 = {"ProviderSelection", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionViewData;", "onSelect", "Lkotlin/Function1;", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionResult;", "Lkotlin/ParameterName;", "name", "result", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionCallback;", "onAbort", "Lkotlin/Function0;", "onError", "Lcom/truelayer/payments/core/domain/errors/CoreError;", "error", PlaceTypes.STORE, "Lcom/truelayer/payments/core/store/Store;", "api", "Lcom/truelayer/payments/core/network/Network;", "(Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionViewData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/truelayer/payments/core/store/Store;Lcom/truelayer/payments/core/network/Network;Landroidx/compose/runtime/Composer;II)V", "ProviderSelectionCallback", "payments-ui_release", "screen", "Lcom/truelayer/payments/ui/screens/providerselection/ProviderSelectionScreen;", "isLoading", "", "saveUserDetailsDialog", "Lcom/truelayer/payments/ui/screens/providerselection/components/SaveAccountDetailsDialogViewData;"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ProviderSelectionKt {
    /* JADX WARN: Removed duplicated region for block: B:80:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProviderSelection(final ProviderSelectionViewData data, Function1<? super ProviderSelectionResult, Unit> function1, Function0<Unit> function0, Function1<? super CoreError, Unit> function12, Store store, Network network, Composer composer, final int i, final int i2) {
        Store store2;
        int i3;
        Network network2;
        CreationExtras defaultViewModelCreationExtras;
        Network network3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(2109669554);
        Function1<? super ProviderSelectionResult, Unit> function13 = (i2 & 2) != 0 ? new Function1<ProviderSelectionResult, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt.ProviderSelection.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ProviderSelectionResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ProviderSelectionResult providerSelectionResult) {
                invoke2(providerSelectionResult);
                return Unit.INSTANCE;
            }
        } : function1;
        final Function0<Unit> function02 = (i2 & 4) != 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt.ProviderSelection.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0;
        final Function1<? super CoreError, Unit> function14 = (i2 & 8) != 0 ? new Function1<CoreError, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt.ProviderSelection.3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CoreError it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CoreError coreError) {
                invoke2(coreError);
                return Unit.INSTANCE;
            }
        } : function12;
        if ((i2 & 16) != 0) {
            i3 = i & (-57345);
            store2 = TrueLayerUI.INSTANCE.getCore$payments_ui_release().getStore();
        } else {
            store2 = store;
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            i3 &= -458753;
            network2 = TrueLayerUI.INSTANCE.getCore$payments_ui_release().getNetwork();
        } else {
            network2 = network;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2109669554, i3, -1, "com.truelayer.payments.ui.screens.providerselection.ProviderSelection (ProviderSelection.kt:36)");
        }
        ViewModelProvider.Factory factoryProviderSelectionViewModel = ProviderSelectionViewModel2.providerSelectionViewModel(data, store2, network2);
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) ProviderSelectionViewModel.class, current, (String) null, factoryProviderSelectionViewModel, defaultViewModelCreationExtras, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        final ProviderSelectionViewModel providerSelectionViewModel = (ProviderSelectionViewModel) viewModel;
        EffectsKt.LaunchedEffect(Locale.INSTANCE.getCurrent(), new C431354(providerSelectionViewModel, null), composerStartRestartGroup, 64);
        EffectsKt.LaunchedEffect(data, new C431365(providerSelectionViewModel, data, null), composerStartRestartGroup, 72);
        SnapshotState4 snapshotState4CollectAsState = SnapshotStateKt.collectAsState(providerSelectionViewModel.getScreen(), null, composerStartRestartGroup, 8, 1);
        SnapshotState4 snapshotState4CollectAsState2 = SnapshotStateKt.collectAsState(providerSelectionViewModel.isLoading(), null, composerStartRestartGroup, 8, 1);
        SnapshotState4 snapshotState4CollectAsState3 = SnapshotStateKt.collectAsState(providerSelectionViewModel.getShowSaveUserAccountDialog(), null, composerStartRestartGroup, 8, 1);
        composerStartRestartGroup.startReplaceableGroup(30804003);
        if (ProviderSelection$lambda$1(snapshotState4CollectAsState2) || (ProviderSelection$lambda$0(snapshotState4CollectAsState) instanceof ProviderSelectionScreen.Init)) {
            LoadingDialog4.LoadingDialog(null, composerStartRestartGroup, 0, 1);
        }
        composerStartRestartGroup.endReplaceableGroup();
        SaveAccountDetailsDialogViewData saveAccountDetailsDialogViewDataProviderSelection$lambda$2 = ProviderSelection$lambda$2(snapshotState4CollectAsState3);
        composerStartRestartGroup.startReplaceableGroup(30804120);
        if (saveAccountDetailsDialogViewDataProviderSelection$lambda$2 != null) {
            SaveAccountDetailsDialog6.SaveAccountDetailsDialog(saveAccountDetailsDialogViewDataProviderSelection$lambda$2.getProviderImageUrl(), saveAccountDetailsDialogViewDataProviderSelection$lambda$2.getProviderExtendedImageUrl(), saveAccountDetailsDialogViewDataProviderSelection$lambda$2.getCurrency(), new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$6$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    providerSelectionViewModel.onSaveUserAccount$payments_ui_release(true);
                }
            }, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$6$2
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    providerSelectionViewModel.onSaveUserAccount$payments_ui_release(false);
                }
            }, composerStartRestartGroup, 512, 0);
            Unit unit = Unit.INSTANCE;
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Function0<Unit> function03 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$onAbortWrapper$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ProviderSelectionViewModel providerSelectionViewModel2 = providerSelectionViewModel;
                final Function0<Unit> function04 = function02;
                providerSelectionViewModel2.onBack(new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$onAbortWrapper$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        function04.invoke();
                    }
                });
            }
        };
        Logger6.v$default(Logger6.INSTANCE, "ProviderSelection Screen: " + ProviderSelection$lambda$0(snapshotState4CollectAsState).getClass().getSimpleName(), null, null, 6, null);
        final ProviderSelectionScreen providerSelectionScreenProviderSelection$lambda$0 = ProviderSelection$lambda$0(snapshotState4CollectAsState);
        if (providerSelectionScreenProviderSelection$lambda$0 instanceof ProviderSelectionScreen.Result) {
            composerStartRestartGroup.startReplaceableGroup(30804913);
            EffectsKt.LaunchedEffect(providerSelectionScreenProviderSelection$lambda$0, new C431377(function13, providerSelectionScreenProviderSelection$lambda$0, null), composerStartRestartGroup, 64);
            composerStartRestartGroup.endReplaceableGroup();
        } else if (providerSelectionScreenProviderSelection$lambda$0 instanceof ProviderSelectionScreen.Error) {
            composerStartRestartGroup.startReplaceableGroup(30805060);
            ProviderSelectionScreen.Error error = (ProviderSelectionScreen.Error) providerSelectionScreenProviderSelection$lambda$0;
            EffectsKt.LaunchedEffect(error.getError(), new C431388(providerSelectionScreenProviderSelection$lambda$0, data, null), composerStartRestartGroup, 72);
            NetworkErrorView.NetworkErrorView(error.getError(), new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt.ProviderSelection.9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    function14.invoke(((ProviderSelectionScreen.Error) providerSelectionScreenProviderSelection$lambda$0).getError());
                }
            }, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt.ProviderSelection.10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    providerSelectionViewModel.onRetry(function02);
                }
            }, composerStartRestartGroup, 8, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else if (providerSelectionScreenProviderSelection$lambda$0 instanceof ProviderSelectionScreen.ProviderSelection) {
            composerStartRestartGroup.startReplaceableGroup(30805764);
            ProviderSelectionContainerKt.ProviderSelectionContainer((ProviderSelectionScreen.ProviderSelection) providerSelectionScreenProviderSelection$lambda$0, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt.ProviderSelection.11
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.CountryFlagTapped(null, 1, null));
                    providerSelectionViewModel.showCountrySelection();
                }
            }, new Function3<String, String, Boolean, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt.ProviderSelection.12
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, Boolean bool) {
                    invoke(str, str2, bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(String providerId, String str, boolean z) {
                    Intrinsics.checkNotNullParameter(providerId, "providerId");
                    providerSelectionViewModel.onSelectProvider(providerId, str, z);
                }
            }, function03, composerStartRestartGroup, 8, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceableGroup();
        } else if (providerSelectionScreenProviderSelection$lambda$0 instanceof ProviderSelectionScreen.BranchSelection) {
            composerStartRestartGroup.startReplaceableGroup(30806466);
            ProviderSelectionContainerKt.BranchSelectionContainer((ProviderSelectionScreen.BranchSelection) providerSelectionScreenProviderSelection$lambda$0, new Function3<String, String, Boolean, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt.ProviderSelection.13
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, Boolean bool) {
                    invoke(str, str2, bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(String str, String str2, boolean z) {
                    Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
                    if (str2 != null) {
                        providerSelectionViewModel.onSelectBranch(str2);
                        return;
                    }
                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.WTF(null, "Selected provider id not present in viewModel.providers", ArraysKt.contentDeepToString(new Throwable().getStackTrace()), null, null, null, 57, null));
                    providerSelectionViewModel.showProviderSelectionWithCurrentCountry$payments_ui_release();
                }
            }, function03, composerStartRestartGroup, 8, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else if (providerSelectionScreenProviderSelection$lambda$0 instanceof ProviderSelectionScreen.CountrySelection) {
            composerStartRestartGroup.startReplaceableGroup(30807534);
            EffectsKt.LaunchedEffect(providerSelectionScreenProviderSelection$lambda$0, new C4312314(null), composerStartRestartGroup, 64);
            CountrySelectionContainer.CountrySelectionContainer((ProviderSelectionScreen.CountrySelection) providerSelectionScreenProviderSelection$lambda$0, new Function1<Country, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt.ProviderSelection.15
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Country country) {
                    invoke2(country);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Country country) {
                    Intrinsics.checkNotNullParameter(country, "country");
                    TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.CountrySelected(country.getCountryCode(), null, 2, null));
                    providerSelectionViewModel.onSelectCountry(country);
                }
            }, function03, composerStartRestartGroup, 8, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            if (providerSelectionScreenProviderSelection$lambda$0 instanceof ProviderSelectionScreen.Priming) {
                composerStartRestartGroup.startReplaceableGroup(30808200);
                EffectsKt.LaunchedEffect(providerSelectionScreenProviderSelection$lambda$0, new C4312516(providerSelectionScreenProviderSelection$lambda$0, null), composerStartRestartGroup, 64);
                ProviderSelectionScreen.Priming priming = (ProviderSelectionScreen.Priming) providerSelectionScreenProviderSelection$lambda$0;
                network3 = network2;
                PrimingContainer4.PrimingContainer(priming.getPriming(), priming.getSelectedProvider().getDisplayName(), priming.getSelectedProvider().getIconUri(), priming.getSelectedProvider().getExtendedIcon(), new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt.ProviderSelection.17
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.PrimingScreenContinueClicked(null, 1, null));
                        providerSelectionViewModel.onUserPrimingConfirmation$payments_ui_release();
                    }
                }, function03, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt.ProviderSelection.18
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.PrimingScreenBankLinkClicked(null, 1, null));
                    }
                }, composerStartRestartGroup, 1572872, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                network3 = network2;
                if (providerSelectionScreenProviderSelection$lambda$0 instanceof ProviderSelectionScreen.SchemeSelection) {
                    composerStartRestartGroup.startReplaceableGroup(30809237);
                    EffectsKt.LaunchedEffect(providerSelectionScreenProviderSelection$lambda$0, new C4312819(providerSelectionScreenProviderSelection$lambda$0, null), composerStartRestartGroup, 64);
                    ProviderSelectionScreen.SchemeSelection schemeSelection = (ProviderSelectionScreen.SchemeSelection) providerSelectionScreenProviderSelection$lambda$0;
                    String subtitle = schemeSelection.getSchemeSelection().getSubtitle();
                    List<Scheme> schemes = schemeSelection.getSchemeSelection().getSchemes();
                    if (schemes == null) {
                        schemes = CollectionsKt.emptyList();
                    }
                    SchemeSelectionContainer4.SchemeSelectionContainer(subtitle, schemes, schemeSelection.getSchemeSelection().getAutoSelectedSchemeId(), function03, new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt.ProviderSelection.20
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke2(str);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(String it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.SchemeSelectionSubmitted(it, null, 2, null));
                            providerSelectionViewModel.onSelectSchemeId$payments_ui_release(it);
                        }
                    }, composerStartRestartGroup, 64, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (providerSelectionScreenProviderSelection$lambda$0 instanceof ProviderSelectionScreen.Confirmation) {
                    composerStartRestartGroup.startReplaceableGroup(30810112);
                    EffectsKt.LaunchedEffect(providerSelectionScreenProviderSelection$lambda$0, new C4313121(providerSelectionScreenProviderSelection$lambda$0, null), composerStartRestartGroup, 64);
                    ConfirmationViewData confirmationViewData = ((ProviderSelectionScreen.Confirmation) providerSelectionScreenProviderSelection$lambda$0).getConfirmationViewData();
                    composerStartRestartGroup.startReplaceableGroup(30810630);
                    boolean zChanged = composerStartRestartGroup.changed(function03);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<PaymentCancellationReason, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$22$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(PaymentCancellationReason paymentCancellationReason) {
                                invoke2(paymentCancellationReason);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(PaymentCancellationReason it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                function03.invoke();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    ConfirmationContainer.ConfirmationContainer(confirmationViewData, (Function1) objRememberedValue, new Function0<Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt.ProviderSelection.23
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.PaymentConfirmed(((ProviderSelectionScreen.Confirmation) providerSelectionScreenProviderSelection$lambda$0).getConfirmationViewData().getProviderId(), null, 2, null));
                            providerSelectionViewModel.onConsent();
                        }
                    }, function03, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (Intrinsics.areEqual(providerSelectionScreenProviderSelection$lambda$0, ProviderSelectionScreen.Init.INSTANCE)) {
                    composerStartRestartGroup.startReplaceableGroup(30811051);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(30811068);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function1<? super ProviderSelectionResult, Unit> function15 = function13;
                final Function0<Unit> function04 = function02;
                final Function1<? super CoreError, Unit> function16 = function14;
                final Store store3 = store2;
                final Network network4 = network3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt.ProviderSelection.24
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        ProviderSelectionKt.ProviderSelection(data, function15, function04, function16, store3, network4, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        network3 = network2;
        if (ComposerKt.isTraceInProgress()) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$4", m3645f = "ProviderSelection.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$4 */
    static final class C431354 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProviderSelectionViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C431354(ProviderSelectionViewModel providerSelectionViewModel, Continuation<? super C431354> continuation) {
            super(2, continuation);
            this.$viewModel = providerSelectionViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C431354(this.$viewModel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C431354) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$viewModel.notifyChange$payments_ui_release();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$5", m3645f = "ProviderSelection.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$5 */
    static final class C431365 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProviderSelectionViewData $data;
        final /* synthetic */ ProviderSelectionViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C431365(ProviderSelectionViewModel providerSelectionViewModel, ProviderSelectionViewData providerSelectionViewData, Continuation<? super C431365> continuation) {
            super(2, continuation);
            this.$viewModel = providerSelectionViewModel;
            this.$data = providerSelectionViewData;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C431365(this.$viewModel, this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C431365) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$viewModel.initialize$payments_ui_release(this.$data);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$7", m3645f = "ProviderSelection.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$7 */
    static final class C431377 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<ProviderSelectionResult, Unit> $onSelect;
        final /* synthetic */ ProviderSelectionScreen $screen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C431377(Function1<? super ProviderSelectionResult, Unit> function1, ProviderSelectionScreen providerSelectionScreen, Continuation<? super C431377> continuation) {
            super(2, continuation);
            this.$onSelect = function1;
            this.$screen = providerSelectionScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C431377(this.$onSelect, this.$screen, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C431377) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$onSelect.invoke(((ProviderSelectionScreen.Result) this.$screen).getResult());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$8", m3645f = "ProviderSelection.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$8 */
    static final class C431388 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProviderSelectionViewData $data;
        final /* synthetic */ ProviderSelectionScreen $screen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C431388(ProviderSelectionScreen providerSelectionScreen, ProviderSelectionViewData providerSelectionViewData, Continuation<? super C431388> continuation) {
            super(2, continuation);
            this.$screen = providerSelectionScreen;
            this.$data = providerSelectionViewData;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C431388(this.$screen, this.$data, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C431388) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.ErrorScreenLoaded(null, AnalyticsExtensions3.toAnalyticsError(((ProviderSelectionScreen.Error) this.$screen).getError(), this.$data.getPaymentContext()), 1, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$14", m3645f = "ProviderSelection.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$14 */
    static final class C4312314 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C4312314(Continuation<? super C4312314> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C4312314(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C4312314) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.CountrySelectionScreenLoaded(null, 1, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$16", m3645f = "ProviderSelection.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$16 */
    static final class C4312516 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProviderSelectionScreen $screen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4312516(ProviderSelectionScreen providerSelectionScreen, Continuation<? super C4312516> continuation) {
            super(2, continuation);
            this.$screen = providerSelectionScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C4312516(this.$screen, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C4312516) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.PrimingScreenLoaded(((ProviderSelectionScreen.Priming) this.$screen).getSelectedProvider().getId(), null, 2, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$19", m3645f = "ProviderSelection.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$19 */
    static final class C4312819 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProviderSelectionScreen $screen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4312819(ProviderSelectionScreen providerSelectionScreen, Continuation<? super C4312819> continuation) {
            super(2, continuation);
            this.$screen = providerSelectionScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C4312819(this.$screen, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C4312819) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            List listEmptyList;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrueLayerAnalytics analytics$payments_ui_release = TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release();
            List<Scheme> schemes = ((ProviderSelectionScreen.SchemeSelection) this.$screen).getSchemeSelection().getSchemes();
            if (schemes == null) {
                listEmptyList = CollectionsKt.emptyList();
            } else {
                List<Scheme> list = schemes;
                listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    listEmptyList.add(((Scheme) it.next()).getId());
                }
            }
            analytics$payments_ui_release.track(new AnalyticsEvents.SchemeSelectionLoaded(listEmptyList, null, 2, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ProviderSelection.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$21", m3645f = "ProviderSelection.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.truelayer.payments.ui.screens.providerselection.ProviderSelectionKt$ProviderSelection$21 */
    static final class C4313121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProviderSelectionScreen $screen;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4313121(ProviderSelectionScreen providerSelectionScreen, Continuation<? super C4313121> continuation) {
            super(2, continuation);
            this.$screen = providerSelectionScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C4313121(this.$screen, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C4313121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TrueLayerUI.INSTANCE.getAnalytics$payments_ui_release().track(new AnalyticsEvents.PaymentConfirmationLoaded(((ProviderSelectionScreen.Confirmation) this.$screen).getConfirmationViewData().getProviderId(), ((ProviderSelectionScreen.Confirmation) this.$screen).getConfirmationViewData().getPaymentUseCase() == ConfirmationViewData.PaymentUseCase.SignUpPlus, null, 4, null));
            return Unit.INSTANCE;
        }
    }

    private static final ProviderSelectionScreen ProviderSelection$lambda$0(SnapshotState4<? extends ProviderSelectionScreen> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean ProviderSelection$lambda$1(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    private static final SaveAccountDetailsDialogViewData ProviderSelection$lambda$2(SnapshotState4<SaveAccountDetailsDialogViewData> snapshotState4) {
        return snapshotState4.getValue();
    }
}
