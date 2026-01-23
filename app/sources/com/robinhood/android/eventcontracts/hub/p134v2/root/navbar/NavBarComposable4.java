package com.robinhood.android.eventcontracts.hub.p134v2.root.navbar;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.eventcontracts.hub.p134v2.root.navbar.HubNavBarViewState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.utils.extensions.Uuids;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: NavBarComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"HubNavBarComposable", "", "viewState", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarViewState;", "onChildCategoryClicked", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/NavBarCallback;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarViewState;Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/NavBarCallback;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CategoryPlaceHolderText", "", "feature-hub-v2_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.hub.v2.root.navbar.NavBarComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class NavBarComposable4 {
    private static final String CategoryPlaceHolderText = "           ";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HubNavBarComposable$lambda$0(HubNavBarViewState hubNavBarViewState, NavBarComposable3 navBarComposable3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HubNavBarComposable(hubNavBarViewState, navBarComposable3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HubNavBarComposable$lambda$2(HubNavBarViewState hubNavBarViewState, NavBarComposable3 navBarComposable3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HubNavBarComposable(hubNavBarViewState, navBarComposable3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HubNavBarComposable$lambda$8(HubNavBarViewState hubNavBarViewState, NavBarComposable3 navBarComposable3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HubNavBarComposable(hubNavBarViewState, navBarComposable3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HubNavBarComposable(final HubNavBarViewState viewState, final NavBarComposable3 onChildCategoryClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ImmutableList3<HubNavBarViewState.DisplayChildCategory> childCategories;
        final NavBarComposable3 navBarComposable3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onChildCategoryClicked, "onChildCategoryClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-211401902);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(onChildCategoryClicked) : composerStartRestartGroup.changedInstance(onChildCategoryClicked) ? 32 : 16;
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
                    ComposerKt.traceEventStart(-211401902, i3, -1, "com.robinhood.android.eventcontracts.hub.v2.root.navbar.HubNavBarComposable (NavBarComposable.kt:33)");
                }
                childCategories = viewState.getChildCategories();
                boolean z = false;
                if (!(childCategories == null && childCategories.isEmpty())) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final Modifier modifier5 = modifier4;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.navbar.NavBarComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return NavBarComposable4.HubNavBarComposable$lambda$0(viewState, onChildCategoryClicked, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                final Modifier modifier6 = modifier4;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM());
                composerStartRestartGroup.startReplaceGroup(-1293752796);
                if (viewState.getChildCategories() != null) {
                    navBarComposable3 = onChildCategoryClicked;
                    int i5 = i3;
                    composerStartRestartGroup.endReplaceGroup();
                    LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(viewState.getInitialScrollChildCategoryIndex(), 0, composerStartRestartGroup, 0, 2);
                    final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 2, null);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                    if ((i5 & 112) == 32 || ((i5 & 64) != 0 && composerStartRestartGroup.changedInstance(navBarComposable3))) {
                        z = true;
                    }
                    boolean z2 = zChangedInstance | z;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.navbar.NavBarComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return NavBarComposable4.HubNavBarComposable$lambda$7$lambda$6(viewState, userInteractionEventDescriptor, navBarComposable3, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    LazyDslKt.LazyRow(modifier6, lazyListStateRememberLazyListState, paddingValuesM5137PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, (i5 >> 6) & 14, 488);
                    modifier3 = modifier6;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier6);
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    LocalShowPlaceholder.Loadable(true, null, null, NavBarComposable.INSTANCE.m14345getLambda$1704186676$feature_hub_v2_externalDebug(), composerStartRestartGroup, 3078, 6);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup3 != null) {
                        scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.navbar.NavBarComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return NavBarComposable4.HubNavBarComposable$lambda$2(viewState, onChildCategoryClicked, modifier6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                navBarComposable3 = onChildCategoryClicked;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final NavBarComposable3 navBarComposable32 = navBarComposable3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.navbar.NavBarComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return NavBarComposable4.HubNavBarComposable$lambda$8(viewState, navBarComposable32, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            childCategories = viewState.getChildCategories();
            boolean z3 = false;
            if (childCategories == null) {
                if (!(childCategories == null && childCategories.isEmpty())) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HubNavBarComposable$lambda$7$lambda$6(HubNavBarViewState hubNavBarViewState, final UserInteractionEventDescriptor userInteractionEventDescriptor, final NavBarComposable3 navBarComposable3, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final ImmutableList3<HubNavBarViewState.DisplayChildCategory> childCategories = hubNavBarViewState.getChildCategories();
        final Function2 function2 = new Function2() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.navbar.NavBarComposableKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NavBarComposable4.HubNavBarComposable$lambda$7$lambda$6$lambda$3(((Integer) obj).intValue(), (HubNavBarViewState.DisplayChildCategory) obj2);
            }
        };
        LazyRow.items(childCategories.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.navbar.NavBarComposableKt$HubNavBarComposable$lambda$7$lambda$6$$inlined$itemsIndexed$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function2.invoke(Integer.valueOf(i), childCategories.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.navbar.NavBarComposableKt$HubNavBarComposable$lambda$7$lambda$6$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                childCategories.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.navbar.NavBarComposableKt$HubNavBarComposable$lambda$7$lambda$6$$inlined$itemsIndexed$default$3
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
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final HubNavBarViewState.DisplayChildCategory displayChildCategory = (HubNavBarViewState.DisplayChildCategory) childCategories.get(i);
                composer.startReplaceGroup(-877504460);
                final String str = "nav_tab-" + Uuids.safeToString(displayChildCategory.getNode().getId());
                final HapticFeedback hapticFeedback = (HapticFeedback) composer.consume(CompositionLocalsKt.getLocalHapticFeedback());
                String tabName = displayChildCategory.getTabName();
                boolean isSelected = displayChildCategory.getIsSelected();
                boolean fancyHighlight = displayChildCategory.getFancyHighlight();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(str, null, null, Context.copy$default(UserInteractionEventDescriptor2.orNew(userInteractionEventDescriptor.getContext()), i, 0, 0, displayChildCategory.getTabName(), null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.TAB, str, null, 4, null), null, 38, null)), true, false, false, true, false, null, 108, null);
                composer.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composer.changedInstance(hapticFeedback) | composer.changedInstance(navBarComposable3) | composer.changedInstance(displayChildCategory) | composer.changed(str);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final NavBarComposable3 navBarComposable32 = navBarComposable3;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.eventcontracts.hub.v2.root.navbar.NavBarComposableKt$HubNavBarComposable$4$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            hapticFeedback.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7042getConfirm5zf0vsI());
                            navBarComposable32.onChildCategoryClicked(displayChildCategory, str);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                CategoryItem.CategoryItem(tabName, (Function0) objRememberedValue, modifierAutoLogEvents$default, true, isSelected, fancyHighlight, composer, 3072, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object HubNavBarComposable$lambda$7$lambda$6$lambda$3(int i, HubNavBarViewState.DisplayChildCategory item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getKey();
    }
}
