package com.robinhood.android.doc.serverdriven.parent;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.doc.serverdriven.capture.SddrCaptureFragment;
import com.robinhood.android.doc.serverdriven.capture.SddrReviewPhotoFragment;
import com.robinhood.android.doc.serverdriven.country.SddrCountryParentFragment;
import com.robinhood.android.doc.serverdriven.doctype.SddrDocumentTypeFragment;
import com.robinhood.android.doc.serverdriven.parent.SddrDestination;
import com.robinhood.android.doc.serverdriven.parent.SddrDestinationEvent;
import com.robinhood.android.doc.serverdriven.pdfupload.SddrPdfUploadFragment;
import com.robinhood.android.doc.serverdriven.splash.SddrSplashFragment;
import com.robinhood.android.doc.serverdriven.submission.SddrSubmissionFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import com.robinhood.shared.documents.lib.docupload.DocUploadEventReceiver;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.ExceptionsH;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SddrParentFragment.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0002&'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrParentFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEventReceiver;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventReceiver", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "getEventReceiver", "()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "eventReceiver$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/doc/serverdriven/parent/SddrParentDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/serverdriven/parent/SddrParentDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onFlowEvent", "event", "Lcom/robinhood/android/doc/serverdriven/parent/SddrFlowEvent;", "replaceFragment", "fragment", "Landroidx/fragment/app/Fragment;", "addToBackStack", "", "Args", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SddrParentFragment extends BaseFragment implements SddrFlowEventReceiver {
    public AnalyticsLogger analytics;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: eventReceiver$delegate, reason: from kotlin metadata */
    private final Interfaces2 eventReceiver;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SddrParentFragment.class, "eventReceiver", "getEventReceiver()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SddrParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.eventReceiver = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DocUploadEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.serverdriven.parent.SddrParentFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.duxo = DuxosKt.duxo(this, SddrParentDuxo.class);
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocUploadEventReceiver getEventReceiver() {
        return (DocUploadEventReceiver) this.eventReceiver.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SddrParentDuxo getDuxo() {
        return (SddrParentDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getDuxo().startFlow();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C142981(null), 1, null);
    }

    /* compiled from: SddrParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.serverdriven.parent.SddrParentFragment$onViewCreated$1", m3645f = "SddrParentFragment.kt", m3646l = {47}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.serverdriven.parent.SddrParentFragment$onViewCreated$1 */
    static final class C142981 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C142981(Continuation<? super C142981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SddrParentFragment.this.new C142981(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C142981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<SddrDestinationEvent>> eventFlow = SddrParentFragment.this.getDuxo().getEventFlow();
                final SddrParentFragment sddrParentFragment = SddrParentFragment.this;
                FlowCollector<? super Event<SddrDestinationEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.doc.serverdriven.parent.SddrParentFragment.onViewCreated.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<SddrDestinationEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<SddrDestinationEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<SddrDestinationEvent> eventConsumerInvoke;
                        EventConsumer<SddrDestinationEvent> eventConsumerInvoke2;
                        EventConsumer<SddrDestinationEvent> eventConsumerInvoke3;
                        EventConsumer<SddrDestinationEvent> eventConsumerInvoke4;
                        if (event != null) {
                            final SddrParentFragment sddrParentFragment2 = sddrParentFragment;
                            if ((event.getData() instanceof SddrDestinationEvent.Next) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.doc.serverdriven.parent.SddrParentFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m13376invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m13376invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        SddrDestinationEvent.Next next = (SddrDestinationEvent.Next) event.getData();
                                        SddrDestination destination = next.getDestination();
                                        if (destination instanceof SddrDestination.DocumentType) {
                                            sddrParentFragment2.replaceFragment(SddrDocumentTypeFragment.INSTANCE.newInstance((Parcelable) next.getDestination()), next.getAddToBackStack());
                                            return;
                                        }
                                        if (destination instanceof SddrDestination.Country) {
                                            sddrParentFragment2.replaceFragment(SddrCountryParentFragment.INSTANCE.newInstance((Parcelable) next.getDestination()), next.getAddToBackStack());
                                            return;
                                        }
                                        if (destination instanceof SddrDestination.Splash) {
                                            sddrParentFragment2.replaceFragment(SddrSplashFragment.Companion.newInstance((Parcelable) next.getDestination()), next.getAddToBackStack());
                                            return;
                                        }
                                        if (destination instanceof SddrDestination.PdfReview) {
                                            sddrParentFragment2.replaceFragment(SddrPdfUploadFragment.Companion.newInstance((Parcelable) next.getDestination()), next.getAddToBackStack());
                                            return;
                                        }
                                        if (destination instanceof SddrDestination.Capture) {
                                            sddrParentFragment2.replaceFragment(SddrCaptureFragment.Companion.newInstance((Parcelable) next.getDestination()), next.getAddToBackStack());
                                        } else if (destination instanceof SddrDestination.PhotoReview) {
                                            sddrParentFragment2.replaceFragment(SddrReviewPhotoFragment.INSTANCE.newInstance((Parcelable) next.getDestination()), next.getAddToBackStack());
                                        } else {
                                            if (destination instanceof SddrDestination.Submission) {
                                                sddrParentFragment2.replaceFragment(SddrSubmissionFragment.Companion.newInstance((Parcelable) next.getDestination()), next.getAddToBackStack());
                                                return;
                                            }
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                });
                            }
                        }
                        if (event != null) {
                            final SddrParentFragment sddrParentFragment3 = sddrParentFragment;
                            if ((event.getData() instanceof SddrDestinationEvent.Prev) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.doc.serverdriven.parent.SddrParentFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m13377invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m13377invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        sddrParentFragment3.requireBaseActivity().onBackPressed();
                                    }
                                });
                            }
                        }
                        if (event != null) {
                            final SddrParentFragment sddrParentFragment4 = sddrParentFragment;
                            if ((event.getData() instanceof SddrDestinationEvent.Error) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.doc.serverdriven.parent.SddrParentFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$3
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m13378invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m13378invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        DocUploadEventReceiver.DefaultImpls.onEvent$default(sddrParentFragment4.getEventReceiver(), DocUploadEvent.WizardMutator.Submission.Error.INSTANCE, false, 2, null);
                                    }
                                });
                            }
                        }
                        if (event != null) {
                            final SddrParentFragment sddrParentFragment5 = sddrParentFragment;
                            if ((event.getData() instanceof SddrDestinationEvent.Finish) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.doc.serverdriven.parent.SddrParentFragment$onViewCreated$1$1$emit$$inlined$consumeIfType$4
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m13379invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m13379invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        DocUploadEventReceiver.DefaultImpls.onEvent$default(sddrParentFragment5.getEventReceiver(), new DocUploadEvent.WizardMutator.Submission.Success(false, 1, null), false, 2, null);
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.doc.serverdriven.parent.SddrFlowEventReceiver
    public void onFlowEvent(SddrFlowEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        getDuxo().onNextFlowEvent(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void replaceFragment(Fragment fragment, boolean addToBackStack) {
        if (addToBackStack) {
            replaceFragment(fragment);
        } else {
            popEntireFragmentBackstack(true);
            replaceFragmentWithoutBackStack(fragment);
        }
    }

    /* compiled from: SddrParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrParentFragment$Args;", "Landroid/os/Parcelable;", "destination", "Lcom/robinhood/android/doc/event/DocUploadDestination$ServerDrivenFlow;", "mockRequests", "", "<init>", "(Lcom/robinhood/android/doc/event/DocUploadDestination$ServerDrivenFlow;Z)V", "getDestination", "()Lcom/robinhood/android/doc/event/DocUploadDestination$ServerDrivenFlow;", "getMockRequests", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final DocUploadDestination.ServerDrivenFlow destination;
        private final boolean mockRequests;

        /* compiled from: SddrParentFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(DocUploadDestination.ServerDrivenFlow.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, DocUploadDestination.ServerDrivenFlow serverDrivenFlow, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                serverDrivenFlow = args.destination;
            }
            if ((i & 2) != 0) {
                z = args.mockRequests;
            }
            return args.copy(serverDrivenFlow, z);
        }

        /* renamed from: component1, reason: from getter */
        public final DocUploadDestination.ServerDrivenFlow getDestination() {
            return this.destination;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getMockRequests() {
            return this.mockRequests;
        }

        public final Args copy(DocUploadDestination.ServerDrivenFlow destination, boolean mockRequests) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return new Args(destination, mockRequests);
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
            return Intrinsics.areEqual(this.destination, args.destination) && this.mockRequests == args.mockRequests;
        }

        public int hashCode() {
            return (this.destination.hashCode() * 31) + Boolean.hashCode(this.mockRequests);
        }

        public String toString() {
            return "Args(destination=" + this.destination + ", mockRequests=" + this.mockRequests + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.destination.writeToParcel(dest, flags);
            dest.writeInt(this.mockRequests ? 1 : 0);
        }

        public Args(DocUploadDestination.ServerDrivenFlow destination, boolean z) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.destination = destination;
            this.mockRequests = z;
        }

        public final DocUploadDestination.ServerDrivenFlow getDestination() {
            return this.destination;
        }

        public final boolean getMockRequests() {
            return this.mockRequests;
        }
    }

    /* compiled from: SddrParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/parent/SddrParentFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrParentFragment;", "Lcom/robinhood/android/doc/serverdriven/parent/SddrParentFragment$Args;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SddrParentFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SddrParentFragment sddrParentFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, sddrParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SddrParentFragment newInstance(Args args) {
            return (SddrParentFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SddrParentFragment sddrParentFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, sddrParentFragment, args);
        }
    }
}
