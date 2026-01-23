package com.truelayer.payments.p419ui.utils;

import com.truelayer.payments.p419ui.utils.AnnotationInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

/* compiled from: HTMLMatcher.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/HTMLMatcher;", "", "()V", "Companion", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class HTMLMatcher {
    public static final int $stable = 0;
    private static final Regex BOLD_REGEX;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Regex HREF_DESC_REGEX;
    private static final Regex HREF_REGEX;
    private static final Regex ITALIC_REGEX;
    private static final Set<RegexOption> OPTIONS;
    private static final Regex SUPPORTED_TAG_REGEX;
    private static final Regex URL_REGEX;

    /* compiled from: HTMLMatcher.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J,\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a0\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J4\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a0\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J4\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a0\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J4\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a0\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u001a2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u0011\u0010\u0012\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0006¨\u0006$"}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/HTMLMatcher$Companion;", "", "()V", "BOLD_REGEX", "Lkotlin/text/Regex;", "getBOLD_REGEX", "()Lkotlin/text/Regex;", "HREF_DESC_REGEX", "getHREF_DESC_REGEX", "HREF_REGEX", "getHREF_REGEX", "ITALIC_REGEX", "getITALIC_REGEX", "OPTIONS", "", "Lkotlin/text/RegexOption;", "SUPPORTED_TAG_REGEX", "getSUPPORTED_TAG_REGEX", "URL_REGEX", "getURL_REGEX", "intoAnnotationInfo", "Lcom/truelayer/payments/ui/utils/AnnotationInfo;", "text", "", "match", "Lkotlin/Pair;", "", "Lcom/truelayer/payments/ui/utils/AnnotationInfo$Annotation;", "offset", "", "toBoldAnnotationInfo", "Lkotlin/text/MatchResult;", "toItalicAnnotationInfo", "toLinkAnnotationInfo", "urlsToLinkAnnotationInfo", "Lcom/truelayer/payments/ui/utils/AnnotationInfo$Annotation$LinkAnnotation;", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Regex getHREF_REGEX() {
            return HTMLMatcher.HREF_REGEX;
        }

        public final Regex getHREF_DESC_REGEX() {
            return HTMLMatcher.HREF_DESC_REGEX;
        }

        public final Regex getURL_REGEX() {
            return HTMLMatcher.URL_REGEX;
        }

        public final Regex getBOLD_REGEX() {
            return HTMLMatcher.BOLD_REGEX;
        }

        public final Regex getITALIC_REGEX() {
            return HTMLMatcher.ITALIC_REGEX;
        }

        public final Regex getSUPPORTED_TAG_REGEX() {
            return HTMLMatcher.SUPPORTED_TAG_REGEX;
        }

        public final AnnotationInfo intoAnnotationInfo(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            Tuples2<String, List<AnnotationInfo.Annotation>> tuples2Match = match(text, 0);
            AnnotationInfo annotationInfo = new AnnotationInfo(tuples2Match.getFirst(), CollectionsKt.filterNotNull(tuples2Match.getSecond()));
            return AnnotationInfo.copy$default(annotationInfo, null, CollectionsKt.plus((Collection) annotationInfo.getAnnotations(), (Iterable) urlsToLinkAnnotationInfo(annotationInfo.getDisplay())), 1, null);
        }

        private final Tuples2<String, List<AnnotationInfo.Annotation>> match(String text, int offset) {
            String first;
            ArrayList arrayList = new ArrayList();
            MatchResult matchResultFind$default = Regex.find$default(getSUPPORTED_TAG_REGEX(), text, 0, 2, null);
            while (matchResultFind$default != null) {
                if (getHREF_REGEX().matches(matchResultFind$default.getValue())) {
                    Tuples2<String, List<AnnotationInfo.Annotation>> linkAnnotationInfo = toLinkAnnotationInfo(text, matchResultFind$default, matchResultFind$default.getRange().getFirst() + offset);
                    first = linkAnnotationInfo.getFirst();
                    arrayList.addAll(linkAnnotationInfo.getSecond());
                } else if (getBOLD_REGEX().matches(matchResultFind$default.getValue())) {
                    Tuples2<String, List<AnnotationInfo.Annotation>> boldAnnotationInfo = toBoldAnnotationInfo(text, matchResultFind$default, matchResultFind$default.getRange().getFirst() + offset);
                    first = boldAnnotationInfo.getFirst();
                    arrayList.addAll(boldAnnotationInfo.getSecond());
                } else if (getITALIC_REGEX().matches(matchResultFind$default.getValue())) {
                    Tuples2<String, List<AnnotationInfo.Annotation>> italicAnnotationInfo = toItalicAnnotationInfo(text, matchResultFind$default, matchResultFind$default.getRange().getFirst() + offset);
                    first = italicAnnotationInfo.getFirst();
                    arrayList.addAll(italicAnnotationInfo.getSecond());
                } else {
                    matchResultFind$default = Regex.find$default(getSUPPORTED_TAG_REGEX(), text, 0, 2, null);
                }
                text = first;
                matchResultFind$default = Regex.find$default(getSUPPORTED_TAG_REGEX(), text, 0, 2, null);
            }
            return new Tuples2<>(text, arrayList);
        }

        private final Tuples2<String, List<AnnotationInfo.Annotation>> toBoldAnnotationInfo(String text, MatchResult match, int offset) {
            int first = match.getRange().getFirst();
            String strSubstring = text.substring(0, first);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = text.substring(first + 3, match.getRange().getLast() - 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            Tuples2<String, List<AnnotationInfo.Annotation>> tuples2Match = match(strSubstring2, offset);
            String first2 = tuples2Match.getFirst();
            String strSubstring3 = text.substring(match.getRange().getLast() + 1, text.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            return new Tuples2<>(strSubstring + ((Object) first2) + strSubstring3, CollectionsKt.plus((Collection<? extends AnnotationInfo.Annotation.BoldAnnotation>) tuples2Match.getSecond(), new AnnotationInfo.Annotation.BoldAnnotation(new PrimitiveRanges2(offset, tuples2Match.getFirst().length() + offset))));
        }

        private final Tuples2<String, List<AnnotationInfo.Annotation>> toItalicAnnotationInfo(String text, MatchResult match, int offset) {
            int first = match.getRange().getFirst();
            String strSubstring = text.substring(0, first);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = text.substring(first + 3, match.getRange().getLast() - 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            Tuples2<String, List<AnnotationInfo.Annotation>> tuples2Match = match(strSubstring2, offset);
            String first2 = tuples2Match.getFirst();
            String strSubstring3 = text.substring(match.getRange().getLast() + 1, text.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            return new Tuples2<>(strSubstring + ((Object) first2) + strSubstring3, CollectionsKt.plus((Collection<? extends AnnotationInfo.Annotation.ItalicAnnotation>) tuples2Match.getSecond(), new AnnotationInfo.Annotation.ItalicAnnotation(new PrimitiveRanges2(offset, tuples2Match.getFirst().length() + offset))));
        }

        private final Tuples2<String, List<AnnotationInfo.Annotation>> toLinkAnnotationInfo(String text, MatchResult match, int offset) {
            String strSubstring;
            String value;
            MatchResult matchResultFind$default = Regex.find$default(getURL_REGEX(), match.getValue(), 0, 2, null);
            if (matchResultFind$default == null || (value = matchResultFind$default.getValue()) == null) {
                strSubstring = null;
            } else {
                strSubstring = value.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            }
            MatchResult matchResultFind$default2 = Regex.find$default(getHREF_DESC_REGEX(), match.getValue(), 0, 2, null);
            String value2 = matchResultFind$default2 != null ? matchResultFind$default2.getValue() : null;
            if (value2 == null || value2.length() == 0) {
                return new Tuples2<>("", CollectionsKt.emptyList());
            }
            if (strSubstring == null || strSubstring.length() == 0) {
                return new Tuples2<>(value2, CollectionsKt.emptyList());
            }
            String strSubstring2 = text.substring(0, match.getRange().getFirst());
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            Tuples2<String, List<AnnotationInfo.Annotation>> tuples2Match = match(value2, offset);
            String first = tuples2Match.getFirst();
            String strSubstring3 = text.substring(match.getRange().getLast() + 1, text.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
            return new Tuples2<>(strSubstring2 + ((Object) first) + strSubstring3, CollectionsKt.plus((Collection<? extends AnnotationInfo.Annotation.LinkAnnotation>) tuples2Match.getSecond(), new AnnotationInfo.Annotation.LinkAnnotation(strSubstring, tuples2Match.getFirst(), new PrimitiveRanges2(offset, tuples2Match.getFirst().length() + offset))));
        }

        private final List<AnnotationInfo.Annotation.LinkAnnotation> urlsToLinkAnnotationInfo(String text) {
            List<MatchResult> list = SequencesKt.toList(Regex.findAll$default(getURL_REGEX(), text, 0, 2, null));
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (MatchResult matchResult : list) {
                String strSubstring = matchResult.getValue().substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                if (!StringsKt.startsWith$default(strSubstring, "https://", false, 2, (Object) null)) {
                    strSubstring = "https://" + strSubstring;
                }
                arrayList.add(new AnnotationInfo.Annotation.LinkAnnotation(strSubstring, strSubstring, new PrimitiveRanges2(matchResult.getRange().getFirst(), matchResult.getRange().getFirst() + strSubstring.length())));
            }
            return arrayList;
        }
    }

    static {
        Set<RegexOption> of = SetsKt.setOf((Object[]) new RegexOption[]{RegexOption.IGNORE_CASE, RegexOption.MULTILINE, RegexOption.DOT_MATCHES_ALL});
        OPTIONS = of;
        HREF_REGEX = new Regex("(<a href=\"?).*?(</a>)", of);
        HREF_DESC_REGEX = new Regex("(?<=\"?>).*?(?=</a>)", of);
        URL_REGEX = new Regex("(?:^|[\\W])((ht|f)tp(s?)://|www\\.)(([\\w\\-]+\\.){1,}?([\\w\\-.~]+/?)*[\\p{Alnum}.,%_=?&#\\-+()\\[\\]*$~@!:/{};']*)", of);
        BOLD_REGEX = new Regex("(<b>).*?(</b>)", of);
        ITALIC_REGEX = new Regex("(<i>).*?(</i>)", of);
        SUPPORTED_TAG_REGEX = new Regex("(<a href=\"?).*?(</a>)|(<b>).*?(</b>)|(<i>).*?(</i>)", of);
    }
}
