package com.robinhood.android.referral.rewardoffers.referralOffer.sdui;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.IconButton5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.page.StandardPageFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.CenterAlignedListPage;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.PageThemeOverride;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.robinhood.models.serverdriven.experimental.api.TopAlignedListPage;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.noties.markwon.Markwon;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReferralOfferV2SduiFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\"#B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016J\r\u0010\u001d\u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010\u001fJ\r\u0010 \u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010\u001fJ\r\u0010!\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010\u001fR\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/sdui/ReferralOfferV2SduiFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/page/StandardPageFragment;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/sdui/ReferralOfferV2SduiFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/referral/rewardoffers/referralOffer/sdui/ReferralOfferV2SduiFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "content", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "getContent", "()Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "handle", "", "action", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "OfferToolbar", "ScreenContent", "Callbacks", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ReferralOfferV2SduiFragment extends StandardPageFragment<GenericAction> implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof ReferralOfferV2SduiFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ReferralOfferV2SduiFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/referral/rewardoffers/referralOffer/sdui/ReferralOfferV2SduiFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ReferralOfferV2SduiFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/sdui/ReferralOfferV2SduiFragment$Callbacks;", "", "onPastRewardsClicked", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPastRewardsClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(ReferralOfferV2SduiFragment referralOfferV2SduiFragment, int i, Composer composer, int i2) {
        referralOfferV2SduiFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OfferToolbar$lambda$1(ReferralOfferV2SduiFragment referralOfferV2SduiFragment, int i, Composer composer, int i2) {
        referralOfferV2SduiFragment.OfferToolbar(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenContent$lambda$3(ReferralOfferV2SduiFragment referralOfferV2SduiFragment, int i, Composer composer, int i2) {
        referralOfferV2SduiFragment.ScreenContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.REFERRAL_REWARD_OFFER_DETAIL;
        String string2 = ((ReferralOfferV2SduiFragmentKey) INSTANCE.getArgs((Fragment) this)).getOfferId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment
    public Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.page.StandardPageFragment
    public StandardPageTemplate<GenericAction> getContent() {
        return ((ReferralOfferV2SduiFragmentKey) INSTANCE.getArgs((Fragment) this)).getContent();
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    public boolean mo15941handle(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.Deeplink) {
            return ActionHandlingFragment2.handleDeeplink(this, ((GenericAction.Deeplink) action).getValue2(), Boolean.FALSE);
        }
        if (action instanceof GenericAction.Dismiss) {
            requireActivity().onBackPressed();
            return true;
        }
        if (action instanceof GenericAction.InfoAlert) {
            return ActionHandlingFragment.handleAlert$default(this, ((GenericAction.InfoAlert) action).getValue2(), null, null, null, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(963513426);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(963513426, i2, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment.ComposeContent (ReferralOfferV2SduiFragment.kt:76)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1748422429, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(1748422429, i3, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment.ComposeContent.<anonymous> (ReferralOfferV2SduiFragment.kt:78)");
                    }
                    if (((ReferralOfferV2SduiFragmentKey) ReferralOfferV2SduiFragment.INSTANCE.getArgs((Fragment) ReferralOfferV2SduiFragment.this)).getContent().is_full_bleed()) {
                        composer2.startReplaceGroup(-2110730630);
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE), 0.0f, 1, null);
                        ReferralOfferV2SduiFragment referralOfferV2SduiFragment = ReferralOfferV2SduiFragment.this;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        referralOfferV2SduiFragment.ScreenContent(composer2, 0);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-2110491465);
                        Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE), 0.0f, 1, null);
                        ReferralOfferV2SduiFragment referralOfferV2SduiFragment2 = ReferralOfferV2SduiFragment.this;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default2);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        referralOfferV2SduiFragment2.ScreenContent(composer2, 0);
                        composer2.endNode();
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReferralOfferV2SduiFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void OfferToolbar(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1069712090);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1069712090, i2, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment.OfferToolbar (ReferralOfferV2SduiFragment.kt:99)");
            }
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-2141059129, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment.OfferToolbar.1
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
                        ComposerKt.traceEventStart(-2141059129, i3, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment.OfferToolbar.<anonymous> (ReferralOfferV2SduiFragment.kt:102)");
                    }
                    String title = ((ReferralOfferV2SduiFragmentKey) ReferralOfferV2SduiFragment.INSTANCE.getArgs((Fragment) ReferralOfferV2SduiFragment.this)).getContent().getTitle();
                    if (title != null) {
                        BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(375397147, true, new C269092(), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(925684604, true, new C269103(), composerStartRestartGroup, 54), null, ((ReferralOfferV2SduiFragmentKey) INSTANCE.getArgs((Fragment) this)).getContent().is_full_bleed(), false, null, null, 0L, null, composerStartRestartGroup, 1576326, 0, 1938);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReferralOfferV2SduiFragment.OfferToolbar$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ReferralOfferV2SduiFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment$OfferToolbar$2 */
    static final class C269092 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
        C269092() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
            invoke(bentoAppBarScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 6) == 0) {
                i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(375397147, i, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment.OfferToolbar.<anonymous> (ReferralOfferV2SduiFragment.kt:107)");
            }
            if (!((ReferralOfferV2SduiFragmentKey) ReferralOfferV2SduiFragment.INSTANCE.getArgs((Fragment) ReferralOfferV2SduiFragment.this)).getContent().getHide_back_button()) {
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(ReferralOfferV2SduiFragment.this);
                final ReferralOfferV2SduiFragment referralOfferV2SduiFragment = ReferralOfferV2SduiFragment.this;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment$OfferToolbar$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ReferralOfferV2SduiFragment.C269092.invoke$lambda$1$lambda$0(referralOfferV2SduiFragment);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(ReferralOfferV2SduiFragment referralOfferV2SduiFragment) {
            referralOfferV2SduiFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ReferralOfferV2SduiFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment$OfferToolbar$3 */
    static final class C269103 implements Function3<Row5, Composer, Integer, Unit> {
        C269103() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(925684604, i, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment.OfferToolbar.<anonymous> (ReferralOfferV2SduiFragment.kt:115)");
            }
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(ReferralOfferV2SduiFragment.this);
            final ReferralOfferV2SduiFragment referralOfferV2SduiFragment = ReferralOfferV2SduiFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment$OfferToolbar$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ReferralOfferV2SduiFragment.C269103.invoke$lambda$1$lambda$0(referralOfferV2SduiFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            IconButton5.IconButton((Function0) objRememberedValue, null, false, null, null, ReferralOfferV2SduiFragment2.INSTANCE.m18088getLambda$1550515367$feature_referral_externalDebug(), composer, 196608, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(ReferralOfferV2SduiFragment referralOfferV2SduiFragment) {
            referralOfferV2SduiFragment.getCallbacks().onPastRewardsClicked();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ScreenContent(Composer composer, final int i) {
        int i2;
        Arrangement.Vertical top;
        int i3;
        ImmutableList3 immutableList3PersistentListOf;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1029164728);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(this) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1029164728, i2, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment.ScreenContent (ReferralOfferV2SduiFragment.kt:132)");
            }
            final StandardPageTemplate<GenericAction> content = getContent();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment$ScreenContent$1$1
                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(GenericAction it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return this.this$0.handle(it);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-962331744);
            final Modifier.Companion companion = Modifier.INSTANCE;
            PageThemeOverride theme_override = content.getTheme_override();
            if (theme_override != null) {
                composerStartRestartGroup.startReplaceGroup(82012030);
                BentoTheme2.BentoTheme(Boolean.valueOf(theme_override == PageThemeOverride.LIGHT), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(873647597, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment$ScreenContent$$inlined$SduiStandardPage$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: SduiStandardPage.kt */
                    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¨\u0006\u0003"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "com/robinhood/android/libdesignsystem/serverui/experimental/compose/SduiStandardPageKt$SduiStandardPage$1$1$1"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPageKt$SduiStandardPage$1$1$1", m3645f = "SduiStandardPage.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment$ScreenContent$$inlined$SduiStandardPage$1$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ long $backgroundedColor;
                        final /* synthetic */ SystemUiController $systemUiController;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(SystemUiController systemUiController, long j, Continuation continuation) {
                            super(2, continuation);
                            this.$systemUiController = systemUiController;
                            this.$backgroundedColor = j;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$systemUiController, this.$backgroundedColor, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            SystemUiController.m9212setStatusBarColorek8zF_U$default(this.$systemUiController, this.$backgroundedColor, false, null, 6, null);
                            return Unit.INSTANCE;
                        }
                    }

                    public final void invoke(Composer composer2, int i4) {
                        Arrangement.Vertical top2;
                        ImmutableList3 immutableList3PersistentListOf2;
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(873647597, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStandardPage.<anonymous> (SduiStandardPage.kt:34)");
                        }
                        StandardPageTemplate standardPageTemplate = content;
                        SduiActionHandler sduiActionHandler2 = sduiActionHandler;
                        Modifier modifier = companion;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier, bentoTheme.getColors(composer2, i5).m21371getBg0d7_KjU(), null, 2, null);
                        composer2.startReplaceGroup(-430325605);
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifierM4872backgroundbw27NRU$default, 0.0f, 1, null);
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top3 = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top3, companion2.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        if (standardPageTemplate instanceof CenterAlignedListPage) {
                            top2 = arrangement.getCenter();
                        } else {
                            if (!(standardPageTemplate instanceof TopAlignedListPage)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            top2 = arrangement.getTop();
                        }
                        Modifier.Companion companion4 = Modifier.INSTANCE;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion2.getCenterHorizontally(), composer2, 48);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        ImmutableList3 persistentList = extensions2.toPersistentList(standardPageTemplate.getBody());
                        composer2.startReplaceGroup(-1772220517);
                        HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                        SduiColumns.SduiColumn(persistentList, GenericAction.class, companion4, null, sduiActionHandler2, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composer2, 100663296, 0);
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        List footer = standardPageTemplate.getFooter();
                        if (footer == null || (immutableList3PersistentListOf2 = extensions2.toPersistentList(footer)) == null) {
                            immutableList3PersistentListOf2 = extensions2.persistentListOf();
                        }
                        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 1, null);
                        composer2.startReplaceGroup(-1772220517);
                        SduiColumns.SduiColumn(immutableList3PersistentListOf2, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, sduiActionHandler2, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composer2, 100666368, 0);
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        composer2.endReplaceGroup();
                        SystemUiController systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composer2, 0, 1);
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composer2, i5).m21371getBg0d7_KjU();
                        Unit unit = Unit.INSTANCE;
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChanged = composer2.changed(systemUiControllerRememberSystemUiController) | composer2.changed(jM21371getBg0d7_KjU);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new AnonymousClass1(systemUiControllerRememberSystemUiController, jM21371getBg0d7_KjU, null);
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                composerStartRestartGroup.endReplaceGroup();
                i3 = i2;
            } else {
                composerStartRestartGroup.startReplaceGroup(82611105);
                composerStartRestartGroup.startReplaceGroup(-430325605);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top2, companion2.getStart(), composerStartRestartGroup, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                if (content instanceof CenterAlignedListPage) {
                    top = arrangement.getCenter();
                } else {
                    if (!(content instanceof TopAlignedListPage)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    top = arrangement.getTop();
                }
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top, companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                ImmutableList3 persistentList = extensions2.toPersistentList(content.getBody());
                composerStartRestartGroup.startReplaceGroup(-1772220517);
                HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                i3 = i2;
                SduiColumns.SduiColumn(persistentList, GenericAction.class, companion, null, sduiActionHandler, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composerStartRestartGroup, 100663296, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                Iterable footer = content.getFooter();
                if (footer == null || (immutableList3PersistentListOf = extensions2.toPersistentList(footer)) == null) {
                    immutableList3PersistentListOf = extensions2.persistentListOf();
                }
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
                composerStartRestartGroup.startReplaceGroup(-1772220517);
                SduiColumns.SduiColumn(immutableList3PersistentListOf, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, sduiActionHandler, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composerStartRestartGroup, 100666368, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            OfferToolbar(composerStartRestartGroup, i3 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.sdui.ReferralOfferV2SduiFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReferralOfferV2SduiFragment.ScreenContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ReferralOfferV2SduiFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/sdui/ReferralOfferV2SduiFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/sdui/ReferralOfferV2SduiFragment;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/sdui/ReferralOfferV2SduiFragmentKey;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ReferralOfferV2SduiFragment, ReferralOfferV2SduiFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(ReferralOfferV2SduiFragmentKey referralOfferV2SduiFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, referralOfferV2SduiFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ReferralOfferV2SduiFragmentKey getArgs(ReferralOfferV2SduiFragment referralOfferV2SduiFragment) {
            return (ReferralOfferV2SduiFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, referralOfferV2SduiFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ReferralOfferV2SduiFragment newInstance(ReferralOfferV2SduiFragmentKey referralOfferV2SduiFragmentKey) {
            return (ReferralOfferV2SduiFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, referralOfferV2SduiFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ReferralOfferV2SduiFragment referralOfferV2SduiFragment, ReferralOfferV2SduiFragmentKey referralOfferV2SduiFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, referralOfferV2SduiFragment, referralOfferV2SduiFragmentKey);
        }
    }
}
