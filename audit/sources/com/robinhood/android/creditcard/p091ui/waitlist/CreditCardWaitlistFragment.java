package com.robinhood.android.creditcard.p091ui.waitlist;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.ImmutableMap;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.daynight.NightModeManager2;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.creditcard.contracts.CreditCardApplicationSuvKey;
import com.robinhood.android.creditcard.contracts.CreditCardWaitlistFragmentKey;
import com.robinhood.android.creditcard.p091ui.waitlist.CreditApplicationReferralBottomSheet;
import com.robinhood.android.creditcard.p091ui.waitlist.CreditCardWaitlistEvent;
import com.robinhood.android.creditcard.p091ui.waitlist.CreditCardWaitlistFragment;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.LoadingComposable;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.SimplifiedWaitlistConfirmationComposable3;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.WaitlistConfirmationComposable3;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.WaitlistGoldComposable3;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.WaitlistJoinedComposable4;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.SolidGoldIntroComposable;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.TermsApplyBottomSheet;
import com.robinhood.android.creditcard.p091ui.waitlist.screens.intro.WaitlistIntroComposableKt;
import com.robinhood.android.designsystem.style.CreditCardSystemOverlay;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.lib.creditcard.CreditCardTabStyle;
import com.robinhood.android.lib.creditcard.CreditCardTabStyle2;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.redesign.accounttab.AccountSelectorTabArgs;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions;
import com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractions2;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.GoldContext;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: CreditCardWaitlistFragment.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u00022\u00020\u0003:\u00014B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0019H\u0016J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0016J\u0016\u0010%\u001a\u00020\u00192\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002J\u0017\u0010)\u001a\u00020\u00192\b\b\u0002\u0010*\u001a\u00020\rH\u0003¢\u0006\u0002\u0010+J\r\u0010,\u001a\u00020\u0019H\u0017¢\u0006\u0002\u0010-J\t\u0010.\u001a\u00020\rH\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\rX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0018\u0010/\u001a\b\u0012\u0004\u0012\u00020100X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065²\u0006\n\u00106\u001a\u00020\rX\u008a\u008e\u0002²\u0006\f\u00107\u001a\u0004\u0018\u000108X\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/lib/creditcard/HasCreditCardTabStyle;", "<init>", "()V", "duxo", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistFragmentDuxo;", "getDuxo", "()Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistFragmentDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "hasBottomBar", "", "getHasBottomBar", "()Z", "creditCardTabStyle", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/robinhood/android/lib/creditcard/CreditCardTabStyle;", "getCreditCardTabStyle", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setCreditCardTabStyle", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "isEmbedded", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "handleDuxoEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistEvent;", "Overlay", "init", "(ZLandroidx/compose/runtime/Composer;II)V", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-credit-card_externalDebug", "visible", "currentLifecycleValue", "Landroidx/lifecycle/Lifecycle$Event;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CreditCardWaitlistFragment extends GenericComposeFragment implements RegionGated, CreditCardTabStyle2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, CreditCardWaitlistFragmentDuxo.class);
    private final boolean hasBottomBar = true;
    private StateFlow2<CreditCardTabStyle> creditCardTabStyle = StateFlow4.MutableStateFlow(CreditCardTabStyle.NIGHT);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$18(CreditCardWaitlistFragment creditCardWaitlistFragment, int i, Composer composer, int i2) {
        creditCardWaitlistFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Overlay$lambda$7(CreditCardWaitlistFragment creditCardWaitlistFragment, boolean z, int i, int i2, Composer composer, int i3) {
        creditCardWaitlistFragment.Overlay(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDuxoEvent(final Event<CreditCardWaitlistEvent> event) {
        EventConsumer<CreditCardWaitlistEvent> eventConsumerInvoke;
        if (!(event.getData() instanceof CreditCardWaitlistEvent) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$handleDuxoEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m12866invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m12866invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CreditCardWaitlistEvent creditCardWaitlistEvent = (CreditCardWaitlistEvent) event.getData();
                if (Intrinsics.areEqual(creditCardWaitlistEvent, CreditCardWaitlistEvent.Error.INSTANCE)) {
                    ErrorDialog errorDialog = (ErrorDialog) ErrorDialog.INSTANCE.newInstance();
                    FragmentManager childFragmentManager = this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    errorDialog.show(childFragmentManager, "error-dialog");
                    return;
                }
                if (creditCardWaitlistEvent instanceof CreditCardWaitlistEvent.CreditApplicationReferralCodeLimitReached) {
                    CreditApplicationReferralBottomSheet creditApplicationReferralBottomSheet = (CreditApplicationReferralBottomSheet) CreditApplicationReferralBottomSheet.INSTANCE.newInstance((Parcelable) new CreditApplicationReferralBottomSheet.Args(CreditApplicationReferralBottomSheet.Args.Type.LIMITED_REACHED, ((CreditCardWaitlistEvent.CreditApplicationReferralCodeLimitReached) creditCardWaitlistEvent).getReferrerFirstName()));
                    FragmentManager childFragmentManager2 = this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                    creditApplicationReferralBottomSheet.show(childFragmentManager2, "credit-application-referral-error");
                    return;
                }
                if (!(creditCardWaitlistEvent instanceof CreditCardWaitlistEvent.CreditApplicationReferralAccountIneligible)) {
                    throw new NoWhenBranchMatchedException();
                }
                CreditApplicationReferralBottomSheet creditApplicationReferralBottomSheet2 = (CreditApplicationReferralBottomSheet) CreditApplicationReferralBottomSheet.INSTANCE.newInstance((Parcelable) new CreditApplicationReferralBottomSheet.Args(CreditApplicationReferralBottomSheet.Args.Type.INELIGIBLE, null, 2, null));
                FragmentManager childFragmentManager3 = this.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                creditApplicationReferralBottomSheet2.show(childFragmentManager3, "credit-application-referral-error");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreditCardWaitlistFragmentDuxo getDuxo() {
        return (CreditCardWaitlistFragmentDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.lib.creditcard.CreditCardTabStyle2
    public StateFlow2<CreditCardTabStyle> getCreditCardTabStyle() {
        return this.creditCardTabStyle;
    }

    public void setCreditCardTabStyle(StateFlow2<CreditCardTabStyle> stateFlow2) {
        Intrinsics.checkNotNullParameter(stateFlow2, "<set-?>");
        this.creditCardTabStyle = stateFlow2;
    }

    private static final Lifecycle.Event ComposeContent$lambda$9(SnapshotState<Lifecycle.Event> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean Overlay$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private final boolean isEmbedded() {
        AccountSelectorTabArgs accountSelectorTabArgs = ((CreditCardWaitlistFragmentKey) INSTANCE.getArgs((Fragment) this)).getAccountSelectorTabArgs();
        return accountSelectorTabArgs != null && accountSelectorTabArgs.isEmbedded();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        setScarletContextWrapper(new ScarletContextWrapper(context, null, null, 6, null));
    }

    /* compiled from: CreditCardWaitlistFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$onViewCreated$1", m3645f = "CreditCardWaitlistFragment.kt", m3646l = {96}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$onViewCreated$1 */
    static final class C126721 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C126721(Continuation<? super C126721> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreditCardWaitlistFragment.this.new C126721(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C126721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CreditCardWaitlistFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ CreditCardWaitlistFragment $tmp0;

            AnonymousClass1(CreditCardWaitlistFragment creditCardWaitlistFragment) {
                this.$tmp0 = creditCardWaitlistFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, CreditCardWaitlistFragment.class, "handleDuxoEvent", "handleDuxoEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<CreditCardWaitlistEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleDuxoEvent = C126721.invokeSuspend$handleDuxoEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleDuxoEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleDuxoEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<CreditCardWaitlistEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleDuxoEvent(CreditCardWaitlistFragment creditCardWaitlistFragment, Event event, Continuation continuation) {
            creditCardWaitlistFragment.handleDuxoEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(CreditCardWaitlistFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CreditCardWaitlistFragment.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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
        CreditCardWaitlistFragmentDuxo duxo = getDuxo();
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        duxo.startDownloading$feature_credit_card_externalDebug(context);
        BaseFragment.collectDuxoState$default(this, null, new C126721(null), 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        ScarletContextWrapper scarletContextWrapper;
        ScarletManager scarletManager;
        super.onPause();
        if (!isEmbedded() || (scarletContextWrapper = getScarletContextWrapper()) == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
            return;
        }
        ScarletManager.removeOverlay$default(scarletManager, CreditCardSystemOverlay.DAY.getPriority(), null, 2, null);
        ScarletManager.removeOverlay$default(scarletManager, CreditCardSystemOverlay.NIGHT.getPriority(), null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Overlay(final boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2095337218);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                z = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2095337218, i3, -1, "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment.Overlay (CreditCardWaitlistFragment.kt:143)");
            }
            int i5 = i3;
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i6 = i5 & 14;
            boolean z2 = i6 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreditCardWaitlistFragment.Overlay$lambda$3$lambda$2(z);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(snapshotState) | (i6 == 4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new CreditCardWaitlistFragment5(z, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
            AnimatedVisibilityKt.AnimatedVisibility(Overlay$lambda$4(snapshotState), (Modifier) null, EnterTransition.INSTANCE.getNone(), EnterExitTransitionKt.fadeOut$default(CreditCardWaitlistFragment6.ANIM, 0.0f, 2, null), (String) null, CreditCardWaitlistFragment2.INSTANCE.getLambda$559476698$feature_credit_card_externalDebug(), composerStartRestartGroup, 199680, 18);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreditCardWaitlistFragment.Overlay$lambda$7(this.f$0, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState Overlay$lambda$3$lambda$2(boolean z) {
        return SnapshotState3.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Overlay$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Function0 function0;
        Function1 function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1642648339);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1642648339, i2, -1, "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment.ComposeContent (CreditCardWaitlistFragment.kt:159)");
            }
            CreditCardWaitlistViewState creditCardWaitlistViewState = (CreditCardWaitlistViewState) FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, Lifecycle.State.RESUMED, (CoroutineContext) null, composerStartRestartGroup, 384, 5).getValue();
            OverrideSystemBarsStyle.OverrideStatusBarStyle(false, composerStartRestartGroup, 6);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1962899511);
            Companion companion2 = INSTANCE;
            AccountSelectorTabArgs accountSelectorTabArgs = ((CreditCardWaitlistFragmentKey) companion2.getArgs((Fragment) this)).getAccountSelectorTabArgs();
            if (accountSelectorTabArgs != null && accountSelectorTabArgs.isEmbedded()) {
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(lifecycleOwner);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new CreditCardWaitlistFragment4(lifecycleOwner, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(lifecycleOwner, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1962870076);
            if (((CreditCardWaitlistFragmentKey) companion2.getArgs((Fragment) this)).getShownInTab()) {
                function0 = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CreditCardWaitlistFragment.ComposeContent$lambda$13$lambda$12(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                function0 = (Function0) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endReplaceGroup();
            Screen screen = creditCardWaitlistViewState.getScreen();
            if (creditCardWaitlistViewState.getScreen() == Screen.TRANSITION) {
                composerStartRestartGroup.startReplaceGroup(-719185341);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CreditCardWaitlistFragment.ComposeContent$lambda$15$lambda$14((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                function1 = (Function1) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-719103749);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CreditCardWaitlistFragment.ComposeContent$lambda$17$lambda$16((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                function1 = (Function1) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endReplaceGroup();
            }
            AnimatedContentKt.AnimatedContent(screen, Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BentoColor.INSTANCE.m21139getCCGoldBG0d7_KjU(), null, 2, null), function1, null, "cc-waitlist", null, ComposableLambda3.rememberComposableLambda(-1692579752, true, new C126714(creditCardWaitlistViewState, this, function0, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 1597440, 40);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreditCardWaitlistFragment.ComposeContent$lambda$18(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeContent$ApplyOverlayWhenNeeded(CreditCardWaitlistFragment creditCardWaitlistFragment, SnapshotState<Lifecycle.Event> snapshotState, Function1<? super ScarletManager, Unit> function1, Composer composer, int i) {
        ScarletManager scarletManager;
        Lifecycle.Event eventComposeContent$lambda$9;
        Lifecycle.State targetState;
        composer.startReplaceGroup(-492144607);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-492144607, i, -1, "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment.ComposeContent.ApplyOverlayWhenNeeded (CreditCardWaitlistFragment.kt:177)");
        }
        ScarletContextWrapper scarletContextWrapper = creditCardWaitlistFragment.getScarletContextWrapper();
        if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return;
        }
        AccountSelectorTabArgs accountSelectorTabArgs = ((CreditCardWaitlistFragmentKey) INSTANCE.getArgs((Fragment) creditCardWaitlistFragment)).getAccountSelectorTabArgs();
        if (accountSelectorTabArgs == null || !accountSelectorTabArgs.isEmbedded() || ((eventComposeContent$lambda$9 = ComposeContent$lambda$9(snapshotState)) != null && (targetState = eventComposeContent$lambda$9.getTargetState()) != null && targetState.isAtLeast(Lifecycle.State.RESUMED))) {
            function1.invoke(scarletManager);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$13$lambda$12(CreditCardWaitlistFragment creditCardWaitlistFragment) {
        creditCardWaitlistFragment.requireBaseActivity().finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform ComposeContent$lambda$15$lambda$14(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(CreditCardWaitlistFragment6.ANIM, 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(CreditCardWaitlistFragment6.ANIM, 0.0f, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform ComposeContent$lambda$17$lambda$16(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), EnterExitTransitionKt.fadeOut$default(CreditCardWaitlistFragment6.ANIM, 0.0f, 2, null));
    }

    /* compiled from: CreditCardWaitlistFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$4 */
    static final class C126714 implements Function4<AnimatedContentScope, Screen, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Lifecycle.Event> $currentLifecycleValue$delegate;
        final /* synthetic */ Function0<Unit> $onClose;
        final /* synthetic */ CreditCardWaitlistViewState $state;
        final /* synthetic */ CreditCardWaitlistFragment this$0;

        /* compiled from: CreditCardWaitlistFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$4$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Screen.values().length];
                try {
                    iArr[Screen.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Screen.TRANSITION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Screen.INTRO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Screen.SOLID_GOLD_INTRO.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Screen.CONFIRMATION.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Screen.UPSELL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Screen.JOINED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C126714(CreditCardWaitlistViewState creditCardWaitlistViewState, CreditCardWaitlistFragment creditCardWaitlistFragment, Function0<Unit> function0, SnapshotState<Lifecycle.Event> snapshotState) {
            this.$state = creditCardWaitlistViewState;
            this.this$0 = creditCardWaitlistFragment;
            this.$onClose = function0;
            this.$currentLifecycleValue$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Screen screen, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(animatedContentScope, screen, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, Screen screen, Composer composer, int i) throws Resources.NotFoundException {
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(screen, "screen");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1692579752, i, -1, "com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment.ComposeContent.<anonymous> (CreditCardWaitlistFragment.kt:206)");
            }
            ImmutableMap<String, Tuples2<MediaSource, MediaItem>> videos = this.$state.getVideos();
            if (videos == null || videos.isEmpty()) {
                composer2.startReplaceGroup(-727277983);
                LoadingComposable.Loading(null, composer2, 0, 1);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-726991047);
                switch (WhenMappings.$EnumSwitchMapping$0[screen.ordinal()]) {
                    case 1:
                        composer2.startReplaceGroup(1223469185);
                        LoadingComposable.Loading(null, composer2, 0, 1);
                        composer2.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                        break;
                    case 2:
                        composer2.startReplaceGroup(-727108692);
                        this.this$0.Overlay(false, composer2, 6, 0);
                        composer2.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                        break;
                    case 3:
                        composer2.startReplaceGroup(-726937727);
                        CreditCardWaitlistFragment creditCardWaitlistFragment = this.this$0;
                        SnapshotState<Lifecycle.Event> snapshotState = this.$currentLifecycleValue$delegate;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer2.changedInstance(this.this$0);
                        final CreditCardWaitlistFragment creditCardWaitlistFragment2 = this.this$0;
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$4$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CreditCardWaitlistFragment.C126714.invoke$lambda$1$lambda$0(creditCardWaitlistFragment2, (ScarletManager) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        CreditCardWaitlistFragment.ComposeContent$ApplyOverlayWhenNeeded(creditCardWaitlistFragment, snapshotState, (Function1) objRememberedValue, composer2, 0);
                        ImmutableMap<String, Tuples2<MediaSource, MediaItem>> videos2 = this.$state.getVideos();
                        boolean z = this.$state.getJoiningWaitlist() || this.$state.isLoadingWaitlistState();
                        boolean canApply = this.$state.getCanApply();
                        boolean hasInvite = this.$state.getHasInvite();
                        boolean hasValidCreditCard = this.$state.getHasValidCreditCard();
                        String referrerFirstName = this.$state.getReferrerFirstName();
                        String entryPointSource = this.$state.getEntryPointSource();
                        AccountSelectorTabArgs accountSelectorTabArgs = ((CreditCardWaitlistFragmentKey) CreditCardWaitlistFragment.INSTANCE.getArgs((Fragment) this.this$0)).getAccountSelectorTabArgs();
                        AccountTabScrollInteractions accountTabScrollInteractionsFindScrollInteraction = AccountTabScrollInteractions2.findScrollInteraction(this.this$0);
                        Function0<Unit> function0 = this.$onClose;
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer2.changedInstance(this.$state) | composer2.changedInstance(this.this$0);
                        final CreditCardWaitlistViewState creditCardWaitlistViewState = this.$state;
                        final CreditCardWaitlistFragment creditCardWaitlistFragment3 = this.this$0;
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$4$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CreditCardWaitlistFragment.C126714.invoke$lambda$4$lambda$3(creditCardWaitlistViewState, creditCardWaitlistFragment3);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function02 = (Function0) objRememberedValue2;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer2.changedInstance(this.this$0);
                        final CreditCardWaitlistFragment creditCardWaitlistFragment4 = this.this$0;
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$4$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CreditCardWaitlistFragment.C126714.invoke$lambda$6$lambda$5(creditCardWaitlistFragment4);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        WaitlistIntroComposableKt.WaitlistIntro(function0, function02, (Function0) objRememberedValue3, videos2, z, canApply, hasValidCreditCard, hasInvite, referrerFirstName, accountTabScrollInteractionsFindScrollInteraction, accountSelectorTabArgs, entryPointSource, composer2, 0, 0, 0);
                        composer2 = composer2;
                        this.this$0.Overlay(false, composer2, 0, 1);
                        composer2.endReplaceGroup();
                        Unit unit3 = Unit.INSTANCE;
                        break;
                    case 4:
                        composer2.startReplaceGroup(-724582936);
                        AccountSelectorTabArgs accountSelectorTabArgs2 = ((CreditCardWaitlistFragmentKey) CreditCardWaitlistFragment.INSTANCE.getArgs((Fragment) this.this$0)).getAccountSelectorTabArgs();
                        Function0<Unit> function03 = this.$onClose;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance4 = composer2.changedInstance(this.this$0);
                        final CreditCardWaitlistFragment creditCardWaitlistFragment5 = this.this$0;
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$4$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CreditCardWaitlistFragment.C126714.invoke$lambda$8$lambda$7(creditCardWaitlistFragment5);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        Function0 function04 = (Function0) objRememberedValue4;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance5 = composer2.changedInstance(this.this$0);
                        final CreditCardWaitlistFragment creditCardWaitlistFragment6 = this.this$0;
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$4$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CreditCardWaitlistFragment.C126714.invoke$lambda$10$lambda$9(creditCardWaitlistFragment6);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        composer2.endReplaceGroup();
                        SolidGoldIntroComposable.SolidGoldIntro(function03, function04, (Function0) objRememberedValue5, accountSelectorTabArgs2, composer2, 0, 0);
                        composer2.endReplaceGroup();
                        Unit unit4 = Unit.INSTANCE;
                        break;
                    case 5:
                        composer2.startReplaceGroup(-723795505);
                        com.robinhood.rosetta.eventlogging.Context context = new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$state.getUpgradeEligibility() == UpgradeEligibility.HAS_GOLD ? new GoldContext(Boolean.TRUE, "", null, 4, null) : new GoldContext(Boolean.FALSE, "", null, 4, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -67108865, -1, -1, -1, 16383, null);
                        CreditCardWaitlistFragment creditCardWaitlistFragment7 = this.this$0;
                        SnapshotState<Lifecycle.Event> snapshotState2 = this.$currentLifecycleValue$delegate;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance6 = composer2.changedInstance(this.this$0);
                        final CreditCardWaitlistFragment creditCardWaitlistFragment8 = this.this$0;
                        Object objRememberedValue6 = composer2.rememberedValue();
                        if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$4$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CreditCardWaitlistFragment.C126714.invoke$lambda$12$lambda$11(creditCardWaitlistFragment8, (ScarletManager) obj);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue6);
                        }
                        composer2.endReplaceGroup();
                        CreditCardWaitlistFragment.ComposeContent$ApplyOverlayWhenNeeded(creditCardWaitlistFragment7, snapshotState2, (Function1) objRememberedValue6, composer2, 0);
                        if (this.$state.getWaitlistFlowSimplified()) {
                            composer2.startReplaceGroup(-723163446);
                            Function0<Unit> function05 = this.$onClose;
                            Tuples2<MediaSource, MediaItem> tuples2 = this.$state.getVideos().get("check_icon");
                            Intrinsics.checkNotNull(tuples2);
                            SimplifiedWaitlistConfirmationComposable3.SimplifiedWaitlistConfirmation(context, function05, tuples2, ((CreditCardWaitlistFragmentKey) CreditCardWaitlistFragment.INSTANCE.getArgs((Fragment) this.this$0)).getAccountSelectorTabArgs(), composer2, 0, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-722759361);
                            Function0<Unit> function06 = this.$onClose;
                            UpgradeEligibility upgradeEligibility = this.$state.getUpgradeEligibility();
                            Tuples2<MediaSource, MediaItem> tuples22 = this.$state.getVideos().get("check_icon");
                            Intrinsics.checkNotNull(tuples22);
                            Tuples2<MediaSource, MediaItem> tuples23 = tuples22;
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChangedInstance7 = composer2.changedInstance(this.this$0) | composer2.changedInstance(this.$state);
                            final CreditCardWaitlistFragment creditCardWaitlistFragment9 = this.this$0;
                            final CreditCardWaitlistViewState creditCardWaitlistViewState2 = this.$state;
                            Object objRememberedValue7 = composer2.rememberedValue();
                            if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$4$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CreditCardWaitlistFragment.C126714.invoke$lambda$14$lambda$13(creditCardWaitlistFragment9, creditCardWaitlistViewState2);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue7);
                            }
                            composer2.endReplaceGroup();
                            WaitlistConfirmationComposable3.WaitlistConfirmation(context, function06, upgradeEligibility, tuples23, (Function0) objRememberedValue7, ((CreditCardWaitlistFragmentKey) CreditCardWaitlistFragment.INSTANCE.getArgs((Fragment) this.this$0)).getAccountSelectorTabArgs(), composer, 0, 0);
                            composer2 = composer;
                            composer2.endReplaceGroup();
                        }
                        this.this$0.Overlay(false, composer2, 0, 1);
                        composer2.endReplaceGroup();
                        Unit unit5 = Unit.INSTANCE;
                        break;
                    case 6:
                        composer2.startReplaceGroup(-721730843);
                        Function0<Unit> function07 = this.$onClose;
                        Tuples2<MediaSource, MediaItem> tuples24 = this.$state.getVideos().get("gold_icon");
                        Intrinsics.checkNotNull(tuples24);
                        Tuples2<MediaSource, MediaItem> tuples25 = tuples24;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance8 = composer2.changedInstance(this.this$0);
                        final CreditCardWaitlistFragment creditCardWaitlistFragment10 = this.this$0;
                        Object objRememberedValue8 = composer2.rememberedValue();
                        if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$4$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CreditCardWaitlistFragment.C126714.invoke$lambda$16$lambda$15(creditCardWaitlistFragment10);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue8);
                        }
                        Function0 function08 = (Function0) objRememberedValue8;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance9 = composer2.changedInstance(this.this$0);
                        final CreditCardWaitlistFragment creditCardWaitlistFragment11 = this.this$0;
                        Object objRememberedValue9 = composer2.rememberedValue();
                        if (zChangedInstance9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$4$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CreditCardWaitlistFragment.C126714.invoke$lambda$18$lambda$17(creditCardWaitlistFragment11);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue9);
                        }
                        composer2.endReplaceGroup();
                        WaitlistGoldComposable3.WaitlistGold(function07, tuples25, function08, (Function0) objRememberedValue9, ((CreditCardWaitlistFragmentKey) CreditCardWaitlistFragment.INSTANCE.getArgs((Fragment) this.this$0)).getAccountSelectorTabArgs(), composer2, 0, 0);
                        composer2 = composer2;
                        this.this$0.Overlay(false, composer2, 0, 1);
                        composer2.endReplaceGroup();
                        Unit unit6 = Unit.INSTANCE;
                        break;
                    case 7:
                        composer2.startReplaceGroup(-720666737);
                        int i2 = C12201R.string.waitlist_joined_share_text;
                        String referralCode = this.$state.getReferralCode();
                        if (referralCode == null) {
                            referralCode = "";
                        }
                        final String strStringResource = StringResources_androidKt.stringResource(i2, new Object[]{referralCode}, composer2, 0);
                        Function0<Unit> function09 = this.$onClose;
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance10 = composer2.changedInstance(this.this$0) | composer2.changed(strStringResource);
                        final CreditCardWaitlistFragment creditCardWaitlistFragment12 = this.this$0;
                        Object objRememberedValue10 = composer2.rememberedValue();
                        if (zChangedInstance10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$4$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CreditCardWaitlistFragment.C126714.invoke$lambda$21$lambda$20(creditCardWaitlistFragment12, strStringResource);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue10);
                        }
                        composer2.endReplaceGroup();
                        Tuples2<MediaSource, MediaItem> tuples26 = this.$state.getVideos().get("forge");
                        Intrinsics.checkNotNull(tuples26);
                        WaitlistJoinedComposable4.WaitlistJoined(function09, (Function0) objRememberedValue10, tuples26, this.$state.getReferralsBlocked(), this.$state.getReferralContext(), ((CreditCardWaitlistFragmentKey) CreditCardWaitlistFragment.INSTANCE.getArgs((Fragment) this.this$0)).getAccountSelectorTabArgs(), composer2, 0, 0);
                        composer2 = composer2;
                        composer2.endReplaceGroup();
                        Unit unit7 = Unit.INSTANCE;
                        break;
                    default:
                        composer2.startReplaceGroup(1223475209);
                        composer2.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                }
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CreditCardWaitlistFragment creditCardWaitlistFragment, ScarletManager scarletManager) {
            Intrinsics.checkNotNullParameter(scarletManager, "scarletManager");
            scarletManager.putOverlay(CreditCardSystemOverlay.DAY, Boolean.TRUE);
            creditCardWaitlistFragment.getCreditCardTabStyle().setValue(CreditCardTabStyle.DAY);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(CreditCardWaitlistFragment creditCardWaitlistFragment) {
            TermsApplyBottomSheet termsApplyBottomSheet = (TermsApplyBottomSheet) TermsApplyBottomSheet.INSTANCE.newInstance();
            FragmentManager childFragmentManager = creditCardWaitlistFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            termsApplyBottomSheet.show(childFragmentManager, "terms-apply");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(CreditCardWaitlistViewState creditCardWaitlistViewState, final CreditCardWaitlistFragment creditCardWaitlistFragment) {
            if (creditCardWaitlistViewState.getHasValidCreditCard()) {
                WebUtils.viewUrl$default(creditCardWaitlistFragment.getContext(), "https://robinhood.com/creditcard/app", 0, 4, (Object) null);
            } else if (creditCardWaitlistViewState.getCanApply()) {
                Navigator navigator = creditCardWaitlistFragment.getNavigator();
                Context contextRequireContext = creditCardWaitlistFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new CreditCardApplicationSuvKey(), null, false, null, null, 60, null);
            } else if (creditCardWaitlistViewState.getHasInvite()) {
                creditCardWaitlistFragment.getDuxo().acceptInvite$feature_credit_card_externalDebug(new Function0() { // from class: com.robinhood.android.creditcard.ui.waitlist.CreditCardWaitlistFragment$ComposeContent$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreditCardWaitlistFragment.C126714.invoke$lambda$4$lambda$3$lambda$2(creditCardWaitlistFragment);
                    }
                });
            } else {
                creditCardWaitlistFragment.getDuxo().joinWaitlist$feature_credit_card_externalDebug();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(CreditCardWaitlistFragment creditCardWaitlistFragment) {
            Navigator navigator = creditCardWaitlistFragment.getNavigator();
            Context contextRequireContext = creditCardWaitlistFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new CreditCardApplicationSuvKey(), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9(CreditCardWaitlistFragment creditCardWaitlistFragment) {
            TermsApplyBottomSheet termsApplyBottomSheet = (TermsApplyBottomSheet) TermsApplyBottomSheet.INSTANCE.newInstance();
            FragmentManager childFragmentManager = creditCardWaitlistFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            termsApplyBottomSheet.show(childFragmentManager, "terms-apply");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7(CreditCardWaitlistFragment creditCardWaitlistFragment) {
            Navigator navigator = creditCardWaitlistFragment.getNavigator();
            Context contextRequireContext = creditCardWaitlistFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new CreditCardApplicationSuvKey(), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$11(CreditCardWaitlistFragment creditCardWaitlistFragment, ScarletManager scarletManager) {
            Intrinsics.checkNotNullParameter(scarletManager, "scarletManager");
            scarletManager.putOverlay(CreditCardSystemOverlay.NIGHT, Boolean.TRUE);
            creditCardWaitlistFragment.getCreditCardTabStyle().setValue(CreditCardTabStyle.NIGHT);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$14$lambda$13(CreditCardWaitlistFragment creditCardWaitlistFragment, CreditCardWaitlistViewState creditCardWaitlistViewState) {
            Screen screen;
            CreditCardWaitlistFragmentDuxo duxo = creditCardWaitlistFragment.getDuxo();
            if (creditCardWaitlistViewState.getUpgradeEligibility() != UpgradeEligibility.ELIGIBLE) {
                screen = Screen.JOINED;
            } else {
                screen = Screen.UPSELL;
            }
            duxo.toNextScreen$feature_credit_card_externalDebug(screen);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$16$lambda$15(CreditCardWaitlistFragment creditCardWaitlistFragment) {
            creditCardWaitlistFragment.getDuxo().onUpgrade$feature_credit_card_externalDebug();
            Navigator navigator = creditCardWaitlistFragment.getNavigator();
            Context contextRequireContext = creditCardWaitlistFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new GoldUpgradeIntentKey(GoldFeature.CREDIT_CARD_WAITLIST, GoldFeature.CREDIT_CARD_WAITLIST, null, NightModeManager2.NIGHT, null, false, 52, null), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$18$lambda$17(CreditCardWaitlistFragment creditCardWaitlistFragment) {
            creditCardWaitlistFragment.getDuxo().toNextScreen$feature_credit_card_externalDebug(Screen.JOINED);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$21$lambda$20(CreditCardWaitlistFragment creditCardWaitlistFragment, String str) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.setType("text/plain");
            creditCardWaitlistFragment.startActivity(Intent.createChooser(intent, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CreditCardWaitlistFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/creditcard/ui/waitlist/CreditCardWaitlistFragment;", "Lcom/robinhood/android/creditcard/contracts/CreditCardWaitlistFragmentKey;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<CreditCardWaitlistFragment, CreditCardWaitlistFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(CreditCardWaitlistFragmentKey creditCardWaitlistFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, creditCardWaitlistFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CreditCardWaitlistFragmentKey getArgs(CreditCardWaitlistFragment creditCardWaitlistFragment) {
            return (CreditCardWaitlistFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, creditCardWaitlistFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CreditCardWaitlistFragment newInstance(CreditCardWaitlistFragmentKey creditCardWaitlistFragmentKey) {
            return (CreditCardWaitlistFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, creditCardWaitlistFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CreditCardWaitlistFragment creditCardWaitlistFragment, CreditCardWaitlistFragmentKey creditCardWaitlistFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, creditCardWaitlistFragment, creditCardWaitlistFragmentKey);
        }
    }
}
