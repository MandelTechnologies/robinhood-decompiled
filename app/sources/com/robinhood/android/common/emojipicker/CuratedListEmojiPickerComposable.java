package com.robinhood.android.common.emojipicker;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridSpan;
import androidx.compose.foundation.lazy.grid.LazyGridSpan2;
import androidx.compose.foundation.lazy.grid.LazyGridSpan3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
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
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CuratedListEmojiPickerComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\u0016\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000eX\u008a\u008e\u0002²\u0006\u001c\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000eX\u008a\u0084\u0002"}, m3636d2 = {"CuratedListEmojiPickerComposable", "", "onEmojiSelected", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/common/emojipicker/CuratedListEmojiPickerDuxo;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/common/emojipicker/CuratedListEmojiPickerDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-emoji-picker_externalDebug", "viewState", "Lcom/robinhood/android/common/emojipicker/CuratedListEmojiPickerViewState;", "expandedStateMap", "", "", "emojiGroupMap", "", "Lcom/robinhood/android/common/emojipicker/Emoji;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CuratedListEmojiPickerComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CuratedListEmojiPickerComposable$lambda$16(Function1 function1, Modifier modifier, CuratedListEmojiPickerDuxo curatedListEmojiPickerDuxo, int i, int i2, Composer composer, int i3) {
        CuratedListEmojiPickerComposable(function1, modifier, curatedListEmojiPickerDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CuratedListEmojiPickerComposable(final Function1<? super String, Unit> onEmojiSelected, Modifier modifier, CuratedListEmojiPickerDuxo curatedListEmojiPickerDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CuratedListEmojiPickerDuxo curatedListEmojiPickerDuxo2;
        int i4;
        CuratedListEmojiPickerDuxo curatedListEmojiPickerDuxo3;
        final Modifier modifier3;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        final CuratedListEmojiPickerDuxo curatedListEmojiPickerDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onEmojiSelected, "onEmojiSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(420413495);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onEmojiSelected) ? 4 : 2) | i;
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
                    curatedListEmojiPickerDuxo2 = curatedListEmojiPickerDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(curatedListEmojiPickerDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    curatedListEmojiPickerDuxo2 = curatedListEmojiPickerDuxo;
                }
                i3 |= i6;
            } else {
                curatedListEmojiPickerDuxo2 = curatedListEmojiPickerDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CuratedListEmojiPickerDuxo.class), current, "CuratedListEmojiPickerDuxo", factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 384, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposableKt$CuratedListEmojiPickerComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposableKt$CuratedListEmojiPickerComposable$$inlined$duxo$1.1
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
                        i4 = i3 & (-897);
                        curatedListEmojiPickerDuxo3 = (CuratedListEmojiPickerDuxo) baseDuxo;
                    } else {
                        i4 = i3;
                        curatedListEmojiPickerDuxo3 = curatedListEmojiPickerDuxo2;
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    curatedListEmojiPickerDuxo3 = curatedListEmojiPickerDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(420413495, i4, -1, "com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposable (CuratedListEmojiPickerComposable.kt:34)");
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(curatedListEmojiPickerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                if (!CuratedListEmojiPickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEmojiGroups().isEmpty()) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        ImmutableList<EmojiGroup> emojiGroups = CuratedListEmojiPickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEmojiGroups();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(emojiGroups, 10)), 16));
                        Iterator<EmojiGroup> it = emojiGroups.iterator();
                        while (it.hasNext()) {
                            Tuples2 tuples2M3642to = Tuples4.m3642to(it.next().getTitle(), Boolean.FALSE);
                            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                        }
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(linkedHashMap, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    Map<String, Boolean> mapCuratedListEmojiPickerComposable$lambda$3 = CuratedListEmojiPickerComposable$lambda$3(snapshotState);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChanged = composerStartRestartGroup.changed(mapCuratedListEmojiPickerComposable$lambda$3);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        ImmutableList<EmojiGroup> emojiGroups2 = CuratedListEmojiPickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEmojiGroups();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(emojiGroups2, 10)), 16));
                        for (EmojiGroup emojiGroup : emojiGroups2) {
                            Tuples2 tuples2M3642to2 = Tuples4.m3642to(emojiGroup.getTitle(), Intrinsics.areEqual(CuratedListEmojiPickerComposable$lambda$3(snapshotState).get(emojiGroup.getTitle()), Boolean.TRUE) ? emojiGroup.getEmojis() : emojiGroup.getEmojis().subList(0, 24));
                            linkedHashMap2.put(tuples2M3642to2.getFirst(), tuples2M3642to2.getSecond());
                        }
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(linkedHashMap2, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                    GridCells.Fixed fixed = new GridCells.Fixed(6);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChanged2 = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changed(snapshotState2) | ((i4 & 14) == 4);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CuratedListEmojiPickerComposable.CuratedListEmojiPickerComposable$lambda$15$lambda$14(snapshotState4CollectAsStateWithLifecycle, snapshotState2, onEmojiSelected, snapshotState, (LazyGridScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LazyGridDslKt.LazyVerticalGrid(fixed, modifierM5142padding3ABfNKs, null, null, false, null, null, null, false, null, (Function1) objRememberedValue4, composerStartRestartGroup, 0, 0, 1020);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                curatedListEmojiPickerDuxo4 = curatedListEmojiPickerDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                curatedListEmojiPickerDuxo4 = curatedListEmojiPickerDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CuratedListEmojiPickerComposable.CuratedListEmojiPickerComposable$lambda$16(onEmojiSelected, modifier3, curatedListEmojiPickerDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                }
                modifier3 = modifier4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(curatedListEmojiPickerDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                if (!CuratedListEmojiPickerComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEmojiGroups().isEmpty()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                curatedListEmojiPickerDuxo4 = curatedListEmojiPickerDuxo3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CuratedListEmojiPickerComposable$lambda$15$lambda$14(SnapshotState4 snapshotState4, SnapshotState snapshotState, final Function1 function1, SnapshotState snapshotState2, LazyGridScope LazyVerticalGrid) {
        LazyGridScope lazyGridScope = LazyVerticalGrid;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        for (final EmojiGroup emojiGroup : CuratedListEmojiPickerComposable$lambda$0(snapshotState4).getEmojiGroups()) {
            LazyGridScope.item$default(lazyGridScope, null, new Function1() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListEmojiPickerComposable.m1840x4b9f8d9a((LazyGridSpan2) obj);
                }
            }, null, ComposableLambda3.composableLambdaInstance(-1544655938, true, new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposableKt$CuratedListEmojiPickerComposable$1$1$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
                    invoke(lazyGridItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyGridItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1544655938, i, -1, "com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CuratedListEmojiPickerComposable.kt:58)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(emojiGroup.getTitle(), PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 0, 0, 8188);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 5, null);
            final List<Emoji> listEmptyList = CuratedListEmojiPickerComposable$lambda$7(snapshotState).get(emojiGroup.getTitle());
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            final Function1 function12 = new Function1() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListEmojiPickerComposable.m1841x4b9f8d9b((Emoji) obj);
                }
            };
            final C11134x2ba2d882 c11134x2ba2d882 = new Function1() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposableKt$CuratedListEmojiPickerComposable$lambda$15$lambda$14$lambda$13$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Emoji emoji) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((Emoji) obj);
                }
            };
            LazyVerticalGrid.items(listEmptyList.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposableKt$CuratedListEmojiPickerComposable$lambda$15$lambda$14$lambda$13$$inlined$items$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return function12.invoke(listEmptyList.get(i));
                }
            }, null, new Function1<Integer, Object>() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposableKt$CuratedListEmojiPickerComposable$lambda$15$lambda$14$lambda$13$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c11134x2ba2d882.invoke(listEmptyList.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposableKt$CuratedListEmojiPickerComposable$lambda$15$lambda$14$lambda$13$$inlined$items$default$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i2) {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = i2 | (composer.changed(lazyGridItemScope) ? 4 : 2);
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
                        ComposerKt.traceEventStart(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                    }
                    final Emoji emoji = (Emoji) listEmptyList.get(i);
                    composer.startReplaceGroup(1850873538);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion, C2002Dp.m7995constructorimpl(5), bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM());
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(function1) | composer.changed(emoji);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function13 = function1;
                        objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposableKt$CuratedListEmojiPickerComposable$1$1$1$4$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function13.invoke(emoji.getCharacter());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(emoji.getCharacter(), ClickableKt.m4893clickableXHw0xAI$default(modifierM5143paddingVpY3zN4, false, null, null, (Function0) objRememberedValue, 7, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i4).getDisplayNibSmall(), composer, 0, 0, 8124);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            lazyGridScope = LazyVerticalGrid;
            LazyGridScope.item$default(lazyGridScope, null, new Function1() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiPickerComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CuratedListEmojiPickerComposable.m1839x285224ff((LazyGridSpan2) obj);
                }
            }, null, ComposableLambda3.composableLambdaInstance(1106957749, true, new CuratedListEmojiPickerComposable4(emojiGroup, snapshotState2)), 5, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CuratedListEmojiPickerComposable$lambda$15$lambda$14$lambda$13$lambda$8 */
    public static final LazyGridSpan m1840x4b9f8d9a(LazyGridSpan2 item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        return LazyGridSpan.m5218boximpl(LazyGridSpan3.GridItemSpan(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CuratedListEmojiPickerComposable$lambda$15$lambda$14$lambda$13$lambda$9 */
    public static final Object m1841x4b9f8d9b(Emoji it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getCharacter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CuratedListEmojiPickerComposable$lambda$15$lambda$14$lambda$13$lambda$12 */
    public static final LazyGridSpan m1839x285224ff(LazyGridSpan2 item) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        return LazyGridSpan.m5218boximpl(LazyGridSpan3.GridItemSpan(6));
    }

    private static final CuratedListEmojiPickerViewState CuratedListEmojiPickerComposable$lambda$0(SnapshotState4<CuratedListEmojiPickerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, Boolean> CuratedListEmojiPickerComposable$lambda$3(SnapshotState<Map<String, Boolean>> snapshotState) {
        return snapshotState.getValue();
    }

    private static final Map<String, List<Emoji>> CuratedListEmojiPickerComposable$lambda$7(SnapshotState<Map<String, List<Emoji>>> snapshotState) {
        return snapshotState.getValue();
    }
}
