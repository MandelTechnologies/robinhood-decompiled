package com.robinhood.android.taxcenter;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.taxcenter.TaxCenterFragment;
import com.robinhood.android.taxcenter.TaxCenterViewState;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TaxCenterFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/TaxCenterFragment;", "Lcom/robinhood/android/taxcenter/BaseTaxComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/taxcenter/TaxCenterDuxo;", "getDuxo", "()Lcom/robinhood/android/taxcenter/TaxCenterDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "AppBarActions", "", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V", "TaxCenterContent", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "listState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/Composer;I)V", "TaxCenterAppBar", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-tax-center_externalDebug", "viewState", "Lcom/robinhood/android/taxcenter/TaxCenterViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TaxCenterFragment extends BaseTaxComposeFragment implements AutoLoggableFragment {
    private static final String TAX_CENTER_HELP_LINK = "https://robinhood.com/support/documents-and-taxes/";

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, TaxCenterDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppBarActions$lambda$1(TaxCenterFragment taxCenterFragment, Row5 row5, int i, Composer composer, int i2) {
        taxCenterFragment.AppBarActions(row5, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxCenterAppBar$lambda$4(TaxCenterFragment taxCenterFragment, int i, Composer composer, int i2) {
        taxCenterFragment.TaxCenterAppBar(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxCenterContent$lambda$3(TaxCenterFragment taxCenterFragment, PaddingValues paddingValues, LazyListState lazyListState, int i, Composer composer, int i2) {
        taxCenterFragment.TaxCenterContent(paddingValues, lazyListState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(null, null, "TaxCenterPresenter", null, 11, null);
    }

    private final TaxCenterDuxo getDuxo() {
        return (TaxCenterDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.taxcenter.BaseTaxComposeFragment
    public void AppBarActions(final Row5 row5, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(row5, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-890759493);
        if ((i & 48) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 17) != 16 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-890759493, i2, -1, "com.robinhood.android.taxcenter.TaxCenterFragment.AppBarActions (TaxCenterFragment.kt:38)");
            }
            TaxCenterViewState taxCenterViewStateAppBarActions$lambda$0 = AppBarActions$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (!(taxCenterViewStateAppBarActions$lambda$0 instanceof TaxCenterViewState.Loading)) {
                if (!(taxCenterViewStateAppBarActions$lambda$0 instanceof TaxCenterViewState.Ready)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((TaxCenterViewState.Ready) taxCenterViewStateAppBarActions$lambda$0).getTaxCenterFeatureGateState()) {
                    TaxCenterAppBar(composerStartRestartGroup, (i2 >> 3) & 14);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.taxcenter.TaxCenterFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxCenterFragment.AppBarActions$lambda$1(this.f$0, row5, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.taxcenter.BaseTaxComposeFragment
    public void TaxCenterContent(final PaddingValues paddingValues, final LazyListState listState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Intrinsics.checkNotNullParameter(listState, "listState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-951880519);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(paddingValues) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(listState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-951880519, i3, -1, "com.robinhood.android.taxcenter.TaxCenterFragment.TaxCenterContent (TaxCenterFragment.kt:51)");
            }
            TaxCenterViewState taxCenterViewStateTaxCenterContent$lambda$2 = TaxCenterContent$lambda$2(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (taxCenterViewStateTaxCenterContent$lambda$2 instanceof TaxCenterViewState.Loading) {
                composerStartRestartGroup.startReplaceGroup(70863577);
                LoadingScreenComposablesKt.GenericLoadingScreenComposable(null, false, composerStartRestartGroup, 0, 3);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(taxCenterViewStateTaxCenterContent$lambda$2 instanceof TaxCenterViewState.Ready)) {
                    composerStartRestartGroup.startReplaceGroup(70861549);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-2098097176);
                ImmutableList immutableList = extensions2.toImmutableList(((TaxCenterViewState.Ready) taxCenterViewStateTaxCenterContent$lambda$2).getContent());
                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                composerStartRestartGroup.startReplaceGroup(767440808);
                SduiColumns.SduiLazyColumn(immutableList, GenericAction.class, modifierPadding, listState, null, null, HorizontalPadding.Default, false, composerStartRestartGroup, (((((i3 << 3) & 896) | 1572864) << 3) & 7168) | 12582912, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.taxcenter.TaxCenterFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxCenterFragment.TaxCenterContent$lambda$3(this.f$0, paddingValues, listState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void TaxCenterAppBar(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1352507354);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1352507354, i2, -1, "com.robinhood.android.taxcenter.TaxCenterFragment.TaxCenterAppBar (TaxCenterFragment.kt:67)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1435628475, true, new C292381(), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.taxcenter.TaxCenterFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxCenterFragment.TaxCenterAppBar$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: TaxCenterFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.taxcenter.TaxCenterFragment$TaxCenterAppBar$1 */
    static final class C292381 implements Function2<Composer, Integer, Unit> {
        C292381() {
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
                ComposerKt.traceEventStart(-1435628475, i, -1, "com.robinhood.android.taxcenter.TaxCenterFragment.TaxCenterAppBar.<anonymous> (TaxCenterFragment.kt:73)");
            }
            final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            String strStringResource = StringResources_androidKt.stringResource(C29236R.string.tax_center_help, composer, 0);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(userInteractionEventDescriptor) | composer.changedInstance(current) | composer.changedInstance(TaxCenterFragment.this);
            final TaxCenterFragment taxCenterFragment = TaxCenterFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.taxcenter.TaxCenterFragment$TaxCenterAppBar$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaxCenterFragment.C292381.invoke$lambda$1$lambda$0(userInteractionEventDescriptor, current, taxCenterFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierM5144paddingVpY3zN4$default, null, null, false, null, composer, 0, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, TaxCenterFragment taxCenterFragment) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.BUTTON, "tax-center-help-button", null, 4, null), null, null, false, 57, null);
            WebUtils.viewUrl$default(taxCenterFragment.getContext(), TaxCenterFragment.TAX_CENTER_HELP_LINK, 0, 4, (Object) null);
            return Unit.INSTANCE;
        }
    }

    private static final TaxCenterViewState AppBarActions$lambda$0(SnapshotState4<? extends TaxCenterViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final TaxCenterViewState TaxCenterContent$lambda$2(SnapshotState4<? extends TaxCenterViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: TaxCenterFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/taxcenter/TaxCenterFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/taxcenter/TaxCenterFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$TaxCenter;", "<init>", "()V", "TAX_CENTER_HELP_LINK", "", "feature-tax-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<TaxCenterFragment, LegacyFragmentKey.TaxCenter> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.TaxCenter taxCenter) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, taxCenter);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.TaxCenter getArgs(TaxCenterFragment taxCenterFragment) {
            return (LegacyFragmentKey.TaxCenter) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, taxCenterFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TaxCenterFragment newInstance(LegacyFragmentKey.TaxCenter taxCenter) {
            return (TaxCenterFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, taxCenter);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TaxCenterFragment taxCenterFragment, LegacyFragmentKey.TaxCenter taxCenter) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, taxCenterFragment, taxCenter);
        }
    }
}
