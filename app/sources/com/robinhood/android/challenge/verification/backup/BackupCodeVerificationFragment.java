package com.robinhood.android.challenge.verification.backup;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.challenge.C10497R;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.challenge.databinding.FragmentBackupCodeVerificationBinding;
import com.robinhood.android.challenge.verification.ChallengeVerificationEvent;
import com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment;
import com.robinhood.android.challenge.verification.dialog.ChallengeDialogHelper;
import com.robinhood.android.challenge.verification.dialog.DefaultNegativeButtonClickDelegate;
import com.robinhood.android.challenge.verification.dialog.DefaultPositiveButtonClickDelegate;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p081cx.SupportEmailHandler;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.Challenge;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.shared.security.contracts.BackupCodeVerificationInput;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: BackupCodeVerificationFragment.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 E2\u00020\u0001:\u0002DEB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u00107\u001a\u0002022\u0006\u00108\u001a\u000209H\u0016J\u001a\u0010:\u001a\u00020*2\u0006\u00108\u001a\u0002092\b\u0010;\u001a\u0004\u0018\u000106H\u0016J\u001a\u0010<\u001a\u00020*2\u0006\u00108\u001a\u0002092\b\u0010;\u001a\u0004\u0018\u000106H\u0016J\u0010\u0010=\u001a\u0002022\u0006\u0010>\u001a\u00020?H\u0002J\u0016\u0010@\u001a\u0002022\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R!\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b&\u0010'R+\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020*8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "supportEmailHandler", "Lcom/robinhood/android/common/cx/SupportEmailHandler;", "getSupportEmailHandler$feature_challenge_externalDebug", "()Lcom/robinhood/android/common/cx/SupportEmailHandler;", "setSupportEmailHandler$feature_challenge_externalDebug", "(Lcom/robinhood/android/common/cx/SupportEmailHandler;)V", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "dialogHelper", "Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogHelper;", "callbacks", "Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/challenge/databinding/FragmentBackupCodeVerificationBinding;", "getBinding", "()Lcom/robinhood/android/challenge/databinding/FragmentBackupCodeVerificationBinding;", "binding$delegate", "duxo", "Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationDuxo;", "getDuxo", "()Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "errorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "getErrorHandler", "()Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "errorHandler$delegate", "<set-?>", "", "isChallengeLoaded", "()Z", "setChallengeLoaded", "(Z)V", "isChallengeLoaded$delegate", "Lkotlin/properties/ReadWriteProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "onPositiveButtonClicked", "passthroughArgs", "onNegativeButtonClicked", "bind", "state", "Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationViewState;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationEvent;", "Callbacks", "Companion", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BackupCodeVerificationFragment extends BaseFragment {
    private static final int BACKUP_CODE_LENGTH = 12;
    public AuthManager authManager;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final ChallengeDialogHelper dialogHelper;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: errorHandler$delegate, reason: from kotlin metadata */
    private final Lazy errorHandler;

    /* renamed from: isChallengeLoaded$delegate, reason: from kotlin metadata */
    private final Interfaces3 isChallengeLoaded;
    public SupportEmailHandler supportEmailHandler;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BackupCodeVerificationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(BackupCodeVerificationFragment.class, "binding", "getBinding()Lcom/robinhood/android/challenge/databinding/FragmentBackupCodeVerificationBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BackupCodeVerificationFragment.class, "isChallengeLoaded", "isChallengeLoaded()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BackupCodeVerificationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationFragment$Callbacks;", "", "onContinueBackupCode", "", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Ljava/util/UUID;", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinueBackupCode(UUID challengeId);
    }

    public BackupCodeVerificationFragment() {
        super(C10497R.layout.fragment_backup_code_verification);
        this.dialogHelper = new ChallengeDialogHelper();
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof BackupCodeVerificationFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, BackupCodeVerificationFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, BackupCodeVerificationDuxo.class);
        this.errorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BackupCodeVerificationFragment.errorHandler_delegate$lambda$0(this.f$0);
            }
        });
        this.isChallengeLoaded = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<ChallengeVerificationEvent> event) {
        EventConsumer<ChallengeVerificationEvent> eventConsumerInvoke;
        EventConsumer<ChallengeVerificationEvent> eventConsumerInvoke2;
        EventConsumer<ChallengeVerificationEvent> eventConsumerInvoke3;
        if ((event.getData() instanceof ChallengeVerificationEvent.ChallengeVerified) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m11793invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m11793invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    ChallengeVerificationEvent.ChallengeVerified challengeVerified = (ChallengeVerificationEvent.ChallengeVerified) event.getData();
                    BackupCodeVerificationFragment.Callbacks callbacks = this.getCallbacks();
                    UUID challengeId = challengeVerified.getChallengeId();
                    Intrinsics.checkNotNull(challengeId);
                    callbacks.onContinueBackupCode(challengeId);
                }
            });
        }
        if ((event.getData() instanceof ChallengeVerificationEvent.Dialog) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m11794invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m11794invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    ChallengeVerificationEvent.Dialog dialog = (ChallengeVerificationEvent.Dialog) event.getData();
                    if (dialog.getInfo().getShouldClearInput()) {
                        this.getBinding().backupCodeVerificationInput.setText("");
                    }
                    this.dialogHelper.showDialog(this, dialog.getInfo());
                }
            });
        }
        if (!(event.getData() instanceof ChallengeVerificationEvent.Error) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment$handleEvent$$inlined$consumeIfType$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m11795invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m11795invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AbsErrorHandler.handleError$default(this.getErrorHandler(), ((ChallengeVerificationEvent.Error) event.getData()).getThrowable(), false, 2, null);
            }
        });
    }

    public final SupportEmailHandler getSupportEmailHandler$feature_challenge_externalDebug() {
        SupportEmailHandler supportEmailHandler = this.supportEmailHandler;
        if (supportEmailHandler != null) {
            return supportEmailHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("supportEmailHandler");
        return null;
    }

    public final void setSupportEmailHandler$feature_challenge_externalDebug(SupportEmailHandler supportEmailHandler) {
        Intrinsics.checkNotNullParameter(supportEmailHandler, "<set-?>");
        this.supportEmailHandler = supportEmailHandler;
    }

    public final AuthManager getAuthManager() {
        AuthManager authManager = this.authManager;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManager");
        return null;
    }

    public final void setAuthManager(AuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "<set-?>");
        this.authManager = authManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentBackupCodeVerificationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentBackupCodeVerificationBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BackupCodeVerificationDuxo getDuxo() {
        return (BackupCodeVerificationDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivityErrorHandler<Object> getErrorHandler() {
        return (ActivityErrorHandler) this.errorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActivityErrorHandler errorHandler_delegate$lambda$0(BackupCodeVerificationFragment backupCodeVerificationFragment) {
        FragmentActivity fragmentActivityRequireActivity = backupCodeVerificationFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new ActivityErrorHandler(fragmentActivityRequireActivity, true, 0, null, 12, null);
    }

    private final boolean isChallengeLoaded() {
        return ((Boolean) this.isChallengeLoaded.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    private final void setChallengeLoaded(boolean z) {
        this.isChallengeLoaded.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().numpad.useDefaultKeyHandler();
        RdsFormattedEditText backupCodeVerificationInput = getBinding().backupCodeVerificationInput;
        Intrinsics.checkNotNullExpressionValue(backupCodeVerificationInput, "backupCodeVerificationInput");
        Observable<R> map = RxTextView.textChanges(backupCodeVerificationInput).map(new Function() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment.onViewCreated.1
            @Override // io.reactivex.functions.Function
            public final CharSequence apply(CharSequence p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return StringsKt.trim(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BackupCodeVerificationFragment.onViewCreated$lambda$1(this.f$0, (CharSequence) obj);
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C105273(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(BackupCodeVerificationFragment backupCodeVerificationFragment, CharSequence code) {
        Intrinsics.checkNotNullParameter(code, "code");
        backupCodeVerificationFragment.getBinding().backupCodeContinueBtn.setEnabled(code.length() >= 12);
        return Unit.INSTANCE;
    }

    /* compiled from: BackupCodeVerificationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment$onViewCreated$3", m3645f = "BackupCodeVerificationFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment$onViewCreated$3 */
    static final class C105273 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C105273(Continuation<? super C105273> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C105273 c105273 = BackupCodeVerificationFragment.this.new C105273(continuation);
            c105273.L$0 = obj;
            return c105273;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C105273) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BackupCodeVerificationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment$onViewCreated$3$1", m3645f = "BackupCodeVerificationFragment.kt", m3646l = {64}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment$onViewCreated$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BackupCodeVerificationFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BackupCodeVerificationFragment backupCodeVerificationFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = backupCodeVerificationFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: BackupCodeVerificationFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment$onViewCreated$3$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C496491 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ BackupCodeVerificationFragment $tmp0;

                C496491(BackupCodeVerificationFragment backupCodeVerificationFragment) {
                    this.$tmp0 = backupCodeVerificationFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final kotlin.Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, BackupCodeVerificationFragment.class, "bind", "bind(Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(BackupCodeVerificationViewState backupCodeVerificationViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$bind = AnonymousClass1.invokeSuspend$bind(this.$tmp0, backupCodeVerificationViewState, continuation);
                    return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((BackupCodeVerificationViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<BackupCodeVerificationViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C496491 c496491 = new C496491(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c496491, this) == coroutine_suspended) {
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
            public static final /* synthetic */ Object invokeSuspend$bind(BackupCodeVerificationFragment backupCodeVerificationFragment, BackupCodeVerificationViewState backupCodeVerificationViewState, Continuation continuation) {
                backupCodeVerificationFragment.bind(backupCodeVerificationViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(BackupCodeVerificationFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(BackupCodeVerificationFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: BackupCodeVerificationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment$onViewCreated$3$2", m3645f = "BackupCodeVerificationFragment.kt", m3646l = {67}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment$onViewCreated$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ BackupCodeVerificationFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(BackupCodeVerificationFragment backupCodeVerificationFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = backupCodeVerificationFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: BackupCodeVerificationFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment$onViewCreated$3$2$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ BackupCodeVerificationFragment $tmp0;

                AnonymousClass1(BackupCodeVerificationFragment backupCodeVerificationFragment) {
                    this.$tmp0 = backupCodeVerificationFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final kotlin.Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, BackupCodeVerificationFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(Event<ChallengeVerificationEvent> event, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$handleEvent = AnonymousClass2.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                    return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((Event<ChallengeVerificationEvent>) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$handleEvent(BackupCodeVerificationFragment backupCodeVerificationFragment, Event event, Continuation continuation) {
                backupCodeVerificationFragment.handleEvent(event);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error && !isChallengeLoaded()) {
            requireActivity().finish();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (this.dialogHelper.onPositiveButtonClicked(new DefaultPositiveButtonClickDelegate(this, getSupportEmailHandler$feature_challenge_externalDebug(), getAuthManager(), getNavigator()), id, passthroughArgs)) {
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (this.dialogHelper.onNegativeButtonClicked(new DefaultNegativeButtonClickDelegate(this), id)) {
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final BackupCodeVerificationViewState state) {
        setChallengeLoaded(state.getChallenge() != null);
        if (state.isLoading()) {
            getBinding().loadingView.show();
        } else {
            getBinding().loadingView.hide();
        }
        RdsButton backupCodeContinueBtn = getBinding().backupCodeContinueBtn;
        Intrinsics.checkNotNullExpressionValue(backupCodeContinueBtn, "backupCodeContinueBtn");
        OnClickListeners.onClick(backupCodeContinueBtn, new Function0() { // from class: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BackupCodeVerificationFragment.bind$lambda$2(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2(BackupCodeVerificationFragment backupCodeVerificationFragment, BackupCodeVerificationViewState backupCodeVerificationViewState) {
        BackupCodeVerificationDuxo duxo = backupCodeVerificationFragment.getDuxo();
        Challenge challenge = backupCodeVerificationViewState.getChallenge();
        Intrinsics.checkNotNull(challenge);
        duxo.submitChallenge(challenge.getId(), backupCodeVerificationFragment.getBinding().backupCodeVerificationInput.getTypedText());
        return Unit.INSTANCE;
    }

    /* compiled from: BackupCodeVerificationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/challenge/verification/backup/BackupCodeVerificationFragment;", "Lcom/robinhood/shared/security/contracts/BackupCodeVerificationInput;", "<init>", "()V", "BACKUP_CODE_LENGTH", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BackupCodeVerificationFragment, BackupCodeVerificationInput> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public BackupCodeVerificationInput getArgs(BackupCodeVerificationFragment backupCodeVerificationFragment) {
            return (BackupCodeVerificationInput) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, backupCodeVerificationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BackupCodeVerificationFragment newInstance(BackupCodeVerificationInput backupCodeVerificationInput) {
            return (BackupCodeVerificationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, backupCodeVerificationInput);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BackupCodeVerificationFragment backupCodeVerificationFragment, BackupCodeVerificationInput backupCodeVerificationInput) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, backupCodeVerificationFragment, backupCodeVerificationInput);
        }
    }
}
