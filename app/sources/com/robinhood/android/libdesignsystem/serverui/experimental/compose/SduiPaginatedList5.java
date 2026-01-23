package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.paging.LoadState;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingSource;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItems5;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.experimental.api.PaginatedListApiEntryPoint2;
import com.robinhood.android.libdesignsystem.serverui.experimental.api.PaginatedListPageApi;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.PaginatedList;
import com.robinhood.models.serverdriven.experimental.api.PaginatedListPage;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.Types;
import java.lang.reflect.ParameterizedType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiPaginatedList.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"SduiPaginatedList", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/PaginatedList;", "(Lcom/robinhood/models/serverdriven/experimental/api/PaginatedList;Landroidx/compose/runtime/Composer;I)V", "ProgressIndicator", "(Landroidx/compose/runtime/Composer;I)V", "RetryButton", "onClick", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPaginatedListKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiPaginatedList5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProgressIndicator$lambda$7(int i, Composer composer, int i2) {
        ProgressIndicator(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RetryButton$lambda$8(Function0 function0, int i, Composer composer, int i2) {
        RetryButton(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiPaginatedList$lambda$0(PaginatedList paginatedList, int i, Composer composer, int i2) {
        SduiPaginatedList(paginatedList, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiPaginatedList$lambda$5(PaginatedList paginatedList, int i, Composer composer, int i2) {
        SduiPaginatedList(paginatedList, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final <ActionT extends Parcelable> void SduiPaginatedList(final PaginatedList<? extends ActionT> component, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(538891080);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(538891080, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPaginatedList (SduiPaginatedList.kt:40)");
            }
            composerStartRestartGroup.startReplaceGroup(-1816711111);
            if (component.getEmpty_list_content() != null) {
                UIComponent<ActionT> empty_list_content = component.getEmpty_list_content();
                Intrinsics.checkNotNull(empty_list_content);
                SduiComponent3.SduiComponent(empty_list_content, null, HorizontalPadding.Default, composerStartRestartGroup, 384, 2);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPaginatedListKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiPaginatedList5.SduiPaginatedList$lambda$0(component, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            composerStartRestartGroup.endReplaceGroup();
            final PaginatedListPageApi paginatedListPageApiRememberPaginatedListPageApi = PaginatedListApiEntryPoint2.rememberPaginatedListPageApi(composerStartRestartGroup, 0);
            final LazyMoshi lazyMoshiRememberMoshi = PaginatedListApiEntryPoint2.rememberMoshi(composerStartRestartGroup, 0);
            final Class clsCurrentActionClass = UtilKt.currentActionClass(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(component) | composerStartRestartGroup.changed(clsCurrentActionClass);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Pager(new PagingConfig(10, 0, false, 0, 0, 0, 62, null), null, new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPaginatedListKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SduiPaginatedList5.SduiPaginatedList$lambda$2$lambda$1(paginatedListPageApiRememberPaginatedListPageApi, lazyMoshiRememberMoshi, clsCurrentActionClass, component);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final LazyPagingItems lazyPagingItemsCollectAsLazyPagingItems = LazyPagingItems5.collectAsLazyPagingItems(((Pager) objRememberedValue).getFlow(), null, composerStartRestartGroup, 0, 1);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lazyPagingItemsCollectAsLazyPagingItems);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPaginatedListKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiPaginatedList5.SduiPaginatedList$lambda$4$lambda$3(lazyPagingItemsCollectAsLazyPagingItems, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierFillMaxWidth$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, 6, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPaginatedListKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiPaginatedList5.SduiPaginatedList$lambda$5(component, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource SduiPaginatedList$lambda$2$lambda$1(PaginatedListPageApi paginatedListPageApi, LazyMoshi lazyMoshi, Class cls, PaginatedList paginatedList) {
        ParameterizedType parameterizedTypeNewParameterizedType = Types.newParameterizedType(PaginatedListPage.class, cls);
        Intrinsics.checkNotNullExpressionValue(parameterizedTypeNewParameterizedType, "newParameterizedType(...)");
        return new SduiPaginatedList4(paginatedListPageApi, lazyMoshi.adapter(parameterizedTypeNewParameterizedType), paginatedList.getInitial_page());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiPaginatedList$lambda$4$lambda$3(final LazyPagingItems lazyPagingItems, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.items$default(LazyColumn, lazyPagingItems.getItemCount(), null, null, ComposableLambda3.composableLambdaInstance(-293583382, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPaginatedListKt$SduiPaginatedList$2$1$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i2 & 48) == 0) {
                    i2 |= composer.changed(i) ? 32 : 16;
                }
                if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-293583382, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPaginatedList.<anonymous>.<anonymous>.<anonymous> (SduiPaginatedList.kt:66)");
                }
                Object obj = lazyPagingItems.get(i);
                Intrinsics.checkNotNull(obj);
                SduiComponent3.SduiComponent((UIComponent) obj, null, HorizontalPadding.Default, composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 6, null);
        if (lazyPagingItems.getLoadState().getAppend() instanceof LoadState.Loading) {
            LazyListScope.item$default(LazyColumn, null, null, SduiPaginatedList2.INSTANCE.getLambda$1372901400$lib_sdui_externalRelease(), 3, null);
        } else if (lazyPagingItems.getLoadState().getAppend() instanceof LoadState.Error) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1971203057, true, new SduiPaginatedList7(lazyPagingItems)), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProgressIndicator(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(217600815);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(217600815, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ProgressIndicator (SduiPaginatedList.kt:81)");
            }
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, BentoProgressIndicator3.f5151S, 0L, composerStartRestartGroup, 48, 5);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPaginatedListKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiPaginatedList5.ProgressIndicator$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RetryButton(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(696673735);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(696673735, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.RetryButton (SduiPaginatedList.kt:93)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C11048R.string.general_label_retry, composerStartRestartGroup, 0), SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, i2 & 14, 0, 8184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPaginatedListKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiPaginatedList5.RetryButton$lambda$8(function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
