package com.robinhood.android.doc.p109ui.persona;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.doc.p109ui.persona.PersonaClientLoadingDuxo2;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import com.robinhood.shared.documents.lib.docupload.DocUploadEventReceiver;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.withpersona.sdk2.inquiry.Inquiry;
import com.withpersona.sdk2.inquiry.InquiryResponse;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: PersonaClientLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\r\u0010\u0017\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u001e\u001a\u00020\u00122\b\b\u0003\u0010\u001b\u001a\u00020\u001cH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaClientLoadingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "callbacks", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "getCallbacks", "()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/doc/ui/persona/PersonaClientLoadingDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/ui/persona/PersonaClientLoadingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "showErrorDialog", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class PersonaClientLoadingFragment extends GenericComposeFragment implements RhDialogFragment.OnDismissListener {
    private static final String ERROR_DIALOG_TAG = "personaErrorDialog";

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DocUploadEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.ui.persona.PersonaClientLoadingFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, PersonaClientLoadingDuxo.class);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PersonaClientLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(PersonaClientLoadingFragment personaClientLoadingFragment, int i, Composer composer, int i2) {
        personaClientLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocUploadEventReceiver getCallbacks() {
        return (DocUploadEventReceiver) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PersonaClientLoadingDuxo getDuxo() {
        return (PersonaClientLoadingDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new Inquiry.Contract(context), new ActivityResultCallback() { // from class: com.robinhood.android.doc.ui.persona.PersonaClientLoadingFragment$onViewCreated$getInquiryResult$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(final InquiryResponse result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof InquiryResponse.Complete) {
                    Handler handler = new Handler(Looper.getMainLooper());
                    final PersonaClientLoadingFragment personaClientLoadingFragment = this.this$0;
                    handler.post(new Runnable() { // from class: com.robinhood.android.doc.ui.persona.PersonaClientLoadingFragment$onViewCreated$getInquiryResult$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            DocUploadEventReceiver.DefaultImpls.onEvent$default(personaClientLoadingFragment.getCallbacks(), DocUploadEvent.ActiveDocRequestEvent.PersonaClientSucceeded.INSTANCE, false, 2, null);
                        }
                    });
                } else if (result instanceof InquiryResponse.Cancel) {
                    Handler handler2 = new Handler(Looper.getMainLooper());
                    final PersonaClientLoadingFragment personaClientLoadingFragment2 = this.this$0;
                    handler2.post(new Runnable() { // from class: com.robinhood.android.doc.ui.persona.PersonaClientLoadingFragment$onViewCreated$getInquiryResult$1.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            DocUploadEventReceiver.DefaultImpls.onEvent$default(personaClientLoadingFragment2.getCallbacks(), DocUploadEvent.WizardMutator.PersonaClientCancelled.INSTANCE, false, 2, null);
                        }
                    });
                } else {
                    if (!(result instanceof InquiryResponse.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Handler handler3 = new Handler(Looper.getMainLooper());
                    final PersonaClientLoadingFragment personaClientLoadingFragment3 = this.this$0;
                    handler3.post(new Runnable() { // from class: com.robinhood.android.doc.ui.persona.PersonaClientLoadingFragment$onViewCreated$getInquiryResult$1.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new PersonaInquiryFlowException("Persona SDK error: " + ((InquiryResponse.Error) result).getErrorCode() + " - " + ((InquiryResponse.Error) result).getCause()), false, ((InquiryResponse.Error) result).getErrorCode() == ErrorCode.NetworkError ? null : new EventMetadata(SentryTeam.AUTH_AND_SAFETY, null, null, 6, null), 2, null);
                            personaClientLoadingFragment3.showErrorDialog(C14254R.id.dialog_id_persona_sdk_error);
                        }
                    });
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        BaseFragment.collectDuxoState$default(this, null, new C143671(activityResultLauncherRegisterForActivityResult, null), 1, null);
    }

    /* compiled from: PersonaClientLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.persona.PersonaClientLoadingFragment$onViewCreated$1", m3645f = "PersonaClientLoadingFragment.kt", m3646l = {77}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.persona.PersonaClientLoadingFragment$onViewCreated$1 */
    static final class C143671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ActivityResultLauncher<Inquiry> $getInquiryResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C143671(ActivityResultLauncher<Inquiry> activityResultLauncher, Continuation<? super C143671> continuation) {
            super(2, continuation);
            this.$getInquiryResult = activityResultLauncher;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PersonaClientLoadingFragment.this.new C143671(this.$getInquiryResult, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(PersonaClientLoadingFragment.this.getDuxo().getEventFlow());
                final ActivityResultLauncher<Inquiry> activityResultLauncher = this.$getInquiryResult;
                final PersonaClientLoadingFragment personaClientLoadingFragment = PersonaClientLoadingFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.doc.ui.persona.PersonaClientLoadingFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<PersonaClientLoadingDuxo2>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<PersonaClientLoadingDuxo2> event, Continuation<? super Unit> continuation) {
                        EventConsumer<PersonaClientLoadingDuxo2> eventConsumerInvoke;
                        EventConsumer<PersonaClientLoadingDuxo2> eventConsumerInvoke2;
                        final ActivityResultLauncher<Inquiry> activityResultLauncher2 = activityResultLauncher;
                        if ((event.getData() instanceof PersonaClientLoadingDuxo2.InquiryCreated) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.doc.ui.persona.PersonaClientLoadingFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m13403invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m13403invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    PersonaClientLoadingDuxo2.InquiryCreated inquiryCreated = (PersonaClientLoadingDuxo2.InquiryCreated) event.getData();
                                    activityResultLauncher2.launch(Inquiry.INSTANCE.fromInquiry(inquiryCreated.getInquiryId()).locale(inquiryCreated.getPersonaLocale()).build());
                                }
                            });
                        }
                        final PersonaClientLoadingFragment personaClientLoadingFragment2 = personaClientLoadingFragment;
                        if ((event.getData() instanceof PersonaClientLoadingDuxo2.Error) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.doc.ui.persona.PersonaClientLoadingFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m13404invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m13404invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    PersonaClientLoadingFragment.showErrorDialog$default(personaClientLoadingFragment2, 0, 1, null);
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

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(37154867);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(37154867, i, -1, "com.robinhood.android.doc.ui.persona.PersonaClientLoadingFragment.ComposeContent (PersonaClientLoadingFragment.kt:92)");
            }
            LoadingScreenComposablesKt.PromoLoadingScreenComposable(null, 0, composerStartRestartGroup, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.doc.ui.persona.PersonaClientLoadingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PersonaClientLoadingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        DocUploadEvent personaClientError;
        if (id == C14254R.id.dialog_id_persona_error) {
            DocUploadEventReceiver callbacks = getCallbacks();
            if (((DocUploadDestination.PersonaClient) INSTANCE.getArgs((Fragment) this)).getExitOnPersonaError()) {
                personaClientError = new DocUploadEvent.ActiveDocRequestEvent.PersonaClientError(true);
            } else {
                personaClientError = DocUploadEvent.WizardMutator.Skip.INSTANCE;
            }
            DocUploadEventReceiver.DefaultImpls.onEvent$default(callbacks, personaClientError, false, 2, null);
            return true;
        }
        if (id == C14254R.id.dialog_id_persona_sdk_error) {
            DocUploadEventReceiver.DefaultImpls.onEvent$default(getCallbacks(), new DocUploadEvent.ActiveDocRequestEvent.PersonaClientError(((DocUploadDestination.PersonaClient) INSTANCE.getArgs((Fragment) this)).getExitOnPersonaError()), false, 2, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    static /* synthetic */ void showErrorDialog$default(PersonaClientLoadingFragment personaClientLoadingFragment, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = C14254R.id.dialog_id_persona_error;
        }
        personaClientLoadingFragment.showErrorDialog(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorDialog(int id) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder cancelable = companion.create(contextRequireContext).setId(id).setPogPictogram(C20690R.drawable.pict_mono_rds_warning).setTitle(C14254R.string.persona_error_dialog_title, new Object[0]).setMessage(C14254R.string.persona_error_dialog_body, new Object[0]).setPositiveButton(C14254R.string.persona_error_dialog_primary_cta, new Object[0]).setCancelable(false);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(cancelable, childFragmentManager, ERROR_DIALOG_TAG, false, 4, null);
    }

    /* compiled from: PersonaClientLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/persona/PersonaClientLoadingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/ui/persona/PersonaClientLoadingFragment;", "Lcom/robinhood/android/doc/event/DocUploadDestination$PersonaClient;", "<init>", "()V", "ERROR_DIALOG_TAG", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PersonaClientLoadingFragment, DocUploadDestination.PersonaClient> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public DocUploadDestination.PersonaClient getArgs(PersonaClientLoadingFragment personaClientLoadingFragment) {
            return (DocUploadDestination.PersonaClient) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, personaClientLoadingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PersonaClientLoadingFragment newInstance(DocUploadDestination.PersonaClient personaClient) {
            return (PersonaClientLoadingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, personaClient);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PersonaClientLoadingFragment personaClientLoadingFragment, DocUploadDestination.PersonaClient personaClient) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, personaClientLoadingFragment, personaClient);
        }
    }
}
