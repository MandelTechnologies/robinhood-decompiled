package com.robinhood.android.doc.deeplink;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.robinhood.android.common.contracts.CuratedListKey;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.onboarding.contracts.DocumentUpload;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CryptoResidencyDocumentStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiResidencyDocument;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UploadResidencyDocDeeplinkActivity.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001b*\b\u0012\u0004\u0012\u00020\u001b0\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/doc/deeplink/UploadResidencyDocDeeplinkActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "<init>", "()V", "residencyDocumentStore", "Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "getResidencyDocumentStore", "()Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "setResidencyDocumentStore", "(Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;)V", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "setRxFactory", "(Lcom/robinhood/coroutines/rx/RxFactory;)V", "documentRequest", "Lcom/robinhood/models/ui/DocumentRequest;", "getDocumentRequest", "()Lcom/robinhood/models/ui/DocumentRequest;", "documentRequest$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "findDocument", "Lcom/robinhood/models/api/ApiResidencyDocument;", "", "id", "Ljava/util/UUID;", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class UploadResidencyDocDeeplinkActivity extends BaseActivity {
    private static final String EXTRA_DOCUMENT_REQUEST = "docRequest";

    /* renamed from: documentRequest$delegate, reason: from kotlin metadata */
    private final Lazy documentRequest = Activity.intentExtra(this, EXTRA_DOCUMENT_REQUEST);
    public CryptoResidencyDocumentStore residencyDocumentStore;
    public RxFactory rxFactory;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final CryptoResidencyDocumentStore getResidencyDocumentStore() {
        CryptoResidencyDocumentStore cryptoResidencyDocumentStore = this.residencyDocumentStore;
        if (cryptoResidencyDocumentStore != null) {
            return cryptoResidencyDocumentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("residencyDocumentStore");
        return null;
    }

    public final void setResidencyDocumentStore(CryptoResidencyDocumentStore cryptoResidencyDocumentStore) {
        Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "<set-?>");
        this.residencyDocumentStore = cryptoResidencyDocumentStore;
    }

    public final RxFactory getRxFactory() {
        RxFactory rxFactory = this.rxFactory;
        if (rxFactory != null) {
            return rxFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rxFactory");
        return null;
    }

    public final void setRxFactory(RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(rxFactory, "<set-?>");
        this.rxFactory = rxFactory;
    }

    private final DocumentRequest getDocumentRequest() {
        return (DocumentRequest) this.documentRequest.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Observable observable = RxFactory.DefaultImpls.rxSingle$default(getRxFactory(), null, new C142661(null), 1, null).map(new Function() { // from class: com.robinhood.android.doc.deeplink.UploadResidencyDocDeeplinkActivity.onCreate.2
            @Override // io.reactivex.functions.Function
            public final Optional<List<ApiResidencyDocument>> apply(PaginatedResult<ApiResidencyDocument> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getResults());
            }
        }).onErrorResumeNext(new Function() { // from class: com.robinhood.android.doc.deeplink.UploadResidencyDocDeeplinkActivity.onCreate.3
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<List<ApiResidencyDocument>>> apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Single.just(Optional2.INSTANCE);
            }
        }).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnFastPath(observable), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.doc.deeplink.UploadResidencyDocDeeplinkActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UploadResidencyDocDeeplinkActivity.onCreate$lambda$1(this.f$0, (Optional) obj);
            }
        });
    }

    /* compiled from: UploadResidencyDocDeeplinkActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiResidencyDocument;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.deeplink.UploadResidencyDocDeeplinkActivity$onCreate$1", m3645f = "UploadResidencyDocDeeplinkActivity.kt", m3646l = {36}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.deeplink.UploadResidencyDocDeeplinkActivity$onCreate$1 */
    static final class C142661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super PaginatedResult<? extends ApiResidencyDocument>>, Object> {
        int label;

        C142661(Continuation<? super C142661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UploadResidencyDocDeeplinkActivity.this.new C142661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<? extends ApiResidencyDocument>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super PaginatedResult<ApiResidencyDocument>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super PaginatedResult<ApiResidencyDocument>> continuation) {
            return ((C142661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            CryptoResidencyDocumentStore residencyDocumentStore = UploadResidencyDocDeeplinkActivity.this.getResidencyDocumentStore();
            String serverValue = ApiResidencyDocument.State.PENDING.getServerValue();
            this.label = 1;
            Object residencyDocuments = residencyDocumentStore.getResidencyDocuments(serverValue, this);
            return residencyDocuments == coroutine_suspended ? coroutine_suspended : residencyDocuments;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(UploadResidencyDocDeeplinkActivity uploadResidencyDocDeeplinkActivity, Optional optional) {
        UploadResidencyDocDeeplinkActivity uploadResidencyDocDeeplinkActivity2;
        List<ApiResidencyDocument> list = (List) optional.component1();
        UUID id = uploadResidencyDocDeeplinkActivity.getDocumentRequest().getId();
        ApiResidencyDocument apiResidencyDocumentFindDocument = null;
        if (id == null || list == null) {
            uploadResidencyDocDeeplinkActivity2 = uploadResidencyDocDeeplinkActivity;
        } else {
            uploadResidencyDocDeeplinkActivity2 = uploadResidencyDocDeeplinkActivity;
            apiResidencyDocumentFindDocument = uploadResidencyDocDeeplinkActivity2.findDocument(list, id);
        }
        if (apiResidencyDocumentFindDocument != null) {
            Navigator.DefaultImpls.startActivity$default(uploadResidencyDocDeeplinkActivity2.getNavigator(), uploadResidencyDocDeeplinkActivity2, DocumentUpload.Companion.singleDocStandaloneActivityIntent$default(DocumentUpload.INSTANCE, uploadResidencyDocDeeplinkActivity2.getDocumentRequest(), true, null, false, null, 28, null), null, false, null, null, 60, null);
        } else {
            Navigator.DefaultImpls.showFragment$default(uploadResidencyDocDeeplinkActivity.getNavigator(), uploadResidencyDocDeeplinkActivity, CuratedListKey.INSTANCE.getCryptoListKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
        uploadResidencyDocDeeplinkActivity.finish();
        return Unit.INSTANCE;
    }

    private final ApiResidencyDocument findDocument(List<ApiResidencyDocument> list, UUID uuid) {
        Object next;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ApiResidencyDocument) next).getId(), uuid)) {
                break;
            }
        }
        return (ApiResidencyDocument) next;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        return getDocumentRequest().getType().getServerValue();
    }

    /* compiled from: UploadResidencyDocDeeplinkActivity.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/doc/deeplink/UploadResidencyDocDeeplinkActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$UploadResidencyDoc;", "<init>", "()V", "EXTRA_DOCUMENT_REQUEST", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<LegacyIntentKey.UploadResidencyDoc> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.UploadResidencyDoc key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = new Intent(context, (Class<?>) UploadResidencyDocDeeplinkActivity.class);
            intent.putExtra(UploadResidencyDocDeeplinkActivity.EXTRA_DOCUMENT_REQUEST, key.getDocumentRequest());
            return intent;
        }
    }
}
