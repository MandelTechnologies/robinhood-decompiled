package com.robinhood.contentful.repository;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.ContentConfiguration;
import com.robinhood.contentful.api.S3ContentfulApi;
import com.robinhood.contentful.model.AssetDetail;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ContentResource;
import com.robinhood.contentful.model.ContentResource6;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.LinkMetadata;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.shared.i18n.locale.SupportedLocaleRepository;
import com.robinhood.utils.extensions.HttpUrl2;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import dispatch.core.Suspend;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.NoRouteToHostException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.ResponseBody;
import okio.BufferedSource;

/* compiled from: ApiContentRepository.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\u0013\u001a\u0002H\u0014\"\b\b\u0000\u0010\u0014*\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00140\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096@¢\u0006\u0002\u0010\u001bJ,\u0010\u001c\u001a\u00020\u00152\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0082@¢\u0006\u0002\u0010\u001bJ$\u0010\u001d\u001a\u00020\u001e2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096@¢\u0006\u0002\u0010!J$\u0010\"\u001a\u00020#2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096@¢\u0006\u0002\u0010!J\"\u0010$\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00140&H\u0082\b¢\u0006\u0002\u0010'R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012¨\u0006("}, m3636d2 = {"Lcom/robinhood/contentful/repository/ApiContentRepository;", "Lcom/robinhood/contentful/repository/ContentRepository;", "supportedLocaleRepository", "Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", "api", "Lcom/robinhood/contentful/api/S3ContentfulApi;", "connectivityManager", "Landroid/net/ConnectivityManager;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/contentful/ContentConfiguration;", "<init>", "(Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;Lcom/robinhood/contentful/api/S3ContentfulApi;Landroid/net/ConnectivityManager;Lcom/robinhood/contentful/ContentConfiguration;)V", "getSupportedLocaleRepository", "()Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", "spaceId", "", "isOnline", "", "()Z", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "T", "Lcom/robinhood/contentful/model/IdentifiableResource;", "type", "Lcom/robinhood/contentful/model/ContentResource$Type;", "id", "localeOverride", "Ljava/util/Locale;", "(Lcom/robinhood/contentful/model/ContentResource$Type;Ljava/lang/String;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadRaw", "open", "Lokio/BufferedSource;", "file", "Lcom/robinhood/contentful/model/AssetResource$File;", "(Lcom/robinhood/contentful/model/AssetResource$File;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUri", "Landroid/net/Uri;", "unwrapUndeclaredThrowable", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class ApiContentRepository implements ContentRepository {
    private final S3ContentfulApi api;
    private final ContentConfiguration configuration;
    private final ConnectivityManager connectivityManager;
    private final String spaceId;
    private final SupportedLocaleRepository supportedLocaleRepository;

    /* compiled from: ApiContentRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.ApiContentRepository", m3645f = "ApiContentRepository.kt", m3646l = {45}, m3647m = AnalyticsStrings.NOTIF_STACK_EVENT_LOAD)
    /* renamed from: com.robinhood.contentful.repository.ApiContentRepository$load$1 */
    static final class C327561<T extends ContentResource6> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C327561(Continuation<? super C327561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ApiContentRepository.this.load(null, null, null, this);
        }
    }

    /* compiled from: ApiContentRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.ApiContentRepository", m3645f = "ApiContentRepository.kt", m3646l = {55, 56}, m3647m = "loadRaw")
    /* renamed from: com.robinhood.contentful.repository.ApiContentRepository$loadRaw$1 */
    static final class C327571 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C327571(Continuation<? super C327571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ApiContentRepository.this.loadRaw(null, null, null, this);
        }
    }

    /* compiled from: ApiContentRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.ApiContentRepository", m3645f = "ApiContentRepository.kt", m3646l = {76}, m3647m = "open")
    /* renamed from: com.robinhood.contentful.repository.ApiContentRepository$open$1 */
    static final class C327591 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C327591(Continuation<? super C327591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ApiContentRepository.this.open(null, null, this);
        }
    }

    @Override // com.robinhood.contentful.repository.ContentRepository
    public <T extends ContentResource6> Object load(ResourceLink<T> resourceLink, Locale locale, Continuation<? super T> continuation) {
        return ContentRepository.DefaultImpls.load(this, resourceLink, locale, continuation);
    }

    @Override // com.robinhood.contentful.repository.ContentRepository
    public <T extends AssetDetail> Object loadAsset(String str, Locale locale, Continuation<? super AssetResource<T>> continuation) {
        return ContentRepository.DefaultImpls.loadAsset(this, str, locale, continuation);
    }

    @Override // com.robinhood.contentful.repository.ContentRepository
    public <T> Object loadEntry(String str, Locale locale, Continuation<? super EntryResource<T>> continuation) {
        return ContentRepository.DefaultImpls.loadEntry(this, str, locale, continuation);
    }

    public ApiContentRepository(SupportedLocaleRepository supportedLocaleRepository, S3ContentfulApi api, ConnectivityManager connectivityManager, ContentConfiguration configuration) {
        Intrinsics.checkNotNullParameter(supportedLocaleRepository, "supportedLocaleRepository");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.supportedLocaleRepository = supportedLocaleRepository;
        this.api = api;
        this.connectivityManager = connectivityManager;
        this.configuration = configuration;
        this.spaceId = configuration.getSpaceId();
    }

    @Override // com.robinhood.contentful.repository.ContentRepository
    public SupportedLocaleRepository getSupportedLocaleRepository() {
        return this.supportedLocaleRepository;
    }

    private final boolean isOnline() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.contentful.repository.ContentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T extends ContentResource6> Object load(ContentResource.Type<? super T> type2, String str, Locale locale, Continuation<? super T> continuation) {
        C327561 c327561;
        if (continuation instanceof C327561) {
            c327561 = (C327561) continuation;
            int i = c327561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327561.label = i - Integer.MIN_VALUE;
            } else {
                c327561 = new C327561(continuation);
            }
        }
        Object objLoadRaw = c327561.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c327561.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objLoadRaw);
                if (!isOnline()) {
                    throw new NoRouteToHostException("Device is offline");
                }
                c327561.label = 1;
                objLoadRaw = loadRaw(type2, str, locale, c327561);
                if (objLoadRaw == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objLoadRaw);
            }
            Intrinsics.checkNotNull(objLoadRaw, "null cannot be cast to non-null type T of com.robinhood.contentful.repository.ApiContentRepository.load");
            return (ContentResource6) objLoadRaw;
        } catch (UndeclaredThrowableException e) {
            Throwable cause = e.getCause();
            Intrinsics.checkNotNull(cause);
            throw cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadRaw(ContentResource.Type<?> type2, String str, Locale locale, Continuation<? super ContentResource6> continuation) {
        C327571 c327571;
        ContentResource.Type<?> type3;
        String str2;
        Locale locale2;
        Locale locale3;
        ContentResource.Type<?> type4;
        String str3;
        Locale locale4;
        if (continuation instanceof C327571) {
            c327571 = (C327571) continuation;
            int i = c327571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327571.label = i - Integer.MIN_VALUE;
            } else {
                c327571 = new C327571(continuation);
            }
        }
        C327571 c3275712 = c327571;
        Object locale5 = c3275712.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c3275712.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(locale5);
            if (locale == null) {
                Locale defaultLocale = this.configuration.getDefaultLocale();
                c3275712.L$0 = type2;
                c3275712.L$1 = str;
                c3275712.L$2 = locale;
                c3275712.label = 1;
                locale5 = ContentRepository2.getLocale(this, defaultLocale, c3275712);
                if (locale5 != coroutine_suspended) {
                    type4 = type2;
                    str3 = str;
                    locale4 = locale;
                }
            }
            type3 = type2;
            str2 = str;
            locale2 = locale;
            locale3 = locale2;
            C327582 c327582 = new C327582(type3, this, str2, locale2, locale3, null);
            c3275712.L$0 = null;
            c3275712.L$1 = null;
            c3275712.L$2 = null;
            c3275712.label = 2;
            Object objWithIO$default = Suspend.withIO$default(null, c327582, c3275712, 1, null);
            return objWithIO$default != coroutine_suspended ? coroutine_suspended : objWithIO$default;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(locale5);
            return locale5;
        }
        locale4 = (Locale) c3275712.L$2;
        String str4 = (String) c3275712.L$1;
        ContentResource.Type<?> type5 = (ContentResource.Type) c3275712.L$0;
        ResultKt.throwOnFailure(locale5);
        str3 = str4;
        type4 = type5;
        String str5 = str3;
        locale2 = (Locale) locale5;
        type3 = type4;
        str2 = str5;
        locale3 = locale4;
        C327582 c3275822 = new C327582(type3, this, str2, locale2, locale3, null);
        c3275712.L$0 = null;
        c3275712.L$1 = null;
        c3275712.L$2 = null;
        c3275712.label = 2;
        Object objWithIO$default2 = Suspend.withIO$default(null, c3275822, c3275712, 1, null);
        if (objWithIO$default2 != coroutine_suspended) {
        }
    }

    /* compiled from: ApiContentRepository.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/contentful/model/IdentifiableResource;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.ApiContentRepository$loadRaw$2", m3645f = "ApiContentRepository.kt", m3646l = {59, 60, 61, 63, 64}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.contentful.repository.ApiContentRepository$loadRaw$2 */
    static final class C327582 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ContentResource6>, Object> {
        final /* synthetic */ String $id;
        final /* synthetic */ Locale $locale;
        final /* synthetic */ Locale $localeOverride;
        final /* synthetic */ ContentResource.Type<?> $type;
        int label;
        final /* synthetic */ ApiContentRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C327582(ContentResource.Type<?> type2, ApiContentRepository apiContentRepository, String str, Locale locale, Locale locale2, Continuation<? super C327582> continuation) {
            super(2, continuation);
            this.$type = type2;
            this.this$0 = apiContentRepository;
            this.$id = str;
            this.$locale = locale;
            this.$localeOverride = locale2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C327582(this.$type, this.this$0, this.$id, this.$locale, this.$localeOverride, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ContentResource6> continuation) {
            return ((C327582) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        
            if (r8 == r0) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
        
            if (r8 == r0) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
        
            if (r8 == r0) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00c5, code lost:
        
            if (r8 == r0) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00e6, code lost:
        
            if (r8 == r0) goto L54;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return (ContentResource6) obj;
                }
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return (ContentResource6) obj;
                }
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    return (ContentResource6) obj;
                }
                if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                    return (ContentResource6) obj;
                }
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (ContentResource6) obj;
            }
            ResultKt.throwOnFailure(obj);
            ContentResource.Type<?> type2 = this.$type;
            if (type2 instanceof ContentResource.Type.Array) {
                throw new UnsupportedOperationException();
            }
            if (type2 instanceof ContentResource.Type.Asset) {
                S3ContentfulApi s3ContentfulApi = this.this$0.api;
                String str = this.this$0.spaceId;
                String str2 = this.$id;
                Locale locale = this.$locale;
                this.label = 1;
                obj = s3ContentfulApi.getAsset(str, str2, locale, this);
            } else if (type2 instanceof ContentResource.Type.ContentType) {
                S3ContentfulApi s3ContentfulApi2 = this.this$0.api;
                String str3 = this.this$0.spaceId;
                String str4 = this.$id;
                Locale locale2 = this.$locale;
                this.label = 2;
                obj = s3ContentfulApi2.getContentType(str3, str4, locale2, this);
            } else if (type2 instanceof ContentResource.Type.Entry) {
                S3ContentfulApi s3ContentfulApi3 = this.this$0.api;
                String str5 = this.this$0.spaceId;
                String str6 = this.$id;
                Locale locale3 = this.$locale;
                this.label = 3;
                obj = s3ContentfulApi3.getEntry(str5, str6, locale3, this);
            } else {
                if (type2 instanceof ContentResource.Type.Environment) {
                    return new ResourceLink(new LinkMetadata(this.$id, ContentResource.Type.Environment.INSTANCE));
                }
                if (type2 instanceof ContentResource.Type.Space) {
                    S3ContentfulApi s3ContentfulApi4 = this.this$0.api;
                    String str7 = this.$id;
                    this.label = 4;
                    obj = s3ContentfulApi4.getSpace(str7, this);
                } else {
                    if (!(type2 instanceof ContentResource.Type.Link)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ApiContentRepository apiContentRepository = this.this$0;
                    ContentResource.Type referentType = ((ContentResource.Type.Link) type2).getReferentType();
                    Intrinsics.checkNotNull(referentType, "null cannot be cast to non-null type com.robinhood.contentful.model.ContentResource.Type<com.robinhood.contentful.model.IdentifiableResource>");
                    String str8 = this.$id;
                    Locale locale4 = this.$localeOverride;
                    this.label = 5;
                    obj = apiContentRepository.load(referentType, str8, locale4, this);
                }
            }
            return coroutine_suspended;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.contentful.repository.ContentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object open(AssetResource.File<?> file, Locale locale, Continuation<? super BufferedSource> continuation) {
        C327591 c327591;
        if (continuation instanceof C327591) {
            c327591 = (C327591) continuation;
            int i = c327591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327591.label = i - Integer.MIN_VALUE;
            } else {
                c327591 = new C327591(continuation);
            }
        }
        Object raw = c327591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c327591.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(raw);
                if (!isOnline()) {
                    throw new NoRouteToHostException("Device is offline");
                }
                S3ContentfulApi s3ContentfulApi = this.api;
                String url = file.getUrl().getUrl();
                c327591.label = 1;
                raw = s3ContentfulApi.getRaw(url, c327591);
                if (raw == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(raw);
            }
            return ((ResponseBody) raw).getSource();
        } catch (UndeclaredThrowableException e) {
            Throwable cause = e.getCause();
            Intrinsics.checkNotNull(cause);
            throw cause;
        }
    }

    @Override // com.robinhood.contentful.repository.ContentRepository
    public Object getUri(AssetResource.File<?> file, Locale locale, Continuation<? super Uri> continuation) {
        return HttpUrl2.toAndroidUri(file.getUrl());
    }

    private final <T> T unwrapUndeclaredThrowable(Function0<? extends T> block) throws Throwable {
        try {
            return block.invoke();
        } catch (UndeclaredThrowableException e) {
            Throwable cause = e.getCause();
            Intrinsics.checkNotNull(cause);
            throw cause;
        }
    }
}
