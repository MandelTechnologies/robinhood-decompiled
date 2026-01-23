package com.robinhood.android.referral.fractionalRewards.loading;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.referral.C26659R;
import com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingFragment;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: FractionalRewardLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0003&'(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\r\u0010\u001b\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "duxo", "Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingDuxo;", "getDuxo", "()Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "bindViewState", "viewState", "Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingViewState;", "onError", "error", "", "onDialogDismissed", "id", "", "Callbacks", "Args", "Companion", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class FractionalRewardLoadingFragment extends GenericComposeFragment implements RhDialogFragment.OnDismissListener {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(FractionalRewardLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, FractionalRewardLoadingDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof FractionalRewardLoadingFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: FractionalRewardLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingFragment$Callbacks;", "", "onRewardInfoLoaded", "", "viewState", "Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadedState;", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRewardInfoLoaded(FractionalRewardLoadedState viewState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(FractionalRewardLoadingFragment fractionalRewardLoadingFragment, int i, Composer composer, int i2) {
        fractionalRewardLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FractionalRewardLoadingDuxo getDuxo() {
        return (FractionalRewardLoadingDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C266991(null), 1, null);
    }

    /* compiled from: FractionalRewardLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingFragment$onViewCreated$1", m3645f = "FractionalRewardLoadingFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingFragment$onViewCreated$1 */
    static final class C266991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C266991(Continuation<? super C266991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C266991 c266991 = FractionalRewardLoadingFragment.this.new C266991(continuation);
            c266991.L$0 = obj;
            return c266991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C266991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: FractionalRewardLoadingFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingFragment$onViewCreated$1$1", m3645f = "FractionalRewardLoadingFragment.kt", m3646l = {44}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FractionalRewardLoadingFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FractionalRewardLoadingFragment fractionalRewardLoadingFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = fractionalRewardLoadingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: FractionalRewardLoadingFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C504991 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ FractionalRewardLoadingFragment $tmp0;

                C504991(FractionalRewardLoadingFragment fractionalRewardLoadingFragment) {
                    this.$tmp0 = fractionalRewardLoadingFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, FractionalRewardLoadingFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(FractionalRewardLoadingViewState fractionalRewardLoadingViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$bindViewState = AnonymousClass1.invokeSuspend$bindViewState(this.$tmp0, fractionalRewardLoadingViewState, continuation);
                    return objInvokeSuspend$bindViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bindViewState : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((FractionalRewardLoadingViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<FractionalRewardLoadingViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C504991 c504991 = new C504991(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c504991, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$bindViewState(FractionalRewardLoadingFragment fractionalRewardLoadingFragment, FractionalRewardLoadingViewState fractionalRewardLoadingViewState, Continuation continuation) {
                fractionalRewardLoadingFragment.bindViewState(fractionalRewardLoadingViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.L$0, null, null, new AnonymousClass1(FractionalRewardLoadingFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1238636731);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1238636731, i, -1, "com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingFragment.ComposeContent (FractionalRewardLoadingFragment.kt:49)");
            }
            LoadingScreenComposablesKt.ShimmerLoadingComposable(new ShimmerLoaderType.Generic(true), WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE), composerStartRestartGroup, ShimmerLoaderType.Generic.$stable, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.referral.fractionalRewards.loading.FractionalRewardLoadingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FractionalRewardLoadingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(FractionalRewardLoadingViewState viewState) {
        UiEvent<Throwable> error = viewState.getError();
        Throwable thConsume = error != null ? error.consume() : null;
        if (thConsume != null) {
            onError(thConsume);
        }
        FractionalRewardLoadedState completedLoadedState = viewState.getCompletedLoadedState();
        if (completedLoadedState != null) {
            getCallbacks().onRewardInfoLoaded(completedLoadedState);
        }
    }

    private final void onError(Throwable error) {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        AbsErrorHandler.handleError$default(new ActivityErrorHandler(fragmentActivityRequireActivity, true, C26659R.id.dialog_id_fractional_claim_error, null, 8, null), error, false, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C26659R.id.dialog_id_fractional_claim_error) {
            requireActivity().finish();
        } else {
            super.onDialogDismissed(id);
        }
    }

    /* compiled from: FractionalRewardLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingFragment$Args;", "Landroid/os/Parcelable;", "rewardId", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getRewardId", "()Ljava/util/UUID;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID rewardId;

        /* compiled from: FractionalRewardLoadingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.rewardId;
            }
            return args.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getRewardId() {
            return this.rewardId;
        }

        public final Args copy(UUID rewardId) {
            Intrinsics.checkNotNullParameter(rewardId, "rewardId");
            return new Args(rewardId);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.rewardId, ((Args) other).rewardId);
        }

        public int hashCode() {
            return this.rewardId.hashCode();
        }

        public String toString() {
            return "Args(rewardId=" + this.rewardId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.rewardId);
        }

        public Args(UUID rewardId) {
            Intrinsics.checkNotNullParameter(rewardId, "rewardId");
            this.rewardId = rewardId;
        }

        public final UUID getRewardId() {
            return this.rewardId;
        }
    }

    /* compiled from: FractionalRewardLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingFragment;", "Lcom/robinhood/android/referral/fractionalRewards/loading/FractionalRewardLoadingFragment$Args;", "<init>", "()V", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<FractionalRewardLoadingFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(FractionalRewardLoadingFragment fractionalRewardLoadingFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, fractionalRewardLoadingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public FractionalRewardLoadingFragment newInstance(Args args) {
            return (FractionalRewardLoadingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(FractionalRewardLoadingFragment fractionalRewardLoadingFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, fractionalRewardLoadingFragment, args);
        }
    }
}
