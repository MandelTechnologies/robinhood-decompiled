package com.robinhood.contentful.repository;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.ContentConfiguration;
import com.robinhood.contentful.json.ContentfulMoshi;
import com.robinhood.contentful.model.AssetDetail;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ContentResource;
import com.robinhood.contentful.model.ContentResource6;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.model.ResourceMetadata7;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.shared.i18n.locale.SupportedLocaleRepository;
import com.robinhood.utils.dagger.annotation.CacheDirectory;
import com.robinhood.utils.datetime.Durations;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.Moshi;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import dispatch.core.Suspend;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.CoroutineScope;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.JvmOkio2;
import okio.Okio;
import okio.Source;

/* compiled from: LocalContentRepository.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ:\u0010\u001d\u001a\u0002H\u001e\"\b\b\u0000\u0010\u001e*\u00020\u001f2\u000e\u0010 \u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u001e0!2\u0006\u0010\"\u001a\u00020#2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096@¢\u0006\u0002\u0010$J&\u0010%\u001a\u0004\u0018\u00010&2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096@¢\u0006\u0002\u0010\u001cJ,\u0010'\u001a\u00020(2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010)\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0086@¢\u0006\u0002\u0010*J \u0010'\u001a\u00020(2\u0006\u0010+\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0086@¢\u0006\u0002\u0010,J\u0018\u0010-\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0082@¢\u0006\u0002\u0010.J\u0018\u0010/\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0082@¢\u0006\u0002\u0010.R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015¨\u00061"}, m3636d2 = {"Lcom/robinhood/contentful/repository/LocalContentRepository;", "Lcom/robinhood/contentful/repository/ContentRepository;", "connectivityManager", "Landroid/net/ConnectivityManager;", "cacheDirectory", "Ljava/io/File;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/contentful/ContentConfiguration;", "supportedLocaleRepository", "Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Landroid/net/ConnectivityManager;Ljava/io/File;Lcom/robinhood/contentful/ContentConfiguration;Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;Lcom/squareup/moshi/Moshi;)V", "getSupportedLocaleRepository", "()Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", "jsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/contentful/model/ContentResource;", "isOnline", "", "()Z", "open", "Lokio/Source;", "file", "Lcom/robinhood/contentful/model/AssetResource$File;", "localeOverride", "Ljava/util/Locale;", "(Lcom/robinhood/contentful/model/AssetResource$File;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "T", "Lcom/robinhood/contentful/model/IdentifiableResource;", "type", "Lcom/robinhood/contentful/model/ContentResource$Type;", "id", "", "(Lcom/robinhood/contentful/model/ContentResource$Type;Ljava/lang/String;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUri", "Landroid/net/Uri;", PlaceTypes.STORE, "", "source", "(Lcom/robinhood/contentful/model/AssetResource$File;Lokio/Source;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resource", "(Lcom/robinhood/contentful/model/IdentifiableResource;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filesDir", "(Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rootDir", "Companion", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class LocalContentRepository implements ContentRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long MAX_STALE = Durations.FIVE_MINUTES.toMillis();
    private final File cacheDirectory;
    private final ContentConfiguration configuration;
    private final ConnectivityManager connectivityManager;
    private final JsonAdapter<ContentResource> jsonAdapter;
    private final SupportedLocaleRepository supportedLocaleRepository;

    /* compiled from: LocalContentRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.LocalContentRepository", m3645f = "LocalContentRepository.kt", m3646l = {115}, m3647m = "filesDir")
    /* renamed from: com.robinhood.contentful.repository.LocalContentRepository$filesDir$1 */
    static final class C327601 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C327601(Continuation<? super C327601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalContentRepository.this.filesDir(null, this);
        }
    }

    /* compiled from: LocalContentRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.LocalContentRepository", m3645f = "LocalContentRepository.kt", m3646l = {47}, m3647m = "open")
    /* renamed from: com.robinhood.contentful.repository.LocalContentRepository$open$1 */
    static final class C327631 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C327631(Continuation<? super C327631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalContentRepository.this.open(null, null, this);
        }
    }

    /* compiled from: LocalContentRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.LocalContentRepository", m3645f = "LocalContentRepository.kt", m3646l = {119}, m3647m = "rootDir")
    /* renamed from: com.robinhood.contentful.repository.LocalContentRepository$rootDir$1 */
    static final class C327641 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C327641(Continuation<? super C327641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalContentRepository.this.rootDir(null, this);
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

    public LocalContentRepository(ConnectivityManager connectivityManager, @CacheDirectory File cacheDirectory, ContentConfiguration configuration, SupportedLocaleRepository supportedLocaleRepository, @ContentfulMoshi Moshi moshi) {
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(supportedLocaleRepository, "supportedLocaleRepository");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.connectivityManager = connectivityManager;
        this.cacheDirectory = cacheDirectory;
        this.configuration = configuration;
        this.supportedLocaleRepository = supportedLocaleRepository;
        Types types = Types.INSTANCE;
        JsonAdapter<ContentResource> jsonAdapterAdapter = moshi.adapter(new TypeToken<ContentResource>() { // from class: com.robinhood.contentful.repository.LocalContentRepository$special$$inlined$getAdapter$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.jsonAdapter = jsonAdapterAdapter;
    }

    @Override // com.robinhood.contentful.repository.ContentRepository
    public SupportedLocaleRepository getSupportedLocaleRepository() {
        return this.supportedLocaleRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isOnline() {
        NetworkInfo activeNetworkInfo = this.connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.contentful.repository.ContentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object open(AssetResource.File<?> file, Locale locale, Continuation<? super Source> continuation) {
        C327631 c327631;
        if (continuation instanceof C327631) {
            c327631 = (C327631) continuation;
            int i = c327631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327631.label = i - Integer.MIN_VALUE;
            } else {
                c327631 = new C327631(continuation);
            }
        }
        Object objFilesDir = c327631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c327631.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFilesDir);
            c327631.L$0 = file;
            c327631.label = 1;
            objFilesDir = filesDir(locale, c327631);
            if (objFilesDir == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (AssetResource.File) c327631.L$0;
            ResultKt.throwOnFailure(objFilesDir);
        }
        File file2 = new File((File) objFilesDir, file.hashKey());
        if (isOnline()) {
            INSTANCE.checkStaleness(file2);
        }
        return Okio.source(file2);
    }

    @Override // com.robinhood.contentful.repository.ContentRepository
    public <T extends ContentResource6> Object load(ContentResource.Type<? super T> type2, String str, Locale locale, Continuation<? super T> continuation) {
        if (type2 instanceof ContentResource.Type.Link) {
            ContentResource.Type<? super T> referentType = ((ContentResource.Type.Link) type2).getReferentType();
            Intrinsics.checkNotNull(referentType, "null cannot be cast to non-null type com.robinhood.contentful.model.ContentResource.Type<in T of com.robinhood.contentful.repository.LocalContentRepository.load>");
            return load(referentType, str, locale, continuation);
        }
        Object objWithIO$default = Suspend.withIO$default(null, new C327622(locale, type2, str, null), continuation, 1, null);
        return objWithIO$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithIO$default : (ContentResource6) objWithIO$default;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: LocalContentRepository.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "T", "Lcom/robinhood/contentful/model/IdentifiableResource;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.LocalContentRepository$load$2", m3645f = "LocalContentRepository.kt", m3646l = {65}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.contentful.repository.LocalContentRepository$load$2 */
    static final class C327622<T> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ String $id;
        final /* synthetic */ Locale $localeOverride;
        final /* synthetic */ ContentResource.Type<? super T> $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C327622(Locale locale, ContentResource.Type<? super T> type2, String str, Continuation<? super C327622> continuation) {
            super(2, continuation);
            this.$localeOverride = locale;
            this.$type = type2;
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LocalContentRepository.this.new C327622(this.$localeOverride, this.$type, this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((C327622) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    LocalContentRepository localContentRepository = LocalContentRepository.this;
                    Locale locale = this.$localeOverride;
                    this.label = 1;
                    obj = localContentRepository.rootDir(locale, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                File file = new File(new File((File) obj, this.$type.getIdentifier()), this.$id);
                if (LocalContentRepository.this.isOnline()) {
                    LocalContentRepository.INSTANCE.checkStaleness(file);
                }
                BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(file));
                try {
                    Object objFromJson = LocalContentRepository.this.jsonAdapter.fromJson(bufferedSourceBuffer);
                    Intrinsics.checkNotNull(objFromJson, "null cannot be cast to non-null type T of com.robinhood.contentful.repository.LocalContentRepository.load");
                    ContentResource6 contentResource6 = (ContentResource6) objFromJson;
                    Closeable.closeFinally(bufferedSourceBuffer, null);
                    return contentResource6;
                } finally {
                }
            } catch (JsonDataException e) {
                throw new IOException(e);
            }
        }
    }

    /* compiled from: LocalContentRepository.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Landroid/net/Uri;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.LocalContentRepository$getUri$2", m3645f = "LocalContentRepository.kt", m3646l = {79}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.contentful.repository.LocalContentRepository$getUri$2 */
    static final class C327612 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
        final /* synthetic */ AssetResource.File<?> $file;
        final /* synthetic */ Locale $localeOverride;
        Object L$0;
        int label;
        final /* synthetic */ LocalContentRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C327612(AssetResource.File<?> file, LocalContentRepository localContentRepository, Locale locale, Continuation<? super C327612> continuation) {
            super(2, continuation);
            this.$file = file;
            this.this$0 = localContentRepository;
            this.$localeOverride = locale;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C327612(this.$file, this.this$0, this.$localeOverride, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
            return ((C327612) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String strHashKey = this.$file.hashKey();
                LocalContentRepository localContentRepository = this.this$0;
                Locale locale = this.$localeOverride;
                this.L$0 = strHashKey;
                this.label = 1;
                Object objFilesDir = localContentRepository.filesDir(locale, this);
                if (objFilesDir == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = strHashKey;
                obj = objFilesDir;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            File file = new File((File) obj, str);
            try {
                if (this.this$0.isOnline()) {
                    LocalContentRepository.INSTANCE.checkStaleness(file);
                }
                if (file.isFile()) {
                    return Uri.fromFile(file);
                }
                return null;
            } catch (IOException unused) {
                return null;
            }
        }
    }

    @Override // com.robinhood.contentful.repository.ContentRepository
    public Object getUri(AssetResource.File<?> file, Locale locale, Continuation<? super Uri> continuation) {
        return Suspend.withIO$default(null, new C327612(file, this, locale, null), continuation, 1, null);
    }

    /* compiled from: LocalContentRepository.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.LocalContentRepository$store$2", m3645f = "LocalContentRepository.kt", m3646l = {97}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.contentful.repository.LocalContentRepository$store$2 */
    static final class C327652 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AssetResource.File<?> $file;
        final /* synthetic */ Locale $localeOverride;
        final /* synthetic */ Source $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C327652(Locale locale, AssetResource.File<?> file, Source source, Continuation<? super C327652> continuation) {
            super(2, continuation);
            this.$localeOverride = locale;
            this.$file = file;
            this.$source = source;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LocalContentRepository.this.new C327652(this.$localeOverride, this.$file, this.$source, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C327652) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LocalContentRepository localContentRepository = LocalContentRepository.this;
                Locale locale = this.$localeOverride;
                this.label = 1;
                obj = localContentRepository.filesDir(locale, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BufferedSink bufferedSinkBuffer = Okio.buffer(JvmOkio2.sink$default(new File((File) obj, this.$file.hashKey()), false, 1, null));
            try {
                bufferedSinkBuffer.writeAll(this.$source);
                Unit unit = Unit.INSTANCE;
                Closeable.closeFinally(bufferedSinkBuffer, null);
                return Unit.INSTANCE;
            } finally {
            }
        }
    }

    public final Object store(AssetResource.File<?> file, Source source, Locale locale, Continuation<? super Unit> continuation) {
        return Suspend.withIO$default(null, new C327652(locale, file, source, null), continuation, 1, null);
    }

    /* compiled from: LocalContentRepository.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.LocalContentRepository$store$4", m3645f = "LocalContentRepository.kt", m3646l = {107}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.contentful.repository.LocalContentRepository$store$4 */
    static final class C327664 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Locale $localeOverride;
        final /* synthetic */ ContentResource6 $resource;
        Object L$0;
        int label;
        final /* synthetic */ LocalContentRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C327664(ContentResource6 contentResource6, LocalContentRepository localContentRepository, Locale locale, Continuation<? super C327664> continuation) {
            super(2, continuation);
            this.$resource = contentResource6;
            this.this$0 = localContentRepository;
            this.$localeOverride = locale;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C327664(this.$resource, this.this$0, this.$localeOverride, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C327664) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ResourceMetadata7<?> resourceMetadata7;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ResourceMetadata7<?> sys = this.$resource.getSys();
                LocalContentRepository localContentRepository = this.this$0;
                Locale locale = this.$localeOverride;
                this.L$0 = sys;
                this.label = 1;
                Object objRootDir = localContentRepository.rootDir(locale, this);
                if (objRootDir == coroutine_suspended) {
                    return coroutine_suspended;
                }
                resourceMetadata7 = sys;
                obj = objRootDir;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                resourceMetadata7 = (ResourceMetadata7) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            File file = new File((File) obj, resourceMetadata7.getType().getIdentifier());
            file.mkdirs();
            BufferedSink bufferedSinkBuffer = Okio.buffer(JvmOkio2.sink$default(new File(file, resourceMetadata7.getId()), false, 1, null));
            LocalContentRepository localContentRepository2 = this.this$0;
            try {
                localContentRepository2.jsonAdapter.toJson(bufferedSinkBuffer, (BufferedSink) this.$resource);
                Unit unit = Unit.INSTANCE;
                Closeable.closeFinally(bufferedSinkBuffer, null);
                return Unit.INSTANCE;
            } finally {
            }
        }
    }

    public final Object store(ContentResource6 contentResource6, Locale locale, Continuation<? super Unit> continuation) {
        return Suspend.withIO$default(null, new C327664(contentResource6, this, locale, null), continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object filesDir(Locale locale, Continuation<? super File> continuation) {
        C327601 c327601;
        if (continuation instanceof C327601) {
            c327601 = (C327601) continuation;
            int i = c327601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327601.label = i - Integer.MIN_VALUE;
            } else {
                c327601 = new C327601(continuation);
            }
        }
        Object objRootDir = c327601.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c327601.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRootDir);
            c327601.label = 1;
            objRootDir = rootDir(locale, c327601);
            if (objRootDir == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRootDir);
        }
        File file = new File((File) objRootDir, "File");
        file.mkdirs();
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rootDir(Locale locale, Continuation<? super File> continuation) {
        C327641 c327641;
        Object obj;
        if (continuation instanceof C327641) {
            c327641 = (C327641) continuation;
            int i = c327641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327641.label = i - Integer.MIN_VALUE;
            } else {
                c327641 = new C327641(continuation);
            }
        }
        Object obj2 = c327641.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c327641.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            if (locale == null) {
                Locale defaultLocale = this.configuration.getDefaultLocale();
                c327641.label = 1;
                Object locale2 = ContentRepository2.getLocale(this, defaultLocale, c327641);
                obj = locale2;
                if (locale2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return new File(new File(this.cacheDirectory, "content"), locale.toLanguageTag());
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj2);
        obj = obj2;
        locale = (Locale) obj;
        return new File(new File(this.cacheDirectory, "content"), locale.toLanguageTag());
    }

    /* compiled from: LocalContentRepository.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/contentful/repository/LocalContentRepository$Companion;", "", "<init>", "()V", "MAX_STALE", "", "checkStaleness", "", "Ljava/io/File;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkStaleness(File file) throws IOException {
            if (System.currentTimeMillis() - file.lastModified() <= LocalContentRepository.MAX_STALE) {
                return;
            }
            throw new IOException("File is stale: " + file);
        }
    }
}
