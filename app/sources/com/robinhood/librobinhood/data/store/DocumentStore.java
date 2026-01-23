package com.robinhood.librobinhood.data.store;

import androidx.room.RoomDatabase;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.documents.models.ApiIndividualDocument;
import com.robinhood.android.documents.models.ApiIraDocument;
import com.robinhood.android.documents.models.ApiManagedDocument;
import com.robinhood.android.documents.models.ApiRhcDocument;
import com.robinhood.android.documents.models.ApiRhdDocument;
import com.robinhood.android.documents.models.ApiRhyDocument;
import com.robinhood.android.documents.models.DocumentsBrokebackApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.api.PaginatedEndpoint;
import com.robinhood.api.PaginatedEndpointKt;
import com.robinhood.api.utils.NetworkRefreshPaginated;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.librobinhood.data.store.DocumentStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiDocument;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.dao.DocumentDao;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Document;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.security.auth.token.AuthTokenManager;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import com.robinhood.utils.http.Headers;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import p479j$.time.LocalDate;
import timber.log.Timber;

/* compiled from: DocumentStore.kt */
@Metadata(m3635d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u0015*\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015H\u0002¢\u0006\u0004\b#\u0010\"J\u001b\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0*0&2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b+\u0010,J!\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0*0&2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b-\u0010,J\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020/0&2\u0006\u0010.\u001a\u00020'¢\u0006\u0004\b0\u00101J \u00104\u001a\u00020/2\u0006\u0010\u0016\u001a\u00020$2\u0006\u00103\u001a\u000202H\u0086@¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\u001b2\u0006\u00106\u001a\u0002022\b\b\u0002\u00107\u001a\u000202¢\u0006\u0004\b8\u00109J\u0015\u0010:\u001a\u00020\u001b2\u0006\u00106\u001a\u000202¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u001b2\b\b\u0002\u00107\u001a\u000202¢\u0006\u0004\b<\u0010;J\u0017\u0010=\u001a\u00020\u001b2\b\b\u0002\u00106\u001a\u000202¢\u0006\u0004\b=\u0010;J\u0017\u0010>\u001a\u00020\u001b2\b\b\u0002\u00106\u001a\u000202¢\u0006\u0004\b>\u0010;J\u0017\u0010?\u001a\u00020\u001b2\b\b\u0002\u00106\u001a\u000202¢\u0006\u0004\b?\u0010;J\u0017\u0010@\u001a\u00020\u001b2\b\b\u0002\u00107\u001a\u000202¢\u0006\u0004\b@\u0010;J)\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0*0&2\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010ER\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010FR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010GR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010HR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010IR&\u0010M\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020L0K\u0012\u0004\u0012\u00020\u001b0J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR \u0010P\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020L0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR \u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020S0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR \u0010X\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020W0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010UR \u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020Y0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010UR \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020[0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010UR \u0010\\\u001a\u000e\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020Y0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010UR \u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020L0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010UR \u0010^\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020L0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010UR \u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020_0R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010UR&\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020a0R8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bb\u0010U\u0012\u0004\bc\u0010dR \u0010f\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020'0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010g¨\u0006h"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/DocumentStore;", "Lcom/robinhood/store/Store;", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/documents/models/DocumentsBrokebackApi;", "brokeback", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "authTokenManager", "Lcom/robinhood/store/StoreBundle;", "storeBundle", "Lcom/robinhood/models/dao/DocumentDao;", "dao", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/documents/models/DocumentsBrokebackApi;Lokhttp3/OkHttpClient;Lcom/robinhood/shared/security/auth/token/AuthTokenManager;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/DocumentDao;)V", "Lretrofit2/Response;", "", "documentId", "requireRedirectUrl", "(Lretrofit2/Response;Ljava/lang/String;)Ljava/lang/String;", "Lcom/robinhood/models/db/Document$Category;", RhGcmListenerService.EXTRA_CATEGORY, "", "refreshManagedDocuments", "(Lcom/robinhood/models/db/Document$Category;)V", "j$/time/LocalDate", InquiryField.DateField.TYPE, "accountNumber", "refreshIraConfirms", "(Lj$/time/LocalDate;Ljava/lang/String;)V", "refreshV2IndividualTradeConfirms", "Ljava/util/UUID;", "id", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/Document;", "getDocument", "(Ljava/util/UUID;)Lio/reactivex/Observable;", "", "getSelfDirectedDocuments", "(Lcom/robinhood/models/db/Document$Category;)Lio/reactivex/Observable;", "getManagedDocuments", "document", "Lokhttp3/HttpUrl;", "getDocumentDownloadUrl", "(Lcom/robinhood/models/db/Document;)Lio/reactivex/Observable;", "", "isSpendingAccount", "getDirectDepositFormDownloadUrl", "(Ljava/util/UUID;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "force", "includeManaged", "refreshIndividualDocuments", "(ZZ)V", "refreshRhyDocuments", "(Z)V", "refreshIraDocuments", "refreshRhcDocuments", "refreshRhdDailyStatements", "refreshRhdMonthlyStatements", "refreshJointAccountStatements", "getTradeConfirms", "(Ljava/lang/String;Lj$/time/LocalDate;)Lio/reactivex/Observable;", "Lcom/robinhood/shared/app/type/AppType;", "Lcom/robinhood/shared/store/user/UserStore;", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/android/documents/models/DocumentsBrokebackApi;", "Lokhttp3/OkHttpClient;", "Lcom/robinhood/shared/security/auth/token/AuthTokenManager;", "Lcom/robinhood/models/dao/DocumentDao;", "Lkotlin/Function1;", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiDocument;", "saveAction", "Lkotlin/jvm/functions/Function1;", "Lcom/robinhood/android/moria/network/Endpoint;", "documentEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/android/documents/models/ApiRhyDocument;", "getRhyDocuments", "Lcom/robinhood/api/PaginatedEndpoint;", "Lcom/robinhood/librobinhood/data/store/EdocsV2Params;", "Lcom/robinhood/android/documents/models/ApiIndividualDocument;", "getV2IndividualTradeConfirms", "Lcom/robinhood/android/documents/models/ApiIraDocument;", "getSelfDirectedIraDocuments", "Lcom/robinhood/android/documents/models/ApiManagedDocument;", "getIraTradeConfirms", "getJointAccountStatements", "getJointAccountTradeConfirms", "Lcom/robinhood/android/documents/models/ApiRhcDocument;", "getRhcDocuments", "Lcom/robinhood/android/documents/models/ApiRhdDocument;", "getRhdDocuments", "getGetRhdDocuments$annotations", "()V", "Lcom/robinhood/android/moria/db/Query;", "documentQuery", "Lcom/robinhood/android/moria/db/Query;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class DocumentStore extends Store {
    private final AccountProvider accountProvider;
    private final AppType appType;
    private final AuthTokenManager authTokenManager;
    private final DocumentsBrokebackApi brokeback;
    private final DocumentDao dao;
    private final Endpoint<UUID, ApiDocument> documentEndpoint;
    private final Query<UUID, Document> documentQuery;
    private final PaginatedEndpoint<EdocsV2Params, ApiIraDocument> getIraTradeConfirms;
    private final PaginatedEndpoint<Unit, ApiDocument> getJointAccountStatements;
    private final PaginatedEndpoint<LocalDate, ApiDocument> getJointAccountTradeConfirms;
    private final PaginatedEndpoint<Document.Category, ApiManagedDocument> getManagedDocuments;
    private final PaginatedEndpoint<Unit, ApiRhcDocument> getRhcDocuments;
    private final PaginatedEndpoint<Document.Category, ApiRhdDocument> getRhdDocuments;
    private final PaginatedEndpoint<Unit, ApiRhyDocument> getRhyDocuments;
    private final PaginatedEndpoint<Unit, ApiIraDocument> getSelfDirectedIraDocuments;
    private final PaginatedEndpoint<EdocsV2Params, ApiIndividualDocument> getV2IndividualTradeConfirms;
    private final OkHttpClient okHttpClient;
    private final Function1<PaginatedResult<ApiDocument>, Unit> saveAction;
    private final UserStore userStore;

    /* compiled from: DocumentStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Document.Category.values().length];
            try {
                iArr[Document.Category.ACCOUNT_STATEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Document.Category.IRA_STATEMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Document.Category.JOINT_ACCOUNT_STATEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Document.Category.RHY_ACCOUNT_STATEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Document.Category.IRA_TRADE_CONFIRM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Document.Category.MANAGED_INDIVIDUAL_STATEMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Document.Category.MANAGED_IRA_STATEMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Document.Category.MANAGED_JOINT_STATEMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Document.Category.RHC_STATEMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Document.Category.RHC_EU_STATEMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Document.Category.ACCOUNT_ACTIVITY_REPORT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Document.Category.RHD_DAILY_STATEMENT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Document.Category.RHD_MONTHLY_STATEMENT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Document.Category.TAX.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Document.Category.JOINT_TRADE_CONFIRM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Document.Category.TRADE_CONFIRM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Document.Category.ADHOC_DOCUMENT_UPLOAD.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: DocumentStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DocumentStore", m3645f = "DocumentStore.kt", m3646l = {348, 350}, m3647m = "getDirectDepositFormDownloadUrl")
    /* renamed from: com.robinhood.librobinhood.data.store.DocumentStore$getDirectDepositFormDownloadUrl$1 */
    static final class C338071 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C338071(Continuation<? super C338071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DocumentStore.this.getDirectDepositFormDownloadUrl(null, false, this);
        }
    }

    private static /* synthetic */ void getGetRhdDocuments$annotations() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DocumentStore(AppType appType, UserStore userStore, AccountProvider accountProvider, DocumentsBrokebackApi brokeback, OkHttpClient okHttpClient, AuthTokenManager authTokenManager, StoreBundle storeBundle, final DocumentDao dao) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Document.Companion companion = Document.INSTANCE;
        super(storeBundle, companion);
        this.appType = appType;
        this.userStore = userStore;
        this.accountProvider = accountProvider;
        this.brokeback = brokeback;
        this.okHttpClient = okHttpClient;
        this.authTokenManager = authTokenManager;
        this.dao = dao;
        final LogoutKillswitch logoutKillswitch = ((Store) this).logoutKillswitch;
        final RoomDatabase roomDatabase = ((Store) this).roomDatabase;
        this.saveAction = new Function1<PaginatedResult<? extends ApiDocument>, Unit>() { // from class: com.robinhood.librobinhood.data.store.DocumentStore$special$$inlined$safeSave$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PaginatedResult<? extends ApiDocument> paginatedResult) {
                m22642invoke(paginatedResult);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22642invoke(PaginatedResult<? extends ApiDocument> paginatedResult) {
                if (!logoutKillswitch.isLoggedOut()) {
                    try {
                        dao.insert(paginatedResult);
                        return;
                    } catch (IllegalStateException e) {
                        if (logoutKillswitch.isLoggedOut()) {
                            Timber.INSTANCE.mo3355e(e, "Ignoring exception due to logout.", new Object[0]);
                            try {
                                roomDatabase.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        throw e;
                    }
                }
                Timber.INSTANCE.mo3350d("Skipping save due to logout", new Object[0]);
            }
        };
        this.documentEndpoint = Endpoint.INSTANCE.create(new DocumentStore$documentEndpoint$1(brokeback), getLogoutKillswitch(), new DocumentStore$documentEndpoint$2(this, null), storeBundle.getClock(), new DefaultStaleDecider(companion.getNormalStaleTimeout(), storeBundle.getClock()));
        PaginatedEndpoint.Companion companion2 = PaginatedEndpoint.INSTANCE;
        this.getRhyDocuments = PaginatedEndpoint.Companion.create$default(companion2, new DocumentStore$getRhyDocuments$1(this, null), getLogoutKillswitch(), new DocumentStore$getRhyDocuments$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getV2IndividualTradeConfirms = PaginatedEndpoint.Companion.create$default(companion2, new DocumentStore$getV2IndividualTradeConfirms$1(this, null), getLogoutKillswitch(), new DocumentStore$getV2IndividualTradeConfirms$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getSelfDirectedIraDocuments = PaginatedEndpoint.Companion.create$default(companion2, new DocumentStore$getSelfDirectedIraDocuments$1(this, null), getLogoutKillswitch(), new DocumentStore$getSelfDirectedIraDocuments$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getManagedDocuments = PaginatedEndpoint.Companion.create$default(companion2, new C338111(null), getLogoutKillswitch(), new C338122(null), storeBundle.getClock(), null, 16, null);
        this.getIraTradeConfirms = PaginatedEndpoint.Companion.create$default(companion2, new DocumentStore$getIraTradeConfirms$1(this, null), getLogoutKillswitch(), new DocumentStore$getIraTradeConfirms$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getJointAccountStatements = PaginatedEndpoint.Companion.create$default(companion2, new DocumentStore$getJointAccountStatements$1(this, null), getLogoutKillswitch(), new DocumentStore$getJointAccountStatements$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getJointAccountTradeConfirms = PaginatedEndpoint.Companion.create$default(companion2, new DocumentStore$getJointAccountTradeConfirms$1(this, null), getLogoutKillswitch(), new DocumentStore$getJointAccountTradeConfirms$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getRhcDocuments = PaginatedEndpoint.Companion.create$default(companion2, new DocumentStore$getRhcDocuments$1(this, null), getLogoutKillswitch(), new DocumentStore$getRhcDocuments$2(this, null), storeBundle.getClock(), null, 16, null);
        this.getRhdDocuments = PaginatedEndpoint.Companion.create$default(companion2, new DocumentStore$getRhdDocuments$1(this, null), getLogoutKillswitch(), new DocumentStore$getRhdDocuments$2(dao), storeBundle.getClock(), null, 16, null);
        this.documentQuery = Store.create$default(this, Query.INSTANCE, "queryDocument", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.DocumentStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocumentStore.documentQuery$lambda$0(this.f$0, (UUID) obj);
            }
        })), new DocumentStore$documentQuery$2(dao), false, 8, null);
    }

    /* compiled from: DocumentStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/documents/models/ApiManagedDocument;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/models/db/Document$Category;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DocumentStore$getManagedDocuments$1", m3645f = "DocumentStore.kt", m3646l = {110}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.DocumentStore$getManagedDocuments$1 */
    static final class C338111 extends ContinuationImpl7 implements Function2<Tuples2<? extends Document.Category, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiManagedDocument>>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C338111(Continuation<? super C338111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C338111 c338111 = DocumentStore.this.new C338111(continuation);
            c338111.L$0 = obj;
            return c338111;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Document.Category, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiManagedDocument>> continuation) {
            return invoke2((Tuples2<? extends Document.Category, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiManagedDocument>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<? extends Document.Category, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiManagedDocument>> continuation) {
            return ((C338111) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Document.Category category = (Document.Category) ((Tuples2) this.L$0).component1();
            DocumentsBrokebackApi documentsBrokebackApi = DocumentStore.this.brokeback;
            this.label = 1;
            Object managedDocuments$default = DocumentsBrokebackApi.DefaultImpls.getManagedDocuments$default(documentsBrokebackApi, category, null, null, null, this, 14, null);
            return managedDocuments$default == coroutine_suspended ? coroutine_suspended : managedDocuments$default;
        }
    }

    /* compiled from: DocumentStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "page", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/documents/models/ApiManagedDocument;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DocumentStore$getManagedDocuments$2", m3645f = "DocumentStore.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.DocumentStore$getManagedDocuments$2 */
    static final class C338122 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiManagedDocument>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C338122(Continuation<? super C338122> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C338122 c338122 = DocumentStore.this.new C338122(continuation);
            c338122.L$0 = obj;
            return c338122;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(PaginatedResult<ApiManagedDocument> paginatedResult, Continuation<? super Unit> continuation) {
            return ((C338122) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiManagedDocument> paginatedResult, Continuation<? super Unit> continuation) {
            return invoke2((PaginatedResult<ApiManagedDocument>) paginatedResult, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                DocumentStore.this.dao.insertManagedStatements((PaginatedResult) this.L$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getRhdDocuments$insertRhdStatements(DocumentDao documentDao, PaginatedResult paginatedResult, Continuation continuation) {
        documentDao.insertRhdStatements(paginatedResult);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow documentQuery$lambda$0(DocumentStore documentStore, UUID documentId) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        return Endpoint.DefaultImpls.poll$default(documentStore.documentEndpoint, documentId, Document.INSTANCE.getNormalStaleTimeout(), null, 4, null);
    }

    public final Observable<Document> getDocument(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.documentQuery.asObservable(id);
    }

    public final Observable<List<Document>> getSelfDirectedDocuments(Document.Category category) {
        Intrinsics.checkNotNullParameter(category, "category");
        return asObservable(takeWhileLoggedIn(this.dao.getDocuments(category)));
    }

    public final Observable<List<Document>> getManagedDocuments(Document.Category category) {
        Intrinsics.checkNotNullParameter(category, "category");
        int i = WhenMappings.$EnumSwitchMapping$0[category.ordinal()];
        if (i == 1) {
            category = Document.Category.MANAGED_INDIVIDUAL_STATEMENT;
        } else if (i == 2) {
            category = Document.Category.MANAGED_IRA_STATEMENT;
        } else if (i == 3) {
            category = Document.Category.MANAGED_JOINT_STATEMENT;
        }
        return asObservable(takeWhileLoggedIn(this.dao.getDocuments(category)));
    }

    public final Observable<HttpUrl> getDocumentDownloadUrl(final Document document) {
        Single singleFlatMap;
        Intrinsics.checkNotNullParameter(document, "document");
        final String id = document.getId();
        switch (WhenMappings.$EnumSwitchMapping$0[document.getCategory().ordinal()]) {
            case 1:
            case 3:
            case 15:
            case 16:
                UserStore.refresh$default(this.userStore, false, 1, null);
                singleFlatMap = this.userStore.getUser().firstOrError().flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.DocumentStore$getDocumentDownloadUrl$request$9

                    /* compiled from: DocumentStore.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiDocument$DownloadResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DocumentStore$getDocumentDownloadUrl$request$9$1", m3645f = "DocumentStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.librobinhood.data.store.DocumentStore$getDocumentDownloadUrl$request$9$1 */
                    static final class C338091 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiDocument.DownloadResponse>, Object> {
                        final /* synthetic */ String $id;
                        int label;
                        final /* synthetic */ DocumentStore this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C338091(DocumentStore documentStore, String str, Continuation<? super C338091> continuation) {
                            super(2, continuation);
                            this.this$0 = documentStore;
                            this.$id = str;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C338091(this.this$0, this.$id, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiDocument.DownloadResponse> continuation) {
                            return ((C338091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                            DocumentsBrokebackApi documentsBrokebackApi = this.this$0.brokeback;
                            String str = this.$id;
                            this.label = 1;
                            Object documentDownloadUrl = documentsBrokebackApi.getDocumentDownloadUrl(str, this);
                            return documentDownloadUrl == coroutine_suspended ? coroutine_suspended : documentDownloadUrl;
                        }
                    }

                    @Override // io.reactivex.functions.Function
                    public final SingleSource<? extends ApiDocument.DownloadResponse> apply(User it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (Intrinsics.areEqual(it.getOrigin().getLocality(), CountryCode.Supported.UnitedStates.INSTANCE)) {
                            DocumentStore documentStore = this.this$0;
                            return RxFactory.DefaultImpls.rxSingle$default(documentStore, null, new C338091(documentStore, id, null), 1, null);
                        }
                        DocumentStore documentStore2 = this.this$0;
                        return RxFactory.DefaultImpls.rxSingle$default(documentStore2, null, new C338102(documentStore2, document, null), 1, null);
                    }

                    /* compiled from: DocumentStore.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiDocument$DownloadResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DocumentStore$getDocumentDownloadUrl$request$9$2", m3645f = "DocumentStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
                    /* renamed from: com.robinhood.librobinhood.data.store.DocumentStore$getDocumentDownloadUrl$request$9$2 */
                    static final class C338102 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiDocument.DownloadResponse>, Object> {
                        final /* synthetic */ Document $document;
                        int label;
                        final /* synthetic */ DocumentStore this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C338102(DocumentStore documentStore, Document document, Continuation<? super C338102> continuation) {
                            super(2, continuation);
                            this.this$0 = documentStore;
                            this.$document = document;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C338102(this.this$0, this.$document, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiDocument.DownloadResponse> continuation) {
                            return ((C338102) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                            DocumentsBrokebackApi documentsBrokebackApi = this.this$0.brokeback;
                            Document.Category category = this.$document.getCategory();
                            String accountId = this.$document.getAccountId();
                            if (accountId == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            LocalDate date = this.$document.getDate();
                            Document.FileType filetype = this.$document.getFiletype();
                            this.label = 1;
                            Object individualDocumentDownloadUrl$default = DocumentsBrokebackApi.DefaultImpls.getIndividualDocumentDownloadUrl$default(documentsBrokebackApi, category, accountId, date, filetype, false, this, 16, null);
                            return individualDocumentDownloadUrl$default == coroutine_suspended ? coroutine_suspended : individualDocumentDownloadUrl$default;
                        }
                    }
                });
                Intrinsics.checkNotNull(singleFlatMap);
                break;
            case 2:
            case 5:
                singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new DocumentStore$getDocumentDownloadUrl$request$2(this, document, null), 1, null);
                break;
            case 4:
                singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new DocumentStore$getDocumentDownloadUrl$request$1(this, document, null), 1, null);
                break;
            case 6:
            case 7:
            case 8:
                singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new DocumentStore$getDocumentDownloadUrl$request$3(this, document, null), 1, null);
                break;
            case 9:
            case 10:
                singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new DocumentStore$getDocumentDownloadUrl$request$4(this, document, null), 1, null);
                break;
            case 11:
                singleFlatMap = Single.fromCallable(new Callable() { // from class: com.robinhood.librobinhood.data.store.DocumentStore$getDocumentDownloadUrl$request$5
                    @Override // java.util.concurrent.Callable
                    public final Response call() {
                        OkHttpClient okHttpClient = this.this$0.okHttpClient;
                        Request.Builder builder = new Request.Builder();
                        String authorizationHeader = this.this$0.authTokenManager.getAuthorizationHeader();
                        if (authorizationHeader == null) {
                            authorizationHeader = "";
                        }
                        return okHttpClient.newCall(builder.header("Authorization", authorizationHeader).url(document.getId()).build()).execute();
                    }
                }).map(new Function() { // from class: com.robinhood.librobinhood.data.store.DocumentStore$getDocumentDownloadUrl$request$6
                    @Override // io.reactivex.functions.Function
                    public final ApiDocument.DownloadResponse apply(Response it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        String strHeader$default = Response.header$default(it, Headers.LOCATION, null, 2, null);
                        if (strHeader$default == null) {
                            strHeader$default = "";
                        }
                        return new ApiDocument.DownloadResponse(strHeader$default);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(singleFlatMap, "map(...)");
                break;
            case 12:
            case 13:
                singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new DocumentStore$getDocumentDownloadUrl$request$7(this, document, null), 1, null);
                break;
            case 14:
                singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new DocumentStore$getDocumentDownloadUrl$request$8(this, id, null), 1, null);
                break;
            case 17:
                singleFlatMap = RxFactory.DefaultImpls.rxSingle$default(this, null, new DocumentStore$getDocumentDownloadUrl$request$10(this, document, null), 1, null);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Observable<HttpUrl> observable = singleFlatMap.map(new Function() { // from class: com.robinhood.librobinhood.data.store.DocumentStore.getDocumentDownloadUrl.1
            @Override // io.reactivex.functions.Function
            public final HttpUrl apply(ApiDocument.DownloadResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return DocumentStoreKt.getDownloadUrl(it, id);
            }
        }).subscribeOn(Schedulers.m3346io()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String requireRedirectUrl(retrofit2.Response<?> response, String str) {
        int iCode = response.code();
        if (DocumentStoreKt.isRedirect(iCode)) {
            String str2 = response.headers().get(Headers.LOCATION);
            if (str2 != null) {
                return str2;
            }
            throw new IllegalStateException(("Redirect (" + iCode + ") without Location for " + str).toString());
        }
        throw new IllegalStateException(("Expected redirect, got " + iCode + " for " + str).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDirectDepositFormDownloadUrl(UUID uuid, boolean z, Continuation<? super HttpUrl> continuation) {
        C338071 c338071;
        String string2;
        ApiDocument.DownloadResponse downloadResponse;
        if (continuation instanceof C338071) {
            c338071 = (C338071) continuation;
            int i = c338071.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c338071.label = i - Integer.MIN_VALUE;
            } else {
                c338071 = new C338071(continuation);
            }
        }
        Object directDepositFormDownloadUrl = c338071.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c338071.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(directDepositFormDownloadUrl);
            string2 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            if (z) {
                DocumentsBrokebackApi documentsBrokebackApi = this.brokeback;
                c338071.L$0 = string2;
                c338071.label = 1;
                directDepositFormDownloadUrl = documentsBrokebackApi.getRhyDirectDepositFormDownloadUrl(string2, c338071);
            } else {
                DocumentsBrokebackApi documentsBrokebackApi2 = this.brokeback;
                c338071.L$0 = string2;
                c338071.label = 2;
                directDepositFormDownloadUrl = documentsBrokebackApi2.getDirectDepositFormDownloadUrl(string2, c338071);
            }
            return coroutine_suspended;
        }
        if (i2 == 1) {
            string2 = (String) c338071.L$0;
            ResultKt.throwOnFailure(directDepositFormDownloadUrl);
            downloadResponse = (ApiDocument.DownloadResponse) directDepositFormDownloadUrl;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            string2 = (String) c338071.L$0;
            ResultKt.throwOnFailure(directDepositFormDownloadUrl);
            downloadResponse = (ApiDocument.DownloadResponse) directDepositFormDownloadUrl;
        }
        return DocumentStoreKt.getDownloadUrl(downloadResponse, string2);
    }

    public static /* synthetic */ void refreshIndividualDocuments$default(DocumentStore documentStore, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        documentStore.refreshIndividualDocuments(z, z2);
    }

    public final void refreshIndividualDocuments(boolean force, boolean includeManaged) {
        UserStore.refresh$default(this.userStore, false, 1, null);
        Maybe<R> maybeFlatMapMaybe = this.userStore.getUser().firstOrError().flatMapMaybe(new C338141(force));
        Intrinsics.checkNotNullExpressionValue(maybeFlatMapMaybe, "flatMapMaybe(...)");
        ScopedSubscriptionKt.subscribeIn(maybeFlatMapMaybe, getStoreScope());
        if (includeManaged) {
            refreshManagedDocuments(Document.Category.MANAGED_INDIVIDUAL_STATEMENT);
        }
    }

    /* compiled from: DocumentStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.librobinhood.data.store.DocumentStore$refreshIndividualDocuments$1 */
    static final class C338141<T, R> implements Function {
        final /* synthetic */ boolean $force;

        C338141(boolean z) {
            this.$force = z;
        }

        @Override // io.reactivex.functions.Function
        public final MaybeSource<? extends PaginatedResult<Object>> apply(User user) {
            NetworkRefreshPaginated<T> networkRefreshPaginatedSaveAction;
            Intrinsics.checkNotNullParameter(user, "user");
            if (Intrinsics.areEqual(user.getOrigin().getLocality(), CountryCode.Supported.UnitedStates.INSTANCE)) {
                final DocumentStore documentStore = DocumentStore.this;
                networkRefreshPaginatedSaveAction = documentStore.refreshPaginated(new Function1() { // from class: com.robinhood.librobinhood.data.store.DocumentStore$refreshIndividualDocuments$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DocumentStore.C338141.apply$lambda$0(documentStore, (String) obj);
                    }
                }).saveAction(DocumentStore.this.saveAction);
            } else {
                final DocumentStore documentStore2 = DocumentStore.this;
                NetworkRefreshPaginated networkRefreshPaginatedRefreshPaginated = documentStore2.refreshPaginated(new Function1() { // from class: com.robinhood.librobinhood.data.store.DocumentStore$refreshIndividualDocuments$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DocumentStore.C338141.apply$lambda$1(documentStore2, (String) obj);
                    }
                });
                final DocumentStore documentStore3 = DocumentStore.this;
                networkRefreshPaginatedSaveAction = networkRefreshPaginatedRefreshPaginated.saveAction(new Function1() { // from class: com.robinhood.librobinhood.data.store.DocumentStore$refreshIndividualDocuments$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DocumentStore.C338141.apply$lambda$2(documentStore3, (PaginatedResult) obj);
                    }
                });
            }
            return networkRefreshPaginatedSaveAction.force(this.$force).toMaybe(DocumentStore.this.getNetworkWrapper());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Single apply$lambda$0(DocumentStore documentStore, String str) {
            return RxFactory.DefaultImpls.rxSingle$default(documentStore, null, new DocumentStore$refreshIndividualDocuments$1$refresh$1$1(documentStore, str, null), 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Single apply$lambda$1(DocumentStore documentStore, String str) {
            return RxFactory.DefaultImpls.rxSingle$default(documentStore, null, new DocumentStore$refreshIndividualDocuments$1$refresh$2$1(documentStore, str, null), 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit apply$lambda$2(DocumentStore documentStore, PaginatedResult page) {
            Intrinsics.checkNotNullParameter(page, "page");
            documentStore.dao.insertIndividualStatements(page);
            return Unit.INSTANCE;
        }
    }

    public final void refreshRhyDocuments(boolean force) {
        PaginatedEndpointKt.refreshAllPages(this.getRhyDocuments, force);
    }

    public static /* synthetic */ void refreshIraDocuments$default(DocumentStore documentStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        documentStore.refreshIraDocuments(z);
    }

    public final void refreshIraDocuments(boolean includeManaged) {
        PaginatedEndpointKt.refreshAllPages(this.getSelfDirectedIraDocuments, false);
        if (includeManaged) {
            refreshManagedDocuments(Document.Category.MANAGED_IRA_STATEMENT);
        }
    }

    private final void refreshManagedDocuments(Document.Category category) {
        PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.getManagedDocuments, category, false, 2, null);
    }

    public static /* synthetic */ void refreshRhcDocuments$default(DocumentStore documentStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        documentStore.refreshRhcDocuments(z);
    }

    public final void refreshRhcDocuments(boolean force) {
        PaginatedEndpointKt.refreshAllPages(this.getRhcDocuments, force);
    }

    public static /* synthetic */ void refreshRhdDailyStatements$default(DocumentStore documentStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        documentStore.refreshRhdDailyStatements(z);
    }

    public final void refreshRhdDailyStatements(boolean force) {
        this.getRhdDocuments.refreshAllPages(Document.Category.RHD_DAILY_STATEMENT, force);
    }

    public static /* synthetic */ void refreshRhdMonthlyStatements$default(DocumentStore documentStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        documentStore.refreshRhdMonthlyStatements(z);
    }

    public final void refreshRhdMonthlyStatements(boolean force) {
        this.getRhdDocuments.refreshAllPages(Document.Category.RHD_MONTHLY_STATEMENT, force);
    }

    public static /* synthetic */ void refreshJointAccountStatements$default(DocumentStore documentStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        documentStore.refreshJointAccountStatements(z);
    }

    public final void refreshJointAccountStatements(boolean includeManaged) {
        PaginatedEndpointKt.refreshAllPages$default(this.getJointAccountStatements, false, 1, null);
        if (includeManaged) {
            refreshManagedDocuments(Document.Category.MANAGED_JOINT_STATEMENT);
        }
    }

    public final Observable<List<Document>> getTradeConfirms(final String accountNumber, final LocalDate date) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(date, "date");
        Observable observableSwitchMap = this.accountProvider.streamAccount(accountNumber).switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.DocumentStore.getTradeConfirms.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<Document>> apply(Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                if (account.getBrokerageAccountType().isRetirement()) {
                    DocumentStore.this.refreshIraConfirms(date, accountNumber);
                    return DocumentStore.this.getSelfDirectedDocuments(Document.Category.IRA_TRADE_CONFIRM);
                }
                if (account.getBrokerageAccountType() == BrokerageAccountType.JOINT_TENANCY_WITH_ROS) {
                    PaginatedEndpoint.DefaultImpls.refreshAllPages$default(DocumentStore.this.getJointAccountTradeConfirms, date, false, 2, null);
                    return DocumentStore.this.getSelfDirectedDocuments(Document.Category.JOINT_TRADE_CONFIRM);
                }
                UserStore.refresh$default(DocumentStore.this.userStore, false, 1, null);
                Observable<User> user = DocumentStore.this.userStore.getUser();
                final DocumentStore documentStore = DocumentStore.this;
                final LocalDate localDate = date;
                final String str = accountNumber;
                return user.switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.DocumentStore.getTradeConfirms.1.1
                    @Override // io.reactivex.functions.Function
                    public final ObservableSource<? extends List<Document>> apply(User user2) {
                        Intrinsics.checkNotNullParameter(user2, "user");
                        if (Intrinsics.areEqual(user2.getOrigin().getLocality(), CountryCode.Supported.UnitedStates.INSTANCE)) {
                            DocumentStore.refreshIndividualDocuments$default(documentStore, false, false, 2, null);
                        } else {
                            documentStore.refreshV2IndividualTradeConfirms(localDate, str);
                        }
                        return documentStore.getSelfDirectedDocuments(Document.Category.TRADE_CONFIRM);
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshIraConfirms(LocalDate date, String accountNumber) {
        PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.getIraTradeConfirms, new EdocsV2Params(date, accountNumber), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshV2IndividualTradeConfirms(LocalDate date, String accountNumber) {
        PaginatedEndpoint.DefaultImpls.refreshAllPages$default(this.getV2IndividualTradeConfirms, new EdocsV2Params(date, accountNumber), false, 2, null);
    }
}
