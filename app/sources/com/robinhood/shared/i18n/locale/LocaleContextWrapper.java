package com.robinhood.shared.i18n.locale;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* compiled from: LocaleContextWrapper.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/i18n/locale/LocaleContextWrapper;", "Landroid/content/ContextWrapper;", "base", "Landroid/content/Context;", "localeConfiguration", "Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;", "isRhc", "", "<init>", "(Landroid/content/Context;Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;Z)V", "attachBaseContext", "", "Companion", "lib-locale_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class LocaleContextWrapper extends ContextWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isRhc;
    private final LocaleConfiguration localeConfiguration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocaleContextWrapper(Context base, LocaleConfiguration localeConfiguration, boolean z) {
        super(base);
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(localeConfiguration, "localeConfiguration");
        this.localeConfiguration = localeConfiguration;
        this.isRhc = z;
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(INSTANCE.wrap(base, this.localeConfiguration, this.isRhc));
    }

    /* compiled from: LocaleContextWrapper.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/i18n/locale/LocaleContextWrapper$Companion;", "", "<init>", "()V", "wrap", "Landroid/content/Context;", "base", "localeConfiguration", "Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;", "isRhc", "", "lib-locale_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Context wrap(Context base, LocaleConfiguration localeConfiguration, boolean isRhc) {
            Intrinsics.checkNotNullParameter(base, "base");
            Intrinsics.checkNotNullParameter(localeConfiguration, "localeConfiguration");
            if (!isRhc) {
                return base;
            }
            Locale.Category category = Locale.Category.FORMAT;
            Locale locale = (Locale) CollectionsKt.first((List) localeConfiguration.preferredLocales(category));
            Locale.Category category2 = Locale.Category.DISPLAY;
            Locale locale2 = (Locale) CollectionsKt.first((List) localeConfiguration.preferredLocales(category2));
            Configuration configuration = base.getResources().getConfiguration();
            configuration.setLocale(locale);
            Locale.setDefault(category, locale);
            Locale.setDefault(category2, locale2);
            Timber.INSTANCE.mo3350d("LocaleContextWrapper", "Locales set, FORMAT to " + locale + ", DISPLAY to " + locale2);
            Context contextCreateConfigurationContext = base.createConfigurationContext(configuration);
            Intrinsics.checkNotNullExpressionValue(contextCreateConfigurationContext, "createConfigurationContext(...)");
            return contextCreateConfigurationContext;
        }
    }
}
