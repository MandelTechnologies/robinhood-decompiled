package com.robinhood.utils.datetime.format;

import android.annotation.SuppressLint;
import com.robinhood.utils.datetime.TemporalTransformer;
import com.robinhood.utils.datetime.TemporalTransformer5;
import com.robinhood.utils.datetime.format.TemporalFormatter;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.format.FormatStyle;
import p479j$.time.temporal.TemporalAccessor;

/* compiled from: TemporalFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u0000 \b*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u00020\u0003:\u0003\t\n\bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "j$/time/temporal/TemporalAccessor", "T", "", "temporal", "", "format", "(Lj$/time/temporal/TemporalAccessor;)Ljava/lang/String;", "Companion", "Wrapped", "Transforming", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface TemporalFormatter<T extends TemporalAccessor> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    String format(T temporal);

    /* compiled from: TemporalFormatter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/utils/datetime/format/TemporalFormatter$Wrapped;", "j$/time/temporal/TemporalAccessor", "T", "Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "j$/time/format/DateTimeFormatter", "formatter", "<init>", "(Lj$/time/format/DateTimeFormatter;)V", "temporal", "", "format", "(Lj$/time/temporal/TemporalAccessor;)Ljava/lang/String;", "Lj$/time/format/DateTimeFormatter;", "getFormatter", "()Lj$/time/format/DateTimeFormatter;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SuppressLint({"UnsafeTemporalApi"})
    /* loaded from: classes12.dex */
    private static final class Wrapped<T extends TemporalAccessor> implements TemporalFormatter<T> {
        private final DateTimeFormatter formatter;

        public Wrapped(DateTimeFormatter formatter) {
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            this.formatter = formatter;
        }

        public final DateTimeFormatter getFormatter() {
            return this.formatter;
        }

        @Override // com.robinhood.utils.datetime.format.TemporalFormatter
        public String format(T temporal) {
            Intrinsics.checkNotNullParameter(temporal, "temporal");
            String str = this.formatter.withLocale(Companion.locale).format(temporal);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
    }

    /* compiled from: TemporalFormatter.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u0001*\b\b\u0002\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0004B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/utils/datetime/format/TemporalFormatter$Transforming;", "j$/time/temporal/TemporalAccessor", "T", "DelegateT", "Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "delegate", "Lcom/robinhood/utils/datetime/TemporalTransformer;", "transformer", "<init>", "(Lcom/robinhood/utils/datetime/format/TemporalFormatter;Lcom/robinhood/utils/datetime/TemporalTransformer;)V", "temporal", "", "format", "(Lj$/time/temporal/TemporalAccessor;)Ljava/lang/String;", "Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "getDelegate", "()Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "Lcom/robinhood/utils/datetime/TemporalTransformer;", "getTransformer", "()Lcom/robinhood/utils/datetime/TemporalTransformer;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    private static final class Transforming<T extends TemporalAccessor, DelegateT extends TemporalAccessor> implements TemporalFormatter<T> {
        private final TemporalFormatter<DelegateT> delegate;
        private final TemporalTransformer<T, DelegateT> transformer;

        /* JADX WARN: Multi-variable type inference failed */
        public Transforming(TemporalFormatter<? super DelegateT> delegate, TemporalTransformer<T, DelegateT> transformer) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(transformer, "transformer");
            this.delegate = delegate;
            this.transformer = transformer;
        }

        public final TemporalFormatter<DelegateT> getDelegate() {
            return this.delegate;
        }

        public final TemporalTransformer<T, DelegateT> getTransformer() {
            return this.transformer;
        }

        @Override // com.robinhood.utils.datetime.format.TemporalFormatter
        public String format(T temporal) {
            Intrinsics.checkNotNullParameter(temporal, "temporal");
            return this.delegate.format(this.transformer.transform(temporal));
        }
    }

    /* compiled from: TemporalFormatter.kt */
    @Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0001\u0010\u000e*\u00020\r2\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0001\u0010\u000e*\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0001\u0010\u000e*\u00020\r2\b\b\u0001\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0001\u0010\u000e*\u00020\r2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u001a2\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0001\u0010\u000e*\u00020\r2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"JI\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0001\u0010\u000e*\u00020\r\"\b\b\u0002\u0010#*\u00020\r2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00020\u00102\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020%¢\u0006\u0004\b'\u0010(JQ\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0001\u0010\u000e*\u00020\r\"\b\b\u0002\u0010#*\u00020\r2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00020\u00102\u0014\b\u0004\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010)JC\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010\"\b\b\u0001\u0010\u000e*\u00020\r2$\u0010*\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u0006¢\u0006\u0004\b+\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010,R$\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010-R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00061"}, m3636d2 = {"Lcom/robinhood/utils/datetime/format/TemporalFormatter$Companion;", "", "<init>", "()V", "Ljava/util/Locale;", "locale", "Lkotlin/Function1;", "", "", "getString", "", "init", "(Ljava/util/Locale;Lkotlin/jvm/functions/Function1;)V", "j$/time/temporal/TemporalAccessor", "T", "format", "Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "of", "(Lkotlin/jvm/functions/Function1;)Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "j$/time/format/DateTimeFormatter", "formatter", "wrapping", "(Lj$/time/format/DateTimeFormatter;)Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "patternRes", "ofPatternResource", "(I)Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "", "localityToPatternRes", "defaultPatternRes", "ofLocalizedPatternResource", "(Ljava/util/Map;I)Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "j$/time/format/FormatStyle", "formatStyle", "ofLocalizedTime", "(Lj$/time/format/FormatStyle;)Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "DelegateT", "delegate", "Lcom/robinhood/utils/datetime/TemporalTransformer;", "transformer", "transforming", "(Lcom/robinhood/utils/datetime/format/TemporalFormatter;Lcom/robinhood/utils/datetime/TemporalTransformer;)Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "(Lcom/robinhood/utils/datetime/format/TemporalFormatter;Lkotlin/jvm/functions/Function1;)Lcom/robinhood/utils/datetime/format/TemporalFormatter;", "block", "requireInitialized", "Ljava/util/Locale;", "Lkotlin/jvm/functions/Function1;", "", "patternFormatterCache", "Ljava/util/Map;", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static Function1<? super Integer, String> getString;
        private static Locale locale;
        private static final Map<String, DateTimeFormatter> patternFormatterCache;

        private Companion() {
        }

        static {
            Locale locale2 = Locale.getDefault(Locale.Category.FORMAT);
            Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
            locale = locale2;
            patternFormatterCache = new ConcurrentHashMap();
        }

        public static /* synthetic */ void init$default(Companion companion, Locale locale2, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                locale2 = Locale.getDefault(Locale.Category.FORMAT);
            }
            companion.init(locale2, function1);
        }

        public final void init(Locale locale2, Function1<? super Integer, String> getString2) {
            Intrinsics.checkNotNullParameter(locale2, "locale");
            Intrinsics.checkNotNullParameter(getString2, "getString");
            locale = locale2;
            getString = getString2;
        }

        /* renamed from: of */
        public final <T extends TemporalAccessor> TemporalFormatter<T> m2973of(final Function1<? super T, String> format2) {
            Intrinsics.checkNotNullParameter(format2, "format");
            return (TemporalFormatter<T>) new TemporalFormatter<T>() { // from class: com.robinhood.utils.datetime.format.TemporalFormatter$Companion$of$1
                /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/String; */
                @Override // com.robinhood.utils.datetime.format.TemporalFormatter
                public String format(TemporalAccessor temporal) {
                    Intrinsics.checkNotNullParameter(temporal, "temporal");
                    return format2.invoke(temporal);
                }
            };
        }

        public final <T extends TemporalAccessor> TemporalFormatter<T> ofLocalizedPatternResource(final Map<Locale, Integer> localityToPatternRes, final int defaultPatternRes) {
            Intrinsics.checkNotNullParameter(localityToPatternRes, "localityToPatternRes");
            return (TemporalFormatter<T>) new TemporalFormatter<T>() { // from class: com.robinhood.utils.datetime.format.TemporalFormatter$Companion$ofLocalizedPatternResource$$inlined$of$1
                /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/String; */
                @Override // com.robinhood.utils.datetime.format.TemporalFormatter
                public String format(TemporalAccessor temporal) {
                    Intrinsics.checkNotNullParameter(temporal, "temporal");
                    TemporalFormatter.Companion companion = TemporalFormatter.Companion.$$INSTANCE;
                    final Map map = localityToPatternRes;
                    final int i = defaultPatternRes;
                    return companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super T>>() { // from class: com.robinhood.utils.datetime.format.TemporalFormatter$Companion$ofLocalizedPatternResource$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Function1<? super Integer, ? extends String> function1) {
                            return invoke2((Function1<? super Integer, String>) function1);
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final TemporalFormatter<T> invoke2(Function1<? super Integer, String> getString2) {
                            Intrinsics.checkNotNullParameter(getString2, "getString");
                            Integer num = map.get(TemporalFormatter.Companion.locale);
                            int iIntValue = num != null ? num.intValue() : i;
                            TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                            Map map2 = TemporalFormatter.Companion.patternFormatterCache;
                            String strInvoke = getString2.invoke(Integer.valueOf(iIntValue));
                            Object objOfPattern = map2.get(strInvoke);
                            if (objOfPattern == null) {
                                objOfPattern = DateTimeFormatter.ofPattern(getString2.invoke(Integer.valueOf(iIntValue)), TemporalFormatter.Companion.locale);
                                Intrinsics.checkNotNullExpressionValue(objOfPattern, "ofPattern(...)");
                                map2.put(strInvoke, objOfPattern);
                            }
                            return companion2.wrapping((DateTimeFormatter) objOfPattern);
                        }
                    }).format(temporal);
                }
            };
        }

        public final <T extends TemporalAccessor> TemporalFormatter<T> ofLocalizedTime(final FormatStyle formatStyle) {
            Intrinsics.checkNotNullParameter(formatStyle, "formatStyle");
            return (TemporalFormatter<T>) new TemporalFormatter<T>() { // from class: com.robinhood.utils.datetime.format.TemporalFormatter$Companion$ofLocalizedTime$$inlined$of$1
                /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/String; */
                @Override // com.robinhood.utils.datetime.format.TemporalFormatter
                public String format(TemporalAccessor temporal) {
                    Intrinsics.checkNotNullParameter(temporal, "temporal");
                    TemporalFormatter.Companion companion = TemporalFormatter.Companion.$$INSTANCE;
                    final FormatStyle formatStyle2 = formatStyle;
                    return companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super T>>() { // from class: com.robinhood.utils.datetime.format.TemporalFormatter$Companion$ofLocalizedTime$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Function1<? super Integer, ? extends String> function1) {
                            return invoke2((Function1<? super Integer, String>) function1);
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final TemporalFormatter<T> invoke2(Function1<? super Integer, String> it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                            DateTimeFormatter dateTimeFormatterWithLocale = DateTimeFormatter.ofLocalizedTime(formatStyle2).withLocale(TemporalFormatter.Companion.locale);
                            Intrinsics.checkNotNullExpressionValue(dateTimeFormatterWithLocale, "withLocale(...)");
                            return companion2.wrapping(dateTimeFormatterWithLocale);
                        }
                    }).format(temporal);
                }
            };
        }

        public final <T extends TemporalAccessor> TemporalFormatter<T> ofPatternResource(final int patternRes) {
            return (TemporalFormatter<T>) new TemporalFormatter<T>() { // from class: com.robinhood.utils.datetime.format.TemporalFormatter$Companion$ofPatternResource$$inlined$of$1
                /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/String; */
                @Override // com.robinhood.utils.datetime.format.TemporalFormatter
                public String format(TemporalAccessor temporal) {
                    Intrinsics.checkNotNullParameter(temporal, "temporal");
                    TemporalFormatter.Companion companion = TemporalFormatter.Companion.$$INSTANCE;
                    final int i = patternRes;
                    return companion.requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super T>>() { // from class: com.robinhood.utils.datetime.format.TemporalFormatter$Companion$ofPatternResource$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Function1<? super Integer, ? extends String> function1) {
                            return invoke2((Function1<? super Integer, String>) function1);
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final TemporalFormatter<T> invoke2(Function1<? super Integer, String> getString2) {
                            Intrinsics.checkNotNullParameter(getString2, "getString");
                            TemporalFormatter.Companion companion2 = TemporalFormatter.Companion.$$INSTANCE;
                            Map map = TemporalFormatter.Companion.patternFormatterCache;
                            String strInvoke = getString2.invoke(Integer.valueOf(i));
                            int i2 = i;
                            Object objOfPattern = map.get(strInvoke);
                            if (objOfPattern == null) {
                                objOfPattern = DateTimeFormatter.ofPattern(getString2.invoke(Integer.valueOf(i2)), TemporalFormatter.Companion.locale);
                                Intrinsics.checkNotNullExpressionValue(objOfPattern, "ofPattern(...)");
                                map.put(strInvoke, objOfPattern);
                            }
                            return companion2.wrapping((DateTimeFormatter) objOfPattern);
                        }
                    }).format(temporal);
                }
            };
        }

        public final <T extends TemporalAccessor> TemporalFormatter<T> wrapping(final DateTimeFormatter formatter) {
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            return requireInitialized(new Function1() { // from class: com.robinhood.utils.datetime.format.TemporalFormatter$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TemporalFormatter.Companion.wrapping$lambda$0(formatter, (Function1) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TemporalFormatter wrapping$lambda$0(DateTimeFormatter dateTimeFormatter, Function1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Wrapped(dateTimeFormatter);
        }

        public final <T extends TemporalAccessor, DelegateT extends TemporalAccessor> TemporalFormatter<T> transforming(final TemporalFormatter<? super DelegateT> delegate, final TemporalTransformer<T, DelegateT> transformer) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(transformer, "transformer");
            return requireInitialized(new Function1() { // from class: com.robinhood.utils.datetime.format.TemporalFormatter$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TemporalFormatter.Companion.transforming$lambda$4(delegate, transformer, (Function1) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TemporalFormatter transforming$lambda$4(TemporalFormatter temporalFormatter, TemporalTransformer temporalTransformer, Function1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new Transforming(temporalFormatter, temporalTransformer);
        }

        public final <T extends TemporalAccessor, DelegateT extends TemporalAccessor> TemporalFormatter<T> transforming(final TemporalFormatter<? super DelegateT> delegate, final Function1<? super T, ? extends DelegateT> transformer) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(transformer, "transformer");
            return requireInitialized(new Function1<Function1<? super Integer, ? extends String>, TemporalFormatter<? super T>>() { // from class: com.robinhood.utils.datetime.format.TemporalFormatter$Companion$transforming$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Function1<? super Integer, ? extends String> function1) {
                    return invoke2((Function1<? super Integer, String>) function1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final TemporalFormatter<T> invoke2(Function1<? super Integer, String> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    TemporalFormatter.Companion companion = TemporalFormatter.Companion.$$INSTANCE;
                    Object obj = delegate;
                    TemporalTransformer.Companion companion2 = TemporalTransformer.INSTANCE;
                    return companion.transforming((TemporalFormatter) obj, (TemporalTransformer) new TemporalTransformer5(transformer));
                }
            });
        }

        public final <T extends TemporalAccessor> TemporalFormatter<T> requireInitialized(Function1<? super Function1<? super Integer, String>, ? extends TemporalFormatter<? super T>> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Function1<? super Integer, String> function1 = getString;
            if (function1 == null) {
                throw new IllegalArgumentException("You must call TemporalFormatter.init!");
            }
            return block.invoke(function1);
        }
    }
}
