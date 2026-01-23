package com.robinhood.android.doc.p109ui.assistant;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.databinding.ActivityFragmentContainerBinding;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BaseSheetActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.p109ui.LoggingUtil2;
import com.robinhood.android.doc.p109ui.assistant.DocUploadAssistantLoadingFragment;
import com.robinhood.android.doc.p109ui.assistant.MultiDocUploadAssistantFragment;
import com.robinhood.android.doc.p109ui.assistant.SingleDocUploadAssistantFragment;
import com.robinhood.android.maxonboarding.OnboardingProgress;
import com.robinhood.android.maxonboarding.ToolbarExt2;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.DocumentUpload;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.documents.contracts.DocUploadAssistant;
import com.robinhood.utils.buildconfig.BuildFlavors;
import com.robinhood.utils.extensions.Lists4;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: DocUploadAssistantActivity.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 =2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001=B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010#\u001a\u00020\u000eH\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\u0016\u0010+\u001a\u00020%2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001a0-H\u0016J\u001a\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010*H\u0016J \u00102\u001a\u00020%2\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bH\u0016J\u0016\u00104\u001a\u00020%2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0-H\u0016J\b\u00105\u001a\u00020%H\u0016J\b\u0010:\u001a\u00020;H\u0002J \u0010<\u001a\u00020%2\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bH\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015RK\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b2\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u00106\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantActivity;", "Lcom/robinhood/android/common/ui/BaseSheetActivity;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantLoadingFragment$Callbacks;", "Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantBaseCallbacks;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "finishOnBackPressed", "", "getFinishOnBackPressed", "()Z", "isMockingDocRequests", "bindings", "Lcom/robinhood/android/common/databinding/ActivityFragmentContainerBinding;", "getBindings", "()Lcom/robinhood/android/common/databinding/ActivityFragmentContainerBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "<set-?>", "Ljava/util/ArrayList;", "Lcom/robinhood/models/ui/DocumentRequest;", "Lkotlin/collections/ArrayList;", "documentRequests", "getDocumentRequests", "()Ljava/util/ArrayList;", "setDocumentRequests", "(Ljava/util/ArrayList;)V", "documentRequests$delegate", "Lkotlin/properties/ReadWriteProperty;", "shouldPromptForLockscreen", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDocRequestsLoaded", "loadedDocumentRequests", "", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onSkipClicked", "completedDocRequests", "startDocUpload", "onAllDocsUploaded", "screenTag", "", "getScreenTag", "()Ljava/lang/String;", "getNextFragment", "Lcom/robinhood/android/common/ui/BaseFragment;", "openSkipDialog", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DocUploadAssistantActivity extends BaseSheetActivity implements RhDialogFragment.OnClickListener, DocUploadAssistantLoadingFragment.Callbacks, DocUploadAssistantBaseCallbacks {
    private static final String PASSTHROUGH_DOC_REQUESTS = "passthrough_doc_requests";
    public AnalyticsLogger analytics;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;

    /* renamed from: documentRequests$delegate, reason: from kotlin metadata */
    private final Interfaces3 documentRequests;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DocUploadAssistantActivity.class, "bindings", "getBindings()Lcom/robinhood/android/common/databinding/ActivityFragmentContainerBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DocUploadAssistantActivity.class, "documentRequests", "getDocumentRequests()Ljava/util/ArrayList;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.BaseSheetActivity
    protected boolean getFinishOnBackPressed() {
        return false;
    }

    public DocUploadAssistantActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.bindings = ViewBinding5.viewBinding(this, DocUploadAssistantActivity2.INSTANCE);
        this.documentRequests = (Interfaces3) BindSavedState2.savedParcelableArrayList(this, new ArrayList()).provideDelegate(this, $$delegatedProperties[1]);
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

    private final boolean isMockingDocRequests() {
        return ((DocUploadAssistant) INSTANCE.getExtras((Activity) this)).getMockRequests();
    }

    private final ActivityFragmentContainerBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityFragmentContainerBinding) value;
    }

    private final ArrayList<DocumentRequest> getDocumentRequests() {
        return (ArrayList) this.documentRequests.getValue(this, $$delegatedProperties[1]);
    }

    private final void setDocumentRequests(ArrayList<DocumentRequest> arrayList) {
        this.documentRequests.setValue(this, $$delegatedProperties[1], arrayList);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return !((DocUploadAssistant) INSTANCE.getExtras((Activity) this)).getIsFromOnboarding();
    }

    @Override // com.robinhood.android.common.p088ui.BaseSheetActivity, com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        ToolbarExt2.configureMaxActivity(toolbar, OnboardingProgress.DOC_UPLOAD, ((DocUploadAssistant) INSTANCE.getExtras((Activity) this)).getIsFromRhfOnboarding());
    }

    @Override // com.robinhood.android.common.p088ui.BaseSheetActivity, com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        Companion companion = INSTANCE;
        if (((DocUploadAssistant) companion.getExtras((Activity) this)).getTheme() == ColorTheme.DARK) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.NIGHT, null, 2, null);
        }
        FrameLayout root = getBindings().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ApplyWindowInsets.m26663applyWindowInsetsAsMarginqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        List<DocumentRequest> documentRequests = ((DocUploadAssistant) companion.getExtras((Activity) this)).getDocumentRequests();
        if (documentRequests != null) {
            setDocumentRequests(Lists4.toArrayList(documentRequests));
        }
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, getNextFragment());
        }
    }

    @Override // com.robinhood.android.doc.ui.assistant.DocUploadAssistantLoadingFragment.Callbacks
    public void onDocRequestsLoaded(List<DocumentRequest> loadedDocumentRequests) {
        Intrinsics.checkNotNullParameter(loadedDocumentRequests, "loadedDocumentRequests");
        setDocumentRequests(Lists4.toArrayList(loadedDocumentRequests));
        if (getDocumentRequests().isEmpty()) {
            Toast.makeText(this, C14254R.string.doc_upload_assistant_no_documents_to_upload, 0).show();
            finish();
        }
        replaceFragmentWithoutBackStack(getNextFragment());
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C14254R.id.dialog_id_doc_upload_assistant_skip) {
            ArrayList parcelableArrayList = passthroughArgs != null ? passthroughArgs.getParcelableArrayList(PASSTHROUGH_DOC_REQUESTS) : null;
            AnalyticsLogger.DefaultImpls.logUserAction$default(getAnalytics(), AnalyticsStrings.USER_ACTION_DOCUMENT_REQUESTS_ASSISTANT_SKIPPED, null, null, parcelableArrayList != null ? LoggingUtil2.getLoggingTag(parcelableArrayList) : null, 6, null);
            finishWithExitBottomAnimation();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.doc.p109ui.assistant.DocUploadAssistantBaseCallbacks
    public void onSkipClicked(ArrayList<DocumentRequest> completedDocRequests) {
        Intrinsics.checkNotNullParameter(completedDocRequests, "completedDocRequests");
        openSkipDialog(completedDocRequests);
    }

    @Override // com.robinhood.android.doc.p109ui.assistant.DocUploadAssistantBaseCallbacks
    public void startDocUpload(List<DocumentRequest> documentRequests) {
        Intrinsics.checkNotNullParameter(documentRequests, "documentRequests");
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_DOCUMENT_REQUESTS_ASSISTANT, AnalyticsStrings.BUTTON_DOCUMENT_REQUESTS_ASSISTANT_START_DOC_UPLOAD, null, null, null, null, LoggingUtil2.getLoggingTag(documentRequests), null, 188, null);
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, DocumentUpload.Companion.multiDocStandaloneActivityIntent$default(DocumentUpload.INSTANCE, documentRequests, false, null, shouldPromptForLockscreen(), ((DocUploadAssistant) INSTANCE.getExtras((Activity) this)).getTheme(), 6, null), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.doc.p109ui.assistant.DocUploadAssistantBaseCallbacks
    public void onAllDocsUploaded() {
        AnalyticsLogger.DefaultImpls.logUserAction$default(getAnalytics(), AnalyticsStrings.USER_ACTION_DOCUMENT_REQUESTS_ASSISTANT_COMPLETED, null, null, LoggingUtil2.getLoggingTag(getDocumentRequests()), 6, null);
        setResult(-1);
        finishWithExitBottomAnimation();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenTag() {
        return LoggingUtil2.getLoggingTag(getDocumentRequests());
    }

    private final BaseFragment getNextFragment() {
        int size = getDocumentRequests().size();
        if (size == 0) {
            return DocUploadAssistantLoadingFragment.INSTANCE.newInstance();
        }
        if (size == 1) {
            return (BaseFragment) SingleDocUploadAssistantFragment.INSTANCE.newInstance((Parcelable) new SingleDocUploadAssistantFragment.Args((DocumentRequest) CollectionsKt.first((List) getDocumentRequests()), isMockingDocRequests(), ((DocUploadAssistant) INSTANCE.getExtras((Activity) this)).getTheme()));
        }
        return (BaseFragment) MultiDocUploadAssistantFragment.INSTANCE.newInstance((Parcelable) new MultiDocUploadAssistantFragment.Args(getDocumentRequests(), isMockingDocRequests(), ((DocUploadAssistant) INSTANCE.getExtras((Activity) this)).getTheme()));
    }

    private final void openSkipDialog(ArrayList<DocumentRequest> completedDocRequests) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_DOCUMENT_REQUESTS_ASSISTANT, "skip", null, null, null, null, LoggingUtil2.getLoggingTag(completedDocRequests), null, 188, null);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(PASSTHROUGH_DOC_REQUESTS, completedDocRequests);
        RhDialogFragment.Builder passthroughArgs = RhDialogFragment.INSTANCE.create(this).setImage(C14254R.drawable.ic_warning).setTitle(C14254R.string.doc_upload_assistant_skip_dialog_title, new Object[0]).setMessage(C14254R.string.doc_upload_assistant_skip_dialog_message, new Object[0]).setId(C14254R.id.dialog_id_doc_upload_assistant_skip).setPositiveButton(C14254R.string.doc_upload_assistant_skip_dialog_positive_btn, new Object[0]).setNegativeButton(C14254R.string.doc_upload_assistant_skip_dialog_negative_btn, new Object[0]).setPassthroughArgs(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(passthroughArgs, supportFragmentManager, "doc-upload-assistant-skip-dialog", false, 4, null);
    }

    /* compiled from: DocUploadAssistantActivity.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/doc/ui/assistant/DocUploadAssistantActivity;", "Lcom/robinhood/shared/documents/contracts/DocUploadAssistant;", "<init>", "()V", "PASSTHROUGH_DOC_REQUESTS", "", "getIntentWithExtras", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "extras", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<DocUploadAssistantActivity, DocUploadAssistant> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public DocUploadAssistant getExtras(DocUploadAssistantActivity docUploadAssistantActivity) {
            return (DocUploadAssistant) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, docUploadAssistantActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, DocUploadAssistant docUploadAssistant) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, docUploadAssistant);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, DocUploadAssistant extras) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Intent intentWithExtras = IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, extras);
            if (BuildFlavors.INSTANCE.isDebugOrInternal() || !extras.getMockRequests()) {
                return intentWithExtras;
            }
            throw new IllegalStateException("requests mocking is not available for prod build");
        }
    }
}
