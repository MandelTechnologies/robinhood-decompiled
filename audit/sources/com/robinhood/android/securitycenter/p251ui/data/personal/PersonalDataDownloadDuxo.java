package com.robinhood.android.securitycenter.p251ui.data.personal;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import com.robinhood.android.challenge.ChallengeResponseActivity;
import com.robinhood.android.securitycenter.p251ui.data.personal.PersonalDataDownloadDuxo;
import com.robinhood.android.securitycenter.p251ui.data.personal.PersonalDataDownloadViewState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.pims.PimsStore;
import com.robinhood.models.api.ApiDocument;
import com.robinhood.models.api.ChallengeErrorResponse;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.p408rx.DownloadManagerOnSubscribe;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.File;
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
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;

/* compiled from: PersonalDataDownloadDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/securitycenter/ui/data/personal/PersonalDataDownloadViewState;", "app", "Landroid/app/Application;", "pimsStore", "Lcom/robinhood/librobinhood/data/store/pims/PimsStore;", "<init>", "(Landroid/app/Application;Lcom/robinhood/librobinhood/data/store/pims/PimsStore;)V", "destinationFile", "Ljava/io/File;", "getDestinationFile", "()Ljava/io/File;", "fetchDownloadFiles", "", "requestId", "Ljava/util/UUID;", ChallengeResponseActivity.EXTRA_CHALLENGE_ID, "Companion", "feature-security-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class PersonalDataDownloadDuxo extends OldBaseDuxo<PersonalDataDownloadViewState> {
    private static final String DOWNLOAD_FILE_NAME = "personal_data.zip";
    private final Application app;
    private final PimsStore pimsStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PersonalDataDownloadDuxo(Application app, PimsStore pimsStore) {
        super(PersonalDataDownloadViewState.Default.INSTANCE, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(pimsStore, "pimsStore");
        this.app = app;
        this.pimsStore = pimsStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getDestinationFile() {
        return new File(this.app.getApplicationContext().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), DOWNLOAD_FILE_NAME);
    }

    /* compiled from: PersonalDataDownloadDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lokhttp3/HttpUrl;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDownloadDuxo$fetchDownloadFiles$1", m3645f = "PersonalDataDownloadDuxo.kt", m3646l = {29}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDownloadDuxo$fetchDownloadFiles$1 */
    static final class C282181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super HttpUrl>, Object> {
        final /* synthetic */ UUID $challengeId;
        final /* synthetic */ UUID $requestId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C282181(UUID uuid, UUID uuid2, Continuation<? super C282181> continuation) {
            super(2, continuation);
            this.$requestId = uuid;
            this.$challengeId = uuid2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PersonalDataDownloadDuxo.this.new C282181(this.$requestId, this.$challengeId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpUrl> continuation) {
            return ((C282181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            HttpUrl.Companion companion;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HttpUrl.Companion companion2 = HttpUrl.INSTANCE;
                PimsStore pimsStore = PersonalDataDownloadDuxo.this.pimsStore;
                UUID uuid = this.$requestId;
                UUID uuid2 = this.$challengeId;
                this.L$0 = companion2;
                this.label = 1;
                Object dataAccessFiles = pimsStore.getDataAccessFiles(uuid, uuid2, this);
                if (dataAccessFiles == coroutine_suspended) {
                    return coroutine_suspended;
                }
                companion = companion2;
                obj = dataAccessFiles;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                companion = (HttpUrl.Companion) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return companion.get(((ApiDocument.DownloadResponse) obj).getDownload_url());
        }
    }

    public final void fetchDownloadFiles(UUID requestId, UUID challengeId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Single singleOnErrorReturn = RxFactory.DefaultImpls.rxSingle$default(this, null, new C282181(requestId, challengeId, null), 1, null).doOnSubscribe(new C282192()).flatMap(new Function() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDownloadDuxo.fetchDownloadFiles.3
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends File> apply(HttpUrl downloadUrl) {
                Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
                Context applicationContext = PersonalDataDownloadDuxo.this.app.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                return Single.create(new DownloadManagerOnSubscribe(applicationContext, downloadUrl, PersonalDataDownloadDuxo.this.getDestinationFile(), false, 8, null));
            }
        }).map(new Function() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDownloadDuxo.fetchDownloadFiles.4
            @Override // io.reactivex.functions.Function
            public final PersonalDataDownloadViewState apply(File it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new PersonalDataDownloadViewState.Success(new UiEvent(it));
            }
        }).onErrorReturn(new Function() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDownloadDuxo.fetchDownloadFiles.5
            @Override // io.reactivex.functions.Function
            public final PersonalDataDownloadViewState apply(Throwable e) {
                Intrinsics.checkNotNullParameter(e, "e");
                ErrorResponse errorResponseExtractErrorResponse = NetworkThrowables.extractErrorResponse(e);
                if (errorResponseExtractErrorResponse instanceof ChallengeErrorResponse) {
                    return new PersonalDataDownloadViewState.ChallengeReceived(((ChallengeErrorResponse) errorResponseExtractErrorResponse).getChallenge());
                }
                return PersonalDataDownloadViewState.Error.INSTANCE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleOnErrorReturn, "onErrorReturn(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleOnErrorReturn, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDownloadDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalDataDownloadDuxo.fetchDownloadFiles$lambda$1(this.f$0, (PersonalDataDownloadViewState) obj);
            }
        });
    }

    /* compiled from: PersonalDataDownloadDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDownloadDuxo$fetchDownloadFiles$2 */
    static final class C282192<T> implements Consumer {
        C282192() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PersonalDataDownloadViewState accept$lambda$0(PersonalDataDownloadViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return PersonalDataDownloadViewState.Loading.INSTANCE;
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            PersonalDataDownloadDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDownloadDuxo$fetchDownloadFiles$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PersonalDataDownloadDuxo.C282192.accept$lambda$0((PersonalDataDownloadViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchDownloadFiles$lambda$1(PersonalDataDownloadDuxo personalDataDownloadDuxo, final PersonalDataDownloadViewState personalDataDownloadViewState) {
        personalDataDownloadDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.securitycenter.ui.data.personal.PersonalDataDownloadDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PersonalDataDownloadDuxo.fetchDownloadFiles$lambda$1$lambda$0(personalDataDownloadViewState, (PersonalDataDownloadViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PersonalDataDownloadViewState fetchDownloadFiles$lambda$1$lambda$0(PersonalDataDownloadViewState personalDataDownloadViewState, PersonalDataDownloadViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(personalDataDownloadViewState);
        return personalDataDownloadViewState;
    }
}
