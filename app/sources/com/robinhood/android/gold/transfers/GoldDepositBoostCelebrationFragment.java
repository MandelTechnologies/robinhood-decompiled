package com.robinhood.android.gold.transfers;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.view.result.ActivityResultCaller;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationFragment;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferAmountPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferIdPref;
import com.robinhood.android.gold.transfers.prefs.GoldDepositBoostTransferTimestampPref;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
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
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import p479j$.time.Instant;

/* compiled from: GoldDepositBoostCelebrationFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0002+,B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\r\u0010(\u001a\u00020#H\u0017¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u001fH\u0016R$\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR$\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u000bR\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/gold/transfers/GoldDepositBoostCelebrationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "goldDepositBoostTransferIdPref", "Lcom/robinhood/prefs/StringPreference;", "getGoldDepositBoostTransferIdPref$annotations", "getGoldDepositBoostTransferIdPref", "()Lcom/robinhood/prefs/StringPreference;", "setGoldDepositBoostTransferIdPref", "(Lcom/robinhood/prefs/StringPreference;)V", "goldDepositBoostTransferAmountPref", "getGoldDepositBoostTransferAmountPref$annotations", "getGoldDepositBoostTransferAmountPref", "setGoldDepositBoostTransferAmountPref", "goldDepositBoostTransferTimestampPref", "getGoldDepositBoostTransferTimestampPref$annotations", "getGoldDepositBoostTransferTimestampPref", "setGoldDepositBoostTransferTimestampPref", "callbacks", "Lcom/robinhood/android/gold/transfers/GoldDepositBoostCelebrationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/gold/transfers/GoldDepositBoostCelebrationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "toolbarVisible", "", "getToolbarVisible", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "Callbacks", "Companion", "lib-gold-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldDepositBoostCelebrationFragment extends GenericComposeFragment implements AutoLoggableFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
            if (!(parentFragment instanceof GoldDepositBoostCelebrationFragment.Callbacks)) {
                parentFragment = null;
            }
            GoldDepositBoostCelebrationFragment.Callbacks callbacks = (GoldDepositBoostCelebrationFragment.Callbacks) parentFragment;
            if (callbacks != null) {
                return callbacks;
            }
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof GoldDepositBoostCelebrationFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    public StringPreference goldDepositBoostTransferAmountPref;
    public StringPreference goldDepositBoostTransferIdPref;
    public StringPreference goldDepositBoostTransferTimestampPref;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GoldDepositBoostCelebrationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/gold/transfers/GoldDepositBoostCelebrationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GoldDepositBoostCelebrationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/gold/transfers/GoldDepositBoostCelebrationFragment$Callbacks;", "", "onContinueClick", "", "lib-gold-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(GoldDepositBoostCelebrationFragment goldDepositBoostCelebrationFragment, int i, Composer composer, int i2) {
        goldDepositBoostCelebrationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @GoldDepositBoostTransferAmountPref
    public static /* synthetic */ void getGoldDepositBoostTransferAmountPref$annotations() {
    }

    @GoldDepositBoostTransferIdPref
    public static /* synthetic */ void getGoldDepositBoostTransferIdPref$annotations() {
    }

    @GoldDepositBoostTransferTimestampPref
    public static /* synthetic */ void getGoldDepositBoostTransferTimestampPref$annotations() {
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

    public final StringPreference getGoldDepositBoostTransferIdPref() {
        StringPreference stringPreference = this.goldDepositBoostTransferIdPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldDepositBoostTransferIdPref");
        return null;
    }

    public final void setGoldDepositBoostTransferIdPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.goldDepositBoostTransferIdPref = stringPreference;
    }

    public final StringPreference getGoldDepositBoostTransferAmountPref() {
        StringPreference stringPreference = this.goldDepositBoostTransferAmountPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldDepositBoostTransferAmountPref");
        return null;
    }

    public final void setGoldDepositBoostTransferAmountPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.goldDepositBoostTransferAmountPref = stringPreference;
    }

    public final StringPreference getGoldDepositBoostTransferTimestampPref() {
        StringPreference stringPreference = this.goldDepositBoostTransferTimestampPref;
        if (stringPreference != null) {
            return stringPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("goldDepositBoostTransferTimestampPref");
        return null;
    }

    public final void setGoldDepositBoostTransferTimestampPref(StringPreference stringPreference) {
        Intrinsics.checkNotNullParameter(stringPreference, "<set-?>");
        this.goldDepositBoostTransferTimestampPref = stringPreference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.GOLD_DEPOSIT_BONUS_CELEBRATION, null, ((UiPostTransferPage.GoldDepositBoostCelebration) INSTANCE.getArgs((Fragment) this)).getLoggingIdentifier(), null, 10, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        StringPreference goldDepositBoostTransferIdPref = getGoldDepositBoostTransferIdPref();
        Companion companion = INSTANCE;
        goldDepositBoostTransferIdPref.set(((UiPostTransferPage.GoldDepositBoostCelebration) companion.getArgs((Fragment) this)).getTransferId());
        getGoldDepositBoostTransferAmountPref().set(((UiPostTransferPage.GoldDepositBoostCelebration) companion.getArgs((Fragment) this)).getAmount());
        getGoldDepositBoostTransferTimestampPref().set(Instant.now().toString());
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1177725865);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1177725865, i2, -1, "com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationFragment.ComposeContent (GoldDepositBoostCelebrationFragment.kt:62)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-150876657, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-150876657, i3, -1, "com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationFragment.ComposeContent.<anonymous> (GoldDepositBoostCelebrationFragment.kt:64)");
                    }
                    SystemUiController.m9212setStatusBarColorek8zF_U$default(SystemUiController3.rememberSystemUiController(null, composer2, 0, 1), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), false, null, 6, null);
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, GoldDepositBoostCelebrationFragment.this.getEventScreen(), null, null, null, null, 61, null);
                    final GoldDepositBoostCelebrationFragment goldDepositBoostCelebrationFragment = GoldDepositBoostCelebrationFragment.this;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1725300474, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1725300474, i4, -1, "com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationFragment.ComposeContent.<anonymous>.<anonymous> (GoldDepositBoostCelebrationFragment.kt:66)");
                            }
                            UiPostTransferPage.GoldDepositBoostCelebration goldDepositBoostCelebration = (UiPostTransferPage.GoldDepositBoostCelebration) GoldDepositBoostCelebrationFragment.INSTANCE.getArgs((Fragment) goldDepositBoostCelebrationFragment);
                            Callbacks callbacks = goldDepositBoostCelebrationFragment.getCallbacks();
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer3.changedInstance(callbacks);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new GoldDepositBoostCelebrationFragment2(callbacks);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            GoldDepositBoostCelebrationComposable2.GoldDepositBoostCelebrationComposable(goldDepositBoostCelebration, (Function0) ((KFunction) objRememberedValue), null, composer3, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.transfers.GoldDepositBoostCelebrationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldDepositBoostCelebrationFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    /* compiled from: GoldDepositBoostCelebrationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/transfers/GoldDepositBoostCelebrationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/gold/transfers/GoldDepositBoostCelebrationFragment;", "Lcom/robinhood/models/ui/bonfire/UiPostTransferPage$GoldDepositBoostCelebration;", "<init>", "()V", "lib-gold-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<GoldDepositBoostCelebrationFragment, UiPostTransferPage.GoldDepositBoostCelebration> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UiPostTransferPage.GoldDepositBoostCelebration getArgs(GoldDepositBoostCelebrationFragment goldDepositBoostCelebrationFragment) {
            return (UiPostTransferPage.GoldDepositBoostCelebration) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, goldDepositBoostCelebrationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public GoldDepositBoostCelebrationFragment newInstance(UiPostTransferPage.GoldDepositBoostCelebration goldDepositBoostCelebration) {
            return (GoldDepositBoostCelebrationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, goldDepositBoostCelebration);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(GoldDepositBoostCelebrationFragment goldDepositBoostCelebrationFragment, UiPostTransferPage.GoldDepositBoostCelebration goldDepositBoostCelebration) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, goldDepositBoostCelebrationFragment, goldDepositBoostCelebration);
        }
    }
}
