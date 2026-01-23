package com.robinhood.shared.i18n.locale;

import com.robinhood.android.util.notification.RhGcmListenerService;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: LocaleConfiguration.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;", "", "supportedLocales", "", "Ljava/util/Locale;", "getSupportedLocales", "()Ljava/util/Set;", "preferredLocales", "", RhGcmListenerService.EXTRA_CATEGORY, "Ljava/util/Locale$Category;", "acceptLanguageHeader", "", "lib-locale_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface LocaleConfiguration {
    String acceptLanguageHeader();

    Set<Locale> getSupportedLocales();

    List<Locale> preferredLocales(Locale.Category category);
}
