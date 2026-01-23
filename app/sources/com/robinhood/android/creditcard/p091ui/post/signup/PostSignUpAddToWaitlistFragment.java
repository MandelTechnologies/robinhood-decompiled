package com.robinhood.android.creditcard.p091ui.post.signup;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.creditcard.contracts.CreditCardWaitlistIntentKey;
import com.robinhood.android.creditcard.p091ui.post.signup.PostSignUpAddToWaitlistDuxo7;
import com.robinhood.android.creditcard.p091ui.post.signup.PostSignUpAddToWaitlistFragment;
import com.robinhood.android.creditcard.p091ui.waitlist.ErrorDialog;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.contracts.RetirementSignUp;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PostSignUpAddToWaitlistFragment.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0002!\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\r\u0010\u0011\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u0010\u0016\u001a\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\t\u0010\u001a\u001a\u00020\u001bH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistDuxo;", "getDuxo", "()Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "handleDuxoEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistEvent;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PostSignUpAddToWaitlistFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, PostSignUpAddToWaitlistDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(PostSignUpAddToWaitlistFragment postSignUpAddToWaitlistFragment, int i, Composer composer, int i2) {
        postSignUpAddToWaitlistFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public final PostSignUpAddToWaitlistDuxo getDuxo() {
        return (PostSignUpAddToWaitlistDuxo) this.duxo.getValue();
    }

    /* compiled from: PostSignUpAddToWaitlistFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistFragment$onViewCreated$1", m3645f = "PostSignUpAddToWaitlistFragment.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistFragment$onViewCreated$1 */
    static final class C126451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C126451(Continuation<? super C126451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PostSignUpAddToWaitlistFragment.this.new C126451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C126451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: PostSignUpAddToWaitlistFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ PostSignUpAddToWaitlistFragment $tmp0;

            AnonymousClass1(PostSignUpAddToWaitlistFragment postSignUpAddToWaitlistFragment) {
                this.$tmp0 = postSignUpAddToWaitlistFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, PostSignUpAddToWaitlistFragment.class, "handleDuxoEvent", "handleDuxoEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<PostSignUpAddToWaitlistDuxo7> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleDuxoEvent = C126451.invokeSuspend$handleDuxoEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleDuxoEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleDuxoEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<PostSignUpAddToWaitlistDuxo7>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleDuxoEvent(PostSignUpAddToWaitlistFragment postSignUpAddToWaitlistFragment, Event event, Continuation continuation) {
            postSignUpAddToWaitlistFragment.handleDuxoEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(PostSignUpAddToWaitlistFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(PostSignUpAddToWaitlistFragment.this);
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
        BaseFragment.collectDuxoState$default(this, null, new C126451(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDuxoEvent(final Event<PostSignUpAddToWaitlistDuxo7> event) {
        EventConsumer<PostSignUpAddToWaitlistDuxo7> eventConsumerInvoke;
        if (!(event.getData() instanceof PostSignUpAddToWaitlistDuxo7) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistFragment$handleDuxoEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m12860invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m12860invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                PostSignUpAddToWaitlistDuxo7 postSignUpAddToWaitlistDuxo7 = (PostSignUpAddToWaitlistDuxo7) event.getData();
                if (Intrinsics.areEqual(postSignUpAddToWaitlistDuxo7, PostSignUpAddToWaitlistDuxo7.Error.INSTANCE)) {
                    ErrorDialog errorDialog = (ErrorDialog) ErrorDialog.INSTANCE.newInstance();
                    FragmentManager childFragmentManager = this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    errorDialog.show(childFragmentManager, "error-dialog");
                    return;
                }
                if (Intrinsics.areEqual(postSignUpAddToWaitlistDuxo7, PostSignUpAddToWaitlistDuxo7.LaunchWaitlistFlow.INSTANCE)) {
                    PostSignUpAddToWaitlistFragment postSignUpAddToWaitlistFragment = this;
                    Navigator navigator = postSignUpAddToWaitlistFragment.getNavigator();
                    FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    postSignUpAddToWaitlistFragment.startActivity(Navigator.DefaultImpls.createIntent$default(navigator, fragmentActivityRequireActivity, new CreditCardWaitlistIntentKey(null, null, false, null, true, false, 47, null), null, false, 12, null));
                    return;
                }
                if (!Intrinsics.areEqual(postSignUpAddToWaitlistDuxo7, PostSignUpAddToWaitlistDuxo7.ShowRetirementSignUp.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                RetirementLastKnownEntryPointManager retirementLastKnownEntryPointManager = RetirementLastKnownEntryPointManager.INSTANCE;
                PostSignUpAddToWaitlistFragment.Companion companion = PostSignUpAddToWaitlistFragment.INSTANCE;
                retirementLastKnownEntryPointManager.setLastKnownEntryPoint(((PostSignUpAddToWaitlistFragment.Args) companion.getArgs((Fragment) this)).getRedirectKey().getEntryPoint());
                retirementLastKnownEntryPointManager.setFromRhfOnboarding(true);
                retirementLastKnownEntryPointManager.setTheme(((PostSignUpAddToWaitlistFragment.Args) companion.getArgs((Fragment) this)).getRedirectKey().getTheme());
                retirementLastKnownEntryPointManager.setShouldLaunchTaxMatchPromoForResurrectedUser(((PostSignUpAddToWaitlistFragment.Args) companion.getArgs((Fragment) this)).getShouldLaunchTaxMatchPromoForResurrectedUser());
                Navigator navigator2 = this.getNavigator();
                Context contextRequireContext = this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator2, contextRequireContext, ((PostSignUpAddToWaitlistFragment.Args) companion.getArgs((Fragment) this)).getRedirectKey(), null, false, null, null, 60, null);
                this.requireActivity().finish();
            }
        });
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-220935684);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-220935684, i2, -1, "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistFragment.ComposeContent (PostSignUpAddToWaitlistFragment.kt:37)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(1886737732, true, new C126441((PostSignUpAddToWaitlistState) FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue(), this), composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PostSignUpAddToWaitlistFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: PostSignUpAddToWaitlistFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistFragment$ComposeContent$1 */
    static final class C126441 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ PostSignUpAddToWaitlistState $state;
        final /* synthetic */ PostSignUpAddToWaitlistFragment this$0;

        /* compiled from: PostSignUpAddToWaitlistFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistFragment$ComposeContent$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PostSignUpAddToWaitlistDuxo9.values().length];
                try {
                    iArr[PostSignUpAddToWaitlistDuxo9.INTRO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PostSignUpAddToWaitlistDuxo9.CONFIRMATION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C126441(PostSignUpAddToWaitlistState postSignUpAddToWaitlistDuxo8, PostSignUpAddToWaitlistFragment postSignUpAddToWaitlistFragment) {
            this.$state = postSignUpAddToWaitlistDuxo8;
            this.this$0 = postSignUpAddToWaitlistFragment;
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
                ComposerKt.traceEventStart(1886737732, i, -1, "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistFragment.ComposeContent.<anonymous> (PostSignUpAddToWaitlistFragment.kt:40)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.$state.getScreen().ordinal()];
            if (i2 == 1) {
                composer.startReplaceGroup(678764693);
                boolean loading = this.$state.getLoading();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.this$0);
                final PostSignUpAddToWaitlistFragment postSignUpAddToWaitlistFragment = this.this$0;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistFragment$ComposeContent$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostSignUpAddToWaitlistFragment.C126441.invoke$lambda$1$lambda$0(postSignUpAddToWaitlistFragment);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                final PostSignUpAddToWaitlistFragment postSignUpAddToWaitlistFragment2 = this.this$0;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistFragment$ComposeContent$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostSignUpAddToWaitlistFragment.C126441.invoke$lambda$3$lambda$2(postSignUpAddToWaitlistFragment2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function02 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                final PostSignUpAddToWaitlistFragment postSignUpAddToWaitlistFragment3 = this.this$0;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistFragment$ComposeContent$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostSignUpAddToWaitlistFragment.C126441.invoke$lambda$5$lambda$4(postSignUpAddToWaitlistFragment3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                PostSignUpAddToWaitlistComposable.PostSignUpAddToWaitlist(loading, function0, function02, (Function0) objRememberedValue3, null, composer, 0, 16);
                composer.endReplaceGroup();
            } else {
                if (i2 != 2) {
                    composer.startReplaceGroup(678762555);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(678776212);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance4 = composer.changedInstance(this.this$0);
                final PostSignUpAddToWaitlistFragment postSignUpAddToWaitlistFragment4 = this.this$0;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistFragment$ComposeContent$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PostSignUpAddToWaitlistFragment.C126441.invoke$lambda$7$lambda$6(postSignUpAddToWaitlistFragment4);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                PostSingUpAddToWaitlistSuccessComposable.PostSignUpAddToWaitlistSuccess((Function0) objRememberedValue4, null, composer, 0, 2);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(PostSignUpAddToWaitlistFragment postSignUpAddToWaitlistFragment) {
            postSignUpAddToWaitlistFragment.getDuxo().joinWaitlist();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(PostSignUpAddToWaitlistFragment postSignUpAddToWaitlistFragment) {
            postSignUpAddToWaitlistFragment.getDuxo().launchWaitlistFlow();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(PostSignUpAddToWaitlistFragment postSignUpAddToWaitlistFragment) {
            postSignUpAddToWaitlistFragment.getDuxo().closeFlow();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(PostSignUpAddToWaitlistFragment postSignUpAddToWaitlistFragment) {
            postSignUpAddToWaitlistFragment.getDuxo().closeFlow();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    /* compiled from: PostSignUpAddToWaitlistFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistFragment$Args;", "Landroid/os/Parcelable;", "redirectKey", "Lcom/robinhood/android/retirement/contracts/RetirementSignUp;", "shouldLaunchTaxMatchPromoForResurrectedUser", "", "<init>", "(Lcom/robinhood/android/retirement/contracts/RetirementSignUp;Z)V", "getRedirectKey", "()Lcom/robinhood/android/retirement/contracts/RetirementSignUp;", "getShouldLaunchTaxMatchPromoForResurrectedUser", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final RetirementSignUp redirectKey;
        private final boolean shouldLaunchTaxMatchPromoForResurrectedUser;

        /* compiled from: PostSignUpAddToWaitlistFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((RetirementSignUp) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, RetirementSignUp retirementSignUp, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                retirementSignUp = args.redirectKey;
            }
            if ((i & 2) != 0) {
                z = args.shouldLaunchTaxMatchPromoForResurrectedUser;
            }
            return args.copy(retirementSignUp, z);
        }

        /* renamed from: component1, reason: from getter */
        public final RetirementSignUp getRedirectKey() {
            return this.redirectKey;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldLaunchTaxMatchPromoForResurrectedUser() {
            return this.shouldLaunchTaxMatchPromoForResurrectedUser;
        }

        public final Args copy(RetirementSignUp redirectKey, boolean shouldLaunchTaxMatchPromoForResurrectedUser) {
            Intrinsics.checkNotNullParameter(redirectKey, "redirectKey");
            return new Args(redirectKey, shouldLaunchTaxMatchPromoForResurrectedUser);
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
            return Intrinsics.areEqual(this.redirectKey, args.redirectKey) && this.shouldLaunchTaxMatchPromoForResurrectedUser == args.shouldLaunchTaxMatchPromoForResurrectedUser;
        }

        public int hashCode() {
            return (this.redirectKey.hashCode() * 31) + Boolean.hashCode(this.shouldLaunchTaxMatchPromoForResurrectedUser);
        }

        public String toString() {
            return "Args(redirectKey=" + this.redirectKey + ", shouldLaunchTaxMatchPromoForResurrectedUser=" + this.shouldLaunchTaxMatchPromoForResurrectedUser + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.redirectKey, flags);
            dest.writeInt(this.shouldLaunchTaxMatchPromoForResurrectedUser ? 1 : 0);
        }

        public Args(RetirementSignUp redirectKey, boolean z) {
            Intrinsics.checkNotNullParameter(redirectKey, "redirectKey");
            this.redirectKey = redirectKey;
            this.shouldLaunchTaxMatchPromoForResurrectedUser = z;
        }

        public final RetirementSignUp getRedirectKey() {
            return this.redirectKey;
        }

        public final boolean getShouldLaunchTaxMatchPromoForResurrectedUser() {
            return this.shouldLaunchTaxMatchPromoForResurrectedUser;
        }
    }

    /* compiled from: PostSignUpAddToWaitlistFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistFragment;", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistFragment$Args;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PostSignUpAddToWaitlistFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(PostSignUpAddToWaitlistFragment postSignUpAddToWaitlistFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, postSignUpAddToWaitlistFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PostSignUpAddToWaitlistFragment newInstance(Args args) {
            return (PostSignUpAddToWaitlistFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PostSignUpAddToWaitlistFragment postSignUpAddToWaitlistFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, postSignUpAddToWaitlistFragment, args);
        }
    }
}
