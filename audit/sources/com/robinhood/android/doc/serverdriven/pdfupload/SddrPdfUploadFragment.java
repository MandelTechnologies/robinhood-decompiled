package com.robinhood.android.doc.serverdriven.pdfupload;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.databinding.FragmentDocUploadReviewPdfBinding;
import com.robinhood.android.doc.serverdriven.parent.SddrDestination;
import com.robinhood.android.doc.serverdriven.parent.SddrFlowEvent;
import com.robinhood.android.doc.serverdriven.parent.SddrFlowEventReceiver;
import com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadErrorEvent;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent3;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.identi.ApiDocumentRequestContent;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SddrPdfUploadFragment.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0002J\u001c\u0010+\u001a\u00020\u00162\b\b\u0001\u0010,\u001a\u00020\u001e2\b\b\u0001\u0010-\u001a\u00020\u001eH\u0002J\u0012\u0010.\u001a\u00020\u00162\b\u0010/\u001a\u0004\u0018\u000100H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/doc/databinding/FragmentDocUploadReviewPdfBinding;", "getBinding", "()Lcom/robinhood/android/doc/databinding/FragmentDocUploadReviewPdfBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEventReceiver;", "getCallbacks", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEventReceiver;", "callbacks$delegate", "duxo", "Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onDialogDismissed", "id", "", "onPositiveButtonClicked", "", "passthroughArgs", "bindUi", "content", "Lcom/robinhood/models/api/identi/ApiDocumentRequestContent$PdfUploadScreen;", "bindViewState", "viewState", "Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadViewState;", "handleError", "event", "Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadErrorEvent;", "showErrorDialog", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "bodyRes", "showInternalErrorDialog", "message", "", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SddrPdfUploadFragment extends BaseFragment {
    private static final String ERROR_DIALOG_TAG = "errorDialog";
    private static final String INTERNAL_ERROR_DIALOG_TAG = "internalErrorDialog";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SddrPdfUploadFragment.class, "binding", "getBinding()Lcom/robinhood/android/doc/databinding/FragmentDocUploadReviewPdfBinding;", 0)), Reflection.property1(new PropertyReference1Impl(SddrPdfUploadFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SddrPdfUploadFragment() {
        super(C14254R.layout.fragment_doc_upload_review_pdf);
        this.binding = ViewBinding5.viewBinding(this, SddrPdfUploadFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(SddrFlowEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = DuxosKt.duxo(this, SddrPdfUploadDuxo.class);
    }

    private final FragmentDocUploadReviewPdfBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDocUploadReviewPdfBinding) value;
    }

    private final SddrFlowEventReceiver getCallbacks() {
        return (SddrFlowEventReceiver) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SddrPdfUploadDuxo getDuxo() {
        return (SddrPdfUploadDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        bindUi(((SddrDestination.PdfReview) INSTANCE.getArgs((Fragment) this)).getContent());
        BaseFragment.collectDuxoState$default(this, null, new C143041(null), 1, null);
    }

    /* compiled from: SddrPdfUploadFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment$onViewCreated$1", m3645f = "SddrPdfUploadFragment.kt", m3646l = {41, 45}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment$onViewCreated$1 */
    static final class C143041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C143041(Continuation<? super C143041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SddrPdfUploadFragment.this.new C143041(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SddrPdfUploadFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "viewState", "Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment$onViewCreated$1$1", m3645f = "SddrPdfUploadFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SddrPdfUploadViewState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SddrPdfUploadFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SddrPdfUploadFragment sddrPdfUploadFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = sddrPdfUploadFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SddrPdfUploadViewState sddrPdfUploadViewState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(sddrPdfUploadViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.bindViewState((SddrPdfUploadViewState) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r7, r1, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<SddrPdfUploadViewState> stateFlow = SddrPdfUploadFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SddrPdfUploadFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            StateFlow<Event<SddrPdfUploadErrorEvent>> eventFlow = SddrPdfUploadFragment.this.getDuxo().getEventFlow();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(SddrPdfUploadFragment.this, null);
            this.label = 2;
        }

        /* compiled from: SddrPdfUploadFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadErrorEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment$onViewCreated$1$2", m3645f = "SddrPdfUploadFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment$onViewCreated$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Event<SddrPdfUploadErrorEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SddrPdfUploadFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SddrPdfUploadFragment sddrPdfUploadFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = sddrPdfUploadFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<SddrPdfUploadErrorEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                if (event != null) {
                    final SddrPdfUploadFragment sddrPdfUploadFragment = this.this$0;
                    if ((event.getData() instanceof SddrPdfUploadErrorEvent) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment$onViewCreated$1$2$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m13382invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m13382invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                sddrPdfUploadFragment.handleError((SddrPdfUploadErrorEvent) event.getData());
                            }
                        });
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        final ImageView pdfReviewImage = getBinding().pdfReviewImage;
        Intrinsics.checkNotNullExpressionValue(pdfReviewImage, "pdfReviewImage");
        OneShotPreDrawListener.add(pdfReviewImage, new Runnable() { // from class: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment$onResume$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                View view = pdfReviewImage;
                this.getDuxo().firstPage(view.getWidth(), view.getHeight());
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            getCallbacks().onFlowEvent(SddrFlowEvent.PopBack.INSTANCE);
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C14254R.id.dialog_id_pdf_read_failed) {
            getCallbacks().onFlowEvent(SddrFlowEvent.PopBack.INSTANCE);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    private final void bindUi(final ApiDocumentRequestContent.PdfUploadScreen content) {
        getBinding().pdfReviewSubtitle.setVisibility(8);
        getBinding().pdfReviewTitle.setText(content.getTitle());
        getBinding().pdfReviewHeaderSdui.setContent(ComposableLambda3.composableLambdaInstance(244718368, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment.bindUi.1
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
                    ComposerKt.traceEventStart(244718368, i, -1, "com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment.bindUi.<anonymous> (SddrPdfUploadFragment.kt:84)");
                }
                final ApiDocumentRequestContent.PdfUploadScreen pdfUploadScreen = content;
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1812494744, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment.bindUi.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1812494744, i2, -1, "com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment.bindUi.<anonymous>.<anonymous> (SddrPdfUploadFragment.kt:85)");
                        }
                        SduiComponent3.SduiComponent(pdfUploadScreen.getHeaderContent(), null, null, composer2, 0, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 100663296, 255);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        RdsButton rdsButton = getBinding().pdfReviewNextBtn;
        rdsButton.setText(content.getButtonContinueLabel());
        Intrinsics.checkNotNull(rdsButton);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SddrPdfUploadFragment.bindUi$lambda$2$lambda$1(this.f$0);
            }
        });
        RdsButton rdsButton2 = getBinding().pdfReviewRetryCta;
        rdsButton2.setText(content.getButtonChooseAgainLabel());
        Intrinsics.checkNotNull(rdsButton2);
        OnClickListeners.onClick(rdsButton2, new Function0() { // from class: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SddrPdfUploadFragment.bindUi$lambda$4$lambda$3(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindUi$lambda$2$lambda$1(SddrPdfUploadFragment sddrPdfUploadFragment) {
        SddrFlowEventReceiver callbacks = sddrPdfUploadFragment.getCallbacks();
        Companion companion = INSTANCE;
        callbacks.onFlowEvent(new SddrFlowEvent.PdfAccepted(((SddrDestination.PdfReview) companion.getArgs((Fragment) sddrPdfUploadFragment)).getState(), ((SddrDestination.PdfReview) companion.getArgs((Fragment) sddrPdfUploadFragment)).getPdf()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindUi$lambda$4$lambda$3(SddrPdfUploadFragment sddrPdfUploadFragment) {
        sddrPdfUploadFragment.getCallbacks().onFlowEvent(SddrFlowEvent.PopBack.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(SddrPdfUploadViewState viewState) {
        getBinding().pdfReviewImage.setImageBitmap(viewState.getPage());
        ImageView imageView = getBinding().pdfReviewPrevPageBtn;
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(!viewState.getShowPrevButton() ? 4 : 0);
        imageView.setEnabled(viewState.getEnablePageButtons());
        OnClickListeners.onClick(imageView, new Function0() { // from class: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SddrPdfUploadFragment.bindViewState$lambda$6$lambda$5(this.f$0);
            }
        });
        ImageView imageView2 = getBinding().pdfReviewNextPageBtn;
        Intrinsics.checkNotNull(imageView2);
        imageView2.setVisibility(viewState.getShowNextButton() ? 0 : 4);
        imageView2.setEnabled(viewState.getEnablePageButtons());
        OnClickListeners.onClick(imageView2, new Function0() { // from class: com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SddrPdfUploadFragment.bindViewState$lambda$8$lambda$7(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$6$lambda$5(SddrPdfUploadFragment sddrPdfUploadFragment) {
        sddrPdfUploadFragment.getDuxo().prevPage(sddrPdfUploadFragment.getBinding().pdfReviewImage.getWidth(), sddrPdfUploadFragment.getBinding().pdfReviewImage.getHeight());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindViewState$lambda$8$lambda$7(SddrPdfUploadFragment sddrPdfUploadFragment) {
        sddrPdfUploadFragment.getDuxo().nextPage(sddrPdfUploadFragment.getBinding().pdfReviewImage.getWidth(), sddrPdfUploadFragment.getBinding().pdfReviewImage.getHeight());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(SddrPdfUploadErrorEvent event) {
        if (Intrinsics.areEqual(event, SddrPdfUploadErrorEvent.IOError.INSTANCE)) {
            showErrorDialog(C14254R.string.doc_upload_cannot_read_pdf_title, C14254R.string.doc_upload_cannot_read_pdf_body);
            return;
        }
        if (Intrinsics.areEqual(event, SddrPdfUploadErrorEvent.SecurityError.INSTANCE)) {
            showErrorDialog(C14254R.string.doc_upload_pdf_password_protected_title, C14254R.string.doc_upload_pdf_password_protected_body);
        } else if (Intrinsics.areEqual(event, SddrPdfUploadErrorEvent.FileSizeError.INSTANCE)) {
            showErrorDialog(C14254R.string.doc_upload_submission_too_large_title, C14254R.string.doc_upload_submission_too_large_body);
        } else {
            if (!(event instanceof SddrPdfUploadErrorEvent.InternalError)) {
                throw new NoWhenBranchMatchedException();
            }
            showInternalErrorDialog(((SddrPdfUploadErrorEvent.InternalError) event).getError().getMessage());
        }
    }

    private final void showErrorDialog(int titleRes, int bodyRes) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setTitle(titleRes, new Object[0]).setMessage(bodyRes, new Object[0]).setId(C14254R.id.dialog_id_pdf_read_failed).setPositiveButton(C14254R.string.doc_upload_error_primary_cta, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "errorDialog", false, 4, null).setCancelable(false);
    }

    private final void showInternalErrorDialog(String message) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder message2 = companion.create(contextRequireContext).setId(C11048R.id.dialog_id_generic_error).setTitle(C11048R.string.general_error_title, new Object[0]).setMessage(message);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(message2, childFragmentManager, INTERNAL_ERROR_DIALOG_TAG, false, 4, null);
    }

    /* compiled from: SddrPdfUploadFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/serverdriven/pdfupload/SddrPdfUploadFragment;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrDestination$PdfReview;", "<init>", "()V", "ERROR_DIALOG_TAG", "", "INTERNAL_ERROR_DIALOG_TAG", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SddrPdfUploadFragment, SddrDestination.PdfReview> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SddrDestination.PdfReview getArgs(SddrPdfUploadFragment sddrPdfUploadFragment) {
            return (SddrDestination.PdfReview) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sddrPdfUploadFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SddrPdfUploadFragment newInstance(SddrDestination.PdfReview pdfReview) {
            return (SddrPdfUploadFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, pdfReview);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SddrPdfUploadFragment sddrPdfUploadFragment, SddrDestination.PdfReview pdfReview) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sddrPdfUploadFragment, pdfReview);
        }
    }
}
