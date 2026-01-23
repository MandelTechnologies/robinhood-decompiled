package com.robinhood.android.doc.p109ui.initial;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.p109ui.UtilKt;
import com.robinhood.android.doc.p109ui.initial.DocUploadInitialIdentiViewState;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import com.robinhood.shared.documents.lib.docupload.DocUploadEventReceiver;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DocUploadInitialIdentiFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\r\u0010\u001d\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020$H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "duxo", "Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "eventReceiver", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "getEventReceiver", "()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "eventReceiver$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "bind", "state", "Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiViewState;", "onDialogDismissed", "id", "", "Args", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DocUploadInitialIdentiFragment extends GenericComposeFragment {
    public AnalyticsLogger analytics;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, DocUploadInitialIdentiDuxo.class);

    /* renamed from: eventReceiver$delegate, reason: from kotlin metadata */
    private final Interfaces2 eventReceiver = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DocUploadEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DocUploadInitialIdentiFragment.class, "eventReceiver", "getEventReceiver()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(DocUploadInitialIdentiFragment docUploadInitialIdentiFragment, int i, Composer composer, int i2) {
        docUploadInitialIdentiFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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
    public final DocUploadInitialIdentiDuxo getDuxo() {
        return (DocUploadInitialIdentiDuxo) this.duxo.getValue();
    }

    private final DocUploadEventReceiver getEventReceiver() {
        return (DocUploadEventReceiver) this.eventReceiver.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AnalyticsLogger.DefaultImpls.logUserAction$default(getAnalytics(), AnalyticsStrings.USER_ACTION_STARTED_DOC_REQUEST_UPLOAD, null, CollectionsKt.joinToString$default(((Args) INSTANCE.getArgs((Fragment) this)).getDocRequests(), null, null, null, 0, null, new Function1() { // from class: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadInitialIdentiFragment.onCreate$lambda$0((DocumentRequest) obj);
            }
        }, 31, null), null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence onCreate$lambda$0(DocumentRequest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getType().getServerValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C143571(null), 1, null);
    }

    /* compiled from: DocUploadInitialIdentiFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiFragment$onViewCreated$1", m3645f = "DocUploadInitialIdentiFragment.kt", m3646l = {46}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiFragment$onViewCreated$1 */
    static final class C143571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C143571(Continuation<? super C143571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DocUploadInitialIdentiFragment.this.new C143571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DocUploadInitialIdentiFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "viewState", "Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiFragment$onViewCreated$1$1", m3645f = "DocUploadInitialIdentiFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DocUploadInitialIdentiViewState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DocUploadInitialIdentiFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DocUploadInitialIdentiFragment docUploadInitialIdentiFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = docUploadInitialIdentiFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DocUploadInitialIdentiViewState docUploadInitialIdentiViewState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(docUploadInitialIdentiViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.bind((DocUploadInitialIdentiViewState) this.L$0);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<DocUploadInitialIdentiViewState> stateFlow = DocUploadInitialIdentiFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DocUploadInitialIdentiFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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
        Composer composerStartRestartGroup = composer.startRestartGroup(377775227);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(377775227, i, -1, "com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiFragment.ComposeContent (DocUploadInitialIdentiFragment.kt:52)");
            }
            LoadingScreenComposablesKt.GenericLoadingScreenComposable(null, false, composerStartRestartGroup, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.doc.ui.initial.DocUploadInitialIdentiFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DocUploadInitialIdentiFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(DocUploadInitialIdentiViewState state) {
        if (state instanceof DocUploadInitialIdentiViewState.Error) {
            Throwable thConsume = ((DocUploadInitialIdentiViewState.Error) state).getThrowable().consume();
            if (thConsume != null) {
                getEventReceiver().onError(thConsume);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(state, DocUploadInitialIdentiViewState.Loading.INSTANCE)) {
            return;
        }
        if (!(state instanceof DocUploadInitialIdentiViewState.Loaded)) {
            throw new NoWhenBranchMatchedException();
        }
        DocUploadInitialIdentiViewState.Loaded loaded = (DocUploadInitialIdentiViewState.Loaded) state;
        if (loaded.getRejectedReason() == null) {
            getEventReceiver().onEvent(new DocUploadEvent.WizardMutator.Start(UtilKt.combineRequests(loaded.getDocumentRequests()), loaded.getIsGdpr()), false);
        } else {
            getAnalytics().logError(AnalyticsStrings.ERROR_REJECTED_DOCUMENT_UPLOAD, loaded.getRejectedReason().name());
            UtilKt.showRejectionDialog(this, loaded.getRejectedReason().getDialogResources());
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C14254R.id.dialog_id_document_email_only || id == C14254R.id.dialog_id_document_out_of_date || id == C14254R.id.dialog_id_document_already_uploaded) {
            DocUploadEventReceiver.DefaultImpls.onEvent$default(getEventReceiver(), new DocUploadEvent.Exit(false, 1, null), false, 2, null);
        } else {
            super.onDialogDismissed(id);
        }
    }

    /* compiled from: DocUploadInitialIdentiFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiFragment$Args;", "Landroid/os/Parcelable;", "docRequests", "", "Lcom/robinhood/models/ui/DocumentRequest;", "isOnboardingOnly", "", "mockRequests", "<init>", "(Ljava/util/List;ZZ)V", "getDocRequests", "()Ljava/util/List;", "()Z", "getMockRequests", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final List<DocumentRequest> docRequests;
        private final boolean isOnboardingOnly;
        private final boolean mockRequests;

        /* compiled from: DocUploadInitialIdentiFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, List list, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = args.docRequests;
            }
            if ((i & 2) != 0) {
                z = args.isOnboardingOnly;
            }
            if ((i & 4) != 0) {
                z2 = args.mockRequests;
            }
            return args.copy(list, z, z2);
        }

        public final List<DocumentRequest> component1() {
            return this.docRequests;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsOnboardingOnly() {
            return this.isOnboardingOnly;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getMockRequests() {
            return this.mockRequests;
        }

        public final Args copy(List<DocumentRequest> docRequests, boolean isOnboardingOnly, boolean mockRequests) {
            Intrinsics.checkNotNullParameter(docRequests, "docRequests");
            return new Args(docRequests, isOnboardingOnly, mockRequests);
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
            return Intrinsics.areEqual(this.docRequests, args.docRequests) && this.isOnboardingOnly == args.isOnboardingOnly && this.mockRequests == args.mockRequests;
        }

        public int hashCode() {
            return (((this.docRequests.hashCode() * 31) + Boolean.hashCode(this.isOnboardingOnly)) * 31) + Boolean.hashCode(this.mockRequests);
        }

        public String toString() {
            return "Args(docRequests=" + this.docRequests + ", isOnboardingOnly=" + this.isOnboardingOnly + ", mockRequests=" + this.mockRequests + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            List<DocumentRequest> list = this.docRequests;
            dest.writeInt(list.size());
            Iterator<DocumentRequest> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeInt(this.isOnboardingOnly ? 1 : 0);
            dest.writeInt(this.mockRequests ? 1 : 0);
        }

        public Args(List<DocumentRequest> docRequests, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(docRequests, "docRequests");
            this.docRequests = docRequests;
            this.isOnboardingOnly = z;
            this.mockRequests = z2;
        }

        public /* synthetic */ Args(List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
        }

        public final List<DocumentRequest> getDocRequests() {
            return this.docRequests;
        }

        public final boolean isOnboardingOnly() {
            return this.isOnboardingOnly;
        }

        public final boolean getMockRequests() {
            return this.mockRequests;
        }
    }

    /* compiled from: DocUploadInitialIdentiFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiFragment;", "Lcom/robinhood/android/doc/ui/initial/DocUploadInitialIdentiFragment$Args;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DocUploadInitialIdentiFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DocUploadInitialIdentiFragment docUploadInitialIdentiFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, docUploadInitialIdentiFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DocUploadInitialIdentiFragment newInstance(Args args) {
            return (DocUploadInitialIdentiFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DocUploadInitialIdentiFragment docUploadInitialIdentiFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, docUploadInitialIdentiFragment, args);
        }
    }
}
