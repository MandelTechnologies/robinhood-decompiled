package com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.ActionBar;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationFragment;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p355ui.bonfire.UiRewardCertificateInfo;
import com.robinhood.models.serverdriven.experimental.api.Color;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.EdgeToEdgeHost;
import com.robinhood.utils.p409ui.edge2edge.LocalEdgeToEdgeHost;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: FractionalRewardClaimConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0003\u0018\u0019\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0013\u001a\u00020\u0014H\u0017¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/referral/lib/fractionalRewards/claimConfirmation/FractionalRewardClaimConfirmationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "callbacks", "Lcom/robinhood/android/referral/lib/fractionalRewards/claimConfirmation/FractionalRewardClaimConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/referral/lib/fractionalRewards/claimConfirmation/FractionalRewardClaimConfirmationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "onDestroyView", "Callbacks", "Args", "Companion", "feature-lib-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class FractionalRewardClaimConfirmationFragment extends GenericComposeFragment implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof FractionalRewardClaimConfirmationFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(FractionalRewardClaimConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/referral/lib/fractionalRewards/claimConfirmation/FractionalRewardClaimConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FractionalRewardClaimConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/referral/lib/fractionalRewards/claimConfirmation/FractionalRewardClaimConfirmationFragment$Callbacks;", "", "onClaimFlowFinished", "", "upsellAlertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "feature-lib-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onClaimFlowFinished(GenericAlertContent<? extends GenericAction> upsellAlertContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(FractionalRewardClaimConfirmationFragment fractionalRewardClaimConfirmationFragment, int i, Composer composer, int i2) {
        fractionalRewardClaimConfirmationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        String primaryText;
        Screen.Name name = Screen.Name.CLAIMED_SCREEN;
        Companion companion = INSTANCE;
        String footerSubtitle = ((Args) companion.getArgs((Fragment) this)).getCertificateInfo().getFooterSubtitle();
        if (footerSubtitle == null || footerSubtitle.length() == 0) {
            primaryText = ((Args) companion.getArgs((Fragment) this)).getCertificateInfo().getPrimaryText();
        } else {
            primaryText = ((Args) companion.getArgs((Fragment) this)).getCertificateInfo().getFooterSubtitle();
        }
        if (primaryText == null) {
            primaryText = "";
        }
        return new Screen(name, null, primaryText, null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1571689981);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1571689981, i2, -1, "com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationFragment.ComposeContent (FractionalRewardClaimConfirmationFragment.kt:52)");
            }
            Color bgColorOverride = ((Args) INSTANCE.getArgs((Fragment) this)).getBgColorOverride();
            composerStartRestartGroup.startReplaceGroup(-1434413235);
            androidx.compose.p011ui.graphics.Color composeColor = bgColorOverride == null ? null : SduiColors2.toComposeColor(bgColorOverride, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1434413891);
            long jade = composeColor == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJade() : composeColor.getValue();
            composerStartRestartGroup.endReplaceGroup();
            EdgeToEdgeHost edgeToEdgeHost = (EdgeToEdgeHost) composerStartRestartGroup.consume(LocalEdgeToEdgeHost.getLocalEdgeToEdgeHost());
            if (edgeToEdgeHost != null) {
                edgeToEdgeHost.overrideSystemBarsStyle(false);
            }
            final long j = jade;
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-876458571, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationFragment.ComposeContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-876458571, i3, -1, "com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationFragment.ComposeContent.<anonymous> (FractionalRewardClaimConfirmationFragment.kt:59)");
                    }
                    long j2 = j;
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, 0L, 0L, 0L, j2, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1379400669, true, new AnonymousClass1(j2, this), composer2, 54), composer2, 805306368, 495);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: FractionalRewardClaimConfirmationFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ long $backgroundColor;
                    final /* synthetic */ FractionalRewardClaimConfirmationFragment this$0;

                    AnonymousClass1(long j, FractionalRewardClaimConfirmationFragment fractionalRewardClaimConfirmationFragment) {
                        this.$backgroundColor = j;
                        this.this$0 = fractionalRewardClaimConfirmationFragment;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(FractionalRewardClaimConfirmationFragment fractionalRewardClaimConfirmationFragment) {
                        fractionalRewardClaimConfirmationFragment.getCallbacks().onClaimFlowFinished(((Args) FractionalRewardClaimConfirmationFragment.INSTANCE.getArgs((Fragment) fractionalRewardClaimConfirmationFragment)).getUpsellAlertContent());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1379400669, i, -1, "com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationFragment.ComposeContent.<anonymous>.<anonymous> (FractionalRewardClaimConfirmationFragment.kt:62)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), this.$backgroundColor, null, 2, null), WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.INSTANCE, composer, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()));
                        final FractionalRewardClaimConfirmationFragment fractionalRewardClaimConfirmationFragment = this.this$0;
                        long j = this.$backgroundColor;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierWindowInsetsPadding);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Companion companion3 = FractionalRewardClaimConfirmationFragment.INSTANCE;
                        UiRewardCertificateInfo certificateInfo = ((Args) companion3.getArgs((Fragment) fractionalRewardClaimConfirmationFragment)).getCertificateInfo();
                        Color bgColorOverride = ((Args) companion3.getArgs((Fragment) fractionalRewardClaimConfirmationFragment)).getBgColorOverride();
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), j, null, 2, null);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(fractionalRewardClaimConfirmationFragment);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FractionalRewardClaimConfirmationFragment.C267211.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(fractionalRewardClaimConfirmationFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        FractionalRewardClaimConfirmationComposable.FractionalRewardClaimConfirmationComposable(certificateInfo, (Function0) objRememberedValue, modifierM4872backgroundbw27NRU$default, bgColorOverride, composer, 0, 0);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.lib.fractionalRewards.claimConfirmation.FractionalRewardClaimConfirmationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FractionalRewardClaimConfirmationFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getCallbacks().onClaimFlowFinished(((Args) INSTANCE.getArgs((Fragment) this)).getUpsellAlertContent());
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ActionBar supportActionBar;
        super.onDestroyView();
        if (getRhToolbar() == null || (supportActionBar = requireBaseActivity().getSupportActionBar()) == null) {
            return;
        }
        supportActionBar.setDisplayHomeAsUpEnabled(true);
    }

    /* compiled from: FractionalRewardClaimConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/referral/lib/fractionalRewards/claimConfirmation/FractionalRewardClaimConfirmationFragment$Args;", "Landroid/os/Parcelable;", "certificateInfo", "Lcom/robinhood/models/ui/bonfire/UiRewardCertificateInfo;", "upsellAlertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "bgColorOverride", "Lcom/robinhood/models/serverdriven/experimental/api/Color;", "<init>", "(Lcom/robinhood/models/ui/bonfire/UiRewardCertificateInfo;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/models/serverdriven/experimental/api/Color;)V", "getCertificateInfo", "()Lcom/robinhood/models/ui/bonfire/UiRewardCertificateInfo;", "getUpsellAlertContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "getBgColorOverride", "()Lcom/robinhood/models/serverdriven/experimental/api/Color;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Color bgColorOverride;
        private final UiRewardCertificateInfo certificateInfo;
        private final GenericAlertContent<GenericAction> upsellAlertContent;

        /* compiled from: FractionalRewardClaimConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UiRewardCertificateInfo) parcel.readParcelable(Args.class.getClassLoader()), (GenericAlertContent) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() == 0 ? null : Color.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, UiRewardCertificateInfo uiRewardCertificateInfo, GenericAlertContent genericAlertContent, Color color, int i, Object obj) {
            if ((i & 1) != 0) {
                uiRewardCertificateInfo = args.certificateInfo;
            }
            if ((i & 2) != 0) {
                genericAlertContent = args.upsellAlertContent;
            }
            if ((i & 4) != 0) {
                color = args.bgColorOverride;
            }
            return args.copy(uiRewardCertificateInfo, genericAlertContent, color);
        }

        /* renamed from: component1, reason: from getter */
        public final UiRewardCertificateInfo getCertificateInfo() {
            return this.certificateInfo;
        }

        public final GenericAlertContent<GenericAction> component2() {
            return this.upsellAlertContent;
        }

        /* renamed from: component3, reason: from getter */
        public final Color getBgColorOverride() {
            return this.bgColorOverride;
        }

        public final Args copy(UiRewardCertificateInfo certificateInfo, GenericAlertContent<? extends GenericAction> upsellAlertContent, Color bgColorOverride) {
            Intrinsics.checkNotNullParameter(certificateInfo, "certificateInfo");
            return new Args(certificateInfo, upsellAlertContent, bgColorOverride);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.certificateInfo, args.certificateInfo) && Intrinsics.areEqual(this.upsellAlertContent, args.upsellAlertContent) && this.bgColorOverride == args.bgColorOverride;
        }

        public int hashCode() {
            int iHashCode = this.certificateInfo.hashCode() * 31;
            GenericAlertContent<GenericAction> genericAlertContent = this.upsellAlertContent;
            int iHashCode2 = (iHashCode + (genericAlertContent == null ? 0 : genericAlertContent.hashCode())) * 31;
            Color color = this.bgColorOverride;
            return iHashCode2 + (color != null ? color.hashCode() : 0);
        }

        public String toString() {
            return "Args(certificateInfo=" + this.certificateInfo + ", upsellAlertContent=" + this.upsellAlertContent + ", bgColorOverride=" + this.bgColorOverride + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.certificateInfo, flags);
            dest.writeParcelable(this.upsellAlertContent, flags);
            Color color = this.bgColorOverride;
            if (color == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(color.name());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(UiRewardCertificateInfo certificateInfo, GenericAlertContent<? extends GenericAction> genericAlertContent, Color color) {
            Intrinsics.checkNotNullParameter(certificateInfo, "certificateInfo");
            this.certificateInfo = certificateInfo;
            this.upsellAlertContent = genericAlertContent;
            this.bgColorOverride = color;
        }

        public /* synthetic */ Args(UiRewardCertificateInfo uiRewardCertificateInfo, GenericAlertContent genericAlertContent, Color color, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uiRewardCertificateInfo, genericAlertContent, (i & 4) != 0 ? null : color);
        }

        public final UiRewardCertificateInfo getCertificateInfo() {
            return this.certificateInfo;
        }

        public final GenericAlertContent<GenericAction> getUpsellAlertContent() {
            return this.upsellAlertContent;
        }

        public final Color getBgColorOverride() {
            return this.bgColorOverride;
        }
    }

    /* compiled from: FractionalRewardClaimConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/lib/fractionalRewards/claimConfirmation/FractionalRewardClaimConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/referral/lib/fractionalRewards/claimConfirmation/FractionalRewardClaimConfirmationFragment;", "Lcom/robinhood/android/referral/lib/fractionalRewards/claimConfirmation/FractionalRewardClaimConfirmationFragment$Args;", "<init>", "()V", "feature-lib-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<FractionalRewardClaimConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(FractionalRewardClaimConfirmationFragment fractionalRewardClaimConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, fractionalRewardClaimConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public FractionalRewardClaimConfirmationFragment newInstance(Args args) {
            return (FractionalRewardClaimConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(FractionalRewardClaimConfirmationFragment fractionalRewardClaimConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, fractionalRewardClaimConfirmationFragment, args);
        }
    }
}
