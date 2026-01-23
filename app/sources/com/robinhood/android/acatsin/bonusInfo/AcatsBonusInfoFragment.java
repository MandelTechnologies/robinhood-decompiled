package com.robinhood.android.acatsin.bonusInfo;

import android.net.Uri;
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
import com.robinhood.android.acats.contracts.AcatsFragmentKeys;
import com.robinhood.android.acatsin.bonusInfo.AcatsBonusInfoFragment;
import com.robinhood.android.acatsin.bonusInfo.AcatsBonusInfoViewState;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.ErrorScreenComposable;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.infoscreen.InfoScreenCallbacks;
import com.robinhood.compose.infoscreen.InfoScreenFooter;
import com.robinhood.compose.infoscreen.InfoScreenKt;
import com.robinhood.models.api.bonfire.ApiAcatsBonusModalContentResponse;
import com.robinhood.models.serverdriven.experimental.api.AspectFillRemoteImage;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
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
import kotlinx.collections.immutable.extensions2;

/* compiled from: AcatsBonusInfoFragment.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\r\u0010\u0017\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0018H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/compose/infoscreen/InfoScreenCallbacks;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "toolbarVisible", "", "getToolbarVisible", "()Z", "duxo", "Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "handle", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onCloseClicked", "Companion", "feature-acats-in_externalDebug", "viewState", "Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsBonusInfoFragment extends GenericActionHandlingFragment implements AutoLoggableFragment, InfoScreenCallbacks {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AcatsBonusInfoDuxo.class);
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(AcatsBonusInfoFragment acatsBonusInfoFragment, int i, Composer composer, int i2) {
        acatsBonusInfoFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
        return new Screen(Screen.Name.ACATS_IN_BONUS_MATCH, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsBonusInfoDuxo getDuxo() {
        return (AcatsBonusInfoDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment, com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle */
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.Deeplink) {
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
            return true;
        }
        if (action instanceof GenericAction.Dismiss) {
            onCloseClicked();
            return true;
        }
        return super.mo15941handle(action);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-747330065);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-747330065, i2, -1, "com.robinhood.android.acatsin.bonusInfo.AcatsBonusInfoFragment.ComposeContent (AcatsBonusInfoFragment.kt:51)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(635400644, true, new C78151(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.bonusInfo.AcatsBonusInfoFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsBonusInfoFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AcatsBonusInfoFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acatsin.bonusInfo.AcatsBonusInfoFragment$ComposeContent$1 */
    static final class C78151 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<AcatsBonusInfoViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C78151(SnapshotState4<? extends AcatsBonusInfoViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(635400644, i, -1, "com.robinhood.android.acatsin.bonusInfo.AcatsBonusInfoFragment.ComposeContent.<anonymous> (AcatsBonusInfoFragment.kt:55)");
            }
            AcatsBonusInfoViewState acatsBonusInfoViewStateComposeContent$lambda$0 = AcatsBonusInfoFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            if (acatsBonusInfoViewStateComposeContent$lambda$0 instanceof AcatsBonusInfoViewState.Loading) {
                composer.startReplaceGroup(1299810080);
                LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, true, false, composer, 384, 11);
                composer.endReplaceGroup();
            } else if (Intrinsics.areEqual(acatsBonusInfoViewStateComposeContent$lambda$0, AcatsBonusInfoViewState.Error.INSTANCE)) {
                composer.startReplaceGroup(1299956245);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(AcatsBonusInfoFragment.this);
                final AcatsBonusInfoFragment acatsBonusInfoFragment = AcatsBonusInfoFragment.this;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.acatsin.bonusInfo.AcatsBonusInfoFragment$ComposeContent$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AcatsBonusInfoFragment.C78151.invoke$lambda$1$lambda$0(acatsBonusInfoFragment);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                ErrorScreenComposable.ErrorScreenComposable(null, (Function0) objRememberedValue, 0, null, null, null, null, false, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
                composer.endReplaceGroup();
            } else {
                if (!(acatsBonusInfoViewStateComposeContent$lambda$0 instanceof AcatsBonusInfoViewState.Loaded)) {
                    composer.startReplaceGroup(734664596);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(1300227805);
                final ApiAcatsBonusModalContentResponse content = ((AcatsBonusInfoViewState.Loaded) acatsBonusInfoViewStateComposeContent$lambda$0).getContent();
                final AcatsBonusInfoFragment acatsBonusInfoFragment2 = AcatsBonusInfoFragment.this;
                ActionHandlingFragment2.ContentWithDialog(acatsBonusInfoFragment2, ComposableLambda3.rememberComposableLambda(-2096478458, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.bonusInfo.AcatsBonusInfoFragment$ComposeContent$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2096478458, i2, -1, "com.robinhood.android.acatsin.bonusInfo.AcatsBonusInfoFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous> (AcatsBonusInfoFragment.kt:69)");
                        }
                        String title = content.getTitle();
                        AspectFillRemoteImage<GenericAction> header_image = content.getHeader_image();
                        long jM21294getNightDotLight0d7_KjU = BentoColor.INSTANCE.m21294getNightDotLight0d7_KjU();
                        long jet = BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getJet();
                        InfoScreenKt.m21677InfoScreendNgdfXs(title, header_image, extensions2.toImmutableList(content.getContent()), acatsBonusInfoFragment2, null, jM21294getNightDotLight0d7_KjU, jet, true, new InfoScreenFooter.Sdui(extensions2.toImmutableList(content.getAction_buttons())), composer2, (InfoScreenFooter.Sdui.$stable << 24) | 12582912, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 48);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(AcatsBonusInfoFragment acatsBonusInfoFragment) {
            acatsBonusInfoFragment.getDuxo().fetchModal();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AcatsBonusInfoViewState ComposeContent$lambda$0(SnapshotState4<? extends AcatsBonusInfoViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.compose.infoscreen.InfoScreenCallbacks
    public void onCloseClicked() {
        requireBaseActivity().getOnBackPressedDispatcher().onBackPressed();
    }

    /* compiled from: AcatsBonusInfoFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/bonusInfo/AcatsBonusInfoFragment;", "Lcom/robinhood/android/acats/contracts/AcatsBonusModal;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsBonusInfoFragment, AcatsFragmentKeys> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsFragmentKeys acatsFragmentKeys) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, acatsFragmentKeys);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsFragmentKeys getArgs(AcatsBonusInfoFragment acatsBonusInfoFragment) {
            return (AcatsFragmentKeys) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsBonusInfoFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsBonusInfoFragment newInstance(AcatsFragmentKeys acatsFragmentKeys) {
            return (AcatsBonusInfoFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, acatsFragmentKeys);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsBonusInfoFragment acatsBonusInfoFragment, AcatsFragmentKeys acatsFragmentKeys) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsBonusInfoFragment, acatsFragmentKeys);
        }
    }
}
