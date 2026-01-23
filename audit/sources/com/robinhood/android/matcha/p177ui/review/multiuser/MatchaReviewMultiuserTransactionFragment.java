package com.robinhood.android.matcha.p177ui.review.multiuser;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.common.ErrorHandling;
import com.robinhood.android.matcha.p177ui.common.RosettaConverters;
import com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewComposable;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewTransactionViewState3;
import com.robinhood.android.matcha.p177ui.review.multiuser.MatchaReviewMultiuserTransactionEvent;
import com.robinhood.android.matcha.p177ui.review.multiuser.MatchaReviewMultiuserTransactionFragment;
import com.robinhood.android.matcha.p177ui.sourceoffunds.SourceOfFundsBottomSheet;
import com.robinhood.android.models.matcha.api.SourceOfFunds;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.social.contracts.matcha.MatchaTransaction;
import com.robinhood.android.social.contracts.matcha.SummaryShowMoreFragmentKey;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.P2PContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: MatchaReviewMultiuserTransactionFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003:;<B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u001a\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u00101\u001a\u00020%2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000100H\u0016J\r\u00105\u001a\u00020)H\u0017¢\u0006\u0002\u00106J\u0010\u00107\u001a\u00020)2\u0006\u00108\u001a\u000209H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006=²\u0006\n\u0010>\u001a\u00020?X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/SourceOfFundsBottomSheet$Callbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDuxo;", "getDuxo", "()Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "memoLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onSourceOfFundsSelected", "sourceOfFunds", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "Callbacks", "Args", "Companion", "feature-p2p_externalDebug", "state", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaReviewMultiuserTransactionFragment extends GenericComposeFragment implements AutoLoggableFragment, SourceOfFundsBottomSheet.Callbacks {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MatchaReviewMultiuserTransactionFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MatchaReviewMultiuserTransactionDuxo.class);
    public EventLogger eventLogger;
    private final ActivityResultLauncher<Intent> memoLauncher;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MatchaReviewMultiuserTransactionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MatchaReviewMultiuserTransactionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionFragment$Callbacks;", "", "onTransactionSuccess", "", "confirmationType", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onTransactionSuccess(ConfirmationType confirmationType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$10(MatchaReviewMultiuserTransactionFragment matchaReviewMultiuserTransactionFragment, int i, Composer composer, int i2) throws Resources.NotFoundException {
        matchaReviewMultiuserTransactionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public MatchaReviewMultiuserTransactionFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionFragment$memoLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    Intent data = result.getData();
                    this.this$0.getDuxo().updateMemo(data != null ? data.getStringExtra(MemoInputActivity.EXTRA_MEMO) : null);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.memoLauncher = activityResultLauncherRegisterForActivityResult;
        this.useDesignSystemToolbar = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchaReviewMultiuserTransactionDuxo getDuxo() {
        return (MatchaReviewMultiuserTransactionDuxo) this.duxo.getValue();
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.P2P_REVIEW_MULTIUSER_TRANSACTION, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        Companion companion = INSTANCE;
        float fFloatValue = ((Args) companion.getArgs((Fragment) this)).getAmount().getDecimalValue().floatValue();
        P2PContext.Direction protobuf = RosettaConverters.toProtobuf(((Args) companion.getArgs((Fragment) this)).getDirection());
        List<Transactor> transactors = ((Args) companion.getArgs((Fragment) this)).getTransactors();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(transactors, 10));
        Iterator<T> it = transactors.iterator();
        while (it.hasNext()) {
            arrayList.add(RosettaConverters.toTargetType((Transactor) it.next()));
        }
        return new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, ((Args) INSTANCE.getArgs((Fragment) this)).getEntryPoint().getIdentifier(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new P2PContext(protobuf, null, fFloatValue, null, arrayList, null, 42, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -268435457, -1, -1, 16383, null);
    }

    private static final MatchaReviewMultiuserTransactionViewState ComposeContent$lambda$1(SnapshotState4<MatchaReviewMultiuserTransactionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C214921(null), 1, null);
    }

    /* compiled from: MatchaReviewMultiuserTransactionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionFragment$onViewCreated$1", m3645f = "MatchaReviewMultiuserTransactionFragment.kt", m3646l = {97}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionFragment$onViewCreated$1 */
    static final class C214921 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C214921(Continuation<? super C214921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaReviewMultiuserTransactionFragment.this.new C214921(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C214921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(MatchaReviewMultiuserTransactionFragment.this.getDuxo().getEventFlow());
                final MatchaReviewMultiuserTransactionFragment matchaReviewMultiuserTransactionFragment = MatchaReviewMultiuserTransactionFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<MatchaReviewMultiuserTransactionEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<MatchaReviewMultiuserTransactionEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<MatchaReviewMultiuserTransactionEvent> eventConsumerInvoke;
                        EventConsumer<MatchaReviewMultiuserTransactionEvent> eventConsumerInvoke2;
                        EventConsumer<MatchaReviewMultiuserTransactionEvent> eventConsumerInvoke3;
                        EventConsumer<MatchaReviewMultiuserTransactionEvent> eventConsumerInvoke4;
                        final MatchaReviewMultiuserTransactionFragment matchaReviewMultiuserTransactionFragment2 = matchaReviewMultiuserTransactionFragment;
                        if ((event.getData() instanceof MatchaReviewMultiuserTransactionEvent.SubmitResult) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16417invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16417invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    MatchaReviewMultiuserTransactionEvent.SubmitResult submitResult = (MatchaReviewMultiuserTransactionEvent.SubmitResult) event.getData();
                                    if (!(submitResult instanceof MatchaReviewMultiuserTransactionEvent.SubmitResult.Success)) {
                                        if (submitResult instanceof MatchaReviewMultiuserTransactionEvent.SubmitResult.InsufficientFundsError) {
                                            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                                            Context contextRequireContext = matchaReviewMultiuserTransactionFragment2.requireContext();
                                            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                            RhDialogFragment.Builder theme = companion.create(contextRequireContext).setId(C21284R.id.dialog_id_matcha_transaction_error).setTitle(C21284R.string.matcha_transfer_insufficient_funds_title, new Object[0]).setMessage(C21284R.string.matcha_transfer_insufficient_funds_detail, new Object[0]).setPositiveButton(C21284R.string.matcha_transfer_insufficient_funds_action, new Object[0]).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
                                            FragmentManager childFragmentManager = matchaReviewMultiuserTransactionFragment2.getChildFragmentManager();
                                            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                            RhDialogFragment.Builder.show$default(theme, childFragmentManager, "insufficient-funds-error", false, 4, null);
                                            return;
                                        }
                                        if (submitResult instanceof MatchaReviewMultiuserTransactionEvent.SubmitResult.Error) {
                                            AbsErrorHandler.handleError$default(ErrorHandling.getMatchaErrorHandler(matchaReviewMultiuserTransactionFragment2.requireBaseActivity()), ((MatchaReviewMultiuserTransactionEvent.SubmitResult.Error) submitResult).getThrowable(), false, 2, null);
                                            return;
                                        } else {
                                            if (!(submitResult instanceof MatchaReviewMultiuserTransactionEvent.SubmitResult.VerificationRequired) && !(submitResult instanceof MatchaReviewMultiuserTransactionEvent.SubmitResult.VerificationComplete)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            return;
                                        }
                                    }
                                    matchaReviewMultiuserTransactionFragment2.getCallbacks().onTransactionSuccess(((MatchaReviewMultiuserTransactionEvent.SubmitResult.Success) submitResult).getConfirmationType());
                                }
                            });
                        }
                        final MatchaReviewMultiuserTransactionFragment matchaReviewMultiuserTransactionFragment3 = matchaReviewMultiuserTransactionFragment;
                        if ((event.getData() instanceof MatchaReviewMultiuserTransactionEvent.AddMemo) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16418invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16418invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    MatchaReviewMultiuserTransactionEvent.AddMemo addMemo = (MatchaReviewMultiuserTransactionEvent.AddMemo) event.getData();
                                    ActivityResultLauncher activityResultLauncher = matchaReviewMultiuserTransactionFragment3.memoLauncher;
                                    MemoInputActivity.Companion companion = MemoInputActivity.INSTANCE;
                                    Context contextRequireContext = matchaReviewMultiuserTransactionFragment3.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    activityResultLauncher.launch(companion.getIntentWithExtras(contextRequireContext, (Parcelable) addMemo.getArgs()));
                                }
                            });
                        }
                        final MatchaReviewMultiuserTransactionFragment matchaReviewMultiuserTransactionFragment4 = matchaReviewMultiuserTransactionFragment;
                        if ((event.getData() instanceof MatchaReviewMultiuserTransactionEvent.ShowSourceOfFundsSelector) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16419invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16419invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    SourceOfFundsBottomSheet sourceOfFundsBottomSheet = (SourceOfFundsBottomSheet) SourceOfFundsBottomSheet.INSTANCE.newInstance((Parcelable) new SourceOfFundsBottomSheet.Args(((MatchaReviewMultiuserTransactionEvent.ShowSourceOfFundsSelector) event.getData()).getSelectedAccount().getOrNull()));
                                    FragmentManager childFragmentManager = matchaReviewMultiuserTransactionFragment4.getChildFragmentManager();
                                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                    sourceOfFundsBottomSheet.show(childFragmentManager, "source-of-funds-sheet");
                                }
                            });
                        }
                        final MatchaReviewMultiuserTransactionFragment matchaReviewMultiuserTransactionFragment5 = matchaReviewMultiuserTransactionFragment;
                        if ((event.getData() instanceof MatchaReviewMultiuserTransactionEvent.LaunchTransferActivity) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$4
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m16420invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m16420invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    MatchaReviewMultiuserTransactionEvent.LaunchTransferActivity launchTransferActivity = (MatchaReviewMultiuserTransactionEvent.LaunchTransferActivity) event.getData();
                                    Navigator navigator = matchaReviewMultiuserTransactionFragment5.getNavigator();
                                    Context contextRequireContext = matchaReviewMultiuserTransactionFragment5.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                                    ApiTransferAccount.TransferAccountType sourceOfFundsType = launchTransferActivity.getSourceOfFundsType();
                                    Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Transfer(new TransferConfiguration.Standard(null, null, false, null, sourceOfFundsType != null ? new TransferConfiguration.TransferAccountSelection(null, false, sourceOfFundsType, 3, null) : null, null, null, null, false, false, null, null, false, 8175, null)), null, false, null, null, 60, null);
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C21284R.id.dialog_id_matcha_transaction_error) {
            getDuxo().launchTransferActivity();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    @Override // com.robinhood.compose.app.GenericComposeFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ComposeContent(Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(363907717);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(363907717, i2, -1, "com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionFragment.ComposeContent (MatchaReviewMultiuserTransactionFragment.kt:165)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            if (ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getShowLoading()) {
                composerStartRestartGroup.startReplaceGroup(677488086);
                MatchaReviewComposable.SubmitLoading(composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(677584992);
                StringResource toolbarTitleText = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getToolbarTitleText();
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                String string2 = toolbarTitleText.getText(resources).toString();
                StringResource toolbarSubtitle = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getToolbarSubtitle();
                if (toolbarSubtitle != null) {
                    Resources resources2 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                    CharSequence text = toolbarSubtitle.getText(resources2);
                    String string3 = text != null ? text.toString() : null;
                    ImmutableList immutableList = extensions2.toImmutableList(ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getAvatars());
                    String amountText = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getAmountText();
                    StringResource summaryText = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getSummaryText();
                    Resources resources3 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                    String string4 = summaryText.getText(resources3).toString();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionFragment$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MatchaReviewMultiuserTransactionFragment.ComposeContent$lambda$3$lambda$2(this.f$0, snapshotState4CollectAsStateWithLifecycle);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    StringResource swipeHintText = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getSwipeHintText();
                    Resources resources4 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                    String string5 = swipeHintText.getText(resources4).toString();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionFragment$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return MatchaReviewMultiuserTransactionFragment.ComposeContent$lambda$5$lambda$4(this.f$0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function02 = (Function0) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    FragmentActivity fragmentActivityRequireActivity = requireActivity();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(fragmentActivityRequireActivity);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new MatchaReviewMultiuserTransactionFragment2(fragmentActivityRequireActivity);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function0 function03 = (Function0) ((KFunction) objRememberedValue3);
                    MatchaReviewMultiuserTransactionDuxo duxo = getDuxo();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(duxo);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new MatchaReviewMultiuserTransactionFragment3(duxo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    KFunction kFunction = (KFunction) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    if (!ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).isSourceOfFundsEditable()) {
                        kFunction = null;
                    }
                    Function0 function04 = (Function0) kFunction;
                    MatchaReviewTransactionViewState3 memoState = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle).getMemoState();
                    MatchaReviewMultiuserTransactionDuxo duxo2 = getDuxo();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(duxo2);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new MatchaReviewMultiuserTransactionFragment4(duxo2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MatchaMultiuserReviewComposable.ReviewMultiuserTransaction(string2, string3, immutableList, amountText, string4, function0, string5, function02, function03, function04, memoState, (Function0) ((KFunction) objRememberedValue5), null, composerStartRestartGroup, 0, 0, 4096);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaReviewMultiuserTransactionFragment.ComposeContent$lambda$10(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3$lambda$2(MatchaReviewMultiuserTransactionFragment matchaReviewMultiuserTransactionFragment, SnapshotState4 snapshotState4) {
        EventLogger.DefaultImpls.logTap$default(matchaReviewMultiuserTransactionFragment.getEventLogger(), UserInteractionEventData.Action.LEARN_MORE, matchaReviewMultiuserTransactionFragment.getEventScreen(), null, null, matchaReviewMultiuserTransactionFragment.getScreenEventContext(), false, 44, null);
        Navigator navigator = matchaReviewMultiuserTransactionFragment.getNavigator();
        Context contextRequireContext = matchaReviewMultiuserTransactionFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        StringResource summaryText = ComposeContent$lambda$1(snapshotState4).getSummaryText();
        Resources resources = matchaReviewMultiuserTransactionFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new SummaryShowMoreFragmentKey(summaryText.getText(resources).toString()), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(MatchaReviewMultiuserTransactionFragment matchaReviewMultiuserTransactionFragment) {
        EventLogger.DefaultImpls.logSwipe$default(matchaReviewMultiuserTransactionFragment.getEventLogger(), UserInteractionEventData.Action.SUBMIT, matchaReviewMultiuserTransactionFragment.getEventScreen(), null, null, matchaReviewMultiuserTransactionFragment.getScreenEventContext(), false, 44, null);
        matchaReviewMultiuserTransactionFragment.getDuxo().submit();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsBottomSheet.Callbacks
    public void onSourceOfFundsSelected(TransferAccount sourceOfFunds) {
        Intrinsics.checkNotNullParameter(sourceOfFunds, "sourceOfFunds");
        getDuxo().updateSelectedTransferAccount(sourceOfFunds);
    }

    /* compiled from: MatchaReviewMultiuserTransactionFragment.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010!\u001a\u00020\"J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionFragment$Args;", "Landroid/os/Parcelable;", "amount", "Lcom/robinhood/models/util/Money;", "transactors", "", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "direction", "Lcom/robinhood/android/matcha/ui/models/Direction;", "sourceOfFunds", "Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "requestId", "Ljava/util/UUID;", MemoInputActivity.EXTRA_MEMO, "", "entryPoint", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/util/List;Lcom/robinhood/android/matcha/ui/models/Direction;Lcom/robinhood/android/models/matcha/api/SourceOfFunds;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getTransactors", "()Ljava/util/List;", "getDirection", "()Lcom/robinhood/android/matcha/ui/models/Direction;", "getSourceOfFunds", "()Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "getRequestId", "()Ljava/util/UUID;", "getMemo", "()Ljava/lang/String;", "getEntryPoint", "()Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$EntryPoint;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final Money amount;
        private final Direction direction;
        private final MatchaTransaction.EntryPoint entryPoint;
        private final String memo;
        private final UUID requestId;
        private final SourceOfFunds sourceOfFunds;
        private final List<Transactor> transactors;

        /* compiled from: MatchaReviewMultiuserTransactionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Money money = (Money) parcel.readParcelable(Args.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(money, arrayList, Direction.CREATOR.createFromParcel(parcel), (SourceOfFunds) parcel.readParcelable(Args.class.getClassLoader()), (UUID) parcel.readSerializable(), parcel.readString(), MatchaTransaction.EntryPoint.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.amount, flags);
            List<Transactor> list = this.transactors;
            dest.writeInt(list.size());
            Iterator<Transactor> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            this.direction.writeToParcel(dest, flags);
            dest.writeParcelable(this.sourceOfFunds, flags);
            dest.writeSerializable(this.requestId);
            dest.writeString(this.memo);
            dest.writeString(this.entryPoint.name());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(Money amount, List<? extends Transactor> transactors, Direction direction, SourceOfFunds sourceOfFunds, UUID uuid, String str, MatchaTransaction.EntryPoint entryPoint) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(transactors, "transactors");
            Intrinsics.checkNotNullParameter(direction, "direction");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.amount = amount;
            this.transactors = transactors;
            this.direction = direction;
            this.sourceOfFunds = sourceOfFunds;
            this.requestId = uuid;
            this.memo = str;
            this.entryPoint = entryPoint;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Args(Money money, List list, Direction direction, SourceOfFunds sourceOfFunds, UUID uuid, String str, MatchaTransaction.EntryPoint entryPoint, int i, DefaultConstructorMarker defaultConstructorMarker) {
            MatchaTransaction.EntryPoint entryPoint2;
            String str2;
            sourceOfFunds = (i & 8) != 0 ? null : sourceOfFunds;
            uuid = (i & 16) != 0 ? null : uuid;
            if ((i & 32) != 0) {
                entryPoint2 = entryPoint;
                str2 = null;
            } else {
                entryPoint2 = entryPoint;
                str2 = str;
            }
            this(money, list, direction, sourceOfFunds, uuid, str2, entryPoint2);
        }

        public final Money getAmount() {
            return this.amount;
        }

        public final List<Transactor> getTransactors() {
            return this.transactors;
        }

        public final Direction getDirection() {
            return this.direction;
        }

        public final SourceOfFunds getSourceOfFunds() {
            return this.sourceOfFunds;
        }

        public final UUID getRequestId() {
            return this.requestId;
        }

        public final String getMemo() {
            return this.memo;
        }

        public final MatchaTransaction.EntryPoint getEntryPoint() {
            return this.entryPoint;
        }
    }

    /* compiled from: MatchaReviewMultiuserTransactionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionFragment;", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionFragment$Args;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MatchaReviewMultiuserTransactionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MatchaReviewMultiuserTransactionFragment matchaReviewMultiuserTransactionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, matchaReviewMultiuserTransactionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MatchaReviewMultiuserTransactionFragment newInstance(Args args) {
            return (MatchaReviewMultiuserTransactionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MatchaReviewMultiuserTransactionFragment matchaReviewMultiuserTransactionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, matchaReviewMultiuserTransactionFragment, args);
        }
    }
}
