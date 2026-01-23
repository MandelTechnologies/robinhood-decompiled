package com.robinhood.android.doc.p109ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.DocUploadParentFragment;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.idupload.IdUploadSubmissionStore;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import com.robinhood.shared.documents.lib.docupload.DocUploadEventReceiver;
import com.robinhood.shared.documents.lib.docupload.UploadFlowDetails;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import org.bouncycastle.i18n.ErrorBundle;
import timber.log.Timber;

/* compiled from: DocUploadSubmissionFragment.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u0002/0B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020.H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/DocUploadSubmissionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "idUploadSubmissionStore", "Lcom/robinhood/android/idupload/IdUploadSubmissionStore;", "getIdUploadSubmissionStore", "()Lcom/robinhood/android/idupload/IdUploadSubmissionStore;", "setIdUploadSubmissionStore", "(Lcom/robinhood/android/idupload/IdUploadSubmissionStore;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "eventReceiver", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "getEventReceiver", "()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "eventReceiver$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "handleError", "throwable", "", "showPayloadTooLargeDialog", "buildIdDocument", "Lcom/robinhood/models/api/IdDocument;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/shared/documents/lib/docupload/UploadFlowDetails;", "originalRequest", "Lcom/robinhood/models/ui/DocumentRequest;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "", "Args", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DocUploadSubmissionFragment extends BaseFragment implements RhDialogFragment.OnDismissListener {
    private static final String ERROR_DIALOG_TAG = "errorDialog";
    public AnalyticsLogger analytics;

    /* renamed from: eventReceiver$delegate, reason: from kotlin metadata */
    private final Interfaces2 eventReceiver;
    public IdUploadSubmissionStore idUploadSubmissionStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DocUploadSubmissionFragment.class, "eventReceiver", "getEventReceiver()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return true;
    }

    public DocUploadSubmissionFragment() {
        super(C14254R.layout.fragment_doc_upload_submission);
        this.eventReceiver = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DocUploadEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.ui.DocUploadSubmissionFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    public final IdUploadSubmissionStore getIdUploadSubmissionStore() {
        IdUploadSubmissionStore idUploadSubmissionStore = this.idUploadSubmissionStore;
        if (idUploadSubmissionStore != null) {
            return idUploadSubmissionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("idUploadSubmissionStore");
        return null;
    }

    public final void setIdUploadSubmissionStore(IdUploadSubmissionStore idUploadSubmissionStore) {
        Intrinsics.checkNotNullParameter(idUploadSubmissionStore, "<set-?>");
        this.idUploadSubmissionStore = idUploadSubmissionStore;
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

    private final DocUploadEventReceiver getEventReceiver() {
        return (DocUploadEventReceiver) this.eventReceiver.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        IdUploadSubmissionStore idUploadSubmissionStore = getIdUploadSubmissionStore();
        Companion companion = INSTANCE;
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(idUploadSubmissionStore.submitRequest(((Args) companion.getArgs((Fragment) this)).getDestination().getOriginalRequest(), buildIdDocument(((Args) companion.getArgs((Fragment) this)).getDestination().getDetails(), ((Args) companion.getArgs((Fragment) this)).getDestination().getOriginalRequest()))), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.doc.ui.DocUploadSubmissionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadSubmissionFragment.onViewCreated$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, new C143292(this), null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(DocUploadSubmissionFragment docUploadSubmissionFragment, boolean z) {
        DocUploadEventReceiver.DefaultImpls.onEvent$default(docUploadSubmissionFragment.getEventReceiver(), new DocUploadEvent.WizardMutator.Submission.Success(((Args) INSTANCE.getArgs((Fragment) docUploadSubmissionFragment)).getDestination().getDetails().getForCrypto()), false, 2, null);
        Toast.makeText(docUploadSubmissionFragment.requireContext(), C14254R.string.doc_upload_submission_success_message, 0).show();
        return Unit.INSTANCE;
    }

    /* compiled from: DocUploadSubmissionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.doc.ui.DocUploadSubmissionFragment$onViewCreated$2 */
    /* synthetic */ class C143292 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C143292(Object obj) {
            super(1, obj, DocUploadSubmissionFragment.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DocUploadSubmissionFragment) this.receiver).handleError(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C14254R.id.dialog_id_doc_upload_error) {
            DocUploadEventReceiver.DefaultImpls.onEvent$default(getEventReceiver(), DocUploadEvent.WizardMutator.Submission.Error.INSTANCE, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError(Throwable throwable) throws Throwable {
        Throwable th;
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getMockRequests()) {
            UtilKt.showToastForMockSubmissionSuccess(this);
            Timber.INSTANCE.mo3350d("doc upload submission error (bypassed): " + throwable, new Object[0]);
            DocUploadEventReceiver.DefaultImpls.onEvent$default(getEventReceiver(), new DocUploadEvent.WizardMutator.Submission.Success(((Args) companion.getArgs((Fragment) this)).getDestination().getDetails().getForCrypto()), false, 2, null);
            return;
        }
        Integer httpStatusCode = Throwables.getHttpStatusCode(throwable);
        if (httpStatusCode != null && httpStatusCode.intValue() == 413) {
            showPayloadTooLargeDialog();
            th = throwable;
        } else {
            ActivityErrorHandler.Companion companion2 = ActivityErrorHandler.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            th = throwable;
            ActivityErrorHandler.Companion.handle$default(companion2, fragmentActivityRequireActivity, th, false, false, 0, null, 60, null);
        }
        if (Throwables.isHttpException(th)) {
            AnalyticsLogger.DefaultImpls.logUserAction$default(getAnalytics(), AnalyticsStrings.USER_ACTION_IDENTITY_DOCUMENT_REJECTED, null, ((Args) companion.getArgs((Fragment) this)).getDestination().getOriginalRequest().getType().getServerValue(), DocUploadParentFragment.V2_TAG, 2, null);
        } else {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new DocUploadParentFragment.DocUploadSubmissionException("Failed doc upload", th), false, null, 4, null);
        }
    }

    private final void showPayloadTooLargeDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = companion.create(contextRequireContext).setTitle(C14254R.string.doc_upload_submission_too_large_title, new Object[0]).setMessage(C14254R.string.doc_upload_submission_too_large_body, new Object[0]).setPositiveButton(C14254R.string.doc_upload_error_primary_cta, new Object[0]).setId(C14254R.id.dialog_id_doc_upload_error);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(id, childFragmentManager, "errorDialog", false, 4, null);
    }

    private final IdDocument buildIdDocument(UploadFlowDetails details, DocumentRequest originalRequest) {
        return new IdDocument(details.getDocumentType(), details.getCountryCode(), originalRequest.getId(), details.getCaptured());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setVisibility(8);
    }

    /* compiled from: DocUploadSubmissionFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/DocUploadSubmissionFragment$Args;", "Landroid/os/Parcelable;", "destination", "Lcom/robinhood/android/doc/event/DocUploadDestination$Submission;", "mockRequests", "", "<init>", "(Lcom/robinhood/android/doc/event/DocUploadDestination$Submission;Z)V", "getDestination", "()Lcom/robinhood/android/doc/event/DocUploadDestination$Submission;", "getMockRequests", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final DocUploadDestination.Submission destination;
        private final boolean mockRequests;

        /* compiled from: DocUploadSubmissionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(DocUploadDestination.Submission.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, DocUploadDestination.Submission submission, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                submission = args.destination;
            }
            if ((i & 2) != 0) {
                z = args.mockRequests;
            }
            return args.copy(submission, z);
        }

        /* renamed from: component1, reason: from getter */
        public final DocUploadDestination.Submission getDestination() {
            return this.destination;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getMockRequests() {
            return this.mockRequests;
        }

        public final Args copy(DocUploadDestination.Submission destination, boolean mockRequests) {
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

        public Args(DocUploadDestination.Submission destination, boolean z) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.destination = destination;
            this.mockRequests = z;
        }

        public /* synthetic */ Args(DocUploadDestination.Submission submission, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(submission, (i & 2) != 0 ? false : z);
        }

        public final DocUploadDestination.Submission getDestination() {
            return this.destination;
        }

        public final boolean getMockRequests() {
            return this.mockRequests;
        }
    }

    /* compiled from: DocUploadSubmissionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/DocUploadSubmissionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/ui/DocUploadSubmissionFragment;", "Lcom/robinhood/android/doc/ui/DocUploadSubmissionFragment$Args;", "<init>", "()V", "ERROR_DIALOG_TAG", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DocUploadSubmissionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(DocUploadSubmissionFragment docUploadSubmissionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, docUploadSubmissionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DocUploadSubmissionFragment newInstance(Args args) {
            return (DocUploadSubmissionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DocUploadSubmissionFragment docUploadSubmissionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, docUploadSubmissionFragment, args);
        }
    }
}
