package com.robinhood.android.matcha.p177ui.username;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.matcha.p177ui.common.HasPromptedUsernameUpdatePref;
import com.robinhood.android.matcha.p177ui.username.UpdateUsernameFragment;
import com.robinhood.android.matcha.p177ui.username.UpdateUsernameViewState;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.resource.StringResource;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: UpdateUsernameFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\r\u0010\u001d\u001a\u00020\u0018H\u0017¢\u0006\u0002\u0010\u001eR$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006 ²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/username/UpdateUsernameFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "hasPromptedUsernameUpdatePref", "Lcom/robinhood/prefs/BooleanPreference;", "getHasPromptedUsernameUpdatePref$annotations", "getHasPromptedUsernameUpdatePref", "()Lcom/robinhood/prefs/BooleanPreference;", "setHasPromptedUsernameUpdatePref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "duxo", "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameDuxo;", "getDuxo", "()Lcom/robinhood/android/matcha/ui/username/UpdateUsernameDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/matcha/ui/username/UpdateUsernameFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "feature-p2p_externalDebug", "viewState", "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class UpdateUsernameFragment extends GenericComposeFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UpdateUsernameFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/matcha/ui/username/UpdateUsernameFragment$Callbacks;", 0))};
    public static final int $stable = 8;
    public BooleanPreference hasPromptedUsernameUpdatePref;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, UpdateUsernameDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.matcha.ui.username.UpdateUsernameFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof UpdateUsernameFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: UpdateUsernameFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/username/UpdateUsernameFragment$Callbacks;", "", "onUsernameUpdateComplete", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onUsernameUpdateComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(UpdateUsernameFragment updateUsernameFragment, int i, Composer composer, int i2) {
        updateUsernameFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @HasPromptedUsernameUpdatePref
    public static /* synthetic */ void getHasPromptedUsernameUpdatePref$annotations() {
    }

    public final BooleanPreference getHasPromptedUsernameUpdatePref() {
        BooleanPreference booleanPreference = this.hasPromptedUsernameUpdatePref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasPromptedUsernameUpdatePref");
        return null;
    }

    public final void setHasPromptedUsernameUpdatePref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasPromptedUsernameUpdatePref = booleanPreference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UpdateUsernameDuxo getDuxo() {
        return (UpdateUsernameDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getHasPromptedUsernameUpdatePref().set(true);
        BaseFragment.collectDuxoState$default(this, null, new C215911(null), 1, null);
    }

    /* compiled from: UpdateUsernameFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.username.UpdateUsernameFragment$onViewCreated$1", m3645f = "UpdateUsernameFragment.kt", m3646l = {37}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.username.UpdateUsernameFragment$onViewCreated$1 */
    static final class C215911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C215911(Continuation<? super C215911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UpdateUsernameFragment.this.new C215911(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C215911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UpdateUsernameFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.username.UpdateUsernameFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ UpdateUsernameFragment this$0;

            AnonymousClass1(UpdateUsernameFragment updateUsernameFragment) {
                this.this$0 = updateUsernameFragment;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((UpdateUsernameViewState) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object emit(UpdateUsernameViewState updateUsernameViewState, Continuation<? super Unit> continuation) {
                ComposeUiEvent<Unit> updateComplete;
                UpdateUsernameViewState.Loaded loaded = updateUsernameViewState instanceof UpdateUsernameViewState.Loaded ? (UpdateUsernameViewState.Loaded) updateUsernameViewState : null;
                if (loaded != null && (updateComplete = loaded.getUpdateComplete()) != null) {
                    final UpdateUsernameFragment updateUsernameFragment = this.this$0;
                    updateComplete.consumeWith(new Function1() { // from class: com.robinhood.android.matcha.ui.username.UpdateUsernameFragment$onViewCreated$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return UpdateUsernameFragment.C215911.AnonymousClass1.emit$lambda$0(updateUsernameFragment, (Unit) obj);
                        }
                    });
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit emit$lambda$0(UpdateUsernameFragment updateUsernameFragment, Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                updateUsernameFragment.getCallbacks().onUsernameUpdateComplete();
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<UpdateUsernameViewState> stateFlow = UpdateUsernameFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(UpdateUsernameFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1223540611);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1223540611, i2, -1, "com.robinhood.android.matcha.ui.username.UpdateUsernameFragment.ComposeContent (UpdateUsernameFragment.kt:46)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1308561592, true, new C215901(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.username.UpdateUsernameFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UpdateUsernameFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: UpdateUsernameFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.username.UpdateUsernameFragment$ComposeContent$1 */
    static final class C215901 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<UpdateUsernameViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C215901(SnapshotState4<? extends UpdateUsernameViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UpdateUsernameFragment updateUsernameFragment, String username) {
            Intrinsics.checkNotNullParameter(username, "username");
            FragmentActivity fragmentActivityRequireActivity = updateUsernameFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
            updateUsernameFragment.getDuxo().saveUsername(username);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1308561592, i, -1, "com.robinhood.android.matcha.ui.username.UpdateUsernameFragment.ComposeContent.<anonymous> (UpdateUsernameFragment.kt:49)");
            }
            UpdateUsernameViewState updateUsernameViewStateComposeContent$lambda$0 = UpdateUsernameFragment.ComposeContent$lambda$0(this.$viewState$delegate);
            if (updateUsernameViewStateComposeContent$lambda$0 instanceof UpdateUsernameViewState.Loading) {
                composer.startReplaceGroup(2059869409);
                LocalShowPlaceholder.Loadable(true, null, null, UpdateUsernameFragment2.INSTANCE.getLambda$1211742288$feature_p2p_externalDebug(), composer, 3078, 6);
                composer.endReplaceGroup();
            } else if (updateUsernameViewStateComposeContent$lambda$0 instanceof UpdateUsernameViewState.Loaded) {
                composer.startReplaceGroup(2060333169);
                UpdateUsernameViewState.Loaded loaded = (UpdateUsernameViewState.Loaded) updateUsernameViewStateComposeContent$lambda$0;
                String username = loaded.getUsername();
                boolean zIsSaveButtonLoading = loaded.isSaveButtonLoading();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(UpdateUsernameFragment.this);
                final UpdateUsernameFragment updateUsernameFragment = UpdateUsernameFragment.this;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.matcha.ui.username.UpdateUsernameFragment$ComposeContent$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return UpdateUsernameFragment.C215901.invoke$lambda$1$lambda$0(updateUsernameFragment, (String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                UpdateUsernameViewState.ErrorDialog errorDialog = loaded.getErrorDialog();
                UpdateUsernameDuxo duxo = UpdateUsernameFragment.this.getDuxo();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(duxo);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new UpdateUsernameFragment4(duxo);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                UpdateUsernameComposable.UpdateUsernameScreen(username, zIsSaveButtonLoading, function1, errorDialog, (Function0) ((KFunction) objRememberedValue2), composer, StringResource.$stable << 9);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(2060847738);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdateUsernameViewState ComposeContent$lambda$0(SnapshotState4<? extends UpdateUsernameViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
