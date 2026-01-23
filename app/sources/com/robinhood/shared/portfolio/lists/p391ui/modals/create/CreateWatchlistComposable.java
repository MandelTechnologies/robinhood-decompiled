package com.robinhood.shared.portfolio.lists.p391ui.modals.create;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.window.AndroidPopup_androidKt;
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
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.shared.portfolio.lists.p391ui.C39419R;
import com.robinhood.shared.portfolio.lists.p391ui.modals.create.CreateWatchlistComposable;
import com.robinhood.shared.portfolio.lists.p391ui.modals.create.CreateWatchlistDuxo6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateWatchlistComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u001aC\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002"}, m3636d2 = {"CreateWatchlistComposable", "", "onWatchlistCreated", "Lkotlin/Function1;", "Lcom/robinhood/models/db/CuratedList;", "onCancelClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreateWatchlistDuxo;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreateWatchlistDuxo;Landroidx/compose/runtime/Composer;II)V", "onEmojiClicked", "creatingWatchlist", "", "lib-lists-ui_externalDebug", "viewState", "Lcom/robinhood/shared/portfolio/lists/ui/modals/create/CreateWatchlistViewState;", "listName", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CreateWatchlistComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateWatchlistComposable$lambda$22(Function1 function1, Function0 function0, Modifier modifier, CreateWatchlistDuxo createWatchlistDuxo, int i, int i2, Composer composer, int i3) {
        CreateWatchlistComposable(function1, function0, modifier, createWatchlistDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CreateWatchlistComposable(Function1<? super CuratedList, Unit> function1, final Function0<Unit> onCancelClick, Modifier modifier, CreateWatchlistDuxo createWatchlistDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CreateWatchlistDuxo createWatchlistDuxo2;
        int i4;
        int i5;
        CreateWatchlistDuxo createWatchlistDuxo3;
        Modifier modifier3;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        final boolean zAreEqual;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final CreateWatchlistDuxo createWatchlistDuxo4;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zChanged;
        Object objRememberedValue3;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        boolean zChanged2;
        Object objRememberedValue4;
        boolean zChangedInstance;
        Object objRememberedValue5;
        boolean zChangedInstance2;
        Object objRememberedValue6;
        boolean zChangedInstance3;
        Object objRememberedValue7;
        final Function0<Unit> function0;
        boolean zChanged3;
        Object objRememberedValue8;
        Continuation continuation;
        Object objRememberedValue9;
        final CreateWatchlistDuxo createWatchlistDuxo5;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function1<? super CuratedList, Unit> onWatchlistCreated = function1;
        Intrinsics.checkNotNullParameter(onWatchlistCreated, "onWatchlistCreated");
        Intrinsics.checkNotNullParameter(onCancelClick, "onCancelClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1156804306);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onWatchlistCreated) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCancelClick) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    createWatchlistDuxo2 = createWatchlistDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(createWatchlistDuxo2) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    createWatchlistDuxo2 = createWatchlistDuxo;
                }
                i3 |= i7;
            } else {
                createWatchlistDuxo2 = createWatchlistDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CreateWatchlistDuxo.class), current, "CreateWatchlistComposable", factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 384, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$CreateWatchlistComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$CreateWatchlistComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue10, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        createWatchlistDuxo3 = (CreateWatchlistDuxo) baseDuxo;
                        i5 = i3 & (-7169);
                    } else {
                        i4 = 0;
                        i5 = i3;
                        createWatchlistDuxo3 = createWatchlistDuxo2;
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    createWatchlistDuxo3 = createWatchlistDuxo2;
                    i4 = 0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1156804306, i5, -1, "com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposable (CreateWatchlistComposable.kt:51)");
                }
                int i8 = i5;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(createWatchlistDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                zAreEqual = Intrinsics.areEqual(CreateWatchlistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCreatingWatchlistState(), CreateWatchlistDuxo6.Creating.INSTANCE);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                FocusRequester focusRequester = (FocusRequester) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default("", null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                String strStringResource = StringResources_androidKt.stringResource(C39419R.string.create_new_watchlist, composerStartRestartGroup, 0);
                Modifier.Companion companion4 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                createWatchlistDuxo4 = createWatchlistDuxo3;
                Modifier modifier6 = modifier3;
                BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5142padding3ABfNKs(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i9).getDisplayCapsuleSmall(), composer2, 0, 0, 8188);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, companion4);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(SizeKt.m5171sizeVpY3zN4(PaddingKt.m5142padding3ABfNKs(companion4, bentoTheme.getSpacing(composer2, i9).m21595getXsmallD9Ej5fM()), C2002Dp.m7995constructorimpl(75), C2002Dp.m7995constructorimpl(85)), bentoTheme.getColors(composer2, i9).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4)));
                composer2.startReplaceGroup(-1633490746);
                zChanged = composer2.changed(zAreEqual) | composer2.changedInstance(createWatchlistDuxo4);
                objRememberedValue3 = composer2.rememberedValue();
                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CreateWatchlistComposable.CreateWatchlistComposable$lambda$17$lambda$10$lambda$6$lambda$5(zAreEqual, createWatchlistDuxo4);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4871backgroundbw27NRU, false, null, null, (Function0) objRememberedValue3, 7, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierM4893clickableXHw0xAI$default);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                BentoText2.m20747BentoText38GnDrw(CreateWatchlistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getIconEmoji(), boxScopeInstance.align(companion4, companion2.getCenter()), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i9).getDisplayNibSmall(), composer2, 0, 0, 8124);
                composer2.endNode();
                Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(Clip.clip(companion4, RoundedCornerShape2.getCircleShape()), bentoTheme.getColors(composer2, i9).m21456getPositive0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer2, i9).m21595getXsmallD9Ej5fM()), companion2.getBottomEnd());
                BentoIcon4.Size12 size12 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.EDIT_12);
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i9).m21425getFg0d7_KjU();
                composer2.startReplaceGroup(-1633490746);
                zChanged2 = composer2.changed(zAreEqual) | composer2.changedInstance(createWatchlistDuxo4);
                objRememberedValue4 = composer2.rememberedValue();
                if (!zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CreateWatchlistComposable.CreateWatchlistComposable$lambda$17$lambda$10$lambda$9$lambda$8(zAreEqual, createWatchlistDuxo4);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceGroup();
                BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21425getFg0d7_KjU, modifierAlign, (Function0) objRememberedValue4, false, composer2, BentoIcon4.Size12.$stable | 48, 32);
                composer2.endNode();
                Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(PaddingKt.m5143paddingVpY3zN4(companion4, bentoTheme.getSpacing(composer2, i9).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i9).m21590getDefaultD9Ej5fM()), focusRequester);
                BentoTextInput8.Message errorMessage = CreateWatchlistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getErrorMessage();
                String strStringResource2 = StringResources_androidKt.stringResource(C39419R.string.list_name, composer2, 0);
                String strCreateWatchlistComposable$lambda$3 = CreateWatchlistComposable$lambda$3(snapshotState);
                boolean z = !zAreEqual;
                composer2.startReplaceGroup(-1633490746);
                zChangedInstance = composer2.changedInstance(createWatchlistDuxo4);
                objRememberedValue5 = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CreateWatchlistComposable.CreateWatchlistComposable$lambda$17$lambda$12$lambda$11(createWatchlistDuxo4, snapshotState, (String) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                BentoTextInput4.BentoTextInput(strCreateWatchlistComposable$lambda$3, (Function1) objRememberedValue5, modifierFocusRequester, null, strStringResource2, null, errorMessage, null, null, null, null, null, null, z, false, composer2, BentoTextInput8.Message.$stable << 18, 0, 24488);
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme.getSpacing(composer2, i9).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i9).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i9).m21592getMediumD9Ej5fM(), 2, null);
                boolean z2 = StringsKt.isBlank(CreateWatchlistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getListName()) && !zAreEqual;
                String strStringResource3 = StringResources_androidKt.stringResource(C39419R.string.create_list_cta, composer2, 0);
                boolean z3 = !zAreEqual;
                String strStringResource4 = StringResources_androidKt.stringResource(C39419R.string.cancel_create_list_cta, composer2, 0);
                composer2.startReplaceGroup(5004770);
                zChangedInstance2 = composer2.changedInstance(createWatchlistDuxo4);
                objRememberedValue6 = composer2.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CreateWatchlistComposable.CreateWatchlistComposable$lambda$17$lambda$14$lambda$13(createWatchlistDuxo4);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue6);
                }
                Function0 function02 = (Function0) objRememberedValue6;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-1633490746);
                zChangedInstance3 = composer2.changedInstance(createWatchlistDuxo4) | ((i8 & 112) != 32);
                objRememberedValue7 = composer2.rememberedValue();
                if (!zChangedInstance3 || objRememberedValue7 == companion.getEmpty()) {
                    function0 = onCancelClick;
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CreateWatchlistComposable.CreateWatchlistComposable$lambda$17$lambda$16$lambda$15(createWatchlistDuxo4, function0);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                } else {
                    function0 = onCancelClick;
                }
                composer2.endReplaceGroup();
                BentoButtonBar2.BentoButtonBar(modifierM5146paddingqDBjuR0$default, null, null, false, null, null, function02, strStringResource3, false, null, z2, (Function0) objRememberedValue7, strStringResource4, false, null, z3, composer2, 0, 0, 25406);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(-707473635);
                if (CreateWatchlistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isEmojiPickerVisible()) {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(createWatchlistDuxo4);
                    Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue11 == companion.getEmpty()) {
                        objRememberedValue11 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CreateWatchlistComposable.CreateWatchlistComposable$lambda$19$lambda$18(createWatchlistDuxo4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue11, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1862534394, true, new C394553(createWatchlistDuxo4), composerStartRestartGroup, 54), composerStartRestartGroup, 1572864, 62);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-707461430);
                if (CreateWatchlistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCreatingWatchlistState() instanceof CreateWatchlistDuxo6.GenericError) {
                    Composer composer3 = composerStartRestartGroup;
                    AndroidPopup_androidKt.m8111PopupK5zGePQ(null, 0L, null, null, ComposableLambda3.rememberComposableLambda(1180638369, true, new C394564(createWatchlistDuxo4, function0), composerStartRestartGroup, 54), composer3, 24576, 15);
                    composerStartRestartGroup = composer3;
                }
                composerStartRestartGroup.endReplaceGroup();
                CreateWatchlistDuxo6 creatingWatchlistState = CreateWatchlistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCreatingWatchlistState();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged3 = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i8 & 14) != 4) | composerStartRestartGroup.changedInstance(createWatchlistDuxo4);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChanged3 || objRememberedValue8 == companion.getEmpty()) {
                    continuation = null;
                    onWatchlistCreated = function1;
                    objRememberedValue8 = new CreateWatchlistComposable2(onWatchlistCreated, createWatchlistDuxo4, snapshotState4CollectAsStateWithLifecycle, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    continuation = null;
                    onWatchlistCreated = function1;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(creatingWatchlistState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, 0);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(5004770);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new CreateWatchlistComposable3(focusRequester, continuation);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                createWatchlistDuxo5 = createWatchlistDuxo4;
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                createWatchlistDuxo5 = createWatchlistDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CreateWatchlistComposable.CreateWatchlistComposable$lambda$22(onWatchlistCreated, onCancelClick, modifier4, createWatchlistDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i6 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                modifier3 = modifier5;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i82 = i5;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(createWatchlistDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                zAreEqual = Intrinsics.areEqual(CreateWatchlistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCreatingWatchlistState(), CreateWatchlistDuxo6.Creating.INSTANCE);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                FocusRequester focusRequester2 = (FocusRequester) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion22.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    String strStringResource5 = StringResources_androidKt.stringResource(C39419R.string.create_new_watchlist, composerStartRestartGroup, 0);
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i92 = BentoTheme.$stable;
                    composer2 = composerStartRestartGroup;
                    createWatchlistDuxo4 = createWatchlistDuxo3;
                    Modifier modifier62 = modifier3;
                    BentoText2.m20747BentoText38GnDrw(strStringResource5, PaddingKt.m5142padding3ABfNKs(companion42, bentoTheme2.getSpacing(composerStartRestartGroup, i92).m21590getDefaultD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i92).getDisplayCapsuleSmall(), composer2, 0, 0, 8188);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, companion42);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composer2.getApplier() == null) {
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy3, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier modifierM4871backgroundbw27NRU2 = Background3.m4871backgroundbw27NRU(SizeKt.m5171sizeVpY3zN4(PaddingKt.m5142padding3ABfNKs(companion42, bentoTheme2.getSpacing(composer2, i92).m21595getXsmallD9Ej5fM()), C2002Dp.m7995constructorimpl(75), C2002Dp.m7995constructorimpl(85)), bentoTheme2.getColors(composer2, i92).m21373getBg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4)));
                        composer2.startReplaceGroup(-1633490746);
                        zChanged = composer2.changed(zAreEqual) | composer2.changedInstance(createWatchlistDuxo4);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CreateWatchlistComposable.CreateWatchlistComposable$lambda$17$lambda$10$lambda$6$lambda$5(zAreEqual, createWatchlistDuxo4);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                            composer2.endReplaceGroup();
                            Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifierM4871backgroundbw27NRU2, false, null, null, (Function0) objRememberedValue3, 7, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, modifierM4893clickableXHw0xAI$default2);
                            Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                            if (composer2.getApplier() == null) {
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                            }
                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy22, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl3.getInserting()) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                                BentoText2.m20747BentoText38GnDrw(CreateWatchlistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getIconEmoji(), boxScopeInstance2.align(companion42, companion22.getCenter()), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i92).getDisplayNibSmall(), composer2, 0, 0, 8124);
                                composer2.endNode();
                                Modifier modifierAlign2 = boxScopeInstance2.align(PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(Clip.clip(companion42, RoundedCornerShape2.getCircleShape()), bentoTheme2.getColors(composer2, i92).m21456getPositive0d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composer2, i92).m21595getXsmallD9Ej5fM()), companion22.getBottomEnd());
                                BentoIcon4.Size12 size122 = new BentoIcon4.Size12(ServerToBentoAssetMapper2.EDIT_12);
                                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composer2, i92).m21425getFg0d7_KjU();
                                composer2.startReplaceGroup(-1633490746);
                                zChanged2 = composer2.changed(zAreEqual) | composer2.changedInstance(createWatchlistDuxo4);
                                objRememberedValue4 = composer2.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CreateWatchlistComposable.CreateWatchlistComposable$lambda$17$lambda$10$lambda$9$lambda$8(zAreEqual, createWatchlistDuxo4);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                    composer2.endReplaceGroup();
                                    BentoIcon2.m20644BentoIconFU0evQE(size122, null, jM21425getFg0d7_KjU2, modifierAlign2, (Function0) objRememberedValue4, false, composer2, BentoIcon4.Size12.$stable | 48, 32);
                                    composer2.endNode();
                                    Modifier modifierFocusRequester2 = FocusRequesterModifier3.focusRequester(PaddingKt.m5143paddingVpY3zN4(companion42, bentoTheme2.getSpacing(composer2, i92).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i92).m21590getDefaultD9Ej5fM()), focusRequester2);
                                    BentoTextInput8.Message errorMessage2 = CreateWatchlistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getErrorMessage();
                                    String strStringResource22 = StringResources_androidKt.stringResource(C39419R.string.list_name, composer2, 0);
                                    String strCreateWatchlistComposable$lambda$32 = CreateWatchlistComposable$lambda$3(snapshotState);
                                    boolean z4 = !zAreEqual;
                                    composer2.startReplaceGroup(-1633490746);
                                    zChangedInstance = composer2.changedInstance(createWatchlistDuxo4);
                                    objRememberedValue5 = composer2.rememberedValue();
                                    if (!zChangedInstance) {
                                        objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CreateWatchlistComposable.CreateWatchlistComposable$lambda$17$lambda$12$lambda$11(createWatchlistDuxo4, snapshotState, (String) obj);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue5);
                                        composer2.endReplaceGroup();
                                        BentoTextInput4.BentoTextInput(strCreateWatchlistComposable$lambda$32, (Function1) objRememberedValue5, modifierFocusRequester2, null, strStringResource22, null, errorMessage2, null, null, null, null, null, null, z4, false, composer2, BentoTextInput8.Message.$stable << 18, 0, 24488);
                                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion42, bentoTheme2.getSpacing(composer2, i92).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composer2, i92).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer2, i92).m21592getMediumD9Ej5fM(), 2, null);
                                        if (StringsKt.isBlank(CreateWatchlistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getListName())) {
                                            String strStringResource32 = StringResources_androidKt.stringResource(C39419R.string.create_list_cta, composer2, 0);
                                            boolean z32 = !zAreEqual;
                                            String strStringResource42 = StringResources_androidKt.stringResource(C39419R.string.cancel_create_list_cta, composer2, 0);
                                            composer2.startReplaceGroup(5004770);
                                            zChangedInstance2 = composer2.changedInstance(createWatchlistDuxo4);
                                            objRememberedValue6 = composer2.rememberedValue();
                                            if (!zChangedInstance2) {
                                                objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$$ExternalSyntheticLambda3
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return CreateWatchlistComposable.CreateWatchlistComposable$lambda$17$lambda$14$lambda$13(createWatchlistDuxo4);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue6);
                                                Function0 function022 = (Function0) objRememberedValue6;
                                                composer2.endReplaceGroup();
                                                composer2.startReplaceGroup(-1633490746);
                                                zChangedInstance3 = composer2.changedInstance(createWatchlistDuxo4) | ((i82 & 112) != 32);
                                                objRememberedValue7 = composer2.rememberedValue();
                                                if (zChangedInstance3) {
                                                    function0 = onCancelClick;
                                                    objRememberedValue7 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$$ExternalSyntheticLambda4
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return CreateWatchlistComposable.CreateWatchlistComposable$lambda$17$lambda$16$lambda$15(createWatchlistDuxo4, function0);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue7);
                                                    composer2.endReplaceGroup();
                                                    BentoButtonBar2.BentoButtonBar(modifierM5146paddingqDBjuR0$default2, null, null, false, null, null, function022, strStringResource32, false, null, z2, (Function0) objRememberedValue7, strStringResource42, false, null, z32, composer2, 0, 0, 25406);
                                                    composerStartRestartGroup = composer2;
                                                    composerStartRestartGroup.endNode();
                                                    composerStartRestartGroup.startReplaceGroup(-707473635);
                                                    if (CreateWatchlistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isEmojiPickerVisible()) {
                                                    }
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    composerStartRestartGroup.startReplaceGroup(-707461430);
                                                    if (CreateWatchlistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCreatingWatchlistState() instanceof CreateWatchlistDuxo6.GenericError) {
                                                    }
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    CreateWatchlistDuxo6 creatingWatchlistState2 = CreateWatchlistComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCreatingWatchlistState();
                                                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                                                    zChanged3 = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i82 & 14) != 4) | composerStartRestartGroup.changedInstance(createWatchlistDuxo4);
                                                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                                    if (zChanged3) {
                                                        continuation = null;
                                                        onWatchlistCreated = function1;
                                                        objRememberedValue8 = new CreateWatchlistComposable2(onWatchlistCreated, createWatchlistDuxo4, snapshotState4CollectAsStateWithLifecycle, null);
                                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        EffectsKt.LaunchedEffect(creatingWatchlistState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, 0);
                                                        Unit unit2 = Unit.INSTANCE;
                                                        composerStartRestartGroup.startReplaceGroup(5004770);
                                                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                                                        if (objRememberedValue9 == companion.getEmpty()) {
                                                        }
                                                        composerStartRestartGroup.endReplaceGroup();
                                                        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, composerStartRestartGroup, 6);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                        }
                                                        createWatchlistDuxo5 = createWatchlistDuxo4;
                                                        modifier4 = modifier62;
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static final Unit CreateWatchlistComposable$lambda$17$lambda$10$lambda$6$lambda$5(boolean z, CreateWatchlistDuxo createWatchlistDuxo) {
        onEmojiClicked(z, createWatchlistDuxo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateWatchlistViewState CreateWatchlistComposable$lambda$0(SnapshotState4<CreateWatchlistViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final String CreateWatchlistComposable$lambda$3(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateWatchlistComposable$lambda$17$lambda$10$lambda$9$lambda$8(boolean z, CreateWatchlistDuxo createWatchlistDuxo) {
        onEmojiClicked(z, createWatchlistDuxo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateWatchlistComposable$lambda$17$lambda$12$lambda$11(CreateWatchlistDuxo createWatchlistDuxo, SnapshotState snapshotState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        createWatchlistDuxo.onListNameChange(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateWatchlistComposable$lambda$17$lambda$14$lambda$13(CreateWatchlistDuxo createWatchlistDuxo) {
        createWatchlistDuxo.createNewWatchlist();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateWatchlistComposable$lambda$17$lambda$16$lambda$15(CreateWatchlistDuxo createWatchlistDuxo, Function0 function0) {
        createWatchlistDuxo.reset();
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* compiled from: CreateWatchlistComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$CreateWatchlistComposable$3 */
    static final class C394553 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ CreateWatchlistDuxo $duxo;

        C394553(CreateWatchlistDuxo createWatchlistDuxo) {
            this.$duxo = createWatchlistDuxo;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1862534394, i, -1, "com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposable.<anonymous> (CreateWatchlistComposable.kt:142)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$duxo);
            final CreateWatchlistDuxo createWatchlistDuxo = this.$duxo;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$CreateWatchlistComposable$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateWatchlistComposable.C394553.invoke$lambda$1$lambda$0(createWatchlistDuxo, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CuratedListEmojiPickerComposable.CuratedListEmojiPickerComposable((Function1) objRememberedValue, null, null, composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CreateWatchlistDuxo createWatchlistDuxo, String emoji) {
            Intrinsics.checkNotNullParameter(emoji, "emoji");
            createWatchlistDuxo.setIconEmoji(emoji);
            createWatchlistDuxo.setEmojiPickerVisible(false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateWatchlistComposable$lambda$19$lambda$18(CreateWatchlistDuxo createWatchlistDuxo) {
        createWatchlistDuxo.setEmojiPickerVisible(false);
        return Unit.INSTANCE;
    }

    /* compiled from: CreateWatchlistComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$CreateWatchlistComposable$4 */
    static final class C394564 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CreateWatchlistDuxo $duxo;
        final /* synthetic */ Function0<Unit> $onCancelClick;

        C394564(CreateWatchlistDuxo createWatchlistDuxo, Function0<Unit> function0) {
            this.$duxo = createWatchlistDuxo;
            this.$onCancelClick = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1180638369, i, -1, "com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposable.<anonymous> (CreateWatchlistComposable.kt:152)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C39419R.string.create_list_something_went_wrong, composer, 0);
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C39419R.string.create_list_generic_error_message, composer, 0));
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_okay, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changed(this.$onCancelClick);
            final CreateWatchlistDuxo createWatchlistDuxo = this.$duxo;
            final Function0<Unit> function0 = this.$onCancelClick;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$CreateWatchlistComposable$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateWatchlistComposable.C394564.invoke$lambda$1$lambda$0(createWatchlistDuxo, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(this.$duxo) | composer.changed(this.$onCancelClick);
            final CreateWatchlistDuxo createWatchlistDuxo2 = this.$duxo;
            final Function0<Unit> function02 = this.$onCancelClick;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.portfolio.lists.ui.modals.create.CreateWatchlistComposableKt$CreateWatchlistComposable$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateWatchlistComposable.C394564.invoke$lambda$3$lambda$2(createWatchlistDuxo2, function02);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue2, composer, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CreateWatchlistDuxo createWatchlistDuxo, Function0 function0) {
            createWatchlistDuxo.reset();
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(CreateWatchlistDuxo createWatchlistDuxo, Function0 function0) {
            createWatchlistDuxo.reset();
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    private static final void onEmojiClicked(boolean z, CreateWatchlistDuxo createWatchlistDuxo) {
        if (z) {
            return;
        }
        createWatchlistDuxo.setEmojiPickerVisible(true);
    }
}
