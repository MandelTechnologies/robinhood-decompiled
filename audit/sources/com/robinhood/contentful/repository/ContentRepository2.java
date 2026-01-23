package com.robinhood.contentful.repository;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ContentRepository.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0080@¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"getLocale", "Ljava/util/Locale;", "Lcom/robinhood/contentful/repository/ContentRepository;", "fallbackLocale", "(Lcom/robinhood/contentful/repository/ContentRepository;Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-contentful_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.contentful.repository.ContentRepositoryKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class ContentRepository2 {
    public static final Object getLocale(ContentRepository contentRepository, Locale locale, Continuation<? super Locale> continuation) {
        return contentRepository.getSupportedLocaleRepository().getSupportedLocale(locale, continuation);
    }
}
