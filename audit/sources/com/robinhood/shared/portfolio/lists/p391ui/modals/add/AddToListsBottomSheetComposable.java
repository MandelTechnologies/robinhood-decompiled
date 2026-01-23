package com.robinhood.shared.portfolio.lists.p391ui.modals.add;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.List;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.portfolio.lists.p391ui.C39419R;
import com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable5;
import com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7;
import com.robinhood.shared.portfolio.lists.p391ui.modals.add.AddToListsBottomSheetEvent;
import com.robinhood.shared.portfolio.lists.p391ui.modals.add.AddToListsBottomSheetViewState2;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AddToListsBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032B\u0010\u0005\u001a>\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a&\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b\"\u000e\u0010\u001c\u001a\u00020\u001dX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002²\u0006\u0012\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u008a\u0084\u0002"}, m3636d2 = {"AddToListsBottomSheetComposable", "", "onSelectSingleList", "Lkotlin/Function1;", "Lcom/robinhood/models/db/CuratedList;", "onClickSaveChanges", "Lkotlin/Function2;", "Lkotlinx/collections/immutable/ImmutableList;", "Lkotlin/ParameterName;", "name", "listsToAdd", "listsToRemove", "onError", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetDuxo;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetDuxo;Landroidx/compose/runtime/Composer;II)V", "logItemUpdate", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "descriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "listId", "Ljava/util/UUID;", "isAddingItem", "", "ListsScrollableAreaMaxHeight", "", "lib-lists-ui_externalDebug", "state", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListsBottomSheetEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class AddToListsBottomSheetComposable {
    private static final int ListsScrollableAreaMaxHeight = 300;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddToListsBottomSheetComposable$lambda$13(Function1 function1, Function2 function2, Function1 function12, Modifier modifier, AddToListsBottomSheetDuxo addToListsBottomSheetDuxo, int i, int i2, Composer composer, int i3) {
        AddToListsBottomSheetComposable(function1, function2, function12, modifier, addToListsBottomSheetDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddToListsBottomSheetComposable(final Function1<? super CuratedList, Unit> onSelectSingleList, final Function2<? super ImmutableList<CuratedList>, ? super ImmutableList<CuratedList>, Unit> onClickSaveChanges, Function1<? super Throwable, Unit> function1, Modifier modifier, AddToListsBottomSheetDuxo addToListsBottomSheetDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        AddToListsBottomSheetDuxo addToListsBottomSheetDuxo2;
        Modifier modifier3;
        int i4;
        int i5;
        final AddToListsBottomSheetDuxo addToListsBottomSheetDuxo3;
        final EventLogger current;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        Composer composer2;
        final ArrayList arrayList;
        SnapshotState4 snapshotState4;
        BentoTheme bentoTheme;
        int i6;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        BentoTheme bentoTheme2;
        float f;
        char c;
        int i7;
        boolean z;
        int i8;
        final SnapshotState4 snapshotState42;
        final Event<AddToListsBottomSheetEvent> eventAddToListsBottomSheetComposable$lambda$1;
        final AddToListsBottomSheetDuxo addToListsBottomSheetDuxo4;
        final Modifier modifier4;
        EventConsumer<AddToListsBottomSheetEvent> eventConsumerInvoke;
        final SnapshotState4 snapshotState43;
        Object checkable;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function1<? super Throwable, Unit> onError = function1;
        Intrinsics.checkNotNullParameter(onSelectSingleList, "onSelectSingleList");
        Intrinsics.checkNotNullParameter(onClickSaveChanges, "onClickSaveChanges");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Composer composerStartRestartGroup = composer.startRestartGroup(1038795528);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onSelectSingleList) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickSaveChanges) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onError) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    addToListsBottomSheetDuxo2 = addToListsBottomSheetDuxo;
                    int i10 = composerStartRestartGroup.changedInstance(addToListsBottomSheetDuxo2) ? 16384 : 8192;
                    i3 |= i10;
                } else {
                    addToListsBottomSheetDuxo2 = addToListsBottomSheetDuxo;
                }
                i3 |= i10;
            } else {
                addToListsBottomSheetDuxo2 = addToListsBottomSheetDuxo;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current2 == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AddToListsBottomSheetDuxo.class), current2, (String) null, factoryCreateViewModelFactory, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetComposableKt$AddToListsBottomSheetComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetComposableKt$AddToListsBottomSheetComposable$$inlined$duxo$1.1
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
                        AddToListsBottomSheetDuxo addToListsBottomSheetDuxo5 = (AddToListsBottomSheetDuxo) baseDuxo;
                        i5 = i3 & (-57345);
                        addToListsBottomSheetDuxo3 = addToListsBottomSheetDuxo5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1038795528, i5, -1, "com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetComposable (AddToListsBottomSheetComposable.kt:49)");
                    }
                    current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    int i11 = i5;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(addToListsBottomSheetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(addToListsBottomSheetDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceGroup(1850111208);
                    ImmutableList<AddToListsBottomSheetViewState2> listRows = AddToListsBottomSheetComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getListRows();
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listRows, 10));
                    for (AddToListsBottomSheetViewState2 addToListsBottomSheetViewState2 : listRows) {
                        composer2.startReplaceGroup(1850111853);
                        if (addToListsBottomSheetViewState2 instanceof AddToListsBottomSheetViewState2.Checkable) {
                            AddToListsBottomSheetViewState2.Checkable checkable2 = (AddToListsBottomSheetViewState2.Checkable) addToListsBottomSheetViewState2;
                            CuratedList list = checkable2.getList();
                            boolean zIsChecked = checkable2.isChecked();
                            StringResource subtitle = checkable2.getSubtitle();
                            composer2.startReplaceGroup(-1224400529);
                            snapshotState43 = snapshotState4CollectAsStateWithLifecycle;
                            boolean zChangedInstance3 = composer2.changedInstance(current) | composer2.changedInstance(userInteractionEventDescriptor) | composer2.changedInstance(addToListsBottomSheetDuxo3) | composer2.changed(snapshotState43);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return AddToListsBottomSheetComposable.AddToListsBottomSheetComposable$lambda$4$lambda$3$lambda$2(current, userInteractionEventDescriptor, addToListsBottomSheetDuxo3, snapshotState43, (UUID) obj, ((Boolean) obj2).booleanValue());
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            checkable = new UserListRowComposable7.WatchlistRow.Checkable(list, subtitle, zIsChecked, (Function2) objRememberedValue3, null, 16, null);
                        } else {
                            snapshotState43 = snapshotState4CollectAsStateWithLifecycle;
                            if (!(addToListsBottomSheetViewState2 instanceof AddToListsBottomSheetViewState2.Selectable)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            AddToListsBottomSheetViewState2.Selectable selectable = (AddToListsBottomSheetViewState2.Selectable) addToListsBottomSheetViewState2;
                            checkable = new UserListRowComposable7.WatchlistRow.Default(selectable.getList(), selectable.getSubtitle(), null, 4, null);
                        }
                        composer2.endReplaceGroup();
                        arrayList.add(checkable);
                        snapshotState4CollectAsStateWithLifecycle = snapshotState43;
                    }
                    snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    composer2.endReplaceGroup();
                    Modifier modifier5 = modifier3;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier5, userInteractionEventDescriptor, true, false, false, false, false, null, 108, null);
                    bentoTheme = BentoTheme.INSTANCE;
                    i6 = BentoTheme.$stable;
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierAutoLogEvents$default, bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU(), null, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, i4);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, i4);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(StringResources6.getText(AddToListsBottomSheetComposable$lambda$0(snapshotState4).getTitle(), composer2, StringResource.$stable).toString(), PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getDisplayCapsuleSmall(), composer2, 0, 0, 8124);
                    Modifier modifierM5158heightInVpY3zN4$default = SizeKt.m5158heightInVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(NestedScrollModifier7.nestedScroll$default(companion2, NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer2, 0, 1), null, 2, null), 0.0f, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, C2002Dp.m7995constructorimpl(300), 1, null);
                    composer2.startReplaceGroup(-1224400529);
                    zChangedInstance = ((i11 & 14) != 4) | composer2.changedInstance(arrayList) | composer2.changedInstance(addToListsBottomSheetDuxo3) | composer2.changed(snapshotState4) | composer2.changedInstance(current) | composer2.changedInstance(userInteractionEventDescriptor);
                    objRememberedValue = composer2.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        bentoTheme2 = bentoTheme;
                        f = 0.0f;
                        c = 59590;
                        i7 = 2;
                        z = true;
                        i8 = i6;
                        snapshotState42 = snapshotState4;
                        Object obj = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return AddToListsBottomSheetComposable.AddToListsBottomSheetComposable$lambda$11$lambda$8$lambda$7(arrayList, addToListsBottomSheetDuxo3, snapshotState42, current, userInteractionEventDescriptor, onSelectSingleList, (LazyListScope) obj2);
                            }
                        };
                        composer2.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    } else {
                        bentoTheme2 = bentoTheme;
                        f = 0.0f;
                        c = 59590;
                        i7 = 2;
                        z = true;
                        i8 = i6;
                        snapshotState42 = snapshotState4;
                    }
                    composer2.endReplaceGroup();
                    BentoTheme bentoTheme3 = bentoTheme2;
                    int i12 = i8;
                    int i13 = i7;
                    boolean z2 = z;
                    float f2 = f;
                    LazyDslKt.LazyColumn(modifierM5158heightInVpY3zN4$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 510);
                    composer2.startReplaceGroup(-1532736760);
                    if (AddToListsBottomSheetComposable$lambda$0(snapshotState42).getCanShowSaveButton()) {
                        composerStartRestartGroup = composer2;
                    } else {
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.SAVE, null, null, null, 59, null), false, false, false, true, false, null, 108, null), f2, z2 ? 1 : 0, null), f2, bentoTheme3.getSpacing(composer2, i12).m21590getDefaultD9Ej5fM(), z2 ? 1 : 0, null), bentoTheme3.getSpacing(composer2, i12).m21592getMediumD9Ej5fM(), f2, i13, null);
                        String strStringResource = StringResources_androidKt.stringResource(C39419R.string.save_list_updates, composer2, 0);
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChanged = composer2.changed(snapshotState42) | ((i11 & 112) == 32 ? z2 ? 1 : 0 : false);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AddToListsBottomSheetComposable.AddToListsBottomSheetComposable$lambda$11$lambda$10$lambda$9(onClickSaveChanges, snapshotState42);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue4, strStringResource, modifierM5144paddingVpY3zN4$default, null, null, false, false, null, null, null, null, false, null, composer2, 0, 0, 8184);
                        composerStartRestartGroup = composer2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    eventAddToListsBottomSheetComposable$lambda$1 = AddToListsBottomSheetComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventAddToListsBottomSheetComposable$lambda$1 == null) {
                        if (!(eventAddToListsBottomSheetComposable$lambda$1.getData() instanceof AddToListsBottomSheetEvent.Error) || (eventConsumerInvoke = eventAddToListsBottomSheetComposable$lambda$1.getGetEventConsumer().invoke()) == null) {
                            onError = function1;
                        } else {
                            onError = function1;
                            eventConsumerInvoke.consume(eventAddToListsBottomSheetComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetComposableKt$AddToListsBottomSheetComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m25610invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25610invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onError.invoke(((AddToListsBottomSheetEvent.Error) eventAddToListsBottomSheetComposable$lambda$1.getData()).getThrowable());
                                }
                            });
                        }
                        Unit unit = Unit.INSTANCE;
                    } else {
                        onError = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    addToListsBottomSheetDuxo4 = addToListsBottomSheetDuxo3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    modifier3 = modifier2;
                }
                i4 = 0;
                i5 = i3;
                addToListsBottomSheetDuxo3 = addToListsBottomSheetDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                int i112 = i5;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(addToListsBottomSheetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(addToListsBottomSheetDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(1850111208);
                ImmutableList<AddToListsBottomSheetViewState2> listRows2 = AddToListsBottomSheetComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getListRows();
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listRows2, 10));
                while (r11.hasNext()) {
                }
                snapshotState4 = snapshotState4CollectAsStateWithLifecycle3;
                composer2.endReplaceGroup();
                Modifier modifier52 = modifier3;
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier52, userInteractionEventDescriptor, true, false, false, false, false, null, 108, null);
                bentoTheme = BentoTheme.INSTANCE;
                i6 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifierAutoLogEvents$default2, bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, i4);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, i4);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(StringResources6.getText(AddToListsBottomSheetComposable$lambda$0(snapshotState4).getTitle(), composer2, StringResource.$stable).toString(), PaddingKt.m5144paddingVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getDisplayCapsuleSmall(), composer2, 0, 0, 8124);
                    Modifier modifierM5158heightInVpY3zN4$default2 = SizeKt.m5158heightInVpY3zN4$default(PaddingKt.m5146paddingqDBjuR0$default(NestedScrollModifier7.nestedScroll$default(companion22, NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer2, 0, 1), null, 2, null), 0.0f, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, C2002Dp.m7995constructorimpl(300), 1, null);
                    composer2.startReplaceGroup(-1224400529);
                    zChangedInstance = ((i112 & 14) != 4) | composer2.changedInstance(arrayList) | composer2.changedInstance(addToListsBottomSheetDuxo3) | composer2.changed(snapshotState4) | composer2.changedInstance(current) | composer2.changedInstance(userInteractionEventDescriptor);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance) {
                        bentoTheme2 = bentoTheme;
                        f = 0.0f;
                        c = 59590;
                        i7 = 2;
                        z = true;
                        i8 = i6;
                        snapshotState42 = snapshotState4;
                        Object obj2 = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj22) {
                                return AddToListsBottomSheetComposable.AddToListsBottomSheetComposable$lambda$11$lambda$8$lambda$7(arrayList, addToListsBottomSheetDuxo3, snapshotState42, current, userInteractionEventDescriptor, onSelectSingleList, (LazyListScope) obj22);
                            }
                        };
                        composer2.updateRememberedValue(obj2);
                        objRememberedValue = obj2;
                        composer2.endReplaceGroup();
                        BentoTheme bentoTheme32 = bentoTheme2;
                        int i122 = i8;
                        int i132 = i7;
                        boolean z22 = z;
                        float f22 = f;
                        LazyDslKt.LazyColumn(modifierM5158heightInVpY3zN4$default2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 510);
                        composer2.startReplaceGroup(-1532736760);
                        if (AddToListsBottomSheetComposable$lambda$0(snapshotState42).getCanShowSaveButton()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        eventAddToListsBottomSheetComposable$lambda$1 = AddToListsBottomSheetComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                        if (eventAddToListsBottomSheetComposable$lambda$1 == null) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        addToListsBottomSheetDuxo4 = addToListsBottomSheetDuxo3;
                        modifier4 = modifier52;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                addToListsBottomSheetDuxo4 = addToListsBottomSheetDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function1<? super Throwable, Unit> function12 = onError;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return AddToListsBottomSheetComposable.AddToListsBottomSheetComposable$lambda$13(onSelectSingleList, onClickSaveChanges, function12, modifier4, addToListsBottomSheetDuxo4, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 == 0) {
                }
                if ((i2 & 16) == 0) {
                    i4 = 0;
                    i5 = i3;
                    addToListsBottomSheetDuxo3 = addToListsBottomSheetDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                int i1122 = i5;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(addToListsBottomSheetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(addToListsBottomSheetDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(1850111208);
                ImmutableList<AddToListsBottomSheetViewState2> listRows22 = AddToListsBottomSheetComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle32).getListRows();
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listRows22, 10));
                while (r11.hasNext()) {
                }
                snapshotState4 = snapshotState4CollectAsStateWithLifecycle32;
                composer2.endReplaceGroup();
                Modifier modifier522 = modifier3;
                Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(modifier522, userInteractionEventDescriptor, true, false, false, false, false, null, 108, null);
                bentoTheme = BentoTheme.INSTANCE;
                i6 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default22 = Background3.m4872backgroundbw27NRU$default(modifierAutoLogEvents$default22, bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, i4);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, i4);
                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierM4872backgroundbw27NRU$default22);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composer2.getApplier() == null) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddToListsBottomSheetComposable$lambda$4$lambda$3$lambda$2(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, AddToListsBottomSheetDuxo addToListsBottomSheetDuxo, SnapshotState4 snapshotState4, UUID listId, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        logItemUpdate(eventLogger, userInteractionEventDescriptor, listId, z);
        addToListsBottomSheetDuxo.updateListCheckedState(listId, AddToListsBottomSheetComposable$lambda$0(snapshotState4).getCheckedListIds(), AddToListsBottomSheetComposable$lambda$0(snapshotState4).getUserListIdsWithSecurity(), z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddToListsBottomSheetViewState AddToListsBottomSheetComposable$lambda$0(SnapshotState4<AddToListsBottomSheetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<AddToListsBottomSheetEvent> AddToListsBottomSheetComposable$lambda$1(SnapshotState4<Event<AddToListsBottomSheetEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddToListsBottomSheetComposable$lambda$11$lambda$8$lambda$7(final List list, final AddToListsBottomSheetDuxo addToListsBottomSheetDuxo, final SnapshotState4 snapshotState4, final EventLogger eventLogger, final UserInteractionEventDescriptor userInteractionEventDescriptor, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, AddToListsBottomSheetComposable3.INSTANCE.getLambda$443588445$lib_lists_ui_externalDebug(), 3, null);
        final C39432xa9a12584 c39432xa9a12584 = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetComposableKt$AddToListsBottomSheetComposable$lambda$11$lambda$8$lambda$7$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(UserListRowComposable7.WatchlistRow watchlistRow) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((UserListRowComposable7.WatchlistRow) obj);
            }
        };
        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetComposableKt$AddToListsBottomSheetComposable$lambda$11$lambda$8$lambda$7$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c39432xa9a12584.invoke(list.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetComposableKt$AddToListsBottomSheetComposable$lambda$11$lambda$8$lambda$7$$inlined$items$default$4
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
                final UserListRowComposable7.WatchlistRow watchlistRow;
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
                UserListRowComposable7.WatchlistRow watchlistRow2 = (UserListRowComposable7.WatchlistRow) list.get(i);
                composer.startReplaceGroup(-1176597886);
                composer.startReplaceGroup(-1224400529);
                boolean zChanged = composer.changed(watchlistRow2) | composer.changedInstance(addToListsBottomSheetDuxo) | composer.changed(snapshotState4) | composer.changedInstance(eventLogger) | composer.changedInstance(userInteractionEventDescriptor) | composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    watchlistRow = watchlistRow2;
                    final AddToListsBottomSheetDuxo addToListsBottomSheetDuxo2 = addToListsBottomSheetDuxo;
                    final EventLogger eventLogger2 = eventLogger;
                    final UserInteractionEventDescriptor userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    final Function1 function12 = function1;
                    final SnapshotState4 snapshotState42 = snapshotState4;
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListsBottomSheetComposableKt$AddToListsBottomSheetComposable$1$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            UUID id = watchlistRow.getWatchlist().getId();
                            UserListRowComposable7.WatchlistRow watchlistRow3 = watchlistRow;
                            if (watchlistRow3 instanceof UserListRowComposable7.WatchlistRow.Checkable) {
                                boolean z = !((UserListRowComposable7.WatchlistRow.Checkable) watchlistRow3).getChecked();
                                addToListsBottomSheetDuxo2.updateListCheckedState(((UserListRowComposable7.WatchlistRow.Checkable) watchlistRow).getWatchlist().getId(), AddToListsBottomSheetComposable.AddToListsBottomSheetComposable$lambda$0(snapshotState42).getCheckedListIds(), AddToListsBottomSheetComposable.AddToListsBottomSheetComposable$lambda$0(snapshotState42).getUserListIdsWithSecurity(), z);
                                AddToListsBottomSheetComposable.logItemUpdate(eventLogger2, userInteractionEventDescriptor2, id, z);
                            } else if (watchlistRow3 instanceof UserListRowComposable7.WatchlistRow.Default) {
                                function12.invoke(((UserListRowComposable7.WatchlistRow.Default) watchlistRow3).getWatchlist());
                                AddToListsBottomSheetComposable.logItemUpdate(eventLogger2, userInteractionEventDescriptor2, id, true);
                            } else {
                                if (!(watchlistRow3 instanceof UserListRowComposable7.WatchlistRow.Expandable)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                throw new IllegalStateException("Expandable list row cannot be shown in a bottom sheet!");
                            }
                        }
                    };
                    composer.updateRememberedValue(function0);
                    objRememberedValue = function0;
                } else {
                    watchlistRow = watchlistRow2;
                }
                composer.endReplaceGroup();
                UserListRowComposable5.UserListRowComposable(watchlistRow, (Function0) objRememberedValue, null, false, null, composer, 0, 28);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddToListsBottomSheetComposable$lambda$11$lambda$10$lambda$9(Function2 function2, SnapshotState4 snapshotState4) {
        function2.invoke(AddToListsBottomSheetComposable$lambda$0(snapshotState4).getListsToAdd(), AddToListsBottomSheetComposable$lambda$0(snapshotState4).getListsToRemove());
        return Unit.INSTANCE;
    }

    public static final void logItemUpdate(EventLogger eventLogger, UserInteractionEventDescriptor descriptor, UUID listId, boolean z) {
        UserInteractionEventData.Action action;
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(listId, "listId");
        String string2 = listId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        com.robinhood.rosetta.eventlogging.List list = new com.robinhood.rosetta.eventlogging.List(string2, null, List.OwnerType.USER, null, 10, null);
        if (z) {
            action = UserInteractionEventData.Action.ADD_TO_LIST;
        } else {
            action = UserInteractionEventData.Action.REMOVE_FROM_LIST;
        }
        Context context = descriptor.getContext();
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(descriptor, null, null, action, context != null ? Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -32769, -1, -1, -1, -1, -1, 16383, null) : null, null, null, 51, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
    }
}
