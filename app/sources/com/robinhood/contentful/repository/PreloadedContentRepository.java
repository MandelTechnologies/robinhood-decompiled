package com.robinhood.contentful.repository;

import android.content.res.AssetManager;
import android.net.Uri;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.ContentConfiguration;
import com.robinhood.contentful.json.ContentfulMoshi;
import com.robinhood.contentful.model.AssetDetail;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ContentResource;
import com.robinhood.contentful.model.ContentResource6;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.shared.i18n.locale.SupportedLocaleRepository;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import dispatch.core.Suspend;
import java.io.IOException;
import java.io.InputStream;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.CoroutineScope;
import okio.Okio;
import okio.Source;

/* compiled from: PreloadedContentRepository.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0000\u0010\u0012*\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00120\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ$\u0010\u001b\u001a\u00020\u001c2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0082@¢\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0082@¢\u0006\u0002\u0010!J \u0010#\u001a\u00020\u0017*\u0006\u0012\u0002\b\u00030\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0082@¢\u0006\u0002\u0010\u001fJ&\u0010$\u001a\u0004\u0018\u00010%2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/robinhood/contentful/repository/PreloadedContentRepository;", "Lcom/robinhood/contentful/repository/ContentRepository;", "assetManager", "Landroid/content/res/AssetManager;", "supportedLocaleRepository", "Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/contentful/ContentConfiguration;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Landroid/content/res/AssetManager;Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;Lcom/robinhood/contentful/ContentConfiguration;Lcom/squareup/moshi/Moshi;)V", "getSupportedLocaleRepository", "()Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", "jsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/contentful/model/ContentResource;", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "T", "Lcom/robinhood/contentful/model/IdentifiableResource;", "type", "Lcom/robinhood/contentful/model/ContentResource$Type;", "id", "", "localeOverride", "Ljava/util/Locale;", "(Lcom/robinhood/contentful/model/ContentResource$Type;Ljava/lang/String;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "open", "Lokio/Source;", "file", "Lcom/robinhood/contentful/model/AssetResource$File;", "(Lcom/robinhood/contentful/model/AssetResource$File;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rootPath", "(Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filesPath", "assetPath", "getUri", "Landroid/net/Uri;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class PreloadedContentRepository implements ContentRepository {
    private final AssetManager assetManager;
    private final ContentConfiguration configuration;
    private final JsonAdapter<ContentResource> jsonAdapter;
    private final SupportedLocaleRepository supportedLocaleRepository;

    /* compiled from: PreloadedContentRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.PreloadedContentRepository", m3645f = "PreloadedContentRepository.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "assetPath")
    /* renamed from: com.robinhood.contentful.repository.PreloadedContentRepository$assetPath$1 */
    static final class C327671 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C327671(Continuation<? super C327671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PreloadedContentRepository.this.assetPath(null, null, this);
        }
    }

    /* compiled from: PreloadedContentRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.PreloadedContentRepository", m3645f = "PreloadedContentRepository.kt", m3646l = {65}, m3647m = "filesPath")
    /* renamed from: com.robinhood.contentful.repository.PreloadedContentRepository$filesPath$1 */
    static final class C327681 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C327681(Continuation<? super C327681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PreloadedContentRepository.this.filesPath(null, this);
        }
    }

    /* compiled from: PreloadedContentRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.PreloadedContentRepository", m3645f = "PreloadedContentRepository.kt", m3646l = {43, 48}, m3647m = AnalyticsStrings.NOTIF_STACK_EVENT_LOAD)
    /* renamed from: com.robinhood.contentful.repository.PreloadedContentRepository$load$1 */
    static final class C327701<T extends ContentResource6> extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C327701(Continuation<? super C327701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PreloadedContentRepository.this.load(null, null, null, this);
        }
    }

    /* compiled from: PreloadedContentRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.PreloadedContentRepository", m3645f = "PreloadedContentRepository.kt", m3646l = {60}, m3647m = "rootPath")
    /* renamed from: com.robinhood.contentful.repository.PreloadedContentRepository$rootPath$1 */
    static final class C327731 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C327731(Continuation<? super C327731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PreloadedContentRepository.this.rootPath(null, this);
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

    public PreloadedContentRepository(AssetManager assetManager, SupportedLocaleRepository supportedLocaleRepository, ContentConfiguration configuration, @ContentfulMoshi Moshi moshi) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(supportedLocaleRepository, "supportedLocaleRepository");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.assetManager = assetManager;
        this.supportedLocaleRepository = supportedLocaleRepository;
        this.configuration = configuration;
        Types types = Types.INSTANCE;
        JsonAdapter<ContentResource> jsonAdapterAdapter = moshi.adapter(new TypeToken<ContentResource>() { // from class: com.robinhood.contentful.repository.PreloadedContentRepository$special$$inlined$getAdapter$1
        }.getType());
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.jsonAdapter = jsonAdapterAdapter;
    }

    @Override // com.robinhood.contentful.repository.ContentRepository
    public SupportedLocaleRepository getSupportedLocaleRepository() {
        return this.supportedLocaleRepository;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r15 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r15 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.contentful.repository.ContentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T extends ContentResource6> Object load(ContentResource.Type<? super T> type2, String str, Locale locale, Continuation<? super T> continuation) {
        C327701 c327701;
        if (continuation instanceof C327701) {
            c327701 = (C327701) continuation;
            int i = c327701.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327701.label = i - Integer.MIN_VALUE;
            } else {
                c327701 = new C327701(continuation);
            }
        }
        Object objWithIO$default = c327701.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c327701.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objWithIO$default);
                Intrinsics.checkNotNull(objWithIO$default, "null cannot be cast to non-null type T of com.robinhood.contentful.repository.PreloadedContentRepository.load");
                return (ContentResource6) objWithIO$default;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithIO$default);
            return (ContentResource6) objWithIO$default;
        }
        ResultKt.throwOnFailure(objWithIO$default);
        if (type2 instanceof ContentResource.Type.Link) {
            ContentResource.Type<T> referentType = ((ContentResource.Type.Link) type2).getReferentType();
            Intrinsics.checkNotNull(referentType, "null cannot be cast to non-null type com.robinhood.contentful.model.ContentResource.Type<in com.robinhood.contentful.model.IdentifiableResource>");
            c327701.label = 1;
            objWithIO$default = load(referentType, str, locale, c327701);
        } else {
            C327712 c327712 = new C327712(locale, type2, str, null);
            c327701.label = 2;
            objWithIO$default = Suspend.withIO$default(null, c327712, c327701, 1, null);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: PreloadedContentRepository.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "T", "Lcom/robinhood/contentful/model/IdentifiableResource;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.PreloadedContentRepository$load$2", m3645f = "PreloadedContentRepository.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.contentful.repository.PreloadedContentRepository$load$2 */
    static final class C327712<T> extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ String $id;
        final /* synthetic */ Locale $localeOverride;
        final /* synthetic */ ContentResource.Type<? super T> $type;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C327712(Locale locale, ContentResource.Type<? super T> type2, String str, Continuation<? super C327712> continuation) {
            super(2, continuation);
            this.$localeOverride = locale;
            this.$type = type2;
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PreloadedContentRepository.this.new C327712(this.$localeOverride, this.$type, this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((C327712) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            AssetManager assetManager;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AssetManager assetManager2 = PreloadedContentRepository.this.assetManager;
                PreloadedContentRepository preloadedContentRepository = PreloadedContentRepository.this;
                Locale locale = this.$localeOverride;
                this.L$0 = assetManager2;
                this.label = 1;
                Object objRootPath = preloadedContentRepository.rootPath(locale, this);
                if (objRootPath == coroutine_suspended) {
                    return coroutine_suspended;
                }
                assetManager = assetManager2;
                obj = objRootPath;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                assetManager = (AssetManager) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            InputStream inputStreamOpen = assetManager.open(obj + "/" + this.$type.getIdentifier() + "/" + this.$id);
            try {
                JsonAdapter jsonAdapter = PreloadedContentRepository.this.jsonAdapter;
                Intrinsics.checkNotNull(inputStreamOpen);
                Object objFromJson = jsonAdapter.fromJson(Okio.buffer(Okio.source(inputStreamOpen)));
                Intrinsics.checkNotNull(objFromJson, "null cannot be cast to non-null type T of com.robinhood.contentful.repository.PreloadedContentRepository.load");
                ContentResource6 contentResource6 = (ContentResource6) objFromJson;
                Closeable.closeFinally(inputStreamOpen, null);
                return contentResource6;
            } finally {
            }
        }
    }

    /* compiled from: PreloadedContentRepository.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lokio/Source;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.PreloadedContentRepository$open$2", m3645f = "PreloadedContentRepository.kt", m3646l = {56}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.contentful.repository.PreloadedContentRepository$open$2 */
    static final class C327722 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Source>, Object> {
        final /* synthetic */ AssetResource.File<?> $file;
        final /* synthetic */ Locale $localeOverride;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C327722(AssetResource.File<?> file, Locale locale, Continuation<? super C327722> continuation) {
            super(2, continuation);
            this.$file = file;
            this.$localeOverride = locale;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PreloadedContentRepository.this.new C327722(this.$file, this.$localeOverride, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Source> continuation) {
            return ((C327722) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException, IOException {
            AssetManager assetManager;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AssetManager assetManager2 = PreloadedContentRepository.this.assetManager;
                PreloadedContentRepository preloadedContentRepository = PreloadedContentRepository.this;
                AssetResource.File<?> file = this.$file;
                Locale locale = this.$localeOverride;
                this.L$0 = assetManager2;
                this.label = 1;
                Object objAssetPath = preloadedContentRepository.assetPath(file, locale, this);
                if (objAssetPath == coroutine_suspended) {
                    return coroutine_suspended;
                }
                assetManager = assetManager2;
                obj = objAssetPath;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                assetManager = (AssetManager) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            InputStream inputStreamOpen = assetManager.open((String) obj);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            return Okio.source(inputStreamOpen);
        }
    }

    @Override // com.robinhood.contentful.repository.ContentRepository
    public Object open(AssetResource.File<?> file, Locale locale, Continuation<? super Source> continuation) {
        return Suspend.withIO$default(null, new C327722(file, locale, null), continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rootPath(Locale locale, Continuation<? super String> continuation) {
        C327731 c327731;
        Object obj;
        if (continuation instanceof C327731) {
            c327731 = (C327731) continuation;
            int i = c327731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327731.label = i - Integer.MIN_VALUE;
            } else {
                c327731 = new C327731(continuation);
            }
        }
        Object obj2 = c327731.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c327731.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj2);
            if (locale == null) {
                Locale defaultLocale = this.configuration.getDefaultLocale();
                c327731.label = 1;
                Object locale2 = ContentRepository2.getLocale(this, defaultLocale, c327731);
                obj = locale2;
                if (locale2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return "content/" + locale.toLanguageTag();
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj2);
        obj = obj2;
        locale = (Locale) obj;
        return "content/" + locale.toLanguageTag();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object filesPath(Locale locale, Continuation<? super String> continuation) {
        C327681 c327681;
        if (continuation instanceof C327681) {
            c327681 = (C327681) continuation;
            int i = c327681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327681.label = i - Integer.MIN_VALUE;
            } else {
                c327681 = new C327681(continuation);
            }
        }
        Object objRootPath = c327681.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c327681.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRootPath);
            c327681.label = 1;
            objRootPath = rootPath(locale, c327681);
            if (objRootPath == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objRootPath);
        }
        return objRootPath + "/File";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object assetPath(AssetResource.File<?> file, Locale locale, Continuation<? super String> continuation) throws NoSuchAlgorithmException {
        C327671 c327671;
        if (continuation instanceof C327671) {
            c327671 = (C327671) continuation;
            int i = c327671.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327671.label = i - Integer.MIN_VALUE;
            } else {
                c327671 = new C327671(continuation);
            }
        }
        Object objFilesPath = c327671.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c327671.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFilesPath);
            c327671.L$0 = file;
            c327671.label = 1;
            objFilesPath = filesPath(locale, c327671);
            if (objFilesPath == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file = (AssetResource.File) c327671.L$0;
            ResultKt.throwOnFailure(objFilesPath);
        }
        return objFilesPath + "/" + file.hashKey();
    }

    /* compiled from: PreloadedContentRepository.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Landroid/net/Uri;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.repository.PreloadedContentRepository$getUri$2", m3645f = "PreloadedContentRepository.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.contentful.repository.PreloadedContentRepository$getUri$2 */
    static final class C327692 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Uri>, Object> {
        final /* synthetic */ AssetResource.File<?> $file;
        final /* synthetic */ Locale $localeOverride;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C327692(AssetResource.File<?> file, Locale locale, Continuation<? super C327692> continuation) {
            super(2, continuation);
            this.$file = file;
            this.$localeOverride = locale;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PreloadedContentRepository.this.new C327692(this.$file, this.$localeOverride, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Uri> continuation) {
            return ((C327692) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException, IOException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PreloadedContentRepository preloadedContentRepository = PreloadedContentRepository.this;
                    AssetResource.File<?> file = this.$file;
                    Locale locale = this.$localeOverride;
                    this.label = 1;
                    obj = preloadedContentRepository.assetPath(file, locale, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                String str = (String) obj;
                PreloadedContentRepository.this.assetManager.open(str).close();
                return Uri.parse("file:///android_asset/" + str);
            } catch (IOException unused) {
                return null;
            }
        }
    }

    @Override // com.robinhood.contentful.repository.ContentRepository
    public Object getUri(AssetResource.File<?> file, Locale locale, Continuation<? super Uri> continuation) {
        return Suspend.withIO$default(null, new C327692(file, locale, null), continuation, 1, null);
    }
}
