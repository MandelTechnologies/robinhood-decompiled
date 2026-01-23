package com.robinhood.shared.documentdownload;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p081cx.CxTopic;
import com.robinhood.android.common.p081cx.SupportEmailHandler;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.DocumentStore;
import com.robinhood.models.p320db.Document;
import com.robinhood.shared.documentdownload.databinding.ActivityDocumentDownloadBinding;
import com.robinhood.shared.documents.contracts.DocumentDownloadKey;
import com.robinhood.shared.documents.contracts.DocumentDownloadLaunchMode;
import com.robinhood.shared.history.animation.Activitys2;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.Files;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p408rx.DownloadManagerOnSubscribe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.io.File;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import okhttp3.HttpUrl;
import timber.log.Timber;

/* compiled from: DocumentDownloadActivity.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 E2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0014J\b\u0010:\u001a\u000207H\u0014J\u0010\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020-H\u0002J\b\u0010=\u001a\u000207H\u0002J\b\u0010>\u001a\u000207H\u0002J\b\u0010?\u001a\u000207H\u0002J\u001a\u0010@\u001a\u00020!2\u0006\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u000109H\u0016J\u001a\u0010D\u001a\u00020!2\u0006\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u000109H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u001d\u0010\u001eR+\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010)\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0015\u001a\u0004\b*\u0010$R\u0014\u0010,\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b2\u00103¨\u0006F"}, m3636d2 = {"Lcom/robinhood/shared/documentdownload/DocumentDownloadActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "documentStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "getDocumentStore", "()Lcom/robinhood/librobinhood/data/store/DocumentStore;", "setDocumentStore", "(Lcom/robinhood/librobinhood/data/store/DocumentStore;)V", "supportEmailHandler", "Lcom/robinhood/android/common/cx/SupportEmailHandler;", "getSupportEmailHandler", "()Lcom/robinhood/android/common/cx/SupportEmailHandler;", "setSupportEmailHandler", "(Lcom/robinhood/android/common/cx/SupportEmailHandler;)V", DocumentDownloadActivity.EXTRA_DOCUMENT, "Lcom/robinhood/models/db/Document;", "getDocument", "()Lcom/robinhood/models/db/Document;", "document$delegate", "Lkotlin/Lazy;", DocumentDownloadActivity.EXTRA_LAUNCH_MODE, "Lcom/robinhood/shared/documents/contracts/DocumentDownloadLaunchMode;", "getLaunchMode", "()Lcom/robinhood/shared/documents/contracts/DocumentDownloadLaunchMode;", "launchMode$delegate", DocumentDownloadActivity.EXTRA_FILENAME, "", "getFilename", "()Ljava/lang/String;", "filename$delegate", "<set-?>", "", "downloading", "getDownloading", "()Z", "setDownloading", "(Z)V", "downloading$delegate", "Lkotlin/properties/ReadWriteProperty;", DocumentDownloadActivity.EXTRA_REPLACE, "getReplace", "replace$delegate", "destinationFile", "Ljava/io/File;", "getDestinationFile", "()Ljava/io/File;", "binding", "Lcom/robinhood/shared/documentdownload/databinding/ActivityDocumentDownloadBinding;", "getBinding", "()Lcom/robinhood/shared/documentdownload/databinding/ActivityDocumentDownloadBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "launchFile", "file", "promptToEmailSupport", "startDownload", "sendEmail", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "Companion", "feature-document-download_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class DocumentDownloadActivity extends BaseActivity {
    private static final String EXTRA_DOCUMENT = "document";
    private static final String EXTRA_FILENAME = "filename";
    private static final String EXTRA_LAUNCH_MODE = "launchMode";
    private static final String EXTRA_REPLACE = "replace";

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: document$delegate, reason: from kotlin metadata */
    private final Lazy document;
    public DocumentStore documentStore;

    /* renamed from: downloading$delegate, reason: from kotlin metadata */
    private final Interfaces3 downloading;

    /* renamed from: filename$delegate, reason: from kotlin metadata */
    private final Lazy filename;

    /* renamed from: launchMode$delegate, reason: from kotlin metadata */
    private final Lazy launchMode;

    /* renamed from: replace$delegate, reason: from kotlin metadata */
    private final Lazy replace;
    public SupportEmailHandler supportEmailHandler;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(DocumentDownloadActivity.class, "downloading", "getDownloading()Z", 0)), Reflection.property1(new PropertyReference1Impl(DocumentDownloadActivity.class, "binding", "getBinding()Lcom/robinhood/shared/documentdownload/databinding/ActivityDocumentDownloadBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DocumentDownloadActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentDownloadLaunchMode.values().length];
            try {
                iArr[DocumentDownloadLaunchMode.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentDownloadLaunchMode.SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static Intent getIntent(Context context, DocumentDownloadKey documentDownloadKey) {
        return INSTANCE.getIntent(context, documentDownloadKey);
    }

    public DocumentDownloadActivity() {
        super(C38748R.layout.activity_document_download);
        this.document = Activity.intentExtra(this, EXTRA_DOCUMENT);
        this.launchMode = Activity.intentExtra(this, EXTRA_LAUNCH_MODE);
        this.filename = Activity.intentExtra(this, EXTRA_FILENAME);
        this.downloading = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[0]);
        this.replace = Activity.intentExtra(this, EXTRA_REPLACE);
        this.binding = ViewBinding5.viewBinding(this, DocumentDownloadActivity2.INSTANCE);
    }

    public final DocumentStore getDocumentStore() {
        DocumentStore documentStore = this.documentStore;
        if (documentStore != null) {
            return documentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("documentStore");
        return null;
    }

    public final void setDocumentStore(DocumentStore documentStore) {
        Intrinsics.checkNotNullParameter(documentStore, "<set-?>");
        this.documentStore = documentStore;
    }

    public final SupportEmailHandler getSupportEmailHandler() {
        SupportEmailHandler supportEmailHandler = this.supportEmailHandler;
        if (supportEmailHandler != null) {
            return supportEmailHandler;
        }
        Intrinsics.throwUninitializedPropertyAccessException("supportEmailHandler");
        return null;
    }

    public final void setSupportEmailHandler(SupportEmailHandler supportEmailHandler) {
        Intrinsics.checkNotNullParameter(supportEmailHandler, "<set-?>");
        this.supportEmailHandler = supportEmailHandler;
    }

    private final Document getDocument() {
        return (Document) this.document.getValue();
    }

    private final DocumentDownloadLaunchMode getLaunchMode() {
        return (DocumentDownloadLaunchMode) this.launchMode.getValue();
    }

    private final String getFilename() {
        return (String) this.filename.getValue();
    }

    private final boolean getDownloading() {
        return ((Boolean) this.downloading.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void setDownloading(boolean z) {
        this.downloading.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    private final boolean getReplace() {
        return ((Boolean) this.replace.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getDestinationFile() {
        return new File(getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), getFilename());
    }

    private final ActivityDocumentDownloadBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityDocumentDownloadBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RdsProgressBar loadingSpinner = getBinding().loadingSpinner;
        Intrinsics.checkNotNullExpressionValue(loadingSpinner, "loadingSpinner");
        Activitys2.setListItemRevealTransition(this, loadingSpinner, getDocument().getId());
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (getDestinationFile().exists()) {
            if (getReplace()) {
                getDestinationFile().delete();
                startDownload();
                return;
            } else {
                launchFile(getDestinationFile());
                return;
            }
        }
        startDownload();
    }

    private final void launchFile(File file) {
        Intent openOrShareIntent;
        String mimeType = getDocument().getFiletype().getMimeType();
        if (mimeType == null) {
            promptToEmailSupport();
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[getLaunchMode().ordinal()];
        if (i == 1) {
            openOrShareIntent = Files.getOpenOrShareIntent(file, this, C38748R.string.documents_share_title, mimeType);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            openOrShareIntent = Files.getShareIntent(file, this, C38748R.string.documents_share_title, mimeType);
        }
        if (openOrShareIntent != null) {
            startActivity(openOrShareIntent);
            finish();
        } else {
            getDestinationFile().delete();
            promptToEmailSupport();
        }
    }

    private final void promptToEmailSupport() {
        RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(this).setId(C38748R.id.dialog_id_doc_email_support).setMessage(C38748R.string.documents_error_download, new Object[0]).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "email", false, 4, null);
    }

    private final void startDownload() {
        if (getDownloading()) {
            Timber.INSTANCE.mo3350d("Download in progress, wait for completion.", new Object[0]);
            return;
        }
        setDownloading(true);
        Observable observableFlatMapSingle = ObservablesAndroid.observeOnMainThread(getDocumentStore().getDocumentDownloadUrl(getDocument())).onErrorResumeNext(getActivityErrorHandler()).flatMapSingle(new Function() { // from class: com.robinhood.shared.documentdownload.DocumentDownloadActivity.startDownload.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends File> apply(HttpUrl url) {
                Intrinsics.checkNotNullParameter(url, "url");
                DocumentDownloadActivity documentDownloadActivity = DocumentDownloadActivity.this;
                return Single.create(new DownloadManagerOnSubscribe(documentDownloadActivity, url, documentDownloadActivity.getDestinationFile(), false, 8, null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapSingle, "flatMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableFlatMapSingle, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.documentdownload.DocumentDownloadActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentDownloadActivity.startDownload$lambda$0(this.f$0, (File) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startDownload$lambda$0(DocumentDownloadActivity documentDownloadActivity, File file) {
        Intrinsics.checkNotNull(file);
        documentDownloadActivity.launchFile(file);
        return Unit.INSTANCE;
    }

    private final void sendEmail() {
        RdsProgressBar loadingSpinner = getBinding().loadingSpinner;
        Intrinsics.checkNotNullExpressionValue(loadingSpinner, "loadingSpinner");
        loadingSpinner.setVisibility(8);
        startActivity(getSupportEmailHandler().getPathfinderEmailIntent(this, String.valueOf(CxTopic.DOWNLOAD_DOCUMENTS.getTopicId())));
        finish();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C38748R.id.dialog_id_doc_email_support) {
            sendEmail();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C38748R.id.dialog_id_doc_email_support) {
            finish();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    /* compiled from: DocumentDownloadActivity.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/documentdownload/DocumentDownloadActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/shared/documents/contracts/DocumentDownloadKey;", "<init>", "()V", "EXTRA_DOCUMENT", "", "EXTRA_LAUNCH_MODE", "EXTRA_FILENAME", "EXTRA_REPLACE", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-document-download_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<DocumentDownloadKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        @JvmStatic
        public Intent getIntent(Context context, DocumentDownloadKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) DocumentDownloadActivity.class);
            intent.putExtra(DocumentDownloadActivity.EXTRA_DOCUMENT, key.getDocument());
            intent.putExtra(DocumentDownloadActivity.EXTRA_LAUNCH_MODE, key.getLaunchMode());
            intent.putExtra(DocumentDownloadActivity.EXTRA_FILENAME, key.getFilename());
            intent.putExtra(DocumentDownloadActivity.EXTRA_REPLACE, key.getReplace());
            return intent;
        }
    }
}
