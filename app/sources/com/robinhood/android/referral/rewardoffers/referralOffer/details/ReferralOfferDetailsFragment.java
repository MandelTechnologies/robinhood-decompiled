package com.robinhood.android.referral.rewardoffers.referralOffer.details;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Toast;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.growth.util.ErrorHandlingExtensions;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.referral.C26659R;
import com.robinhood.android.referral.lib.invite.Activities3;
import com.robinhood.android.referral.rewardoffers.referralOffer.SymmetricReferralPrepareInviteDialogFragment;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsEvent;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewData;
import com.robinhood.android.referral.rewardoffers.referralOffer.details.model.ReferralOfferDetailsViewState;
import com.robinhood.android.serverclientcomponents.alert.ClientComponentAlertFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.p355ui.referraloffer.ReferralOfferDetails;
import com.robinhood.models.p355ui.referraloffer.ReferralOfferInfoSheet;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ReferralEntryPointContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: ReferralOfferDetailsFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003?@AB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u001d\u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010\u001fJ\u001a\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u001eH\u0016J-\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-2\u000e\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0/2\u0006\u00100\u001a\u000201H\u0016¢\u0006\u0002\u00102J\u0010\u00103\u001a\u00020\u001e2\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u00020\u001eH\u0016J\u0010\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u00020\u001eH\u0002R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B²\u0006\n\u0010C\u001a\u00020DX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/serverclientcomponents/alert/ClientComponentAlertFragment$Callbacks;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/SymmetricReferralPrepareInviteDialogFragment$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsDuxo;", "getDuxo", "()Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "invitePreparationDialogJob", "Lkotlinx/coroutines/Job;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "consumeEvent", "event", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent;", "showPreparationAlert", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsEvent$ShowPreparationAlert;", "onSendInvitesCancelled", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onActionClicked", "", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "onDestroyView", "showInviteSentConfirmation", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction$InfoAlertAction;", "showPermissionExplanation", "Callbacks", "Args", "Companion", "feature-referral_externalDebug", "viewState", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/model/ReferralOfferDetailsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class ReferralOfferDetailsFragment extends GenericComposeFragment implements ClientComponentAlertFragment.Callbacks, SymmetricReferralPrepareInviteDialogFragment.Callbacks, AutoLoggableFragment {
    private static final int CONTACTS_REQUEST_CODE = 99;
    private static final long MIN_PREPARING_REFERRAL_LOADING_TIME_MS = 2000;
    private static final String PREPARE_INVITE_DIALOG = "prepare-invite-dialog";
    private Job invitePreparationDialogJob;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ReferralOfferDetailsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, ReferralOfferDetailsDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof ReferralOfferDetailsFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: ReferralOfferDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsFragment$Callbacks;", "", "onShowInfoSheet", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/ui/referraloffer/ReferralOfferInfoSheet;", "onPastRewardsClicked", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onPastRewardsClicked();

        void onShowInfoSheet(ReferralOfferInfoSheet data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(ReferralOfferDetailsFragment referralOfferDetailsFragment, int i, Composer composer, int i2) {
        referralOfferDetailsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return "RewardOfferDetailsFragment";
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.REFERRAL_REWARD_OFFER_DETAIL;
        String string2 = ((Args) INSTANCE.getArgs((Fragment) this)).getDetails().getId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReferralOfferDetailsDuxo getDuxo() {
        return (ReferralOfferDetailsDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(824075981);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(824075981, i2, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment.ComposeContent (ReferralOfferDetailsFragment.kt:72)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(getScarletManager()), null, ComposableLambda3.rememberComposableLambda(1739060443, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment.ComposeContent.1

                /* compiled from: ReferralOfferDetailsFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<ReferralOfferDetailsViewState> $viewState$delegate;
                    final /* synthetic */ ReferralOfferDetailsFragment this$0;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(ReferralOfferDetailsFragment referralOfferDetailsFragment, SnapshotState4<? extends ReferralOfferDetailsViewState> snapshotState4) {
                        this.this$0 = referralOfferDetailsFragment;
                        this.$viewState$delegate = snapshotState4;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:69:0x0204  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x022f  */
                    /* JADX WARN: Removed duplicated region for block: B:79:0x025a  */
                    /* JADX WARN: Removed duplicated region for block: B:84:0x0285  */
                    /* JADX WARN: Removed duplicated region for block: B:89:0x02b0  */
                    /* JADX WARN: Removed duplicated region for block: B:94:0x02d9  */
                    /* JADX WARN: Removed duplicated region for block: B:97:0x0314  */
                    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(Composer composer, int i) {
                        ReferralEntryPointContext referralEntryPointContext;
                        boolean zChangedInstance;
                        final ReferralOfferDetailsFragment referralOfferDetailsFragment;
                        Object objRememberedValue;
                        boolean zChangedInstance2;
                        final ReferralOfferDetailsFragment referralOfferDetailsFragment2;
                        Object objRememberedValue2;
                        boolean zChangedInstance3;
                        final ReferralOfferDetailsFragment referralOfferDetailsFragment3;
                        Object objRememberedValue3;
                        boolean zChangedInstance4;
                        final ReferralOfferDetailsFragment referralOfferDetailsFragment4;
                        Object objRememberedValue4;
                        boolean zChangedInstance5;
                        final ReferralOfferDetailsFragment referralOfferDetailsFragment5;
                        Object objRememberedValue5;
                        boolean zChangedInstance6;
                        final ReferralOfferDetailsFragment referralOfferDetailsFragment6;
                        Object objRememberedValue6;
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-213242512, i, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment.ComposeContent.<anonymous>.<anonymous> (ReferralOfferDetailsFragment.kt:76)");
                        }
                        Screen eventScreen = this.this$0.getEventScreen();
                        Companion companion = ReferralOfferDetailsFragment.INSTANCE;
                        String source = ((Args) companion.getArgs((Fragment) this.this$0)).getSource();
                        if (source == null) {
                            source = "uncategorized";
                        }
                        String initialSource = ((Args) companion.getArgs((Fragment) this.this$0)).getInitialSource();
                        if (initialSource == null) {
                            initialSource = "";
                        }
                        ReferralEntryPointContext referralEntryPointContext2 = new ReferralEntryPointContext(source, initialSource, null, 4, null);
                        FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                        DisplayMetrics displayMetrics = Activity.getDisplayMetrics(fragmentActivityRequireActivity);
                        String title = ((Args) companion.getArgs((Fragment) this.this$0)).getDetails().getTitle();
                        ReferralOfferDetailsViewState referralOfferDetailsViewStateComposeContent$lambda$0 = ReferralOfferDetailsFragment.ComposeContent$lambda$0(this.$viewState$delegate);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance7 = composer.changedInstance(this.this$0);
                        final ReferralOfferDetailsFragment referralOfferDetailsFragment7 = this.this$0;
                        Object objRememberedValue7 = composer.rememberedValue();
                        if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$1$lambda$0(referralOfferDetailsFragment7);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue7);
                        }
                        Function0 function0 = (Function0) objRememberedValue7;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance8 = composer.changedInstance(this.this$0);
                        final ReferralOfferDetailsFragment referralOfferDetailsFragment8 = this.this$0;
                        Object objRememberedValue8 = composer.rememberedValue();
                        if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$3$lambda$2(referralOfferDetailsFragment8);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue8);
                        }
                        Function0 function02 = (Function0) objRememberedValue8;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance9 = composer.changedInstance(this.this$0);
                        final ReferralOfferDetailsFragment referralOfferDetailsFragment9 = this.this$0;
                        Object objRememberedValue9 = composer.rememberedValue();
                        if (zChangedInstance9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$5$lambda$4(referralOfferDetailsFragment9);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue9);
                        }
                        Function0 function03 = (Function0) objRememberedValue9;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance10 = composer.changedInstance(this.this$0);
                        final ReferralOfferDetailsFragment referralOfferDetailsFragment10 = this.this$0;
                        Object objRememberedValue10 = composer.rememberedValue();
                        if (zChangedInstance10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$7$lambda$6(referralOfferDetailsFragment10, (Uri) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue10);
                        }
                        Function1 function1 = (Function1) objRememberedValue10;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance11 = composer.changedInstance(this.this$0);
                        final ReferralOfferDetailsFragment referralOfferDetailsFragment11 = this.this$0;
                        Object objRememberedValue11 = composer.rememberedValue();
                        if (zChangedInstance11 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue11 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$9$lambda$8(referralOfferDetailsFragment11);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue11);
                        }
                        Function0 function04 = (Function0) objRememberedValue11;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance12 = composer.changedInstance(this.this$0);
                        final ReferralOfferDetailsFragment referralOfferDetailsFragment12 = this.this$0;
                        Object objRememberedValue12 = composer.rememberedValue();
                        if (zChangedInstance12 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue12 = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$11$lambda$10(referralOfferDetailsFragment12, (ReferralOfferDetailsViewData.ContactInfo) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue12);
                        }
                        Function1 function12 = (Function1) objRememberedValue12;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance13 = composer.changedInstance(this.this$0);
                        final ReferralOfferDetailsFragment referralOfferDetailsFragment13 = this.this$0;
                        Object objRememberedValue13 = composer.rememberedValue();
                        if (zChangedInstance13 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue13 = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$13$lambda$12(referralOfferDetailsFragment13, (ReferralOfferDetailsViewData.ContactInfo) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue13);
                        }
                        Function1 function13 = (Function1) objRememberedValue13;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance14 = composer.changedInstance(this.this$0);
                        final ReferralOfferDetailsFragment referralOfferDetailsFragment14 = this.this$0;
                        Object objRememberedValue14 = composer.rememberedValue();
                        if (zChangedInstance14 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue14 = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$15$lambda$14(referralOfferDetailsFragment14, (ReferralOfferDetailsViewData.ContactInfo) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue14);
                        }
                        Function1 function14 = (Function1) objRememberedValue14;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance15 = composer.changedInstance(this.this$0);
                        final ReferralOfferDetailsFragment referralOfferDetailsFragment15 = this.this$0;
                        Object objRememberedValue15 = composer.rememberedValue();
                        if (!zChangedInstance15) {
                            referralEntryPointContext = referralEntryPointContext2;
                            if (objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                            }
                            Function0 function05 = (Function0) objRememberedValue15;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            zChangedInstance = composer.changedInstance(this.this$0);
                            referralOfferDetailsFragment = this.this$0;
                            objRememberedValue = composer.rememberedValue();
                            if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda14
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$19$lambda$18(referralOfferDetailsFragment);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function06 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            zChangedInstance2 = composer.changedInstance(this.this$0);
                            referralOfferDetailsFragment2 = this.this$0;
                            objRememberedValue2 = composer.rememberedValue();
                            if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$21$lambda$20(referralOfferDetailsFragment2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Function0 function07 = (Function0) objRememberedValue2;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            zChangedInstance3 = composer.changedInstance(this.this$0);
                            referralOfferDetailsFragment3 = this.this$0;
                            objRememberedValue3 = composer.rememberedValue();
                            if (!zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$23$lambda$22(referralOfferDetailsFragment3);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            Function0 function08 = (Function0) objRememberedValue3;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            zChangedInstance4 = composer.changedInstance(this.this$0);
                            referralOfferDetailsFragment4 = this.this$0;
                            objRememberedValue4 = composer.rememberedValue();
                            if (!zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$25$lambda$24(referralOfferDetailsFragment4, (String) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue4);
                            }
                            Function1 function15 = (Function1) objRememberedValue4;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            zChangedInstance5 = composer.changedInstance(this.this$0);
                            referralOfferDetailsFragment5 = this.this$0;
                            objRememberedValue5 = composer.rememberedValue();
                            if (!zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$27$lambda$26(referralOfferDetailsFragment5, (String) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue5);
                            }
                            Function1 function16 = (Function1) objRememberedValue5;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            zChangedInstance6 = composer.changedInstance(this.this$0);
                            referralOfferDetailsFragment6 = this.this$0;
                            objRememberedValue6 = composer.rememberedValue();
                            if (!zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$29$lambda$28(referralOfferDetailsFragment6, ((Boolean) obj).booleanValue());
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue6);
                            }
                            composer.endReplaceGroup();
                            ReferralOfferDetailsComposableKt.ReferralOfferDetailsComposable(eventScreen, referralEntryPointContext, displayMetrics, title, referralOfferDetailsViewStateComposeContent$lambda$0, function0, function02, function03, function1, function04, function12, function13, function14, function05, function06, function07, function08, function15, function16, null, (Function1) objRememberedValue6, composer, 0, 0, 0, 524288);
                            if (ComposerKt.isTraceInProgress()) {
                                return;
                            }
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        referralEntryPointContext = referralEntryPointContext2;
                        objRememberedValue15 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$17$lambda$16(referralOfferDetailsFragment15);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue15);
                        Function0 function052 = (Function0) objRememberedValue15;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        zChangedInstance = composer.changedInstance(this.this$0);
                        referralOfferDetailsFragment = this.this$0;
                        objRememberedValue = composer.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$19$lambda$18(referralOfferDetailsFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function062 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        zChangedInstance2 = composer.changedInstance(this.this$0);
                        referralOfferDetailsFragment2 = this.this$0;
                        objRememberedValue2 = composer.rememberedValue();
                        if (!zChangedInstance2) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$21$lambda$20(referralOfferDetailsFragment2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function072 = (Function0) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        zChangedInstance3 = composer.changedInstance(this.this$0);
                        referralOfferDetailsFragment3 = this.this$0;
                        objRememberedValue3 = composer.rememberedValue();
                        if (!zChangedInstance3) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$23$lambda$22(referralOfferDetailsFragment3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function082 = (Function0) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        zChangedInstance4 = composer.changedInstance(this.this$0);
                        referralOfferDetailsFragment4 = this.this$0;
                        objRememberedValue4 = composer.rememberedValue();
                        if (!zChangedInstance4) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$25$lambda$24(referralOfferDetailsFragment4, (String) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        Function1 function152 = (Function1) objRememberedValue4;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        zChangedInstance5 = composer.changedInstance(this.this$0);
                        referralOfferDetailsFragment5 = this.this$0;
                        objRememberedValue5 = composer.rememberedValue();
                        if (!zChangedInstance5) {
                            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$27$lambda$26(referralOfferDetailsFragment5, (String) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue5);
                        }
                        Function1 function162 = (Function1) objRememberedValue5;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        zChangedInstance6 = composer.changedInstance(this.this$0);
                        referralOfferDetailsFragment6 = this.this$0;
                        objRememberedValue6 = composer.rememberedValue();
                        if (!zChangedInstance6) {
                            objRememberedValue6 = new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$ComposeContent$1$1$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ReferralOfferDetailsFragment.C268861.AnonymousClass1.invoke$lambda$29$lambda$28(referralOfferDetailsFragment6, ((Boolean) obj).booleanValue());
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue6);
                        }
                        composer.endReplaceGroup();
                        ReferralOfferDetailsComposableKt.ReferralOfferDetailsComposable(eventScreen, referralEntryPointContext, displayMetrics, title, referralOfferDetailsViewStateComposeContent$lambda$0, function0, function02, function03, function1, function04, function12, function13, function14, function052, function062, function072, function082, function152, function162, null, (Function1) objRememberedValue6, composer, 0, 0, 0, 524288);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(ReferralOfferDetailsFragment referralOfferDetailsFragment) {
                        referralOfferDetailsFragment.getDuxo().showAdditionalInfo();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$19$lambda$18(ReferralOfferDetailsFragment referralOfferDetailsFragment) {
                        referralOfferDetailsFragment.getDuxo().onShowPastRewardsClicked();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(ReferralOfferDetailsFragment referralOfferDetailsFragment) {
                        referralOfferDetailsFragment.requireActivity().onBackPressed();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$11$lambda$10(ReferralOfferDetailsFragment referralOfferDetailsFragment, ReferralOfferDetailsViewData.ContactInfo it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        referralOfferDetailsFragment.getDuxo().onInviteSingleContactClicked(it);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$13$lambda$12(ReferralOfferDetailsFragment referralOfferDetailsFragment, ReferralOfferDetailsViewData.ContactInfo it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        referralOfferDetailsFragment.getDuxo().onContactSelected(it);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$15$lambda$14(ReferralOfferDetailsFragment referralOfferDetailsFragment, ReferralOfferDetailsViewData.ContactInfo it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        referralOfferDetailsFragment.getDuxo().onContactDeselected(it);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$17$lambda$16(ReferralOfferDetailsFragment referralOfferDetailsFragment) {
                        referralOfferDetailsFragment.getDuxo().onClearSelectedContactsClicked();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$9$lambda$8(ReferralOfferDetailsFragment referralOfferDetailsFragment) {
                        referralOfferDetailsFragment.getDuxo().onInviteContactsClicked();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(ReferralOfferDetailsFragment referralOfferDetailsFragment) {
                        referralOfferDetailsFragment.getDuxo().onInviteAllSelectedContacts();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$6(ReferralOfferDetailsFragment referralOfferDetailsFragment, Uri it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Navigator navigator = referralOfferDetailsFragment.getNavigator();
                        Context contextRequireContext = referralOfferDetailsFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, it, null, null, false, null, 60, null);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$21$lambda$20(ReferralOfferDetailsFragment referralOfferDetailsFragment) {
                        referralOfferDetailsFragment.getDuxo().onSearchingStarted();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$23$lambda$22(ReferralOfferDetailsFragment referralOfferDetailsFragment) {
                        referralOfferDetailsFragment.getDuxo().onCancelSearchClicked();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$25$lambda$24(ReferralOfferDetailsFragment referralOfferDetailsFragment, String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        referralOfferDetailsFragment.getDuxo().onSearchQueryChanged(it);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$27$lambda$26(ReferralOfferDetailsFragment referralOfferDetailsFragment, String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        referralOfferDetailsFragment.getDuxo().onShareLinkButtonClicked(it);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$29$lambda$28(ReferralOfferDetailsFragment referralOfferDetailsFragment, boolean z) {
                        if (!z) {
                            referralOfferDetailsFragment.getDuxo().requestPermissionDismissed();
                        } else {
                            referralOfferDetailsFragment.requestPermissionsCompat(99, "android.permission.READ_CONTACTS");
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1739060443, i3, -1, "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment.ComposeContent.<anonymous> (ReferralOfferDetailsFragment.kt:75)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-213242512, true, new AnonymousClass1(ReferralOfferDetailsFragment.this, snapshotState4CollectAsStateWithLifecycle), composer3, 54), composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ReferralOfferDetailsFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReferralOfferDetailsViewState ComposeContent$lambda$0(SnapshotState4<? extends ReferralOfferDetailsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: ReferralOfferDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$onViewCreated$1", m3645f = "ReferralOfferDetailsFragment.kt", m3646l = {115}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$onViewCreated$1 */
    static final class C268871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C268871(Continuation<? super C268871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReferralOfferDetailsFragment.this.new C268871(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C268871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(ReferralOfferDetailsFragment.this.getDuxo().getEventFlow());
                final ReferralOfferDetailsFragment referralOfferDetailsFragment = ReferralOfferDetailsFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<ReferralOfferDetailsEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<ReferralOfferDetailsEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<ReferralOfferDetailsEvent> eventConsumerInvoke;
                        final ReferralOfferDetailsFragment referralOfferDetailsFragment2 = referralOfferDetailsFragment;
                        if ((event.getData() instanceof ReferralOfferDetailsEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Resources.NotFoundException {
                                    m18077invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m18077invoke(Object it) throws Resources.NotFoundException {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    referralOfferDetailsFragment2.consumeEvent((ReferralOfferDetailsEvent) event.getData());
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C268871(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void consumeEvent(ReferralOfferDetailsEvent event) throws Resources.NotFoundException {
        if (event instanceof ReferralOfferDetailsEvent.InviteContactViaEmail) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                Activities3.inviteViaEmail(activity, ((ReferralOfferDetailsEvent.InviteContactViaEmail) event).getData(), getString(C26659R.string.referral_offer_email_subject_line));
                return;
            }
            return;
        }
        if (event instanceof ReferralOfferDetailsEvent.InviteContactViaText) {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                Activities3.inviteViaText(activity2, ((ReferralOfferDetailsEvent.InviteContactViaText) event).getData());
                return;
            }
            return;
        }
        if (event instanceof ReferralOfferDetailsEvent.ShowInfoSheet) {
            getCallbacks().onShowInfoSheet(((ReferralOfferDetailsEvent.ShowInfoSheet) event).getContent());
            return;
        }
        if (event instanceof ReferralOfferDetailsEvent.ShowInviteSentConfirmation) {
            showInviteSentConfirmation(((ReferralOfferDetailsEvent.ShowInviteSentConfirmation) event).getAction());
            return;
        }
        if (Intrinsics.areEqual(event, ReferralOfferDetailsEvent.ShowPastRewards.INSTANCE)) {
            getCallbacks().onPastRewardsClicked();
            return;
        }
        if (Intrinsics.areEqual(event, ReferralOfferDetailsEvent.ShowPermissionExplanation.INSTANCE)) {
            showPermissionExplanation();
            return;
        }
        if (Intrinsics.areEqual(event, ReferralOfferDetailsEvent.ShowPermissionRequest.INSTANCE)) {
            requestPermissionsCompat(99, "android.permission.READ_CONTACTS");
            return;
        }
        if (event instanceof ReferralOfferDetailsEvent.ShowPreparationAlert) {
            showPreparationAlert((ReferralOfferDetailsEvent.ShowPreparationAlert) event);
            return;
        }
        if (Intrinsics.areEqual(event, ReferralOfferDetailsEvent.CancelInvitePreparation.INSTANCE)) {
            Job job = this.invitePreparationDialogJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            Fragment fragmentFindFragmentByTag = getParentFragmentManager().findFragmentByTag(PREPARE_INVITE_DIALOG);
            if (fragmentFindFragmentByTag instanceof DialogFragment) {
                ((DialogFragment) fragmentFindFragmentByTag).dismiss();
                return;
            }
            return;
        }
        if (!(event instanceof ReferralOfferDetailsEvent.InviteContactViaWhatsApp)) {
            throw new NoWhenBranchMatchedException();
        }
        FragmentActivity activity3 = getActivity();
        if (activity3 != null) {
            Activities3.inviteViaWhatsApp(activity3, ((ReferralOfferDetailsEvent.InviteContactViaWhatsApp) event).getMessage());
        }
    }

    private final void showPreparationAlert(ReferralOfferDetailsEvent.ShowPreparationAlert event) {
        SymmetricReferralPrepareInviteDialogFragment symmetricReferralPrepareInviteDialogFragment = (SymmetricReferralPrepareInviteDialogFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance$default(SymmetricReferralPrepareInviteDialogFragment.INSTANCE, new SymmetricReferralPrepareInviteDialogFragment.Args(event.getPreparationText(), event.getCancelCta()), this, 0, 4, null);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        symmetricReferralPrepareInviteDialogFragment.show(parentFragmentManager, PREPARE_INVITE_DIALOG);
        this.invitePreparationDialogJob = BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C268881(symmetricReferralPrepareInviteDialogFragment, null), 3, null);
    }

    /* compiled from: ReferralOfferDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$showPreparationAlert$1", m3645f = "ReferralOfferDetailsFragment.kt", m3646l = {182}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.rewardoffers.referralOffer.details.ReferralOfferDetailsFragment$showPreparationAlert$1 */
    static final class C268881 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SymmetricReferralPrepareInviteDialogFragment $prepareDialog;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C268881(SymmetricReferralPrepareInviteDialogFragment symmetricReferralPrepareInviteDialogFragment, Continuation<? super C268881> continuation) {
            super(2, continuation);
            this.$prepareDialog = symmetricReferralPrepareInviteDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReferralOfferDetailsFragment.this.new C268881(this.$prepareDialog, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C268881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(2000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Job job = ReferralOfferDetailsFragment.this.invitePreparationDialogJob;
            if (job != null && !job.isCancelled()) {
                this.$prepareDialog.dismissAllowingStateLoss();
                ReferralOfferDetailsFragment.this.getDuxo().inviteNextContact();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.referral.rewardoffers.referralOffer.SymmetricReferralPrepareInviteDialogFragment.Callbacks
    public void onSendInvitesCancelled() {
        getDuxo().onPreparationCanceled();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode != 99) {
            return;
        }
        boolean z = false;
        Integer orNull = ArraysKt.getOrNull(grantResults, 0);
        if (orNull != null && orNull.intValue() == 0) {
            z = true;
        }
        getDuxo().onPermissionRequestResult(z);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        if (button.getTypedAction() instanceof GenericAction.DeeplinkAction) {
            getDuxo().onInviteSentConfirmationAlertActionButtonClicked(button.getTitle());
            return false;
        }
        if (!(button.getTypedAction() instanceof GenericAction.DismissAction)) {
            return false;
        }
        getDuxo().onInviteSentConfirmationAlertDismissButtonClicked(button.getTitle());
        return false;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Activity.hideKeyboard$default(activity, false, 1, null);
        }
        super.onDestroyView();
    }

    private final void showInviteSentConfirmation(GenericAction.InfoAlertAction action) {
        ErrorHandlingExtensions.showAlert(this, action.getAlert(), "invite-confirmation-dialog");
    }

    private final void showPermissionExplanation() {
        Toast.makeText(getActivity(), C26659R.string.symmetric_referral_contacts_permission_denied, 0).show();
    }

    /* compiled from: ReferralOfferDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsFragment$Args;", "Landroid/os/Parcelable;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/ui/referraloffer/ReferralOfferDetails;", "isMultiSelectContactMember", "", "contactsPermissionGranted", "isRhsg", "isWhatsAppInstalled", "source", "", "initialSource", "<init>", "(Lcom/robinhood/models/ui/referraloffer/ReferralOfferDetails;ZZZZLjava/lang/String;Ljava/lang/String;)V", "getDetails", "()Lcom/robinhood/models/ui/referraloffer/ReferralOfferDetails;", "()Z", "getContactsPermissionGranted", "getSource", "()Ljava/lang/String;", "getInitialSource", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean contactsPermissionGranted;
        private final ReferralOfferDetails details;
        private final String initialSource;
        private final boolean isMultiSelectContactMember;
        private final boolean isRhsg;
        private final boolean isWhatsAppInstalled;
        private final String source;

        /* compiled from: ReferralOfferDetailsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ReferralOfferDetails referralOfferDetails = (ReferralOfferDetails) parcel.readParcelable(Args.class.getClassLoader());
                boolean z4 = false;
                boolean z5 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z5 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new Args(referralOfferDetails, z4, z5, z2, z3, parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ReferralOfferDetails referralOfferDetails, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                referralOfferDetails = args.details;
            }
            if ((i & 2) != 0) {
                z = args.isMultiSelectContactMember;
            }
            if ((i & 4) != 0) {
                z2 = args.contactsPermissionGranted;
            }
            if ((i & 8) != 0) {
                z3 = args.isRhsg;
            }
            if ((i & 16) != 0) {
                z4 = args.isWhatsAppInstalled;
            }
            if ((i & 32) != 0) {
                str = args.source;
            }
            if ((i & 64) != 0) {
                str2 = args.initialSource;
            }
            String str3 = str;
            String str4 = str2;
            boolean z5 = z4;
            boolean z6 = z2;
            return args.copy(referralOfferDetails, z, z6, z3, z5, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final ReferralOfferDetails getDetails() {
            return this.details;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsMultiSelectContactMember() {
            return this.isMultiSelectContactMember;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getContactsPermissionGranted() {
            return this.contactsPermissionGranted;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsRhsg() {
            return this.isRhsg;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsWhatsAppInstalled() {
            return this.isWhatsAppInstalled;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component7, reason: from getter */
        public final String getInitialSource() {
            return this.initialSource;
        }

        public final Args copy(ReferralOfferDetails details, boolean isMultiSelectContactMember, boolean contactsPermissionGranted, boolean isRhsg, boolean isWhatsAppInstalled, String source, String initialSource) {
            Intrinsics.checkNotNullParameter(details, "details");
            return new Args(details, isMultiSelectContactMember, contactsPermissionGranted, isRhsg, isWhatsAppInstalled, source, initialSource);
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
            return Intrinsics.areEqual(this.details, args.details) && this.isMultiSelectContactMember == args.isMultiSelectContactMember && this.contactsPermissionGranted == args.contactsPermissionGranted && this.isRhsg == args.isRhsg && this.isWhatsAppInstalled == args.isWhatsAppInstalled && Intrinsics.areEqual(this.source, args.source) && Intrinsics.areEqual(this.initialSource, args.initialSource);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.details.hashCode() * 31) + Boolean.hashCode(this.isMultiSelectContactMember)) * 31) + Boolean.hashCode(this.contactsPermissionGranted)) * 31) + Boolean.hashCode(this.isRhsg)) * 31) + Boolean.hashCode(this.isWhatsAppInstalled)) * 31;
            String str = this.source;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.initialSource;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Args(details=" + this.details + ", isMultiSelectContactMember=" + this.isMultiSelectContactMember + ", contactsPermissionGranted=" + this.contactsPermissionGranted + ", isRhsg=" + this.isRhsg + ", isWhatsAppInstalled=" + this.isWhatsAppInstalled + ", source=" + this.source + ", initialSource=" + this.initialSource + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.details, flags);
            dest.writeInt(this.isMultiSelectContactMember ? 1 : 0);
            dest.writeInt(this.contactsPermissionGranted ? 1 : 0);
            dest.writeInt(this.isRhsg ? 1 : 0);
            dest.writeInt(this.isWhatsAppInstalled ? 1 : 0);
            dest.writeString(this.source);
            dest.writeString(this.initialSource);
        }

        public Args(ReferralOfferDetails details, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2) {
            Intrinsics.checkNotNullParameter(details, "details");
            this.details = details;
            this.isMultiSelectContactMember = z;
            this.contactsPermissionGranted = z2;
            this.isRhsg = z3;
            this.isWhatsAppInstalled = z4;
            this.source = str;
            this.initialSource = str2;
        }

        public final ReferralOfferDetails getDetails() {
            return this.details;
        }

        public final boolean isMultiSelectContactMember() {
            return this.isMultiSelectContactMember;
        }

        public final boolean getContactsPermissionGranted() {
            return this.contactsPermissionGranted;
        }

        public final boolean isRhsg() {
            return this.isRhsg;
        }

        public final boolean isWhatsAppInstalled() {
            return this.isWhatsAppInstalled;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getInitialSource() {
            return this.initialSource;
        }
    }

    /* compiled from: ReferralOfferDetailsFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsFragment;", "Lcom/robinhood/android/referral/rewardoffers/referralOffer/details/ReferralOfferDetailsFragment$Args;", "<init>", "()V", "CONTACTS_REQUEST_CODE", "", "MIN_PREPARING_REFERRAL_LOADING_TIME_MS", "", "PREPARE_INVITE_DIALOG", "", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ReferralOfferDetailsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ReferralOfferDetailsFragment referralOfferDetailsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, referralOfferDetailsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ReferralOfferDetailsFragment newInstance(Args args) {
            return (ReferralOfferDetailsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ReferralOfferDetailsFragment referralOfferDetailsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, referralOfferDetailsFragment, args);
        }
    }
}
