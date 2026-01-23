package com.robinhood.android.idupload;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.docupload.DocUploadApi;
import com.robinhood.android.bitmap.BitmapStore;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.CryptoResidencyDocumentStore;
import com.robinhood.models.api.DocUploadCapturedDocument;
import com.robinhood.models.api.DocUploadRequestInfo;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.api.PdfDocument;
import com.robinhood.models.api.PhotoDocument;
import com.robinhood.models.p355ui.DocumentRequest;
import com.robinhood.prefs.Installation;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.singular.sdk.internal.Constants;
import com.truelayer.payments.p419ui.utils.TestTags;
import dispatch.core.Suspend;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.p481io.IOStreams;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import timber.log.Timber;

/* compiled from: IdUploadSubmissionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0086@¢\u0006\u0002\u0010\u001eJ\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0018\u0010&\u001a\u00020'2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J:\u0010(\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020)2\b\u0010\u001d\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010)H\u0082@¢\u0006\u0002\u0010+J \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0-0 *\u00020.2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0-0 *\u00020/2\u0006\u0010\n\u001a\u00020\u000bH\u0002J$\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0-0 2\u0006\u0010$\u001a\u00020%2\u0006\u00101\u001a\u000202H\u0002J\u001c\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0-0 2\u0006\u00104\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/idupload/IdUploadSubmissionStore;", "Lcom/robinhood/store/Store;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "bitmapStore", "Lcom/robinhood/android/bitmap/BitmapStore;", "api", "Lcom/robinhood/android/api/docupload/DocUploadApi;", "cryptoResidencyDocumentStore", "Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;", "contentResolver", "Landroid/content/ContentResolver;", "installation", "Lcom/robinhood/prefs/Installation;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/android/common/util/CardManager;Lcom/robinhood/android/bitmap/BitmapStore;Lcom/robinhood/android/api/docupload/DocUploadApi;Lcom/robinhood/librobinhood/data/store/CryptoResidencyDocumentStore;Landroid/content/ContentResolver;Lcom/robinhood/prefs/Installation;Lcom/robinhood/store/StoreBundle;)V", "submitServerDrivenRequest", "", "requestId", "Ljava/util/UUID;", "requestType", "", "photoIdType", PlaceTypes.COUNTRY, "Lcom/robinhood/iso/countrycode/CountryCode;", "front", "Lcom/robinhood/models/api/DocUploadCapturedDocument;", TestTags.BACK, "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/iso/countrycode/CountryCode;Lcom/robinhood/models/api/DocUploadCapturedDocument;Lcom/robinhood/models/api/DocUploadCapturedDocument;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitRequest", "Lio/reactivex/Observable;", "", "documentRequest", "Lcom/robinhood/models/ui/DocumentRequest;", "idDocument", "Lcom/robinhood/models/api/IdDocument;", "getUploadObservable", "Lio/reactivex/Completable;", "uploadIdentiId", "Lcom/robinhood/models/api/DocUploadRequestInfo;", "selfie", "(Lcom/robinhood/models/ui/DocumentRequest;Lcom/robinhood/models/api/IdDocument;Lcom/robinhood/models/api/DocUploadRequestInfo;Lcom/robinhood/models/api/DocUploadRequestInfo;Lcom/robinhood/models/api/DocUploadRequestInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toRequestInfoObservable", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/PhotoDocument;", "Lcom/robinhood/models/api/PdfDocument;", "getObservableForSide", "side", "Lcom/robinhood/models/api/IdDocument$Side;", "toRequestInformationObservable", "document", "lib-store-id-upload_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class IdUploadSubmissionStore extends Store {
    private final DocUploadApi api;
    private final BitmapStore bitmapStore;
    private final CardManager cardManager;
    private final ContentResolver contentResolver;
    private final CryptoResidencyDocumentStore cryptoResidencyDocumentStore;
    private final Installation installation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdUploadSubmissionStore(CardManager cardManager, BitmapStore bitmapStore, DocUploadApi api, CryptoResidencyDocumentStore cryptoResidencyDocumentStore, ContentResolver contentResolver, Installation installation, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(bitmapStore, "bitmapStore");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(cryptoResidencyDocumentStore, "cryptoResidencyDocumentStore");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.cardManager = cardManager;
        this.bitmapStore = bitmapStore;
        this.api = api;
        this.cryptoResidencyDocumentStore = cryptoResidencyDocumentStore;
        this.contentResolver = contentResolver;
        this.installation = installation;
    }

    public final Object submitServerDrivenRequest(final UUID uuid, final String str, final String str2, final CountryCode countryCode, DocUploadCapturedDocument docUploadCapturedDocument, DocUploadCapturedDocument docUploadCapturedDocument2, Continuation<? super Unit> continuation) {
        Observable<Optional<DocUploadRequestInfo>> observableJust;
        Observable<Optional<DocUploadRequestInfo>> requestInformationObservable = toRequestInformationObservable(docUploadCapturedDocument);
        if (docUploadCapturedDocument2 == null || (observableJust = toRequestInformationObservable(docUploadCapturedDocument2)) == null) {
            observableJust = Observable.just(Optional2.INSTANCE);
            Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        }
        final Completable completableOnErrorComplete = Completable.fromCallable(new Callable() { // from class: com.robinhood.android.idupload.IdUploadSubmissionStore$submitServerDrivenRequest$photoCleanupCompletable$1
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Object call() {
                call();
                return Unit.INSTANCE;
            }

            @Override // java.util.concurrent.Callable
            public final void call() {
                this.this$0.bitmapStore.deleteBitmapsFromDisk("FRONT", "BACK", "SELFIE");
            }
        }).onErrorComplete();
        Completable completableAndThen = Observables.INSTANCE.combineLatest(requestInformationObservable, observableJust).subscribeOn(Schedulers.m3346io()).flatMapCompletable(new Function() { // from class: com.robinhood.android.idupload.IdUploadSubmissionStore.submitServerDrivenRequest.2
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Tuples2<? extends Optional<DocUploadRequestInfo>, ? extends Optional<DocUploadRequestInfo>> tuples2) {
                MultipartBody.Part partCreateFormData;
                MultipartBody.Part partCreateFormData2;
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                Optional<DocUploadRequestInfo> optionalComponent1 = tuples2.component1();
                Optional<DocUploadRequestInfo> optionalComponent2 = tuples2.component2();
                DocUploadRequestInfo orNull = optionalComponent1.getOrNull();
                if (orNull != null) {
                    Timber.Companion companion = Timber.INSTANCE;
                    companion.mo3356i("Front document size: " + orNull.getData().length, new Object[0]);
                    MultipartBody.Part.Companion companion2 = MultipartBody.Part.INSTANCE;
                    String str3 = "front." + orNull.getType().getExtension();
                    RequestBody.Companion companion3 = RequestBody.INSTANCE;
                    MultipartBody.Part partCreateFormData3 = companion2.createFormData("front", str3, RequestBody.Companion.create$default(companion3, orNull.getData(), orNull.getType().getMediaType(), 0, 0, 6, (Object) null));
                    if (partCreateFormData3 != null) {
                        DocUploadRequestInfo orNull2 = optionalComponent2.getOrNull();
                        if (orNull2 != null) {
                            companion.mo3356i("Back document size: " + orNull2.getData().length, new Object[0]);
                            partCreateFormData = companion2.createFormData(TestTags.BACK, "back." + orNull2.getType().getExtension(), RequestBody.Companion.create$default(companion3, orNull2.getData(), orNull2.getType().getMediaType(), 0, 0, 6, (Object) null));
                        } else {
                            partCreateFormData = null;
                        }
                        if (Intrinsics.areEqual(str2, str)) {
                            partCreateFormData2 = null;
                        } else {
                            partCreateFormData2 = companion2.createFormData(str + "_type", str2);
                        }
                        String str4 = str2;
                        RequestBody requestBodyCreate = (Intrinsics.areEqual(str4, IdDocument.Type.NATIONAL_ID.getServerValue()) || Intrinsics.areEqual(str4, IdDocument.Type.THREE_POINT_SELFIE.getServerValue())) ? null : companion3.create(str2, IdUploadSubmissionStore4.MULTIPART);
                        IdUploadSubmissionStore idUploadSubmissionStore = this;
                        return RxFactory.DefaultImpls.rxCompletable$default(idUploadSubmissionStore, null, new AnonymousClass1(idUploadSubmissionStore, uuid, str, requestBodyCreate, countryCode, partCreateFormData3, partCreateFormData, partCreateFormData2, null), 1, null);
                    }
                }
                return Completable.error(new IllegalStateException("front side cannot be null"));
            }

            /* compiled from: IdUploadSubmissionStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.idupload.IdUploadSubmissionStore$submitServerDrivenRequest$2$1", m3645f = "IdUploadSubmissionStore.kt", m3646l = {128}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.idupload.IdUploadSubmissionStore$submitServerDrivenRequest$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ MultipartBody.Part $backPart;
                final /* synthetic */ CountryCode $country;
                final /* synthetic */ MultipartBody.Part $frontPart;
                final /* synthetic */ RequestBody $photoIdTypeBody;
                final /* synthetic */ UUID $requestId;
                final /* synthetic */ String $requestType;
                final /* synthetic */ MultipartBody.Part $selectedTypePart;
                int label;
                final /* synthetic */ IdUploadSubmissionStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(IdUploadSubmissionStore idUploadSubmissionStore, UUID uuid, String str, RequestBody requestBody, CountryCode countryCode, MultipartBody.Part part, MultipartBody.Part part2, MultipartBody.Part part3, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = idUploadSubmissionStore;
                    this.$requestId = uuid;
                    this.$requestType = str;
                    this.$photoIdTypeBody = requestBody;
                    this.$country = countryCode;
                    this.$frontPart = part;
                    this.$backPart = part2;
                    this.$selectedTypePart = part3;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$requestId, this.$requestType, this.$photoIdTypeBody, this.$country, this.$frontPart, this.$backPart, this.$selectedTypePart, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    String iso3166CountryCode;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        DocUploadApi docUploadApi = this.this$0.api;
                        RequestBody.Companion companion = RequestBody.INSTANCE;
                        String string2 = this.$requestId.toString();
                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                        RequestBody requestBodyCreate = companion.create(string2, IdUploadSubmissionStore4.MULTIPART);
                        RequestBody requestBodyCreate2 = companion.create(this.$requestType, IdUploadSubmissionStore4.MULTIPART);
                        RequestBody requestBody = this.$photoIdTypeBody;
                        CountryCode countryCode = this.$country;
                        RequestBody requestBodyCreate3 = (countryCode == null || (iso3166CountryCode = countryCode.getIso3166CountryCode()) == null) ? null : companion.create(iso3166CountryCode, IdUploadSubmissionStore4.MULTIPART);
                        RequestBody requestBodyCreate4 = companion.create(this.this$0.installation.mo2745id(), IdUploadSubmissionStore4.MULTIPART);
                        MultipartBody.Part part = this.$frontPart;
                        MultipartBody.Part part2 = this.$backPart;
                        MultipartBody.Part part3 = this.$selectedTypePart;
                        this.label = 1;
                        if (docUploadApi.uploadDocument(requestBodyCreate, requestBodyCreate2, requestBody, requestBodyCreate3, requestBodyCreate4, part, part2, null, part3, this) == coroutine_suspended) {
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
        }).andThen(this.cardManager.invalidateCards().onErrorComplete()).onErrorResumeNext(new Function() { // from class: com.robinhood.android.idupload.IdUploadSubmissionStore.submitServerDrivenRequest.3
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Throwable err) {
                Intrinsics.checkNotNullParameter(err, "err");
                return completableOnErrorComplete.andThen(Completable.error(err));
            }
        }).andThen(completableOnErrorComplete);
        Intrinsics.checkNotNullExpressionValue(completableAndThen, "andThen(...)");
        Object objAwait = RxAwait3.await(completableAndThen, continuation);
        return objAwait == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwait : Unit.INSTANCE;
    }

    public final Observable<Boolean> submitRequest(DocumentRequest documentRequest, IdDocument idDocument) {
        Intrinsics.checkNotNullParameter(documentRequest, "documentRequest");
        Intrinsics.checkNotNullParameter(idDocument, "idDocument");
        Observable<Boolean> observableAndThen = getUploadObservable(documentRequest, idDocument).andThen(Observable.just(Boolean.TRUE));
        Intrinsics.checkNotNullExpressionValue(observableAndThen, "andThen(...)");
        return observableAndThen;
    }

    private final Completable getUploadObservable(final DocumentRequest documentRequest, final IdDocument idDocument) {
        Observable<Optional<DocUploadRequestInfo>> observableForSide = getObservableForSide(idDocument, IdDocument.Side.FRONT);
        Observable<Optional<DocUploadRequestInfo>> observableForSide2 = getObservableForSide(idDocument, IdDocument.Side.BACK);
        Observable<Optional<DocUploadRequestInfo>> observableForSide3 = getObservableForSide(idDocument, IdDocument.Side.SELFIE);
        final Completable completableOnErrorComplete = Completable.fromCallable(new Callable() { // from class: com.robinhood.android.idupload.IdUploadSubmissionStore$getUploadObservable$photoCleanupCompletable$1
            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ Object call() {
                call();
                return Unit.INSTANCE;
            }

            @Override // java.util.concurrent.Callable
            public final void call() {
                this.this$0.bitmapStore.deleteBitmapsFromDisk("FRONT", "BACK", "SELFIE");
            }
        }).onErrorComplete();
        Completable completableAndThen = Observables.INSTANCE.combineLatest(observableForSide, observableForSide2, observableForSide3).subscribeOn(Schedulers.m3346io()).flatMapCompletable(new Function() { // from class: com.robinhood.android.idupload.IdUploadSubmissionStore.getUploadObservable.1

            /* compiled from: IdUploadSubmissionStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.idupload.IdUploadSubmissionStore$getUploadObservable$1$1", m3645f = "IdUploadSubmissionStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.idupload.IdUploadSubmissionStore$getUploadObservable$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Optional<DocUploadRequestInfo> $back;
                final /* synthetic */ DocumentRequest $documentRequest;
                final /* synthetic */ Optional<DocUploadRequestInfo> $front;
                final /* synthetic */ IdDocument $idDocument;
                final /* synthetic */ Optional<DocUploadRequestInfo> $selfie;
                int label;
                final /* synthetic */ IdUploadSubmissionStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(IdUploadSubmissionStore idUploadSubmissionStore, DocumentRequest documentRequest, IdDocument idDocument, Optional<DocUploadRequestInfo> optional, Optional<DocUploadRequestInfo> optional2, Optional<DocUploadRequestInfo> optional3, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = idUploadSubmissionStore;
                    this.$documentRequest = documentRequest;
                    this.$idDocument = idDocument;
                    this.$front = optional;
                    this.$back = optional2;
                    this.$selfie = optional3;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$documentRequest, this.$idDocument, this.$front, this.$back, this.$selfie, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        IdUploadSubmissionStore idUploadSubmissionStore = this.this$0;
                        DocumentRequest documentRequest = this.$documentRequest;
                        IdDocument idDocument = this.$idDocument;
                        DocUploadRequestInfo orNull = this.$front.getOrNull();
                        Intrinsics.checkNotNull(orNull);
                        DocUploadRequestInfo orNull2 = this.$back.getOrNull();
                        DocUploadRequestInfo orNull3 = this.$selfie.getOrNull();
                        this.label = 1;
                        if (idUploadSubmissionStore.uploadIdentiId(documentRequest, idDocument, orNull, orNull2, orNull3, this) == coroutine_suspended) {
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

            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Tuples3<? extends Optional<DocUploadRequestInfo>, ? extends Optional<DocUploadRequestInfo>, ? extends Optional<DocUploadRequestInfo>> tuples3) {
                Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                Optional<DocUploadRequestInfo> optionalComponent1 = tuples3.component1();
                Optional<DocUploadRequestInfo> optionalComponent2 = tuples3.component2();
                Optional<DocUploadRequestInfo> optionalComponent3 = tuples3.component3();
                IdUploadSubmissionStore idUploadSubmissionStore = IdUploadSubmissionStore.this;
                return RxFactory.DefaultImpls.rxCompletable$default(idUploadSubmissionStore, null, new AnonymousClass1(idUploadSubmissionStore, documentRequest, idDocument, optionalComponent1, optionalComponent2, optionalComponent3, null), 1, null);
            }
        }).andThen(this.cardManager.invalidateCards().onErrorComplete()).onErrorResumeNext(new Function() { // from class: com.robinhood.android.idupload.IdUploadSubmissionStore.getUploadObservable.2
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Throwable err) {
                Intrinsics.checkNotNullParameter(err, "err");
                return completableOnErrorComplete.andThen(Completable.error(err));
            }
        }).andThen(completableOnErrorComplete);
        Intrinsics.checkNotNullExpressionValue(completableAndThen, "andThen(...)");
        return completableAndThen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object uploadIdentiId(DocumentRequest documentRequest, IdDocument idDocument, DocUploadRequestInfo docUploadRequestInfo, DocUploadRequestInfo docUploadRequestInfo2, DocUploadRequestInfo docUploadRequestInfo3, Continuation<? super Unit> continuation) {
        if (documentRequest.getForCrypto()) {
            IdDocument.Request request = idDocument.toRequest(docUploadRequestInfo, docUploadRequestInfo2, documentRequest.getForCrypto());
            CryptoResidencyDocumentStore cryptoResidencyDocumentStore = this.cryptoResidencyDocumentStore;
            UUID id = documentRequest.getId();
            Intrinsics.checkNotNull(id);
            RequestBody type2 = request.getType();
            Intrinsics.checkNotNull(type2);
            Object objUploadResidencyDocument = cryptoResidencyDocumentStore.uploadResidencyDocument(id, type2, request.getFront(), request.getBack(), continuation);
            return objUploadResidencyDocument == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUploadResidencyDocument : Unit.INSTANCE;
        }
        IdDocument.IdentiRequest identiRequest = idDocument.toIdentiRequest(documentRequest.getType(), this.installation.mo2745id(), docUploadRequestInfo, docUploadRequestInfo2, docUploadRequestInfo3);
        Object objUploadDocument$default = DocUploadApi.DefaultImpls.uploadDocument$default(this.api, identiRequest.getDocumentId(), identiRequest.getDocumentType(), identiRequest.getPhotoIdType(), identiRequest.getCountry(), identiRequest.getDeviceId(), identiRequest.getFront(), identiRequest.getBack(), identiRequest.getSelfie(), null, continuation, 256, null);
        return objUploadDocument$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUploadDocument$default : Unit.INSTANCE;
    }

    /* compiled from: IdUploadSubmissionStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.idupload.IdUploadSubmissionStore$toRequestInfoObservable$1", m3645f = "IdUploadSubmissionStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.idupload.IdUploadSubmissionStore$toRequestInfoObservable$1 */
    static final class C187171 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends Bitmap>>, Object> {
        final /* synthetic */ BitmapStore $bitmapStore;
        final /* synthetic */ PhotoDocument $this_toRequestInfoObservable;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C187171(BitmapStore bitmapStore, PhotoDocument photoDocument, Continuation<? super C187171> continuation) {
            super(2, continuation);
            this.$bitmapStore = bitmapStore;
            this.$this_toRequestInfoObservable = photoDocument;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C187171(this.$bitmapStore, this.$this_toRequestInfoObservable, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends Bitmap>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<Bitmap>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<Bitmap>> continuation) {
            return ((C187171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Optional.Companion companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Optional.Companion companion2 = Optional.INSTANCE;
                BitmapStore bitmapStore = this.$bitmapStore;
                String strName = this.$this_toRequestInfoObservable.getSide().name();
                this.L$0 = companion2;
                this.label = 1;
                Object bitmapFromDisk = bitmapStore.readBitmapFromDisk(strName, this);
                if (bitmapFromDisk == coroutine_suspended) {
                    return coroutine_suspended;
                }
                companion = companion2;
                obj = bitmapFromDisk;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (Optional.Companion) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return companion.m2972of(obj);
        }
    }

    private final Observable<Optional<DocUploadRequestInfo>> toRequestInfoObservable(final PhotoDocument photoDocument, BitmapStore bitmapStore) {
        Observable<Optional<DocUploadRequestInfo>> observable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C187171(bitmapStore, photoDocument, null), 1, null).map(new Function() { // from class: com.robinhood.android.idupload.IdUploadSubmissionStore.toRequestInfoObservable.2
            @Override // io.reactivex.functions.Function
            public final Optional<DocUploadRequestInfo> apply(Optional<Bitmap> optional) {
                DocUploadRequestInfo docUploadRequestInfo;
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                Bitmap bitmapComponent1 = optional.component1();
                if (bitmapComponent1 != null) {
                    docUploadRequestInfo = new DocUploadRequestInfo(IdDocument.INSTANCE.bitmapToByteArray(bitmapComponent1), photoDocument.getSide(), DocUploadRequestInfo.Type.PHOTO);
                } else {
                    docUploadRequestInfo = null;
                }
                return Optional.INSTANCE.m2972of(docUploadRequestInfo);
            }
        }).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* compiled from: IdUploadSubmissionStore.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/DocUploadRequestInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.idupload.IdUploadSubmissionStore$toRequestInfoObservable$3", m3645f = "IdUploadSubmissionStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.idupload.IdUploadSubmissionStore$toRequestInfoObservable$3 */
    static final class C187193 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends DocUploadRequestInfo>>, Object> {
        final /* synthetic */ ContentResolver $contentResolver;
        final /* synthetic */ PdfDocument $this_toRequestInfoObservable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C187193(ContentResolver contentResolver, PdfDocument pdfDocument, Continuation<? super C187193> continuation) {
            super(2, continuation);
            this.$contentResolver = contentResolver;
            this.$this_toRequestInfoObservable = pdfDocument;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C187193(this.$contentResolver, this.$this_toRequestInfoObservable, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends DocUploadRequestInfo>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Optional<DocUploadRequestInfo>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<DocUploadRequestInfo>> continuation) {
            return ((C187193) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: IdUploadSubmissionStore.kt */
        @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/DocUploadRequestInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.idupload.IdUploadSubmissionStore$toRequestInfoObservable$3$1", m3645f = "IdUploadSubmissionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.idupload.IdUploadSubmissionStore$toRequestInfoObservable$3$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Optional<? extends DocUploadRequestInfo>>, Object> {
            final /* synthetic */ ContentResolver $contentResolver;
            final /* synthetic */ PdfDocument $this_toRequestInfoObservable;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ContentResolver contentResolver, PdfDocument pdfDocument, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$contentResolver = contentResolver;
                this.$this_toRequestInfoObservable = pdfDocument;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$contentResolver, this.$this_toRequestInfoObservable, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Optional<? extends DocUploadRequestInfo>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super Optional<DocUploadRequestInfo>>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Optional<DocUploadRequestInfo>> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws FileNotFoundException {
                byte[] bytes;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.$contentResolver.openFileDescriptor(this.$this_toRequestInfoObservable.getUri(), Constants.REVENUE_AMOUNT_KEY);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        try {
                            bytes = IOStreams.readBytes(fileInputStream);
                            Closeable.closeFinally(fileInputStream, null);
                            Closeable.closeFinally(parcelFileDescriptorOpenFileDescriptor, null);
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    bytes = null;
                }
                return Optional3.asOptional(bytes != null ? new DocUploadRequestInfo(bytes, this.$this_toRequestInfoObservable.getSide(), DocUploadRequestInfo.Type.PDF) : null);
            }
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$contentResolver, this.$this_toRequestInfoObservable, null);
            this.label = 1;
            Object objWithIO$default = Suspend.withIO$default(null, anonymousClass1, this, 1, null);
            return objWithIO$default == coroutine_suspended ? coroutine_suspended : objWithIO$default;
        }
    }

    private final Observable<Optional<DocUploadRequestInfo>> toRequestInfoObservable(PdfDocument pdfDocument, ContentResolver contentResolver) {
        Observable<Optional<DocUploadRequestInfo>> observable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C187193(contentResolver, pdfDocument, null), 1, null).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    private final Observable<Optional<DocUploadRequestInfo>> getObservableForSide(IdDocument idDocument, IdDocument.Side side) {
        Observable<Optional<DocUploadRequestInfo>> requestInformationObservable;
        DocUploadCapturedDocument captureForSide = idDocument.getCaptureForSide(side);
        if (captureForSide != null && (requestInformationObservable = toRequestInformationObservable(captureForSide)) != null) {
            return requestInformationObservable;
        }
        Observable<Optional<DocUploadRequestInfo>> observableJust = Observable.just(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        return observableJust;
    }

    private final Observable<Optional<DocUploadRequestInfo>> toRequestInformationObservable(DocUploadCapturedDocument document) {
        if (document instanceof PhotoDocument) {
            return toRequestInfoObservable((PhotoDocument) document, this.bitmapStore);
        }
        if (document instanceof PdfDocument) {
            return toRequestInfoObservable((PdfDocument) document, this.contentResolver);
        }
        throw new NoWhenBranchMatchedException();
    }
}
