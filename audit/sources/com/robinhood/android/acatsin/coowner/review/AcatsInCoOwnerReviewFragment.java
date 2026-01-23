package com.robinhood.android.acatsin.coowner.review;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewContract;
import com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewState2;
import com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewState5;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment2;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.AcatsFlowStep2;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
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

/* compiled from: AcatsInCoOwnerReviewFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\u0012\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-acats-in-coowner_externalDebug", "viewState", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewViewState;", "events", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewEvent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInCoOwnerReviewFragment extends AcatsFlowStepFragment2 {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInCoOwnerReviewFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8(AcatsInCoOwnerReviewFragment acatsInCoOwnerReviewFragment, int i, Composer composer, int i2) {
        acatsInCoOwnerReviewFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public AcatsInCoOwnerReviewFragment() {
        super(AcatsFlowStep2.ACATS_IN_CO_OWNER_CONFIRM, AcatsFlowStep.REVIEW_AND_SUBMIT);
        this.duxo = DuxosKt.duxo(this, AcatsInCoOwnerReviewDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInCoOwnerReviewContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInCoOwnerReviewContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final AcatsInCoOwnerReviewDuxo getDuxo() {
        return (AcatsInCoOwnerReviewDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInCoOwnerReviewContract.Callbacks getCallbacks() {
        return (AcatsInCoOwnerReviewContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<AcatsInCoOwnerReviewState2> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(1713191633);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1713191633, i2, -1, "com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewFragment.ComposeContent (AcatsInCoOwnerReviewFragment.kt:23)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Event<AcatsInCoOwnerReviewState2> eventComposeContent$lambda$1 = ComposeContent$lambda$1(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (eventComposeContent$lambda$1 != null && (eventComposeContent$lambda$1.getData() instanceof AcatsInCoOwnerReviewState2.AcatRequestCancelled) && (eventConsumerInvoke = eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m10733invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m10733invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.getCallbacks().onAcatRequestCanceled(((AcatsInCoOwnerReviewState2.AcatRequestCancelled) eventComposeContent$lambda$1.getData()).getCoOwnerName());
                    }
                });
            }
            AcatsInCoOwnerReviewState5 acatsInCoOwnerReviewState5ComposeContent$lambda$0 = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsInCoOwnerReviewFragment.ComposeContent$lambda$4$lambda$3(this.f$0, (AcatsInCoOwnerReviewState5.Loaded) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            AcatsInCoOwnerReviewContract.Callbacks callbacks = getCallbacks();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(callbacks);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new AcatsInCoOwnerReviewFragment2(callbacks);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function12 = (Function1) ((KFunction) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsInCoOwnerReviewFragment.ComposeContent$lambda$7$lambda$6(this.f$0, (AcatsInCoOwnerReviewState5.Loaded) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            AcatsInCoOwnerReviewComposable.AcatsInCoOwnerReviewComposable(acatsInCoOwnerReviewState5ComposeContent$lambda$0, function1, function12, (Function1) objRememberedValue3, null, composerStartRestartGroup, 0, 16);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInCoOwnerReviewFragment.ComposeContent$lambda$8(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(AcatsInCoOwnerReviewFragment acatsInCoOwnerReviewFragment, AcatsInCoOwnerReviewState5.Loaded state) {
        Intrinsics.checkNotNullParameter(state, "state");
        acatsInCoOwnerReviewFragment.getCallbacks().onAcatReviewed(state.getRhsAccountNumber(), state.getBrokerageAccountType(), state.getDtccNumber());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7$lambda$6(AcatsInCoOwnerReviewFragment acatsInCoOwnerReviewFragment, AcatsInCoOwnerReviewState5.Loaded state) {
        Intrinsics.checkNotNullParameter(state, "state");
        acatsInCoOwnerReviewFragment.getDuxo().onCancelAcatRequest(state.getAcatsId(), state.isCancelSheetLoading(), state.getCoOwnerName());
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInCoOwnerReviewFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewFragment;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewContract$Key;", "<init>", "()V", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInCoOwnerReviewFragment, AcatsInCoOwnerReviewContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInCoOwnerReviewContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInCoOwnerReviewContract.Key getArgs(AcatsInCoOwnerReviewFragment acatsInCoOwnerReviewFragment) {
            return (AcatsInCoOwnerReviewContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInCoOwnerReviewFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInCoOwnerReviewFragment newInstance(AcatsInCoOwnerReviewContract.Key key) {
            return (AcatsInCoOwnerReviewFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInCoOwnerReviewFragment acatsInCoOwnerReviewFragment, AcatsInCoOwnerReviewContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInCoOwnerReviewFragment, key);
        }
    }

    private static final AcatsInCoOwnerReviewState5 ComposeContent$lambda$0(SnapshotState4<? extends AcatsInCoOwnerReviewState5> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<AcatsInCoOwnerReviewState2> ComposeContent$lambda$1(SnapshotState4<Event<AcatsInCoOwnerReviewState2>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
