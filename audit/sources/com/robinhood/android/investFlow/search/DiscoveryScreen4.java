package com.robinhood.android.investFlow.search;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.investFlow.search.DiscoveryScreen4;
import com.robinhood.android.investFlow.search.DiscoveryViewState;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DiscoveryScreen.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a'\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u000b\u001a\"\u0010\f\u001a\u00020\u0001*\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000fH\u0000\u001a\u0017\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"DiscoveryContent", "", "state", "Lcom/robinhood/android/investFlow/search/DiscoveryViewState$Loaded;", "callbacks", "Lcom/robinhood/android/investFlow/search/DiscoveryCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/investFlow/search/DiscoveryViewState$Loaded;Lcom/robinhood/android/investFlow/search/DiscoveryCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DiscoveryScreen", "Lcom/robinhood/android/investFlow/search/DiscoveryViewState;", "(Lcom/robinhood/android/investFlow/search/DiscoveryViewState;Lcom/robinhood/android/investFlow/search/DiscoveryCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "optionalSduiItems", "Landroidx/compose/foundation/lazy/LazyListScope;", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "PlaceholderDiscoveryScreen", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-invest-flow_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investFlow.search.DiscoveryScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class DiscoveryScreen4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoveryContent$lambda$0(DiscoveryViewState.Loaded loaded, DiscoveryScreen3 discoveryScreen3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DiscoveryContent(loaded, discoveryScreen3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiscoveryScreen$lambda$2(DiscoveryViewState discoveryViewState, DiscoveryScreen3 discoveryScreen3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DiscoveryScreen(discoveryViewState, discoveryScreen3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaceholderDiscoveryScreen$lambda$3(Modifier modifier, int i, int i2, Composer composer, int i3) {
        PlaceholderDiscoveryScreen(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: DiscoveryScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investFlow.search.DiscoveryScreenKt$DiscoveryContent$1 */
    static final class C193931 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ DiscoveryScreen3 $callbacks;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ DiscoveryViewState.Loaded $state;

        C193931(Modifier modifier, DiscoveryViewState.Loaded loaded, DiscoveryScreen3 discoveryScreen3) {
            this.$modifier = modifier;
            this.$state = loaded;
            this.$callbacks = discoveryScreen3;
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
                ComposerKt.traceEventStart(1440145257, i, -1, "com.robinhood.android.investFlow.search.DiscoveryContent.<anonymous> (DiscoveryScreen.kt:36)");
            }
            Modifier modifier = this.$modifier;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changedInstance(this.$callbacks);
            final DiscoveryViewState.Loaded loaded = this.$state;
            final DiscoveryScreen3 discoveryScreen3 = this.$callbacks;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.investFlow.search.DiscoveryScreenKt$DiscoveryContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DiscoveryScreen4.C193931.invoke$lambda$1$lambda$0(loaded, discoveryScreen3, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierM5146paddingqDBjuR0$default, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer, 0, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(DiscoveryViewState.Loaded loaded, DiscoveryScreen3 discoveryScreen3, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            DiscoveryScreen4.optionalSduiItems(LazyColumn, loaded.getHeader());
            DiscoverySection2.discoverySections(LazyColumn, loaded.getSections(), loaded.getSelectedIds(), discoveryScreen3);
            DiscoveryScreen4.optionalSduiItems(LazyColumn, loaded.getFooter());
            return Unit.INSTANCE;
        }
    }

    public static final void DiscoveryContent(final DiscoveryViewState.Loaded state, final DiscoveryScreen3 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1588870314);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1588870314, i3, -1, "com.robinhood.android.investFlow.search.DiscoveryContent (DiscoveryScreen.kt:34)");
            }
            SduiActionHandler3.ProvideActionHandler(callbacks, ComposableLambda3.rememberComposableLambda(1440145257, true, new C193931(modifier, state, callbacks), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investFlow.search.DiscoveryScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoveryScreen4.DiscoveryContent$lambda$0(state, callbacks, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DiscoveryScreen(final DiscoveryViewState state, final DiscoveryScreen3 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-530874134);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
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
                    ComposerKt.traceEventStart(-530874134, i3, -1, "com.robinhood.android.investFlow.search.DiscoveryScreen (DiscoveryScreen.kt:58)");
                }
                boolean z = false;
                if (!(state instanceof DiscoveryViewState.Error)) {
                    composerStartRestartGroup.startReplaceGroup(-1201542790);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i3 & 112) == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(callbacks))) {
                        z = true;
                    }
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new DiscoveryScreen5(callbacks);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i5 = (i3 >> 6) & 14;
                    Modifier modifier5 = modifier4;
                    ErrorScreenComposable.ErrorScreenComposable(modifier5, (Function0) ((KFunction) objRememberedValue), 0, null, null, null, null, false, composerStartRestartGroup, i5, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    modifier4 = modifier5;
                    composerStartRestartGroup.endReplaceGroup();
                } else if (state instanceof DiscoveryViewState.Loaded) {
                    composerStartRestartGroup.startReplaceGroup(-1201344266);
                    int i6 = i3 & 1008;
                    Modifier modifier6 = modifier4;
                    DiscoveryContent((DiscoveryViewState.Loaded) state, callbacks, modifier6, composerStartRestartGroup, i6, 0);
                    modifier4 = modifier6;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!Intrinsics.areEqual(state, DiscoveryViewState.Loading.INSTANCE)) {
                        composerStartRestartGroup.startReplaceGroup(931070527);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-1201146703);
                    PlaceholderDiscoveryScreen(modifier4, composerStartRestartGroup, (i3 >> 6) & 14, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investFlow.search.DiscoveryScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DiscoveryScreen4.DiscoveryScreen$lambda$2(state, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            boolean z2 = false;
            if (!(state instanceof DiscoveryViewState.Error)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: DiscoveryScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investFlow.search.DiscoveryScreenKt$PlaceholderDiscoveryScreen$1 */
    static final class C193941 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;

        C193941(Modifier modifier) {
            this.$modifier = modifier;
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
                ComposerKt.traceEventStart(-412013599, i, -1, "com.robinhood.android.investFlow.search.PlaceholderDiscoveryScreen.<anonymous> (DiscoveryScreen.kt:94)");
            }
            Modifier modifier = this.$modifier;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.investFlow.search.DiscoveryScreenKt$PlaceholderDiscoveryScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DiscoveryScreen4.C193941.invoke$lambda$1$lambda$0((LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifier, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer, 805306368, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.items$default(LazyColumn, 2, null, null, DiscoveryScreen.INSTANCE.m15506getLambda$2077418877$feature_invest_flow_externalDebug(), 6, null);
            return Unit.INSTANCE;
        }
    }

    private static final void PlaceholderDiscoveryScreen(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(601803633);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(601803633, i3, -1, "com.robinhood.android.investFlow.search.PlaceholderDiscoveryScreen (DiscoveryScreen.kt:93)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(-412013599, true, new C193941(modifier), composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investFlow.search.DiscoveryScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DiscoveryScreen4.PlaceholderDiscoveryScreen$lambda$3(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void optionalSduiItems(LazyListScope lazyListScope, ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        if (immutableList != null) {
            SduiColumns.sduiItems(lazyListScope, immutableList, GenericAction.class, null, null, HorizontalPadding.Default);
        }
    }
}
