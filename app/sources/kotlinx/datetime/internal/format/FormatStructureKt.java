package kotlinx.datetime.internal.format;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FormatStructure.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\"\u0004\b\u0000\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u0002¨\u0006\u0006"}, m3636d2 = {"basicFormats", "", "Lkotlinx/datetime/internal/format/FieldFormatDirective;", "T", "format", "Lkotlinx/datetime/internal/format/FormatStructure;", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class FormatStructureKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<FieldFormatDirective<T>> basicFormats(FormatStructure<? super T> formatStructure) {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        basicFormats$lambda$2$rec(listCreateListBuilder, formatStructure);
        return CollectionsKt.build(listCreateListBuilder);
    }

    private static final <T> void basicFormats$lambda$2$rec(List<FieldFormatDirective<T>> list, FormatStructure<? super T> formatStructure) {
        if (formatStructure instanceof BasicFormatStructure) {
            list.add(((BasicFormatStructure) formatStructure).getDirective());
            return;
        }
        if (!(formatStructure instanceof ConcatenatedFormatStructure)) {
            if (formatStructure instanceof ConstantFormatStructure) {
                return;
            }
            if (formatStructure instanceof SignedFormatStructure) {
                basicFormats$lambda$2$rec(list, ((SignedFormatStructure) formatStructure).getFormat());
                return;
            }
            if (formatStructure instanceof AlternativesParsing) {
                AlternativesParsing alternativesParsing = (AlternativesParsing) formatStructure;
                basicFormats$lambda$2$rec(list, alternativesParsing.getMainFormat());
                Iterator<T> it = alternativesParsing.getFormats().iterator();
                while (it.hasNext()) {
                    basicFormats$lambda$2$rec(list, (FormatStructure) it.next());
                }
                return;
            }
            if (formatStructure instanceof Optional) {
                basicFormats$lambda$2$rec(list, ((Optional) formatStructure).getFormat());
                return;
            }
            return;
        }
        Iterator<T> it2 = ((ConcatenatedFormatStructure) formatStructure).getFormats().iterator();
        while (it2.hasNext()) {
            basicFormats$lambda$2$rec(list, (NonConcatenatedFormatStructure) it2.next());
        }
    }
}
