package com.robinhood.curatedproductdiscovery.p291ui;

import android.net.Uri;
import android.os.Parcelable;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.NewProductsLandingPageGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.curatedproductdiscovery.p291ui.NewProductsLandingDataState;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: NewProductsLandingFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\t\u0010\u0018\u001a\u00020\u0019H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 ²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDuxo;", "getDuxo", "()Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDeeplinkClick", "deeplink", "", "onDisclosureClick", "link", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-curated-product-discovery_externalDebug", "state", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class NewProductsLandingFragment extends GenericComposeFragment implements AutoLoggableFragment, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(NewProductsLandingPageGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, NewProductsLandingDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NewProductsLandingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NewProductsLandingDataState.Status.values().length];
            try {
                iArr[NewProductsLandingDataState.Status.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NewProductsLandingDataState.Status.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NewProductsLandingDataState.Status.SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(NewProductsLandingFragment newProductsLandingFragment, int i, Composer composer, int i2) {
        newProductsLandingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
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

    private final NewProductsLandingDuxo getDuxo() {
        return (NewProductsLandingDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.NEW_PRODUCTS_LANDING, ((LegacyFragmentKey.NewProductsLanding) INSTANCE.getArgs((Fragment) this)).getSource(), null, null, 12, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-757785109);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-757785109, i2, -1, "com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragment.ComposeContent (NewProductsLandingFragment.kt:82)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            int i3 = WhenMappings.$EnumSwitchMapping$0[ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getStatus().ordinal()];
            if (i3 == 1) {
                composerStartRestartGroup.startReplaceGroup(1912957284);
                LocalShowPlaceholder.Loadable(true, null, null, ComposableSingletons$NewProductsLandingFragmentKt.INSTANCE.m2594xeff71997(), composerStartRestartGroup, 3078, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i3 == 2) {
                composerStartRestartGroup.startReplaceGroup(1912967025);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return NewProductsLandingFragment.ComposeContent$lambda$2$lambda$1(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                ErrorScreenComposable.ErrorScreenComposable(null, (Function0) objRememberedValue, 0, null, null, null, null, false, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i3 != 3) {
                    composerStartRestartGroup.startReplaceGroup(1912955444);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1912973011);
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-432248554, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragment.ComposeContent.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-432248554, i4, -1, "com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragment.ComposeContent.<anonymous> (NewProductsLandingFragment.kt:101)");
                        }
                        List<NewProductCardData> newProductCards = NewProductsLandingFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getNewProductCards();
                        NewProductsLandingFragment newProductsLandingFragment = NewProductsLandingFragment.this;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer2.changedInstance(newProductsLandingFragment);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new NewProductsLandingFragment$ComposeContent$2$1$1(newProductsLandingFragment);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        Function1 function1 = (Function1) ((KFunction) objRememberedValue2);
                        NewProductsLandingFragment newProductsLandingFragment2 = NewProductsLandingFragment.this;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer2.changedInstance(newProductsLandingFragment2);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new NewProductsLandingFragment$ComposeContent$2$2$1(newProductsLandingFragment2);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        NewProductsLandingFragmentKt.NewProductsLandingContent(newProductCards, function1, (Function1) ((KFunction) objRememberedValue3), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NewProductsLandingFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewProductsLandingViewState ComposeContent$lambda$0(SnapshotState4<NewProductsLandingViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(NewProductsLandingFragment newProductsLandingFragment) {
        newProductsLandingFragment.getDuxo().refresh(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDeeplinkClick(String deeplink) {
        Uri uri = Uri.parse(deeplink);
        Navigator navigator = getNavigator();
        Intrinsics.checkNotNull(uri);
        if (navigator.isDeepLinkSupported(uri)) {
            Navigator navigator2 = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator2, contextRequireContext, uri, Boolean.FALSE, null, false, null, 56, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDisclosureClick(String link) {
        WebUtils.viewUrl$default(getContext(), link, 0, 4, (Object) null);
    }

    /* compiled from: NewProductsLandingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$NewProductsLanding;", "Lcom/robinhood/android/navigation/FragmentResolver;", "<init>", "()V", "createFragment", "key", "feature-curated-product-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<NewProductsLandingFragment, LegacyFragmentKey.NewProductsLanding>, FragmentResolver<LegacyFragmentKey.NewProductsLanding> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.NewProductsLanding getArgs(NewProductsLandingFragment newProductsLandingFragment) {
            return (LegacyFragmentKey.NewProductsLanding) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, newProductsLandingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public NewProductsLandingFragment newInstance(LegacyFragmentKey.NewProductsLanding newProductsLanding) {
            return (NewProductsLandingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, newProductsLanding);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(NewProductsLandingFragment newProductsLandingFragment, LegacyFragmentKey.NewProductsLanding newProductsLanding) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, newProductsLandingFragment, newProductsLanding);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public NewProductsLandingFragment createFragment(LegacyFragmentKey.NewProductsLanding key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (NewProductsLandingFragment) NewProductsLandingFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
