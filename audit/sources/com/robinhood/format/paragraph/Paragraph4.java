package com.robinhood.format.paragraph;

import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Paragraph.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002\u001a\u001a\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0006"}, m3636d2 = {"joinToParagraph", "Lcom/robinhood/utils/resource/StringResource;", "", "buildParagraph", "firstSentence", "secondSentence", "lib-format-paragraph_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.format.paragraph.ParagraphKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class Paragraph4 {
    public static final StringResource joinToParagraph(List<? extends StringResource> list) {
        StringResource stringResourceJoinToParagraph;
        Intrinsics.checkNotNullParameter(list, "<this>");
        StringResource stringResourceInvoke = (StringResource) CollectionsKt.firstOrNull((List) list);
        if (stringResourceInvoke == null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke("");
        }
        int size = list.size();
        if (size == 0 || size == 1) {
            stringResourceJoinToParagraph = null;
        } else if (size == 2) {
            stringResourceJoinToParagraph = (StringResource) CollectionsKt.last((List) list);
        } else {
            stringResourceJoinToParagraph = joinToParagraph(list.subList(1, list.size()));
        }
        return buildParagraph(stringResourceInvoke, stringResourceJoinToParagraph);
    }

    private static final StringResource buildParagraph(StringResource stringResource, StringResource stringResource2) {
        return stringResource2 != null ? StringResource.INSTANCE.invoke(C33206R.string.paragraph_joiner, stringResource, stringResource2) : stringResource;
    }
}
