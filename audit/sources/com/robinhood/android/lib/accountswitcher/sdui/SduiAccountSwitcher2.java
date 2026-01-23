package com.robinhood.android.lib.accountswitcher.sdui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherEvent;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdl;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.squareup.wire.AnyMessage;
import contracts.account_switcher.proto.p427v1.AccountSwitcherAction;
import contracts.account_switcher.proto.p427v1.AccountSwitcherActionDto;
import contracts.account_switcher.proto.p427v1.DeeplinkAction;
import contracts.account_switcher.proto.p427v1.GetAccountSwitcherResponseDto;
import contracts.account_switcher.proto.p427v1.SelectAccountAction;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: SduiAccountSwitcher.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\u0012\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u008a\u0084\u0002"}, m3636d2 = {"SduiAccountSwitcher", "", "surface", "Lcontracts/account_switcher/proto/v1/SurfaceDto;", "callbacks", "Lcom/robinhood/android/lib/accountswitcher/sdui/SduiAccountSwitcherCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/lib/accountswitcher/sdui/SduiAccountSwitcherDuxo;", "(Lcontracts/account_switcher/proto/v1/SurfaceDto;Lcom/robinhood/android/lib/accountswitcher/sdui/SduiAccountSwitcherCallbacks;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/lib/accountswitcher/sdui/SduiAccountSwitcherDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-account-switcher_externalDebug", "viewState", "Lcom/robinhood/android/lib/accountswitcher/sdui/SduiAccountSwitcherViewState;", "events", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/lib/accountswitcher/sdui/SduiAccountSwitcherEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiAccountSwitcher2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAccountSwitcher$lambda$2(SurfaceDto surfaceDto, SduiAccountSwitcher sduiAccountSwitcher, Modifier modifier, SduiAccountSwitcherDuxo sduiAccountSwitcherDuxo, int i, int i2, Composer composer, int i3) {
        SduiAccountSwitcher(surfaceDto, sduiAccountSwitcher, modifier, sduiAccountSwitcherDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAccountSwitcher$lambda$9(SurfaceDto surfaceDto, SduiAccountSwitcher sduiAccountSwitcher, Modifier modifier, SduiAccountSwitcherDuxo sduiAccountSwitcherDuxo, int i, int i2, Composer composer, int i3) {
        SduiAccountSwitcher(surfaceDto, sduiAccountSwitcher, modifier, sduiAccountSwitcherDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SduiAccountSwitcher(final SurfaceDto surface, final SduiAccountSwitcher callbacks, Modifier modifier, SduiAccountSwitcherDuxo sduiAccountSwitcherDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SduiAccountSwitcherDuxo sduiAccountSwitcherDuxo2;
        int i4;
        Modifier modifier3;
        final SduiAccountSwitcherDuxo sduiAccountSwitcherDuxo3;
        GetAccountSwitcherResponseDto accountSwitcherResponseDto;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        List<UIComponentDto> components;
        final List<UIComponentDto> listEmptyList;
        final Modifier modifier4;
        EventConsumer<SduiAccountSwitcherEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1834350219);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(surface) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    sduiAccountSwitcherDuxo2 = sduiAccountSwitcherDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(sduiAccountSwitcherDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    sduiAccountSwitcherDuxo2 = sduiAccountSwitcherDuxo;
                }
                i3 |= i6;
            } else {
                sduiAccountSwitcherDuxo2 = sduiAccountSwitcherDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(2050738472);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        CreationExtras2 creationExtras2 = new CreationExtras2(current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE);
                        creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, surface)));
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(SduiAccountSwitcherDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherKt$SduiAccountSwitcher$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherKt$SduiAccountSwitcher$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 = i3 & (-7169);
                        modifier3 = modifier5;
                        sduiAccountSwitcherDuxo3 = (SduiAccountSwitcherDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1834350219, i4, -1, "com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcher (SduiAccountSwitcher.kt:38)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(sduiAccountSwitcherDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(sduiAccountSwitcherDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        accountSwitcherResponseDto = SduiAccountSwitcher$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAccountSwitcherResponseDto();
                        if (accountSwitcherResponseDto != null || (components = accountSwitcherResponseDto.getComponents()) == null) {
                            final Modifier modifier6 = modifier3;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return SduiAccountSwitcher2.SduiAccountSwitcher$lambda$2(surface, callbacks, modifier6, sduiAccountSwitcherDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        GetAccountSwitcherResponseDto accountSwitcherResponseDto2 = SduiAccountSwitcher$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAccountSwitcherResponseDto();
                        if (accountSwitcherResponseDto2 == null || (listEmptyList = accountSwitcherResponseDto2.getFooter_components()) == null) {
                            listEmptyList = CollectionsKt.emptyList();
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SduiAccountSwitcher2.SduiAccountSwitcher$lambda$4$lambda$3((ActionDto) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function1 = (Function1) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        final Event<SduiAccountSwitcherEvent> eventSduiAccountSwitcher$lambda$1 = SduiAccountSwitcher$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventSduiAccountSwitcher$lambda$1 != null) {
                            if ((eventSduiAccountSwitcher$lambda$1.getData() instanceof SduiAccountSwitcherEvent.AccountSelected) && (eventConsumerInvoke = eventSduiAccountSwitcher$lambda$1.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(eventSduiAccountSwitcher$lambda$1, new Function1() { // from class: com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherKt$SduiAccountSwitcher$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        m15811invoke(obj);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m15811invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        SduiAccountSwitcherEvent.AccountSelected accountSelected = (SduiAccountSwitcherEvent.AccountSelected) eventSduiAccountSwitcher$lambda$1.getData();
                                        callbacks.onAccountSelected(accountSelected.getAccountNumber(), accountSelected.getBrokerageAccountType());
                                    }
                                });
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(sduiAccountSwitcherDuxo3) | composerStartRestartGroup.changedInstance(listEmptyList) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks)));
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new SduiActionHandler() { // from class: com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherKt$SduiAccountSwitcher$actionHandler$1$1
                                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                public final boolean mo15941handle(AccountSwitcherAction action) {
                                    Intrinsics.checkNotNullParameter(action, "action");
                                    SelectAccountAction select_account = action.getSelect_account();
                                    String account_number = select_account != null ? select_account.getAccount_number() : null;
                                    DeeplinkAction deeplink = action.getDeeplink();
                                    String url = deeplink != null ? deeplink.getUrl() : null;
                                    if (account_number != null) {
                                        sduiAccountSwitcherDuxo3.onAccountSelected$lib_account_switcher_externalDebug(account_number);
                                        return true;
                                    }
                                    if (url != null) {
                                        List<UIComponentDto> list = listEmptyList;
                                        ArrayList arrayList = new ArrayList();
                                        Iterator<T> it = list.iterator();
                                        while (it.hasNext()) {
                                            UIComponentDto.ConcreteDto concrete = ((UIComponentDto) it.next()).getConcrete();
                                            if (concrete != null) {
                                                arrayList.add(concrete);
                                            }
                                        }
                                        extensions2.toPersistentList(arrayList);
                                        callbacks.onDeeplink(url);
                                        return true;
                                    }
                                    if (action.getDismiss() != null) {
                                        callbacks.onDismiss();
                                        return true;
                                    }
                                    if (action.getShow_all_accounts() != null) {
                                        callbacks.onShowAllAccounts();
                                        return true;
                                    }
                                    if (action.getRefresh() == null) {
                                        return false;
                                    }
                                    callbacks.onRefresh();
                                    return true;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                        ImmutableList3 persistentList = extensions2.toPersistentList(components);
                        composerStartRestartGroup.startReplaceGroup(-1370740990);
                        Composer composer2 = composerStartRestartGroup;
                        Modifier modifier7 = modifier3;
                        SduiColumnsIdl.SduiLazyColumn(persistentList, AccountSwitcherAction.class, function1, modifierFillMaxWidth$default, LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3), null, sduiActionHandler, HorizontalPadding.Default, false, composer2, 3456, 0);
                        composer2.endReplaceGroup();
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = listEmptyList.iterator();
                        while (it.hasNext()) {
                            UIComponentDto.ConcreteDto concrete = ((UIComponentDto) it.next()).getConcrete();
                            if (concrete != null) {
                                arrayList.add(concrete);
                            }
                        }
                        ImmutableList3 persistentList2 = extensions2.toPersistentList(arrayList);
                        composer2.startReplaceGroup(40010095);
                        SduiColumnsIdl.SduiColumn(persistentList2, function1, AccountSwitcherAction.class, modifierFillMaxWidth$default2, null, sduiActionHandler, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 3120, 0);
                        composerStartRestartGroup = composer2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier7;
                    } else {
                        i4 = i3;
                        modifier3 = modifier5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                sduiAccountSwitcherDuxo3 = sduiAccountSwitcherDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(sduiAccountSwitcherDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(sduiAccountSwitcherDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                accountSwitcherResponseDto = SduiAccountSwitcher$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getAccountSwitcherResponseDto();
                if (accountSwitcherResponseDto != null) {
                }
                final Modifier modifier62 = modifier3;
                if (ComposerKt.isTraceInProgress()) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                sduiAccountSwitcherDuxo3 = sduiAccountSwitcherDuxo2;
            }
            scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiAccountSwitcher2.SduiAccountSwitcher$lambda$9(surface, callbacks, modifier4, sduiAccountSwitcherDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountSwitcherAction SduiAccountSwitcher$lambda$4$lambda$3(ActionDto actionDto) {
        AnyMessage concrete;
        if (actionDto == null || (concrete = actionDto.getConcrete()) == null) {
            return null;
        }
        return (AccountSwitcherAction) concrete.unpack(AccountSwitcherActionDto.INSTANCE.getProtoAdapter());
    }

    private static final SduiAccountSwitcherViewState SduiAccountSwitcher$lambda$0(SnapshotState4<SduiAccountSwitcherViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<SduiAccountSwitcherEvent> SduiAccountSwitcher$lambda$1(SnapshotState4<Event<SduiAccountSwitcherEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
