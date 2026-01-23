package org.bitbucket.cowwoc.diffmatchpatch;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* compiled from: DiffMatchPatches.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0002\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a:\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¨\u0006\u0011"}, m3636d2 = {"diffWordMode", "Ljava/util/LinkedList;", "Lorg/bitbucket/cowwoc/diffmatchpatch/DiffMatchPatch$Diff;", "Lorg/bitbucket/cowwoc/diffmatchpatch/DiffMatchPatch;", "text1", "", "text2", "diffLinesToWords", "Lorg/bitbucket/cowwoc/diffmatchpatch/DiffMatchPatch$LinesToCharsResult;", "diffLinesToWordsMunge", "text", "wordArray", "", "wordHash", "", "", "maxLines", "lib-diff-match-patch_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatchesKt, reason: use source file name */
/* loaded from: classes25.dex */
public final class DiffMatchPatches {
    public static final LinkedList<DiffMatchPatch.Diff> diffWordMode(DiffMatchPatch diffMatchPatch, String text1, String text2) {
        Intrinsics.checkNotNullParameter(diffMatchPatch, "<this>");
        Intrinsics.checkNotNullParameter(text1, "text1");
        Intrinsics.checkNotNullParameter(text2, "text2");
        DiffMatchPatch.LinesToCharsResult linesToCharsResultDiffLinesToWords = diffLinesToWords(text1 + PlaceholderUtils.XXShortPlaceholderText, text2 + PlaceholderUtils.XXShortPlaceholderText);
        String str = linesToCharsResultDiffLinesToWords.chars1;
        String str2 = linesToCharsResultDiffLinesToWords.chars2;
        List<String> list = linesToCharsResultDiffLinesToWords.lineArray;
        LinkedList<DiffMatchPatch.Diff> linkedListDiffMain = diffMatchPatch.diffMain(str, str2, false);
        diffMatchPatch.diffCharsToLines(linkedListDiffMain, list);
        Intrinsics.checkNotNull(linkedListDiffMain);
        return linkedListDiffMain;
    }

    private static final DiffMatchPatch.LinesToCharsResult diffLinesToWords(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        arrayList.add("");
        return new DiffMatchPatch.LinesToCharsResult(diffLinesToWordsMunge(str, arrayList, linkedHashMap, 40000), diffLinesToWordsMunge(str2, arrayList, linkedHashMap, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH), arrayList);
    }

    private static final String diffLinesToWordsMunge(String str, List<String> list, Map<String, Integer> map, int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        int i3 = -1;
        while (i3 < str.length() - 1) {
            String str2 = str;
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, ' ', i2, false, 4, (Object) null);
            if (iIndexOf$default == -1) {
                iIndexOf$default = str2.length() - 1;
            }
            String strSubstring = str2.substring(i2, iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (map.containsKey(strSubstring)) {
                Integer num = map.get(strSubstring);
                Intrinsics.checkNotNull(num, "null cannot be cast to non-null type kotlin.Int");
                sb.append((char) num.intValue());
            } else {
                if (list.size() == i) {
                    strSubstring = str2.substring(i2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    iIndexOf$default = str2.length();
                }
                list.add(strSubstring);
                map.put(strSubstring, Integer.valueOf(list.size() - 1));
                sb.append((char) (list.size() - 1));
            }
            i3 = iIndexOf$default;
            i2 = i3 + 1;
            str = str2;
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }
}
