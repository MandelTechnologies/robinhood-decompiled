package com.robinhood.android.directdeposit.p101ui.deeplink;

import android.content.Context;
import android.os.Environment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.directdeposit.p101ui.deeplink.DirectDepositFormDuxo2;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.DocumentStore;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.p408rx.DownloadManagerOnSubscribe;
import com.squareup.moshi.JsonAdapter;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: DirectDepositFormDuxo.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/directdeposit/ui/deeplink/DirectDepositFormViewState;", "documentStore", "Lcom/robinhood/librobinhood/data/store/DocumentStore;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "<init>", "(Lcom/robinhood/librobinhood/data/store/DocumentStore;Lcom/robinhood/utils/moshi/LazyMoshi;)V", "errorResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/android/directdeposit/ui/deeplink/ErrorResponse;", "startDownload", "", "documentId", "Ljava/util/UUID;", "isSpendingAccount", "", "activity", "Lcom/robinhood/android/common/ui/BaseActivity;", "downloadForm", "Lio/reactivex/Single;", "Ljava/io/File;", "context", "Landroid/content/Context;", "handleFormError", "throwable", "", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectDepositFormDuxo extends OldBaseDuxo<DirectDepositFormDuxo2> {
    public static final int $stable = 8;
    private final DocumentStore documentStore;
    private final JsonAdapter<DirectDepositFormDuxo3> errorResponseAdapter;

    /* JADX INFO: Access modifiers changed from: private */
    public final Single<DirectDepositFormDuxo2> handleFormError(Throwable throwable) throws IOException {
        Response<?> response;
        String strExtractErrorBodyString;
        HttpException httpException = (HttpException) Throwables.findCause(throwable, HttpException.class);
        DirectDepositFormDuxo3 directDepositFormDuxo3FromJson = null;
        if (httpException != null && (response = httpException.response()) != null && (strExtractErrorBodyString = NetworkThrowables.extractErrorBodyString(response)) != null) {
            try {
                directDepositFormDuxo3FromJson = this.errorResponseAdapter.fromJson(strExtractErrorBodyString);
            } catch (IOException unused) {
            }
        }
        if (directDepositFormDuxo3FromJson != null) {
            Single<DirectDepositFormDuxo2> singleJust = Single.just(new DirectDepositFormDuxo2.Error(directDepositFormDuxo3FromJson));
            Intrinsics.checkNotNull(singleJust);
            return singleJust;
        }
        Single<DirectDepositFormDuxo2> singleError = Single.error(throwable);
        Intrinsics.checkNotNull(singleError);
        return singleError;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DirectDepositFormDuxo(DocumentStore documentStore, LazyMoshi moshi) {
        super(DirectDepositFormDuxo2.Loading.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(documentStore, "documentStore");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.documentStore = documentStore;
        Types types = Types.INSTANCE;
        this.errorResponseAdapter = moshi.adapter(new TypeToken<DirectDepositFormDuxo3>() { // from class: com.robinhood.android.directdeposit.ui.deeplink.DirectDepositFormDuxo$special$$inlined$getAdapter$1
        }.getType());
    }

    public final void startDownload(UUID documentId, boolean isSpendingAccount, BaseActivity activity) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Single singleOnErrorResumeNext = downloadForm(documentId, isSpendingAccount, activity).map(new Function() { // from class: com.robinhood.android.directdeposit.ui.deeplink.DirectDepositFormDuxo.startDownload.1
            @Override // io.reactivex.functions.Function
            public final DirectDepositFormDuxo2.Loaded apply(File p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new DirectDepositFormDuxo2.Loaded(p0);
            }
        }).onErrorResumeNext((Function<? super Throwable, ? extends SingleSource<? extends R>>) new Function() { // from class: com.robinhood.android.directdeposit.ui.deeplink.DirectDepositFormDuxo.startDownload.2
            @Override // io.reactivex.functions.Function
            public final Single<DirectDepositFormDuxo2> apply(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return DirectDepositFormDuxo.this.handleFormError(p0);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorResumeNext, "onErrorResumeNext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleOnErrorResumeNext, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directdeposit.ui.deeplink.DirectDepositFormDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositFormDuxo.startDownload$lambda$1(this.f$0, (DirectDepositFormDuxo2) obj);
            }
        }, activity.getActivityErrorHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startDownload$lambda$1(DirectDepositFormDuxo directDepositFormDuxo, final DirectDepositFormDuxo2 directDepositFormDuxo2) {
        directDepositFormDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.deeplink.DirectDepositFormDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectDepositFormDuxo.startDownload$lambda$1$lambda$0(directDepositFormDuxo2, (DirectDepositFormDuxo2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectDepositFormDuxo2 startDownload$lambda$1$lambda$0(DirectDepositFormDuxo2 directDepositFormDuxo2, DirectDepositFormDuxo2 applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(directDepositFormDuxo2);
        return directDepositFormDuxo2;
    }

    private final Single<File> downloadForm(UUID documentId, boolean isSpendingAccount, final Context context) {
        final File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "robinhood_direct_deposit_form.pdf");
        Single<File> singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new C140661(documentId, isSpendingAccount, null), 1, null).flatMap(new Function() { // from class: com.robinhood.android.directdeposit.ui.deeplink.DirectDepositFormDuxo.downloadForm.2
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends File> apply(HttpUrl url) {
                Intrinsics.checkNotNullParameter(url, "url");
                File file2 = file;
                Context context2 = context;
                if (file2.exists()) {
                    file2.delete();
                }
                return Single.create(new DownloadManagerOnSubscribe(context2, url, file2, false, 8, null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    /* compiled from: DirectDepositFormDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lokhttp3/HttpUrl;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.directdeposit.ui.deeplink.DirectDepositFormDuxo$downloadForm$1", m3645f = "DirectDepositFormDuxo.kt", m3646l = {101}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.directdeposit.ui.deeplink.DirectDepositFormDuxo$downloadForm$1 */
    static final class C140661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super HttpUrl>, Object> {
        final /* synthetic */ UUID $documentId;
        final /* synthetic */ boolean $isSpendingAccount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C140661(UUID uuid, boolean z, Continuation<? super C140661> continuation) {
            super(2, continuation);
            this.$documentId = uuid;
            this.$isSpendingAccount = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DirectDepositFormDuxo.this.new C140661(this.$documentId, this.$isSpendingAccount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpUrl> continuation) {
            return ((C140661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            DocumentStore documentStore = DirectDepositFormDuxo.this.documentStore;
            UUID uuid = this.$documentId;
            boolean z = this.$isSpendingAccount;
            this.label = 1;
            Object directDepositFormDownloadUrl = documentStore.getDirectDepositFormDownloadUrl(uuid, z, this);
            return directDepositFormDownloadUrl == coroutine_suspended ? coroutine_suspended : directDepositFormDownloadUrl;
        }
    }
}
