package format;

import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import utils.AnyUtils;
import utils.ListUtils3;

/* compiled from: DecimalFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J7\u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lformat/DecimalFormatter;", "", "", "formattedArgument", "Lkotlin/Function2;", "", "formatFloatingPoint", "formatAsFloatingDecimal", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;", "operations-stdlib"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface DecimalFormatter {

    /* compiled from: DecimalFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class DefaultImpls {
        public static String formatDecimal(DecimalFormatter decimalFormatter, Object obj, Object obj2, Function2<? super String, ? super Double, String> formatFloatingPoint) {
            Object objM28550constructorimpl;
            Intrinsics.checkNotNullParameter(formatFloatingPoint, "formatFloatingPoint");
            List<Object> asList = AnyUtils.getAsList(obj);
            String strValueOf = String.valueOf(CollectionsKt.firstOrNull((List) asList));
            String strValueOf2 = String.valueOf(ListUtils3.secondOrNull(asList));
            try {
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(formatAsFloatingDecimal(decimalFormatter, strValueOf, strValueOf2, formatFloatingPoint));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m28553exceptionOrNullimpl(objM28550constructorimpl) == null) {
                return (String) objM28550constructorimpl;
            }
            return null;
        }

        private static String formatAsFloatingDecimal(DecimalFormatter decimalFormatter, String str, String str2, Function2<? super String, ? super Double, String> function2) {
            Double doubleOrNull;
            if (!new Regex("%[\\d|.]*[f]").matches(str) || (doubleOrNull = StringsKt.toDoubleOrNull(str2)) == null) {
                return null;
            }
            return function2.invoke(str, Double.valueOf(doubleOrNull.doubleValue()));
        }
    }
}
