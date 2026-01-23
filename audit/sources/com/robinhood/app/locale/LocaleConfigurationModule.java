package com.robinhood.app.locale;

import androidx.core.os.LocaleListCompat;
import com.robinhood.shared.i18n.locale.LocaleConfiguration;
import com.robinhood.shared.i18n.locale.LocaleConfiguration2;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocaleConfigurationModule.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/app/locale/LocaleConfigurationModule;", "", "<init>", "()V", "provideLocaleConfiguration", "Lcom/robinhood/shared/i18n/locale/LocaleConfiguration;", "app-2025.51.4_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class LocaleConfigurationModule {
    public static final LocaleConfigurationModule INSTANCE = new LocaleConfigurationModule();

    private LocaleConfigurationModule() {
    }

    public final LocaleConfiguration provideLocaleConfiguration() {
        return new LocaleConfiguration() { // from class: com.robinhood.app.locale.LocaleConfigurationModule.provideLocaleConfiguration.1
            private final Set<Locale> supportedLocales;

            /* compiled from: LocaleConfigurationModule.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.app.locale.LocaleConfigurationModule$provideLocaleConfiguration$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Locale.Category.values().length];
                    try {
                        iArr[Locale.Category.DISPLAY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Locale.Category.FORMAT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                Set setCreateSetBuilder = SetsKt.createSetBuilder();
                Locale localeForLanguageTag = Locale.forLanguageTag("en");
                Intrinsics.checkNotNullExpressionValue(localeForLanguageTag, "forLanguageTag(...)");
                setCreateSetBuilder.add(localeForLanguageTag);
                Locale localeForLanguageTag2 = Locale.forLanguageTag("en-GB");
                Intrinsics.checkNotNullExpressionValue(localeForLanguageTag2, "forLanguageTag(...)");
                setCreateSetBuilder.add(localeForLanguageTag2);
                this.supportedLocales = SetsKt.build(setCreateSetBuilder);
            }

            @Override // com.robinhood.shared.i18n.locale.LocaleConfiguration
            public Set<Locale> getSupportedLocales() {
                return this.supportedLocales;
            }

            @Override // com.robinhood.shared.i18n.locale.LocaleConfiguration
            public List<Locale> preferredLocales(Locale.Category category) {
                Intrinsics.checkNotNullParameter(category, "category");
                List<Locale> listPreferredMatchingLocales = preferredMatchingLocales();
                LocaleListCompat adjustedDefault = LocaleListCompat.getAdjustedDefault();
                Intrinsics.checkNotNullExpressionValue(adjustedDefault, "getAdjustedDefault(...)");
                int i = WhenMappings.$EnumSwitchMapping$0[category.ordinal()];
                if (i == 1) {
                    return listPreferredMatchingLocales.isEmpty() ? CollectionsKt.listOf(Locale.ENGLISH) : listPreferredMatchingLocales;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (listPreferredMatchingLocales.isEmpty()) {
                    if (adjustedDefault.isEmpty()) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("OS locale list is empty"), false, null, 4, null);
                    }
                    Locale locale = adjustedDefault.get(0);
                    if (locale == null) {
                        locale = Locale.ENGLISH;
                    }
                    return CollectionsKt.listOf(locale);
                }
                return CollectionsKt.listOf(listPreferredMatchingLocales.get(0));
            }

            @Override // com.robinhood.shared.i18n.locale.LocaleConfiguration
            public String acceptLanguageHeader() {
                LocaleListCompat adjustedDefault = LocaleListCompat.getAdjustedDefault();
                Intrinsics.checkNotNullExpressionValue(adjustedDefault, "getAdjustedDefault(...)");
                return LocaleConfiguration2.generateAcceptLanguageHeader(CollectionsKt.distinct(CollectionsKt.plus((Collection) preferredMatchingLocales(), (Iterable) LocaleConfiguration2.asList(adjustedDefault))));
            }

            private final List<Locale> preferredMatchingLocales() {
                Locale firstMatch;
                Object next;
                LocaleListCompat adjustedDefault = LocaleListCompat.getAdjustedDefault();
                Intrinsics.checkNotNullExpressionValue(adjustedDefault, "getAdjustedDefault(...)");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Set<Locale> supportedLocales = getSupportedLocales();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(supportedLocales, 10));
                Iterator<T> it = supportedLocales.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Locale) it.next()).toLanguageTag());
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                for (int i = 0; i < 3 && (firstMatch = adjustedDefault.getFirstMatch(strArr)) != null && !linkedHashSet.contains(firstMatch); i++) {
                    Iterator<T> it2 = getSupportedLocales().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (Intrinsics.areEqual(((Locale) next).getLanguage(), firstMatch.getLanguage())) {
                            break;
                        }
                    }
                    if (next == null) {
                        break;
                    }
                    linkedHashSet.add(firstMatch);
                    List listCreateListBuilder = CollectionsKt.createListBuilder();
                    int size = adjustedDefault.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Locale locale = adjustedDefault.get(i2);
                        if (!Intrinsics.areEqual(locale, firstMatch)) {
                            listCreateListBuilder.add(locale);
                        }
                    }
                    Locale[] localeArr = (Locale[]) CollectionsKt.build(listCreateListBuilder).toArray(new Locale[0]);
                    adjustedDefault = LocaleListCompat.create((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
                    Intrinsics.checkNotNullExpressionValue(adjustedDefault, "create(...)");
                }
                return CollectionsKt.toList(linkedHashSet);
            }
        };
    }
}
