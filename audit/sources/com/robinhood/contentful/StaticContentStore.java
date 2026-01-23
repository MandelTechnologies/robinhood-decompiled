package com.robinhood.contentful;

import android.net.Uri;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.contentful.model.AssetDetail;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.ContentResource;
import com.robinhood.contentful.model.ContentResource6;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.model.ResourceLink;
import com.robinhood.contentful.repository.ApiContentRepository;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.contentful.repository.LocalContentRepository;
import com.robinhood.contentful.repository.PreloadedContentRepository;
import com.robinhood.shared.i18n.locale.SupportedLocaleRepository;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.BufferedSource;
import okio.Source;
import retrofit2.HttpException;

/* compiled from: StaticContentStore.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u000f0\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096@¢\u0006\u0002\u0010\u0017J$\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096@¢\u0006\u0002\u0010\u001cJ$\u0010\u001d\u001a\u00020\u001e2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096@¢\u0006\u0002\u0010\u001cR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/contentful/StaticContentStore;", "Lcom/robinhood/contentful/repository/ContentRepository;", "supportedLocaleRepository", "Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", "apiContentRepository", "Lcom/robinhood/contentful/repository/ApiContentRepository;", "localContentRepository", "Lcom/robinhood/contentful/repository/LocalContentRepository;", "preloadedContentRepository", "Lcom/robinhood/contentful/repository/PreloadedContentRepository;", "<init>", "(Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;Lcom/robinhood/contentful/repository/ApiContentRepository;Lcom/robinhood/contentful/repository/LocalContentRepository;Lcom/robinhood/contentful/repository/PreloadedContentRepository;)V", "getSupportedLocaleRepository", "()Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "T", "Lcom/robinhood/contentful/model/IdentifiableResource;", "type", "Lcom/robinhood/contentful/model/ContentResource$Type;", "id", "", "localeOverride", "Ljava/util/Locale;", "(Lcom/robinhood/contentful/model/ContentResource$Type;Ljava/lang/String;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "open", "Lokio/Source;", "file", "Lcom/robinhood/contentful/model/AssetResource$File;", "(Lcom/robinhood/contentful/model/AssetResource$File;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUri", "Landroid/net/Uri;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class StaticContentStore implements ContentRepository {
    private final ApiContentRepository apiContentRepository;
    private final LocalContentRepository localContentRepository;
    private final PreloadedContentRepository preloadedContentRepository;
    private final SupportedLocaleRepository supportedLocaleRepository;

    /* compiled from: StaticContentStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.StaticContentStore", m3645f = "StaticContentStore.kt", m3646l = {111, 112, 113}, m3647m = "getUri")
    /* renamed from: com.robinhood.contentful.StaticContentStore$getUri$1 */
    static final class C327261 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C327261(Continuation<? super C327261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StaticContentStore.this.getUri(null, null, this);
        }
    }

    /* compiled from: StaticContentStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.StaticContentStore", m3645f = "StaticContentStore.kt", m3646l = {41, 51, 56, 65}, m3647m = AnalyticsStrings.NOTIF_STACK_EVENT_LOAD)
    /* renamed from: com.robinhood.contentful.StaticContentStore$load$1 */
    static final class C327271<T extends ContentResource6> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C327271(Continuation<? super C327271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StaticContentStore.this.load(null, null, null, this);
        }
    }

    /* compiled from: StaticContentStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.contentful.StaticContentStore", m3645f = "StaticContentStore.kt", m3646l = {82, 88, 89, 95, 103}, m3647m = "open")
    /* renamed from: com.robinhood.contentful.StaticContentStore$open$1 */
    static final class C327281 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C327281(Continuation<? super C327281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return StaticContentStore.this.open(null, null, this);
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

    public StaticContentStore(SupportedLocaleRepository supportedLocaleRepository, ApiContentRepository apiContentRepository, LocalContentRepository localContentRepository, PreloadedContentRepository preloadedContentRepository) {
        Intrinsics.checkNotNullParameter(supportedLocaleRepository, "supportedLocaleRepository");
        Intrinsics.checkNotNullParameter(apiContentRepository, "apiContentRepository");
        Intrinsics.checkNotNullParameter(localContentRepository, "localContentRepository");
        Intrinsics.checkNotNullParameter(preloadedContentRepository, "preloadedContentRepository");
        this.supportedLocaleRepository = supportedLocaleRepository;
        this.apiContentRepository = apiContentRepository;
        this.localContentRepository = localContentRepository;
        this.preloadedContentRepository = preloadedContentRepository;
    }

    @Override // com.robinhood.contentful.repository.ContentRepository
    public SupportedLocaleRepository getSupportedLocaleRepository() {
        return this.supportedLocaleRepository;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|75|(1:(1:(1:(1:(4:14|15|66|67)(2:19|20))(4:21|83|22|23))(5:28|81|29|52|(1:65)(1:55)))(4:35|73|36|37))(4:40|77|41|(0)(1:44))|47|79|48|(3:51|52|(0))|65|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f6, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f7, code lost:
    
        r4 = r9;
        r9 = r2;
        r2 = r11;
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fc, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fd, code lost:
    
        r4 = r9;
        r9 = r2;
        r2 = r11;
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0124, code lost:
    
        if (r12 == r1) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.robinhood.contentful.model.ContentResource$Type, com.robinhood.contentful.model.ContentResource$Type<? super T extends com.robinhood.contentful.model.IdentifiableResource>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    @Override // com.robinhood.contentful.repository.ContentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T extends ContentResource6> Object load(ContentResource.Type<? super T> type2, String str, Locale locale, Continuation<? super T> continuation) {
        C327271 c327271;
        String str2;
        List list;
        Locale locale2;
        ContentResource.Type<? super T> type3;
        ContentResource.Type<? super T> type4;
        HttpException e;
        String str3;
        Locale locale3;
        IOException e2;
        ContentResource.Type<? super T> type5;
        ContentResource6 contentResource6;
        LocalContentRepository localContentRepository;
        if (continuation instanceof C327271) {
            c327271 = (C327271) continuation;
            int i = c327271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327271.label = i - Integer.MIN_VALUE;
            } else {
                c327271 = new C327271(continuation);
            }
        }
        Object objLoad = c327271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c327271.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objLoad);
                ArrayList arrayList = new ArrayList();
                try {
                    LocalContentRepository localContentRepository2 = this.localContentRepository;
                    c327271.L$0 = type2;
                    c327271.L$1 = str;
                    c327271.L$2 = locale;
                    c327271.L$3 = arrayList;
                    c327271.label = 1;
                    Object objLoad2 = localContentRepository2.load(type2, str, locale, c327271);
                    if (objLoad2 != coroutine_suspended) {
                        return objLoad2;
                    }
                } catch (IOException e3) {
                    e = e3;
                    str2 = str;
                    list = arrayList;
                    locale2 = locale;
                    type3 = type2;
                }
            } else if (i2 == 1) {
                List list2 = (List) c327271.L$3;
                Locale locale4 = (Locale) c327271.L$2;
                String str4 = (String) c327271.L$1;
                ContentResource.Type<? super T> type6 = (ContentResource.Type) c327271.L$0;
                try {
                    ResultKt.throwOnFailure(objLoad);
                    return objLoad;
                } catch (IOException e4) {
                    list = list2;
                    ContentResource.Type<? super T> type7 = type6;
                    e = e4;
                    locale2 = locale4;
                    str2 = str4;
                    type3 = type7;
                }
            } else {
                if (i2 == 2) {
                    list = (List) c327271.L$3;
                    locale3 = (Locale) c327271.L$2;
                    str3 = (String) c327271.L$1;
                    ContentResource.Type<? super T> type8 = (ContentResource.Type) c327271.L$0;
                    try {
                        ResultKt.throwOnFailure(objLoad);
                        type5 = type8;
                        contentResource6 = (ContentResource6) objLoad;
                        localContentRepository = this.localContentRepository;
                        c327271.L$0 = type5;
                        c327271.L$1 = str3;
                        c327271.L$2 = locale3;
                        c327271.L$3 = list;
                        c327271.L$4 = contentResource6;
                        c327271.label = 3;
                    } catch (IOException e5) {
                        type4 = type8;
                        e2 = e5;
                        list.add(e2);
                        List list3 = list;
                        PreloadedContentRepository preloadedContentRepository = this.preloadedContentRepository;
                        c327271.L$0 = list3;
                        c327271.L$1 = null;
                        c327271.L$2 = null;
                        c327271.L$3 = null;
                        c327271.L$4 = null;
                        c327271.label = 4;
                        objLoad = preloadedContentRepository.load(type4, str3, locale3, c327271);
                        type2 = list3;
                    } catch (HttpException e6) {
                        type4 = type8;
                        e = e6;
                        list.add(e);
                        List list32 = list;
                        PreloadedContentRepository preloadedContentRepository2 = this.preloadedContentRepository;
                        c327271.L$0 = list32;
                        c327271.L$1 = null;
                        c327271.L$2 = null;
                        c327271.L$3 = null;
                        c327271.L$4 = null;
                        c327271.label = 4;
                        objLoad = preloadedContentRepository2.load(type4, str3, locale3, c327271);
                        type2 = list32;
                    }
                    return localContentRepository.store(contentResource6, locale3, c327271) != coroutine_suspended ? coroutine_suspended : contentResource6;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z = (ContentResource.Type<? super T>) ((List) c327271.L$0);
                    ResultKt.throwOnFailure(objLoad);
                    type2 = z;
                    return (ContentResource6) objLoad;
                }
                ContentResource6 contentResource62 = (ContentResource6) c327271.L$4;
                list = (List) c327271.L$3;
                locale3 = (Locale) c327271.L$2;
                str3 = (String) c327271.L$1;
                type4 = (ContentResource.Type) c327271.L$0;
                try {
                    ResultKt.throwOnFailure(objLoad);
                    return contentResource62;
                } catch (IOException e7) {
                    e2 = e7;
                    list.add(e2);
                    List list322 = list;
                    PreloadedContentRepository preloadedContentRepository22 = this.preloadedContentRepository;
                    c327271.L$0 = list322;
                    c327271.L$1 = null;
                    c327271.L$2 = null;
                    c327271.L$3 = null;
                    c327271.L$4 = null;
                    c327271.label = 4;
                    objLoad = preloadedContentRepository22.load(type4, str3, locale3, c327271);
                    type2 = list322;
                } catch (HttpException e8) {
                    e = e8;
                    list.add(e);
                    List list3222 = list;
                    PreloadedContentRepository preloadedContentRepository222 = this.preloadedContentRepository;
                    c327271.L$0 = list3222;
                    c327271.L$1 = null;
                    c327271.L$2 = null;
                    c327271.L$3 = null;
                    c327271.L$4 = null;
                    c327271.label = 4;
                    objLoad = preloadedContentRepository222.load(type4, str3, locale3, c327271);
                    type2 = list3222;
                }
            }
            list.add(e);
            ApiContentRepository apiContentRepository = this.apiContentRepository;
            c327271.L$0 = type3;
            c327271.L$1 = str2;
            c327271.L$2 = locale2;
            c327271.L$3 = list;
            c327271.label = 2;
            Object objLoad3 = apiContentRepository.load(type3, str2, locale2, c327271);
            if (objLoad3 != coroutine_suspended) {
                str3 = str2;
                locale3 = locale2;
                objLoad = objLoad3;
                type5 = type3;
                contentResource6 = (ContentResource6) objLoad;
                localContentRepository = this.localContentRepository;
                c327271.L$0 = type5;
                c327271.L$1 = str3;
                c327271.L$2 = locale3;
                c327271.L$3 = list;
                c327271.L$4 = contentResource6;
                c327271.label = 3;
                if (localContentRepository.store(contentResource6, locale3, c327271) != coroutine_suspended) {
                }
            }
        } catch (Throwable th) {
            Iterator it = ((Iterable) type2).iterator();
            while (it.hasNext()) {
                th.addSuppressed((Throwable) it.next());
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0136, code lost:
    
        if (r13 == r1) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.robinhood.contentful.model.AssetResource$File, com.robinhood.contentful.model.AssetResource$File<?>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.robinhood.contentful.repository.ContentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object open(AssetResource.File<?> file, Locale locale, Continuation<? super Source> continuation) {
        C327281 c327281;
        Object obj;
        AssetResource.File<?> file2;
        AssetResource.File<?> file3;
        List list;
        IOException e;
        Closeable closeable;
        Closeable closeable2;
        Throwable th;
        LocalContentRepository localContentRepository;
        AssetResource.File<?> file4;
        Locale locale2;
        List list2;
        if (continuation instanceof C327281) {
            c327281 = (C327281) continuation;
            int i = c327281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327281.label = i - Integer.MIN_VALUE;
            } else {
                c327281 = new C327281(continuation);
            }
        }
        Object objOpen = c327281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = c327281.label;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    Iterator it = ((Iterable) file).iterator();
                    while (it.hasNext()) {
                        th2.addSuppressed((Throwable) it.next());
                    }
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
                file.add(e);
                file2 = r2;
                obj = file;
                PreloadedContentRepository preloadedContentRepository = this.preloadedContentRepository;
                c327281.L$0 = obj;
                c327281.L$1 = null;
                c327281.L$2 = null;
                c327281.L$3 = null;
                c327281.label = 5;
                objOpen = preloadedContentRepository.open(file2, locale, c327281);
                file = obj;
            } catch (HttpException e3) {
                e = e3;
                file.add(e);
                file2 = r2;
                obj = file;
                PreloadedContentRepository preloadedContentRepository2 = this.preloadedContentRepository;
                c327281.L$0 = obj;
                c327281.L$1 = null;
                c327281.L$2 = null;
                c327281.L$3 = null;
                c327281.label = 5;
                objOpen = preloadedContentRepository2.open(file2, locale, c327281);
                file = obj;
            }
        } catch (IOException e4) {
            e = e4;
            file = locale;
            locale = r2;
            r2 = 3;
            file.add(e);
            file2 = r2;
            obj = file;
            PreloadedContentRepository preloadedContentRepository22 = this.preloadedContentRepository;
            c327281.L$0 = obj;
            c327281.L$1 = null;
            c327281.L$2 = null;
            c327281.L$3 = null;
            c327281.label = 5;
            objOpen = preloadedContentRepository22.open(file2, locale, c327281);
            file = obj;
        } catch (HttpException e5) {
            e = e5;
            file = locale;
            locale = r2;
            r2 = 3;
            file.add(e);
            file2 = r2;
            obj = file;
            PreloadedContentRepository preloadedContentRepository222 = this.preloadedContentRepository;
            c327281.L$0 = obj;
            c327281.L$1 = null;
            c327281.L$2 = null;
            c327281.L$3 = null;
            c327281.label = 5;
            objOpen = preloadedContentRepository222.open(file2, locale, c327281);
            file = obj;
        }
        if (r2 == 0) {
            ResultKt.throwOnFailure(objOpen);
            ArrayList arrayList = new ArrayList();
            try {
                LocalContentRepository localContentRepository2 = this.localContentRepository;
                c327281.L$0 = file;
                c327281.L$1 = locale;
                c327281.L$2 = arrayList;
                c327281.label = 1;
                Object objOpen2 = localContentRepository2.open(file, locale, c327281);
                if (objOpen2 != coroutine_suspended) {
                    return objOpen2;
                }
            } catch (IOException e6) {
                file3 = file;
                list = arrayList;
                e = e6;
            }
        } else {
            if (r2 != 1) {
                if (r2 == 2) {
                    list = (List) c327281.L$2;
                    locale = (Locale) c327281.L$1;
                    file3 = (AssetResource.File) c327281.L$0;
                    ResultKt.throwOnFailure(objOpen);
                    closeable = (Closeable) objOpen;
                    try {
                        localContentRepository = this.localContentRepository;
                        c327281.L$0 = file3;
                        c327281.L$1 = locale;
                        c327281.L$2 = list;
                        c327281.L$3 = closeable;
                        c327281.label = 3;
                        if (localContentRepository.store(file3, (BufferedSource) closeable, locale, c327281) != coroutine_suspended) {
                            file4 = file3;
                            locale2 = locale;
                            list2 = list;
                            closeable2 = closeable;
                            Unit unit = Unit.INSTANCE;
                            kotlin.p481io.Closeable.closeFinally(closeable2, null);
                            LocalContentRepository localContentRepository3 = this.localContentRepository;
                            c327281.L$0 = file4;
                            c327281.L$1 = locale2;
                            c327281.L$2 = list2;
                            c327281.L$3 = null;
                            c327281.label = 4;
                            Object objOpen3 = localContentRepository3.open(file4, locale2, c327281);
                            if (objOpen3 != coroutine_suspended) {
                            }
                        }
                    } catch (Throwable th3) {
                        closeable2 = closeable;
                        th = th3;
                        throw th;
                    }
                }
                if (r2 != 3) {
                    if (r2 == 4) {
                        ResultKt.throwOnFailure(objOpen);
                        return objOpen;
                    }
                    if (r2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list3 = (List) c327281.L$0;
                    ResultKt.throwOnFailure(objOpen);
                    file = list3;
                    return (Source) objOpen;
                }
                closeable2 = (Closeable) c327281.L$3;
                list2 = (List) c327281.L$2;
                locale2 = (Locale) c327281.L$1;
                file4 = (AssetResource.File) c327281.L$0;
                try {
                    ResultKt.throwOnFailure(objOpen);
                    Unit unit2 = Unit.INSTANCE;
                    kotlin.p481io.Closeable.closeFinally(closeable2, null);
                    LocalContentRepository localContentRepository32 = this.localContentRepository;
                    c327281.L$0 = file4;
                    c327281.L$1 = locale2;
                    c327281.L$2 = list2;
                    c327281.L$3 = null;
                    c327281.label = 4;
                    Object objOpen32 = localContentRepository32.open(file4, locale2, c327281);
                    return objOpen32 != coroutine_suspended ? coroutine_suspended : objOpen32;
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        throw th;
                    } catch (Throwable th5) {
                        kotlin.p481io.Closeable.closeFinally(closeable2, th);
                        throw th5;
                    }
                }
            }
            list = (List) c327281.L$2;
            locale = (Locale) c327281.L$1;
            file3 = (AssetResource.File) c327281.L$0;
            try {
                ResultKt.throwOnFailure(objOpen);
                return objOpen;
            } catch (IOException e7) {
                e = e7;
            }
        }
        list.add(e);
        ApiContentRepository apiContentRepository = this.apiContentRepository;
        c327281.L$0 = file3;
        c327281.L$1 = locale;
        c327281.L$2 = list;
        c327281.label = 2;
        objOpen = apiContentRepository.open(file3, locale, c327281);
        if (objOpen != coroutine_suspended) {
            closeable = (Closeable) objOpen;
            localContentRepository = this.localContentRepository;
            c327281.L$0 = file3;
            c327281.L$1 = locale;
            c327281.L$2 = list;
            c327281.L$3 = closeable;
            c327281.label = 3;
            if (localContentRepository.store(file3, (BufferedSource) closeable, locale, c327281) != coroutine_suspended) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.contentful.repository.ContentRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getUri(AssetResource.File<?> file, Locale locale, Continuation<? super Uri> continuation) {
        C327261 c327261;
        Uri uri;
        AssetResource.File<?> file2;
        Locale locale2;
        if (continuation instanceof C327261) {
            c327261 = (C327261) continuation;
            int i = c327261.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c327261.label = i - Integer.MIN_VALUE;
            } else {
                c327261 = new C327261(continuation);
            }
        }
        Object uri2 = c327261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c327261.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(uri2);
            LocalContentRepository localContentRepository = this.localContentRepository;
            c327261.L$0 = file;
            c327261.L$1 = locale;
            c327261.label = 1;
            uri2 = localContentRepository.getUri(file, locale, c327261);
            if (uri2 != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(uri2);
                return uri2;
            }
            locale2 = (Locale) c327261.L$1;
            file2 = (AssetResource.File) c327261.L$0;
            ResultKt.throwOnFailure(uri2);
            uri = (Uri) uri2;
            if (uri == null) {
                ApiContentRepository apiContentRepository = this.apiContentRepository;
                c327261.L$0 = null;
                c327261.L$1 = null;
                c327261.label = 3;
                Object uri3 = apiContentRepository.getUri(file2, locale2, c327261);
                return uri3 == coroutine_suspended ? coroutine_suspended : uri3;
            }
            return uri;
        }
        locale = (Locale) c327261.L$1;
        file = (AssetResource.File) c327261.L$0;
        ResultKt.throwOnFailure(uri2);
        uri = (Uri) uri2;
        if (uri == null) {
            PreloadedContentRepository preloadedContentRepository = this.preloadedContentRepository;
            c327261.L$0 = file;
            c327261.L$1 = locale;
            c327261.label = 2;
            uri2 = preloadedContentRepository.getUri(file, locale, c327261);
            if (uri2 != coroutine_suspended) {
                Locale locale3 = locale;
                file2 = file;
                locale2 = locale3;
                uri = (Uri) uri2;
                if (uri == null) {
                }
            }
        }
        return uri;
    }
}
