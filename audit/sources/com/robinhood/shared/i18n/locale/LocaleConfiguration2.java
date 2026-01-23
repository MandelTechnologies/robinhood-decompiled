package com.robinhood.shared.i18n.locale;

import androidx.core.os.LocaleListCompat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;

/* compiled from: LocaleConfiguration.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0006"}, m3636d2 = {"asList", "", "Ljava/util/Locale;", "Landroidx/core/os/LocaleListCompat;", "generateAcceptLanguageHeader", "", "lib-locale_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.i18n.locale.LocaleConfigurationKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class LocaleConfiguration2 {

    /* compiled from: LocaleConfiguration.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.i18n.locale.LocaleConfigurationKt$asList$1 */
    /* synthetic */ class C390301 extends FunctionReferenceImpl implements Function1<Integer, Locale> {
        C390301(Object obj) {
            super(1, obj, LocaleListCompat.class, "get", "get(I)Ljava/util/Locale;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Locale invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Locale invoke(int i) {
            return ((LocaleListCompat) this.receiver).get(i);
        }
    }

    public static final List<Locale> asList(LocaleListCompat localeListCompat) {
        Intrinsics.checkNotNullParameter(localeListCompat, "<this>");
        return SequencesKt.toList(SequencesKt.mapNotNull(CollectionsKt.asSequence(RangesKt.until(0, localeListCompat.size())), new C390301(localeListCompat)));
    }

    public static final String generateAcceptLanguageHeader(List<Locale> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt.joinToString$default(CollectionsKt.withIndex(CollectionsKt.take(list, 10)), ", ", null, null, 0, null, new Function1() { // from class: com.robinhood.shared.i18n.locale.LocaleConfigurationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LocaleConfiguration2.generateAcceptLanguageHeader$lambda$0((IndexedValue) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence generateAcceptLanguageHeader$lambda$0(IndexedValue indexedValue) {
        Intrinsics.checkNotNullParameter(indexedValue, "<destruct>");
        int index = indexedValue.getIndex();
        Locale locale = (Locale) indexedValue.component2();
        if (index == 0) {
            String languageTag = locale.toLanguageTag();
            Intrinsics.checkNotNull(languageTag);
            return languageTag;
        }
        String str = String.format(Locale.US, "%s;q=%.1f", Arrays.copyOf(new Object[]{locale.toLanguageTag(), Double.valueOf((10 - index) / 10.0d)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
