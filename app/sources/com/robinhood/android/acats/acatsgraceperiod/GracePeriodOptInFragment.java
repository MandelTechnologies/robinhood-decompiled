package com.robinhood.android.acats.acatsgraceperiod;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.acats.acatsgraceperiod.GracePeriodOptInFragment;
import com.robinhood.android.acats.contracts.GracePeriodOptInResult;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.AcatsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.bonfire.transfer.ClawbackGracePeriodContent;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GracePeriodOptInFragment.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0006H\u0017¢\u0006\u0002\u0010\u0007J\t\u0010\b\u001a\u00020\tH\u0096\u0001R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/acats/acatsgraceperiod/GracePeriodOptInFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-acats-grace-period_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class GracePeriodOptInFragment extends GenericActionHandlingFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(AcatsRegionGate.INSTANCE);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(GracePeriodOptInFragment gracePeriodOptInFragment, int i, Composer composer, int i2) {
        gracePeriodOptInFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* compiled from: GracePeriodOptInFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acats.acatsgraceperiod.GracePeriodOptInFragment$ComposeContent$1 */
    static final class C74001 implements Function2<Composer, Integer, Unit> {

        /* compiled from: GracePeriodOptInFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acats.acatsgraceperiod.GracePeriodOptInFragment$ComposeContent$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ClawbackGracePeriodContent.Type.values().length];
                try {
                    iArr[ClawbackGracePeriodContent.Type.ELIGIBLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClawbackGracePeriodContent.Type.INELIGIBLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClawbackGracePeriodContent.Type.RESTRICTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C74001() {
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
                ComposerKt.traceEventStart(1410672827, i, -1, "com.robinhood.android.acats.acatsgraceperiod.GracePeriodOptInFragment.ComposeContent.<anonymous> (GracePeriodOptInFragment.kt:22)");
            }
            ClawbackGracePeriodContent apiPreCreateTransferResponse4 = (ClawbackGracePeriodContent) GracePeriodOptInFragment.INSTANCE.getArgs((Fragment) GracePeriodOptInFragment.this);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(GracePeriodOptInFragment.this);
            final GracePeriodOptInFragment gracePeriodOptInFragment = GracePeriodOptInFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.acats.acatsgraceperiod.GracePeriodOptInFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GracePeriodOptInFragment.C74001.invoke$lambda$1$lambda$0(gracePeriodOptInFragment, (ClawbackGracePeriodContent.Type) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(GracePeriodOptInFragment.this);
            final GracePeriodOptInFragment gracePeriodOptInFragment2 = GracePeriodOptInFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.acats.acatsgraceperiod.GracePeriodOptInFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return GracePeriodOptInFragment.C74001.invoke$lambda$3$lambda$2(gracePeriodOptInFragment2, (ClawbackGracePeriodContent.Type) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            GracePeriodOptInScreen.GracePeriodOptInScreen(apiPreCreateTransferResponse4, function1, (Function1) objRememberedValue2, null, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(GracePeriodOptInFragment gracePeriodOptInFragment, ClawbackGracePeriodContent.Type it) {
            Parcelable parcelable;
            Intrinsics.checkNotNullParameter(it, "it");
            int i = WhenMappings.$EnumSwitchMapping$0[((ClawbackGracePeriodContent) GracePeriodOptInFragment.INSTANCE.getArgs((Fragment) gracePeriodOptInFragment)).getType().ordinal()];
            if (i == 1) {
                parcelable = GracePeriodOptInResult.OptIn.INSTANCE;
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                parcelable = GracePeriodOptInResult.OptOut.INSTANCE;
            }
            FragmentActivity fragmentActivityRequireActivity = gracePeriodOptInFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            NavigationActivityResultContract3.finishWithResult(fragmentActivityRequireActivity, parcelable);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(GracePeriodOptInFragment gracePeriodOptInFragment, ClawbackGracePeriodContent.Type it) {
            Intrinsics.checkNotNullParameter(it, "it");
            int i = WhenMappings.$EnumSwitchMapping$0[((ClawbackGracePeriodContent) GracePeriodOptInFragment.INSTANCE.getArgs((Fragment) gracePeriodOptInFragment)).getType().ordinal()];
            if (i == 1) {
                FragmentActivity fragmentActivityRequireActivity = gracePeriodOptInFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                NavigationActivityResultContract3.finishWithResult(fragmentActivityRequireActivity, GracePeriodOptInResult.OptOut.INSTANCE);
            } else if (i == 2) {
                gracePeriodOptInFragment.requireActivity().finish();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Navigator navigator = gracePeriodOptInFragment.getNavigator();
                Context contextRequireContext = gracePeriodOptInFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse("robinhood://portfolio"), null, null, false, null, 60, null);
                gracePeriodOptInFragment.requireActivity().finish();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(292582640);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(292582640, i2, -1, "com.robinhood.android.acats.acatsgraceperiod.GracePeriodOptInFragment.ComposeContent (GracePeriodOptInFragment.kt:20)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1410672827, true, new C74001(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acats.acatsgraceperiod.GracePeriodOptInFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GracePeriodOptInFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GracePeriodOptInFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/acatsgraceperiod/GracePeriodOptInFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/acats/acatsgraceperiod/GracePeriodOptInFragment;", "Lcom/robinhood/models/api/bonfire/transfer/ClawbackGracePeriodContent;", "<init>", "()V", "feature-acats-grace-period_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<GracePeriodOptInFragment, ClawbackGracePeriodContent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ClawbackGracePeriodContent getArgs(GracePeriodOptInFragment gracePeriodOptInFragment) {
            return (ClawbackGracePeriodContent) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, gracePeriodOptInFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GracePeriodOptInFragment newInstance(ClawbackGracePeriodContent apiPreCreateTransferResponse4) {
            return (GracePeriodOptInFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, apiPreCreateTransferResponse4);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GracePeriodOptInFragment gracePeriodOptInFragment, ClawbackGracePeriodContent apiPreCreateTransferResponse4) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, gracePeriodOptInFragment, apiPreCreateTransferResponse4);
        }
    }
}
