package com.robinhood.android.feature.account.onboarding.accounttype;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
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
import bonfire.proto.idl.accounts.p028v1.AccountEligibilityWarningDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.contracts.onboarding.AccountTypeSelectionCallbacks;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.feature.account.onboarding.AccountOnboardingComponents;
import com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposable;
import com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionEvent;
import com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionFragment;
import com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionRow;
import com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionViewState;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButton2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponentIdl;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.squareup.wire.AnyMessage;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.Alert;
import rh_server_driven_ui.p531v1.AlertAction;
import rh_server_driven_ui.p531v1.AlertDto;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.DeepLinkAction;
import rh_server_driven_ui.p531v1.GenericAction;
import rh_server_driven_ui.p531v1.GenericActionDto;
import rh_server_driven_ui.p531v1.PogWithPictogramDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: AccountTypeSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001aQ\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0014\u001a;\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0017\u001a\u0015\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002²\u0006\u0012\u0010\"\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#X\u008a\u0084\u0002²\u0006\f\u0010%\u001a\u0004\u0018\u00010&X\u008a\u008e\u0002"}, m3636d2 = {"AccountTypeSelectionComposable", "", "callbacks", "Lcom/robinhood/android/account/contracts/onboarding/AccountTypeSelectionCallbacks;", "onCloseClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDuxo;", "(Lcom/robinhood/android/account/contracts/onboarding/AccountTypeSelectionCallbacks;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionDuxo;Landroidx/compose/runtime/Composer;II)V", "AccountTypeSelectionList", "title", "", "subtitle", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow;", "onVerifyAccountEligibility", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/account/contracts/onboarding/AccountTypeSelectionCallbacks;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AccountTypeRow", WebsocketGatewayConstants.DATA_KEY, "(Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow;Lcom/robinhood/android/account/contracts/onboarding/AccountTypeSelectionCallbacks;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AccountEligibilityWarning", "accountEligibilityWarning", "Lbonfire/proto/idl/accounts/v1/AccountEligibilityWarningDto;", "(Lbonfire/proto/idl/accounts/v1/AccountEligibilityWarningDto;Landroidx/compose/runtime/Composer;I)V", "AccountEligibilityWarningPreview", "(Landroidx/compose/runtime/Composer;I)V", "Preview", "feature-account-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionEvent;", "alert", "Lrh_server_driven_ui/v1/AlertDto;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class AccountTypeSelectionComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountEligibilityWarning$lambda$23(AccountEligibilityWarningDto accountEligibilityWarningDto, int i, Composer composer, int i2) {
        AccountEligibilityWarning(accountEligibilityWarningDto, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountEligibilityWarningPreview$lambda$24(int i, Composer composer, int i2) {
        AccountEligibilityWarningPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTypeRow$lambda$16(AccountTypeSelectionRow accountTypeSelectionRow, AccountTypeSelectionCallbacks accountTypeSelectionCallbacks, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountTypeRow(accountTypeSelectionRow, accountTypeSelectionCallbacks, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTypeSelectionComposable$lambda$7(AccountTypeSelectionCallbacks accountTypeSelectionCallbacks, Function0 function0, Modifier modifier, AccountTypeSelectionDuxo accountTypeSelectionDuxo, int i, int i2, Composer composer, int i3) {
        AccountTypeSelectionComposable(accountTypeSelectionCallbacks, function0, modifier, accountTypeSelectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTypeSelectionList$lambda$11(String str, String str2, ImmutableList immutableList, AccountTypeSelectionCallbacks accountTypeSelectionCallbacks, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountTypeSelectionList(str, str2, immutableList, accountTypeSelectionCallbacks, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$25(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountTypeSelectionComposable(final AccountTypeSelectionCallbacks callbacks, final Function0<Unit> onCloseClick, Modifier modifier, AccountTypeSelectionDuxo accountTypeSelectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final AccountTypeSelectionDuxo accountTypeSelectionDuxo2;
        Modifier modifier3;
        final Context context;
        final Navigator navigator;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        final Event<AccountTypeSelectionEvent> eventAccountTypeSelectionComposable$lambda$1;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final AccountTypeSelectionDuxo accountTypeSelectionDuxo3;
        final Modifier modifier4;
        EventConsumer<AccountTypeSelectionEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1873371588);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(callbacks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    accountTypeSelectionDuxo2 = accountTypeSelectionDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(accountTypeSelectionDuxo2) ? 2048 : 1024;
                    i3 |= i5;
                } else {
                    accountTypeSelectionDuxo2 = accountTypeSelectionDuxo;
                }
                i3 |= i5;
            } else {
                accountTypeSelectionDuxo2 = accountTypeSelectionDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) != 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AccountTypeSelectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i3 &= -7169;
                        accountTypeSelectionDuxo2 = (AccountTypeSelectionDuxo) baseDuxo;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1873371588, i3, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposable (AccountTypeSelectionComposable.kt:73)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(accountTypeSelectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(accountTypeSelectionDuxo2.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                eventAccountTypeSelectionComposable$lambda$1 = AccountTypeSelectionComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventAccountTypeSelectionComposable$lambda$1 != null) {
                    if ((eventAccountTypeSelectionComposable$lambda$1.getData() instanceof AccountTypeSelectionEvent.BrokerageAccountTypeSelected) && (eventConsumerInvoke = eventAccountTypeSelectionComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventAccountTypeSelectionComposable$lambda$1, new Function1() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m14441invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m14441invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                callbacks.onBrokerageAccountTypeSelected(((AccountTypeSelectionEvent.BrokerageAccountTypeSelected) eventAccountTypeSelectionComposable$lambda$1.getData()).getBrokerageAccountType());
                            }
                        });
                    }
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(accountTypeSelectionDuxo2) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new SduiActionHandler() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionComposable$actionHandler$1$1
                        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                        public final boolean mo15941handle(GenericAction action) {
                            Intrinsics.checkNotNullParameter(action, "action");
                            if (action.getDismiss() != null) {
                                accountTypeSelectionDuxo2.dismissWarning();
                                return true;
                            }
                            if (action.getDeeplink() != null) {
                                Navigator navigator2 = navigator;
                                Context context2 = context;
                                DeepLinkAction deeplink = action.getDeeplink();
                                if (deeplink != null) {
                                    return Navigator.DefaultImpls.handleDeepLink$default(navigator2, context2, Uri.parse(deeplink.getUrl()), null, null, false, null, 60, null);
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            if (action.getAlert() == null) {
                                return false;
                            }
                            SnapshotState<AlertDto> snapshotState2 = snapshotState;
                            AlertDto.Companion companion2 = AlertDto.INSTANCE;
                            AlertAction alert = action.getAlert();
                            Alert alert2 = alert != null ? alert.getAlert() : null;
                            if (alert2 != null) {
                                AccountTypeSelectionComposable.AccountTypeSelectionComposable$lambda$4(snapshotState2, companion2.fromProto(alert2));
                                return true;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                final Modifier modifier5 = modifier3;
                accountTypeSelectionDuxo3 = accountTypeSelectionDuxo2;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ACCOUNT_TYPE_SELECTION, null, null, null, 14, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, ((AccountTypeSelectionFragment.Args) AccountTypeSelectionDuxo.INSTANCE.getArgs((HasSavedState) accountTypeSelectionDuxo2)).getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(292453607, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt.AccountTypeSelectionComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(292453607, i6, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposable.<anonymous> (AccountTypeSelectionComposable.kt:119)");
                        }
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier5, null, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i7).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                        final Function0<Unit> function0 = onCloseClick;
                        final SnapshotState4<AccountTypeSelectionViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, ComposableLambda3.rememberComposableLambda(-604224605, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt.AccountTypeSelectionComposable.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-604224605, i8, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposable.<anonymous>.<anonymous> (AccountTypeSelectionComposable.kt:124)");
                                }
                                Function2<Composer, Integer, Unit> lambda$1250395542$feature_account_onboarding_externalDebug = AccountTypeSelectionComposable5.INSTANCE.getLambda$1250395542$feature_account_onboarding_externalDebug();
                                final Function0<Unit> function02 = function0;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1235342910, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt.AccountTypeSelectionComposable.2.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                        invoke(bentoAppBarScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i9) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i9 & 6) == 0) {
                                            i9 |= (i9 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1235342910, i9, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposable.<anonymous>.<anonymous>.<anonymous> (AccountTypeSelectionComposable.kt:127)");
                                        }
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function02, composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                final SnapshotState4<AccountTypeSelectionViewState> snapshotState42 = snapshotState4;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1250395542$feature_account_onboarding_externalDebug, null, composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(876122481, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt.AccountTypeSelectionComposable.2.1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                        invoke(boxScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BoxScope BentoAppBar, Composer composer4, int i9) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i9 & 17) == 16 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(876122481, i9, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposable.<anonymous>.<anonymous>.<anonymous> (AccountTypeSelectionComposable.kt:132)");
                                        }
                                        AccountTypeSelectionViewState accountTypeSelectionViewStateAccountTypeSelectionComposable$lambda$0 = AccountTypeSelectionComposable.AccountTypeSelectionComposable$lambda$0(snapshotState42);
                                        AccountTypeSelectionViewState.Loaded loaded = accountTypeSelectionViewStateAccountTypeSelectionComposable$lambda$0 instanceof AccountTypeSelectionViewState.Loaded ? (AccountTypeSelectionViewState.Loaded) accountTypeSelectionViewStateAccountTypeSelectionComposable$lambda$0 : null;
                                        if (loaded != null && loaded.isVerifyingAccountEligibility()) {
                                            BentoProgressBar2.m20697BentoIndeterminateProgressBareaDK9VM(SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null), false, BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21425getFg0d7_KjU(), Color.INSTANCE.m6725getTransparent0d7_KjU(), composer4, 3078, 2);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), false, false, null, null, 0L, null, composer3, 24966, 0, 2026);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(1428679288, true, new AnonymousClass2(accountTypeSelectionDuxo3, callbacks, snapshotState4CollectAsStateWithLifecycle, sduiActionHandler, snapshotState), composer2, 54), composer2, 805306416, 316);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: AccountTypeSelectionComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionComposable$2$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ SduiActionHandler<GenericAction> $actionHandler;
                        final /* synthetic */ SnapshotState<AlertDto> $alert$delegate;
                        final /* synthetic */ AccountTypeSelectionCallbacks $callbacks;
                        final /* synthetic */ AccountTypeSelectionDuxo $duxo;
                        final /* synthetic */ SnapshotState4<AccountTypeSelectionViewState> $viewState$delegate;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass2(AccountTypeSelectionDuxo accountTypeSelectionDuxo, AccountTypeSelectionCallbacks accountTypeSelectionCallbacks, SnapshotState4<? extends AccountTypeSelectionViewState> snapshotState4, SduiActionHandler<? super GenericAction> sduiActionHandler, SnapshotState<AlertDto> snapshotState) {
                            this.$duxo = accountTypeSelectionDuxo;
                            this.$callbacks = accountTypeSelectionCallbacks;
                            this.$viewState$delegate = snapshotState4;
                            this.$actionHandler = sduiActionHandler;
                            this.$alert$delegate = snapshotState;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i & 6) == 0) {
                                i2 = (composer.changed(paddingValues) ? 4 : 2) | i;
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1428679288, i2, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposable.<anonymous>.<anonymous> (AccountTypeSelectionComposable.kt:147)");
                            }
                            AccountTypeSelectionViewState accountTypeSelectionViewStateAccountTypeSelectionComposable$lambda$0 = AccountTypeSelectionComposable.AccountTypeSelectionComposable$lambda$0(this.$viewState$delegate);
                            if (accountTypeSelectionViewStateAccountTypeSelectionComposable$lambda$0 instanceof AccountTypeSelectionViewState.Loaded) {
                                composer.startReplaceGroup(-1341065352);
                                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                AccountTypeSelectionViewState.Loaded loaded = (AccountTypeSelectionViewState.Loaded) accountTypeSelectionViewStateAccountTypeSelectionComposable$lambda$0;
                                String title = loaded.getTitle();
                                String subtitle = loaded.getSubtitle();
                                ImmutableList<AccountTypeSelectionRow> rows = loaded.getRows();
                                AccountTypeSelectionDuxo accountTypeSelectionDuxo = this.$duxo;
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(accountTypeSelectionDuxo);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new AccountTypeSelectionComposable2(accountTypeSelectionDuxo);
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                AccountTypeSelectionComposable.AccountTypeSelectionList(title, subtitle, rows, this.$callbacks, (Function1) ((KFunction) objRememberedValue), modifierPadding, composer, 0, 0);
                                final AccountEligibilityWarningDto accountEligibilityWarning = loaded.getAccountEligibilityWarning();
                                composer.startReplaceGroup(-1428718592);
                                if (accountEligibilityWarning != null) {
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                                    final AccountTypeSelectionDuxo accountTypeSelectionDuxo2 = this.$duxo;
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionComposable$2$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return AccountTypeSelectionComposable.C166402.AnonymousClass2.invoke$lambda$2$lambda$1(accountTypeSelectionDuxo2);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer.endReplaceGroup();
                                    final SduiActionHandler<GenericAction> sduiActionHandler = this.$actionHandler;
                                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue2, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(1473882660, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt.AccountTypeSelectionComposable.2.2.3
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                                            invoke(rhModalBottomSheet5, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i3) {
                                            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                            if ((i3 & 17) == 16 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1473882660, i3, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposable.<anonymous>.<anonymous>.<anonymous> (AccountTypeSelectionComposable.kt:165)");
                                            }
                                            SduiActionHandler<GenericAction> sduiActionHandler2 = sduiActionHandler;
                                            final AccountEligibilityWarningDto accountEligibilityWarningDto = accountEligibilityWarning;
                                            SduiActionHandler3.ProvideActionHandler(sduiActionHandler2, ComposableLambda3.rememberComposableLambda(-102728891, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt.AccountTypeSelectionComposable.2.2.3.1
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                    invoke(composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer3, int i4) {
                                                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                                        composer3.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-102728891, i4, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountTypeSelectionComposable.kt:168)");
                                                    }
                                                    AccountTypeSelectionComposable.AccountEligibilityWarning(accountEligibilityWarningDto, composer3, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer2, 54), composer2, 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer, 54), composer, 1572864, 62);
                                }
                                composer.endReplaceGroup();
                                AlertDto alertDtoAccountTypeSelectionComposable$lambda$3 = AccountTypeSelectionComposable.AccountTypeSelectionComposable$lambda$3(this.$alert$delegate);
                                if (alertDtoAccountTypeSelectionComposable$lambda$3 != null) {
                                    SduiActionHandler<GenericAction> sduiActionHandler2 = this.$actionHandler;
                                    final SnapshotState<AlertDto> snapshotState = this.$alert$delegate;
                                    SduiAlert sduiAlert = SduiAlert.INSTANCE;
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    Composer.Companion companion = Composer.INSTANCE;
                                    if (objRememberedValue3 == companion.getEmpty()) {
                                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionComposable$2$2$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return AccountTypeSelectionComposable.C166402.AnonymousClass2.invoke$lambda$7$lambda$4$lambda$3((ActionDto) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function1 function1 = (Function1) objRememberedValue3;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(5004770);
                                    Object objRememberedValue4 = composer.rememberedValue();
                                    if (objRememberedValue4 == companion.getEmpty()) {
                                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionComposable$2$2$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return AccountTypeSelectionComposable.C166402.AnonymousClass2.invoke$lambda$7$lambda$6$lambda$5(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue4);
                                    }
                                    composer.endReplaceGroup();
                                    sduiAlert.Dialog(alertDtoAccountTypeSelectionComposable$lambda$3, function1, sduiActionHandler2, (Function1<? super String, Unit>) null, (Function0<Unit>) objRememberedValue4, composer, (SduiAlert.$stable << 15) | 24624, 8);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer.endReplaceGroup();
                            } else {
                                if (!Intrinsics.areEqual(accountTypeSelectionViewStateAccountTypeSelectionComposable$lambda$0, AccountTypeSelectionViewState.Loading.INSTANCE)) {
                                    composer.startReplaceGroup(-1428735999);
                                    composer.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer.startReplaceGroup(-1339476106);
                                AccountOnboardingComponents.PlaceholderAccountOnboardingSelectionScreen(3, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer, 6, 0);
                                composer.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1(AccountTypeSelectionDuxo accountTypeSelectionDuxo) {
                            accountTypeSelectionDuxo.dismissWarning();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final GenericAction invoke$lambda$7$lambda$4$lambda$3(ActionDto actionDto) {
                            AnyMessage concrete;
                            if (actionDto == null || (concrete = actionDto.getConcrete()) == null) {
                                return null;
                            }
                            return (GenericAction) concrete.unpack(GenericActionDto.INSTANCE.getProtoAdapter());
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$7$lambda$6$lambda$5(SnapshotState snapshotState) {
                            AccountTypeSelectionComposable.AccountTypeSelectionComposable$lambda$4(snapshotState, null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                accountTypeSelectionDuxo3 = accountTypeSelectionDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountTypeSelectionComposable.AccountTypeSelectionComposable$lambda$7(callbacks, onCloseClick, modifier4, accountTypeSelectionDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if ((i2 & 8) != 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final SnapshotState4<? extends AccountTypeSelectionViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(accountTypeSelectionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(accountTypeSelectionDuxo2.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                eventAccountTypeSelectionComposable$lambda$1 = AccountTypeSelectionComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventAccountTypeSelectionComposable$lambda$1 != null) {
                }
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(accountTypeSelectionDuxo2) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue2 = new SduiActionHandler() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionComposable$actionHandler$1$1
                        @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                        /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                        public final boolean mo15941handle(GenericAction action) {
                            Intrinsics.checkNotNullParameter(action, "action");
                            if (action.getDismiss() != null) {
                                accountTypeSelectionDuxo2.dismissWarning();
                                return true;
                            }
                            if (action.getDeeplink() != null) {
                                Navigator navigator2 = navigator;
                                Context context2 = context;
                                DeepLinkAction deeplink = action.getDeeplink();
                                if (deeplink != null) {
                                    return Navigator.DefaultImpls.handleDeepLink$default(navigator2, context2, Uri.parse(deeplink.getUrl()), null, null, false, null, 60, null);
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            if (action.getAlert() == null) {
                                return false;
                            }
                            SnapshotState<AlertDto> snapshotState2 = snapshotState;
                            AlertDto.Companion companion2 = AlertDto.INSTANCE;
                            AlertAction alert = action.getAlert();
                            Alert alert2 = alert != null ? alert.getAlert() : null;
                            if (alert2 != null) {
                                AccountTypeSelectionComposable.AccountTypeSelectionComposable$lambda$4(snapshotState2, companion2.fromProto(alert2));
                                return true;
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    final SduiActionHandler<? super GenericAction> sduiActionHandler2 = (SduiActionHandler) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    final Modifier modifier52 = modifier3;
                    accountTypeSelectionDuxo3 = accountTypeSelectionDuxo2;
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.ACCOUNT_TYPE_SELECTION, null, null, null, 14, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, ((AccountTypeSelectionFragment.Args) AccountTypeSelectionDuxo.INSTANCE.getArgs((HasSavedState) accountTypeSelectionDuxo2)).getSource(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(292453607, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt.AccountTypeSelectionComposable.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i6) {
                            if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(292453607, i6, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposable.<anonymous> (AccountTypeSelectionComposable.kt:119)");
                            }
                            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier52, null, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i7).m21371getBg0d7_KjU();
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU();
                            final Function0<Unit> function0 = onCloseClick;
                            final SnapshotState4<? extends AccountTypeSelectionViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierLogScreenTransitions$default, ComposableLambda3.rememberComposableLambda(-604224605, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt.AccountTypeSelectionComposable.2.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i8) {
                                    if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-604224605, i8, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposable.<anonymous>.<anonymous> (AccountTypeSelectionComposable.kt:124)");
                                    }
                                    Function2<Composer, Integer, Unit> lambda$1250395542$feature_account_onboarding_externalDebug = AccountTypeSelectionComposable5.INSTANCE.getLambda$1250395542$feature_account_onboarding_externalDebug();
                                    final Function0<Unit> function02 = function0;
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1235342910, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt.AccountTypeSelectionComposable.2.1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                            invoke(bentoAppBarScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i9) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i9 & 6) == 0) {
                                                i9 |= (i9 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                            }
                                            if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1235342910, i9, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposable.<anonymous>.<anonymous>.<anonymous> (AccountTypeSelectionComposable.kt:127)");
                                            }
                                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function02, composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54);
                                    final SnapshotState4<? extends AccountTypeSelectionViewState> snapshotState42 = snapshotState4;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1250395542$feature_account_onboarding_externalDebug, null, composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(876122481, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt.AccountTypeSelectionComposable.2.1.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer4, Integer num) {
                                            invoke(boxScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BoxScope BentoAppBar, Composer composer4, int i9) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i9 & 17) == 16 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(876122481, i9, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposable.<anonymous>.<anonymous>.<anonymous> (AccountTypeSelectionComposable.kt:132)");
                                            }
                                            AccountTypeSelectionViewState accountTypeSelectionViewStateAccountTypeSelectionComposable$lambda$0 = AccountTypeSelectionComposable.AccountTypeSelectionComposable$lambda$0(snapshotState42);
                                            AccountTypeSelectionViewState.Loaded loaded = accountTypeSelectionViewStateAccountTypeSelectionComposable$lambda$0 instanceof AccountTypeSelectionViewState.Loaded ? (AccountTypeSelectionViewState.Loaded) accountTypeSelectionViewStateAccountTypeSelectionComposable$lambda$0 : null;
                                            if (loaded != null && loaded.isVerifyingAccountEligibility()) {
                                                BentoProgressBar2.m20697BentoIndeterminateProgressBareaDK9VM(SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null), false, BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21425getFg0d7_KjU(), Color.INSTANCE.m6725getTransparent0d7_KjU(), composer4, 3078, 2);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), false, false, null, null, 0L, null, composer3, 24966, 0, 2026);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(1428679288, true, new AnonymousClass2(accountTypeSelectionDuxo3, callbacks, snapshotState4CollectAsStateWithLifecycle3, sduiActionHandler2, snapshotState), composer2, 54), composer2, 805306416, 316);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: AccountTypeSelectionComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionComposable$2$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ SduiActionHandler<GenericAction> $actionHandler;
                            final /* synthetic */ SnapshotState<AlertDto> $alert$delegate;
                            final /* synthetic */ AccountTypeSelectionCallbacks $callbacks;
                            final /* synthetic */ AccountTypeSelectionDuxo $duxo;
                            final /* synthetic */ SnapshotState4<AccountTypeSelectionViewState> $viewState$delegate;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass2(AccountTypeSelectionDuxo accountTypeSelectionDuxo, AccountTypeSelectionCallbacks accountTypeSelectionCallbacks, SnapshotState4<? extends AccountTypeSelectionViewState> snapshotState4, SduiActionHandler<? super GenericAction> sduiActionHandler, SnapshotState<AlertDto> snapshotState) {
                                this.$duxo = accountTypeSelectionDuxo;
                                this.$callbacks = accountTypeSelectionCallbacks;
                                this.$viewState$delegate = snapshotState4;
                                this.$actionHandler = sduiActionHandler;
                                this.$alert$delegate = snapshotState;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                invoke(paddingValues, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                int i2;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i & 6) == 0) {
                                    i2 = (composer.changed(paddingValues) ? 4 : 2) | i;
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1428679288, i2, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposable.<anonymous>.<anonymous> (AccountTypeSelectionComposable.kt:147)");
                                }
                                AccountTypeSelectionViewState accountTypeSelectionViewStateAccountTypeSelectionComposable$lambda$0 = AccountTypeSelectionComposable.AccountTypeSelectionComposable$lambda$0(this.$viewState$delegate);
                                if (accountTypeSelectionViewStateAccountTypeSelectionComposable$lambda$0 instanceof AccountTypeSelectionViewState.Loaded) {
                                    composer.startReplaceGroup(-1341065352);
                                    Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                                    AccountTypeSelectionViewState.Loaded loaded = (AccountTypeSelectionViewState.Loaded) accountTypeSelectionViewStateAccountTypeSelectionComposable$lambda$0;
                                    String title = loaded.getTitle();
                                    String subtitle = loaded.getSubtitle();
                                    ImmutableList<AccountTypeSelectionRow> rows = loaded.getRows();
                                    AccountTypeSelectionDuxo accountTypeSelectionDuxo = this.$duxo;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(accountTypeSelectionDuxo);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new AccountTypeSelectionComposable2(accountTypeSelectionDuxo);
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    AccountTypeSelectionComposable.AccountTypeSelectionList(title, subtitle, rows, this.$callbacks, (Function1) ((KFunction) objRememberedValue), modifierPadding, composer, 0, 0);
                                    final AccountEligibilityWarningDto accountEligibilityWarning = loaded.getAccountEligibilityWarning();
                                    composer.startReplaceGroup(-1428718592);
                                    if (accountEligibilityWarning != null) {
                                        composer.startReplaceGroup(5004770);
                                        boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
                                        final AccountTypeSelectionDuxo accountTypeSelectionDuxo2 = this.$duxo;
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionComposable$2$2$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return AccountTypeSelectionComposable.C166402.AnonymousClass2.invoke$lambda$2$lambda$1(accountTypeSelectionDuxo2);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue2);
                                        }
                                        composer.endReplaceGroup();
                                        final SduiActionHandler<? super GenericAction> sduiActionHandler = this.$actionHandler;
                                        RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue2, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(1473882660, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt.AccountTypeSelectionComposable.2.2.3
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                                                invoke(rhModalBottomSheet5, composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i3) {
                                                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                                if ((i3 & 17) == 16 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1473882660, i3, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposable.<anonymous>.<anonymous>.<anonymous> (AccountTypeSelectionComposable.kt:165)");
                                                }
                                                SduiActionHandler<GenericAction> sduiActionHandler2 = sduiActionHandler;
                                                final AccountEligibilityWarningDto accountEligibilityWarningDto = accountEligibilityWarning;
                                                SduiActionHandler3.ProvideActionHandler(sduiActionHandler2, ComposableLambda3.rememberComposableLambda(-102728891, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt.AccountTypeSelectionComposable.2.2.3.1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                        invoke(composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer3, int i4) {
                                                        if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-102728891, i4, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountTypeSelectionComposable.kt:168)");
                                                        }
                                                        AccountTypeSelectionComposable.AccountEligibilityWarning(accountEligibilityWarningDto, composer3, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer2, 54), composer2, 48);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer, 54), composer, 1572864, 62);
                                    }
                                    composer.endReplaceGroup();
                                    AlertDto alertDtoAccountTypeSelectionComposable$lambda$3 = AccountTypeSelectionComposable.AccountTypeSelectionComposable$lambda$3(this.$alert$delegate);
                                    if (alertDtoAccountTypeSelectionComposable$lambda$3 != null) {
                                        SduiActionHandler<GenericAction> sduiActionHandler2 = this.$actionHandler;
                                        final SnapshotState snapshotState = this.$alert$delegate;
                                        SduiAlert sduiAlert = SduiAlert.INSTANCE;
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue3 = composer.rememberedValue();
                                        Composer.Companion companion = Composer.INSTANCE;
                                        if (objRememberedValue3 == companion.getEmpty()) {
                                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionComposable$2$2$$ExternalSyntheticLambda1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return AccountTypeSelectionComposable.C166402.AnonymousClass2.invoke$lambda$7$lambda$4$lambda$3((ActionDto) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue3);
                                        }
                                        Function1 function1 = (Function1) objRememberedValue3;
                                        composer.endReplaceGroup();
                                        composer.startReplaceGroup(5004770);
                                        Object objRememberedValue4 = composer.rememberedValue();
                                        if (objRememberedValue4 == companion.getEmpty()) {
                                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionComposable$2$2$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return AccountTypeSelectionComposable.C166402.AnonymousClass2.invoke$lambda$7$lambda$6$lambda$5(snapshotState);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue4);
                                        }
                                        composer.endReplaceGroup();
                                        sduiAlert.Dialog(alertDtoAccountTypeSelectionComposable$lambda$3, function1, sduiActionHandler2, (Function1<? super String, Unit>) null, (Function0<Unit>) objRememberedValue4, composer, (SduiAlert.$stable << 15) | 24624, 8);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer.endReplaceGroup();
                                } else {
                                    if (!Intrinsics.areEqual(accountTypeSelectionViewStateAccountTypeSelectionComposable$lambda$0, AccountTypeSelectionViewState.Loading.INSTANCE)) {
                                        composer.startReplaceGroup(-1428735999);
                                        composer.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    composer.startReplaceGroup(-1339476106);
                                    AccountOnboardingComponents.PlaceholderAccountOnboardingSelectionScreen(3, PaddingKt.padding(Modifier.INSTANCE, paddingValues), composer, 6, 0);
                                    composer.endReplaceGroup();
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1(AccountTypeSelectionDuxo accountTypeSelectionDuxo) {
                                accountTypeSelectionDuxo.dismissWarning();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final GenericAction invoke$lambda$7$lambda$4$lambda$3(ActionDto actionDto) {
                                AnyMessage concrete;
                                if (actionDto == null || (concrete = actionDto.getConcrete()) == null) {
                                    return null;
                                }
                                return (GenericAction) concrete.unpack(GenericActionDto.INSTANCE.getProtoAdapter());
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$7$lambda$6$lambda$5(SnapshotState snapshotState) {
                                AccountTypeSelectionComposable.AccountTypeSelectionComposable$lambda$4(snapshotState, null);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountTypeSelectionViewState AccountTypeSelectionComposable$lambda$0(SnapshotState4<? extends AccountTypeSelectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<AccountTypeSelectionEvent> AccountTypeSelectionComposable$lambda$1(SnapshotState4<Event<AccountTypeSelectionEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDto AccountTypeSelectionComposable$lambda$3(SnapshotState<AlertDto> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountTypeSelectionComposable$lambda$4(SnapshotState<AlertDto> snapshotState, AlertDto alertDto) {
        snapshotState.setValue(alertDto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountTypeSelectionList(final String str, final String str2, final ImmutableList<AccountTypeSelectionRow> immutableList, final AccountTypeSelectionCallbacks accountTypeSelectionCallbacks, final Function1<? super AccountTypeSelectionRow, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        final String str3;
        int i3;
        String str4;
        Function1<? super AccountTypeSelectionRow, Unit> function12;
        int i4;
        Modifier modifier2;
        int i5;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1642529457);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str3 = str;
        } else if ((i & 6) == 0) {
            str3 = str;
            i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str4 = str2;
                i3 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(accountTypeSelectionCallbacks) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
                }
                i4 = i2 & 32;
                if (i4 == 0) {
                    if ((196608 & i) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                    i5 = i3;
                    if ((74899 & i5) != 74898 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                    } else {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1642529457, i5, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionList (AccountTypeSelectionComposable.kt:206)");
                        }
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance = ((i5 & 14) != 4) | ((i5 & 112) != 32) | ((i5 & 896) != 256 || ((i5 & 512) != 0 && composerStartRestartGroup.changedInstance(immutableList))) | composerStartRestartGroup.changedInstance(accountTypeSelectionCallbacks) | ((57344 & i5) == 16384);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final String str5 = str4;
                            final Function1<? super AccountTypeSelectionRow, Unit> function13 = function12;
                            Function1 function14 = new Function1() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AccountTypeSelectionComposable.AccountTypeSelectionList$lambda$10$lambda$9(immutableList, str3, str5, accountTypeSelectionCallbacks, function13, (LazyListScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function14);
                            objRememberedValue = function14;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier4 = modifier2;
                        composer2 = composerStartRestartGroup;
                        LazyDslKt.LazyColumn(modifier4, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, (i5 >> 15) & 14, 510);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AccountTypeSelectionComposable.AccountTypeSelectionList$lambda$11(str, str2, immutableList, accountTypeSelectionCallbacks, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                modifier2 = modifier;
                i5 = i3;
                if ((74899 & i5) != 74898) {
                    if (i4 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    if ((i5 & 896) != 256) {
                        zChangedInstance = ((i5 & 14) != 4) | ((i5 & 112) != 32) | ((i5 & 896) != 256 || ((i5 & 512) != 0 && composerStartRestartGroup.changedInstance(immutableList))) | composerStartRestartGroup.changedInstance(accountTypeSelectionCallbacks) | ((57344 & i5) == 16384);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            final String str52 = str4;
                            final Function1 function132 = function12;
                            Function1 function142 = new Function1() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AccountTypeSelectionComposable.AccountTypeSelectionList$lambda$10$lambda$9(immutableList, str3, str52, accountTypeSelectionCallbacks, function132, (LazyListScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function142);
                            objRememberedValue = function142;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier42 = modifier2;
                            composer2 = composerStartRestartGroup;
                            LazyDslKt.LazyColumn(modifier42, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, (i5 >> 15) & 14, 510);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function12 = function1;
            i4 = i2 & 32;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            i5 = i3;
            if ((74899 & i5) != 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str4 = str2;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        function12 = function1;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((74899 & i5) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountTypeSelectionList$lambda$10$lambda$9(final ImmutableList immutableList, final String str, final String str2, final AccountTypeSelectionCallbacks accountTypeSelectionCallbacks, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(226633242, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionList$1$1$1
            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(226633242, i, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionList.<anonymous>.<anonymous>.<anonymous> (AccountTypeSelectionComposable.kt:211)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), composer, 6, 0);
                String str3 = str;
                String str4 = str2;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21622defaultHorizontalPaddingWMci_g0);
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
                BentoText2.m20747BentoText38GnDrw(str3, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8190);
                composer.startReplaceGroup(23301069);
                if (str4.length() > 0) {
                    BentoText2.m20747BentoText38GnDrw(str4, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8190);
                }
                composer.endReplaceGroup();
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }
        }), 3, null);
        final C16636x72bb4cf5 c16636x72bb4cf5 = new Function1() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionList$lambda$10$lambda$9$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(AccountTypeSelectionRow accountTypeSelectionRow) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((AccountTypeSelectionRow) obj);
            }
        };
        LazyColumn.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionList$lambda$10$lambda$9$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c16636x72bb4cf5.invoke(immutableList.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$AccountTypeSelectionList$lambda$10$lambda$9$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                AccountTypeSelectionRow accountTypeSelectionRow = (AccountTypeSelectionRow) immutableList.get(i);
                composer.startReplaceGroup(2096171819);
                AccountTypeSelectionComposable.AccountTypeRow(accountTypeSelectionRow, accountTypeSelectionCallbacks, function1, null, composer, 0, 8);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountTypeRow(final AccountTypeSelectionRow accountTypeSelectionRow, final AccountTypeSelectionCallbacks accountTypeSelectionCallbacks, final Function1<? super AccountTypeSelectionRow, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long jM21427getFg30d7_KjU;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1730050324);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(accountTypeSelectionRow) : composerStartRestartGroup.changedInstance(accountTypeSelectionRow) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(accountTypeSelectionCallbacks) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1730050324, i3, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeRow (AccountTypeSelectionComposable.kt:246)");
                }
                if (!accountTypeSelectionRow.getEnabled()) {
                    composerStartRestartGroup.startReplaceGroup(321917258);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(321958953);
                    jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                boolean enabled = accountTypeSelectionRow.getEnabled();
                String identifier = accountTypeSelectionRow.getIdentifier();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = ((i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(accountTypeSelectionRow))) | ((i3 & 896) == 256) | composerStartRestartGroup.changedInstance(accountTypeSelectionCallbacks);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountTypeSelectionComposable.AccountTypeRow$lambda$13$lambda$12(accountTypeSelectionRow, function1, accountTypeSelectionCallbacks);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierClickableSelectionCard$default = AccountOnboardingComponents.clickableSelectionCard$default(modifier4, enabled, false, identifier, (Function0) objRememberedValue, 2, null);
                modifier3 = modifier4;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical center = arrangement.getCenter();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(center, companion.getCenterVertically(), composerStartRestartGroup, 54);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClickableSelectionCard$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                long j = jM21427getFg30d7_KjU;
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(accountTypeSelectionRow.getIconAsset()), null, j, companion3, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 3120, 48);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierWeight$default = Row5.weight$default(row6, PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(accountTypeSelectionRow.getTitle(), companion3, Color.m6701boximpl(j), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composer2, 24624, 0, 8168);
                BentoText2.m20747BentoText38GnDrw(accountTypeSelectionRow.getSubtitle(), companion3, Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 48, 0, 8184);
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountTypeSelectionComposable.AccountTypeRow$lambda$16(accountTypeSelectionRow, accountTypeSelectionCallbacks, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!accountTypeSelectionRow.getEnabled()) {
            }
            boolean enabled2 = accountTypeSelectionRow.getEnabled();
            String identifier2 = accountTypeSelectionRow.getIdentifier();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            if ((i3 & 14) != 4) {
                zChangedInstance = ((i3 & 14) != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(accountTypeSelectionRow))) | ((i3 & 896) == 256) | composerStartRestartGroup.changedInstance(accountTypeSelectionCallbacks);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountTypeSelectionComposable.AccountTypeRow$lambda$13$lambda$12(accountTypeSelectionRow, function1, accountTypeSelectionCallbacks);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierClickableSelectionCard$default2 = AccountOnboardingComponents.clickableSelectionCard$default(modifier4, enabled2, false, identifier2, (Function0) objRememberedValue, 2, null);
                    modifier3 = modifier4;
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical center2 = arrangement2.getCenter();
                    Alignment.Companion companion4 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(center2, companion4.getCenterVertically(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClickableSelectionCard$default2);
                    ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        Modifier.Companion companion32 = Modifier.INSTANCE;
                        long j2 = jM21427getFg30d7_KjU;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(accountTypeSelectionRow.getIconAsset()), null, j2, companion32, null, false, composerStartRestartGroup, BentoIcon4.Size24.$stable | 3120, 48);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        Modifier modifierWeight$default2 = Row5.weight$default(row62, PaddingKt.m5144paddingVpY3zN4$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), 1.0f, false, 2, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                        Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            composer2 = composerStartRestartGroup;
                            BentoText2.m20747BentoText38GnDrw(accountTypeSelectionRow.getTitle(), companion32, Color.m6701boximpl(j2), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), composer2, 24624, 0, 8168);
                            BentoText2.m20747BentoText38GnDrw(accountTypeSelectionRow.getSubtitle(), companion32, Color.m6701boximpl(j2), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i52).getTextS(), composer2, 48, 0, 8184);
                            composer2.endNode();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
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
    public static final Unit AccountTypeRow$lambda$13$lambda$12(AccountTypeSelectionRow accountTypeSelectionRow, Function1 function1, AccountTypeSelectionCallbacks accountTypeSelectionCallbacks) {
        AccountTypeSelectionRow.RowType rowType = accountTypeSelectionRow.getRowType();
        if (rowType instanceof AccountTypeSelectionRow.RowType.Account) {
            function1.invoke(accountTypeSelectionRow);
        } else if (Intrinsics.areEqual(rowType, AccountTypeSelectionRow.RowType.Retirement.INSTANCE)) {
            accountTypeSelectionCallbacks.onRetirementAccountTypeSelected();
        } else {
            if (!Intrinsics.areEqual(rowType, AccountTypeSelectionRow.RowType.Custodial.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            accountTypeSelectionCallbacks.onCustodialAccountTypeSelected();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AccountEligibilityWarning(final AccountEligibilityWarningDto accountEligibilityWarningDto, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1454350562);
        int i2 = (i & 6) == 0 ? i | (composerStartRestartGroup.changedInstance(accountEligibilityWarningDto) ? 4 : 2) : i;
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1454350562, i2, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountEligibilityWarning (AccountTypeSelectionComposable.kt:305)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21622defaultHorizontalPaddingWMci_g0);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            PogWithPictogramDto pog_with_pictogram = accountEligibilityWarningDto.getPog_with_pictogram();
            composerStartRestartGroup.startReplaceGroup(-1255397387);
            if (pog_with_pictogram != null) {
                UIComponentDto.ConcreteDto.PogWithPictogram pogWithPictogram = new UIComponentDto.ConcreteDto.PogWithPictogram(pog_with_pictogram);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountTypeSelectionComposable.AccountEligibilityWarning$lambda$22$lambda$18$lambda$17((ActionDto) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                SduiComponentIdl.SduiComponent(pogWithPictogram, (Function1) objRememberedValue, (Modifier) null, (HorizontalPadding) null, composerStartRestartGroup, 48, 12);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String title = accountEligibilityWarningDto.getTitle();
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium();
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            Composer composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(title, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8124);
            BentoText2.m20747BentoText38GnDrw(accountEligibilityWarningDto.getSubtitle(), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), 5, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i3).getTextM(), composer2, 0, 0, 8124);
            composerStartRestartGroup = composer2;
            composerStartRestartGroup.startReplaceGroup(-1255368786);
            for (ButtonDto buttonDto : accountEligibilityWarningDto.getButtons()) {
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AccountTypeSelectionComposable.m2015x924c6805((ActionDto) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                SduiButton2.SduiButton(buttonDto, (Function1) objRememberedValue2, modifierFillMaxWidth$default2, composerStartRestartGroup, 48, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountTypeSelectionComposable.AccountEligibilityWarning$lambda$23(accountEligibilityWarningDto, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GenericAction AccountEligibilityWarning$lambda$22$lambda$18$lambda$17(ActionDto actionDto) {
        AnyMessage concrete;
        if (actionDto == null || (concrete = actionDto.getConcrete()) == null) {
            return null;
        }
        return (GenericAction) concrete.unpack(GenericActionDto.INSTANCE.getProtoAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AccountEligibilityWarning$lambda$22$lambda$21$lambda$20$lambda$19 */
    public static final GenericAction m2015x924c6805(ActionDto actionDto) {
        Intrinsics.checkNotNullParameter(actionDto, "actionDto");
        AnyMessage concrete = actionDto.getConcrete();
        if (concrete != null) {
            return (GenericAction) concrete.unpack(GenericActionDto.INSTANCE.getProtoAdapter());
        }
        return null;
    }

    private static final void AccountEligibilityWarningPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1942562065);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1942562065, i, -1, "com.robinhood.android.feature.account.onboarding.accounttype.AccountEligibilityWarningPreview (AccountTypeSelectionComposable.kt:352)");
            }
            Boolean bool = Boolean.TRUE;
            BentoTheme2.BentoTheme(bool, null, null, null, null, bool, null, null, AccountTypeSelectionComposable5.INSTANCE.m14443getLambda$1305642919$feature_account_onboarding_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountTypeSelectionComposable.AccountEligibilityWarningPreview$lambda$24(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1806024719);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1806024719, i, -1, "com.robinhood.android.feature.account.onboarding.accounttype.Preview (AccountTypeSelectionComposable.kt:384)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, Boolean.TRUE, null, null, AccountTypeSelectionComposable5.INSTANCE.getLambda$1966345129$feature_account_onboarding_externalDebug(), composerStartRestartGroup, 100859910, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountTypeSelectionComposable.Preview$lambda$25(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
