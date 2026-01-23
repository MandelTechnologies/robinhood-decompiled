package com.robinhood.shared.i18n.locale;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: SupportedLocaleRepository.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/i18n/locale/SupportedLocaleRepository;", "", "getSupportedLocale", "Ljava/util/Locale;", "fallbackLocale", "(Ljava/util/Locale;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-locale_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface SupportedLocaleRepository {
    Object getSupportedLocale(Locale locale, Continuation<? super Locale> continuation);

    /* compiled from: SupportedLocaleRepository.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getSupportedLocale$default(SupportedLocaleRepository supportedLocaleRepository, Locale locale, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSupportedLocale");
            }
            if ((i & 1) != 0) {
                locale = Locale.US;
            }
            return supportedLocaleRepository.getSupportedLocale(locale, continuation);
        }
    }
}
