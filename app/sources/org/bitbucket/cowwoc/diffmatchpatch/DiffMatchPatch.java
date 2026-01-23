package org.bitbucket.cowwoc.diffmatchpatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;

/* loaded from: classes25.dex */
public final class DiffMatchPatch {
    public float diffTimeout = 1.0f;
    public short diffEditCost = 4;
    public float matchThreshold = 0.5f;
    public int matchDistance = 1000;
    public float patchDeleteThreshold = 0.5f;
    public short patchMargin = 4;
    private final short matchMaxBits = 32;
    private final Pattern BLANKLINEEND = Pattern.compile("\\n\\r?\\n\\Z", 32);
    private final Pattern BLANKLINESTART = Pattern.compile("\\A\\r?\\n\\r?\\n", 32);

    public enum Operation {
        DELETE,
        INSERT,
        EQUAL
    }

    static class LinesToCharsResult {
        final String chars1;
        final String chars2;
        final List<String> lineArray;

        LinesToCharsResult(String str, String str2, List<String> list) {
            this.chars1 = str;
            this.chars2 = str2;
            this.lineArray = list;
        }
    }

    public LinkedList<Diff> diffMain(String str, String str2) {
        return diffMain(str, str2, true);
    }

    public LinkedList<Diff> diffMain(String str, String str2, boolean z) {
        return diffMain(str, str2, z, this.diffTimeout <= 0.0f ? Long.MAX_VALUE : System.currentTimeMillis() + ((long) (this.diffTimeout * 1000.0f)));
    }

    private LinkedList<Diff> diffMain(String str, String str2, boolean z, long j) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Null inputs. (diffMain)");
        }
        if (str.equals(str2)) {
            LinkedList<Diff> linkedList = new LinkedList<>();
            if (str.length() != 0) {
                linkedList.add(new Diff(Operation.EQUAL, str));
            }
            return linkedList;
        }
        int iDiffCommonPrefix = diffCommonPrefix(str, str2);
        String strSubstring = str.substring(0, iDiffCommonPrefix);
        String strSubstring2 = str.substring(iDiffCommonPrefix);
        String strSubstring3 = str2.substring(iDiffCommonPrefix);
        int iDiffCommonSuffix = diffCommonSuffix(strSubstring2, strSubstring3);
        String strSubstring4 = strSubstring2.substring(strSubstring2.length() - iDiffCommonSuffix);
        LinkedList<Diff> linkedListDiffCompute = diffCompute(strSubstring2.substring(0, strSubstring2.length() - iDiffCommonSuffix), strSubstring3.substring(0, strSubstring3.length() - iDiffCommonSuffix), z, j);
        if (strSubstring.length() != 0) {
            linkedListDiffCompute.addFirst(new Diff(Operation.EQUAL, strSubstring));
        }
        if (strSubstring4.length() != 0) {
            linkedListDiffCompute.addLast(new Diff(Operation.EQUAL, strSubstring4));
        }
        diffCleanupMerge(linkedListDiffCompute);
        return linkedListDiffCompute;
    }

    private LinkedList<Diff> diffCompute(String str, String str2, boolean z, long j) {
        LinkedList<Diff> linkedList = new LinkedList<>();
        if (str.length() == 0) {
            linkedList.add(new Diff(Operation.INSERT, str2));
            return linkedList;
        }
        if (str2.length() == 0) {
            linkedList.add(new Diff(Operation.DELETE, str));
            return linkedList;
        }
        String str3 = str.length() > str2.length() ? str : str2;
        String str4 = str.length() > str2.length() ? str2 : str;
        int iIndexOf = str3.indexOf(str4);
        if (iIndexOf != -1) {
            Operation operation2 = str.length() > str2.length() ? Operation.DELETE : Operation.INSERT;
            linkedList.add(new Diff(operation2, str3.substring(0, iIndexOf)));
            linkedList.add(new Diff(Operation.EQUAL, str4));
            linkedList.add(new Diff(operation2, str3.substring(iIndexOf + str4.length())));
            return linkedList;
        }
        if (str4.length() == 1) {
            linkedList.add(new Diff(Operation.DELETE, str));
            linkedList.add(new Diff(Operation.INSERT, str2));
            return linkedList;
        }
        String[] strArrDiffHalfMatch = diffHalfMatch(str, str2);
        if (strArrDiffHalfMatch != null) {
            String str5 = strArrDiffHalfMatch[0];
            String str6 = strArrDiffHalfMatch[1];
            String str7 = strArrDiffHalfMatch[2];
            String str8 = strArrDiffHalfMatch[3];
            String str9 = strArrDiffHalfMatch[4];
            LinkedList<Diff> linkedListDiffMain = diffMain(str5, str7, z, j);
            LinkedList<Diff> linkedListDiffMain2 = diffMain(str6, str8, z, j);
            linkedListDiffMain.add(new Diff(Operation.EQUAL, str9));
            linkedListDiffMain.addAll(linkedListDiffMain2);
            return linkedListDiffMain;
        }
        if (z && str.length() > 100 && str2.length() > 100) {
            return diffLineMode(str, str2, j);
        }
        return diffBisect(str, str2, j);
    }

    private LinkedList<Diff> diffLineMode(String str, String str2, long j) {
        LinesToCharsResult linesToCharsResultDiffLinesToChars = diffLinesToChars(str, str2);
        String str3 = linesToCharsResultDiffLinesToChars.chars1;
        String str4 = linesToCharsResultDiffLinesToChars.chars2;
        List<String> list = linesToCharsResultDiffLinesToChars.lineArray;
        DiffMatchPatch diffMatchPatch = this;
        LinkedList<Diff> linkedListDiffMain = diffMatchPatch.diffMain(str3, str4, false, j);
        diffCharsToLines(linkedListDiffMain, list);
        diffCleanupSemantic(linkedListDiffMain);
        linkedListDiffMain.add(new Diff(Operation.EQUAL, ""));
        ListIterator<Diff> listIterator = linkedListDiffMain.listIterator();
        Diff next = listIterator.next();
        String str5 = "";
        String str6 = str5;
        int i = 0;
        int i2 = 0;
        while (next != null) {
            int i3 = C477101.f7153x3fe1b310[next.f10819operation.ordinal()];
            if (i3 == 1) {
                i++;
                str5 = str5 + next.text;
            } else if (i3 == 2) {
                i2++;
                str6 = str6 + next.text;
            } else if (i3 == 3) {
                if (i2 >= 1 && i >= 1) {
                    listIterator.previous();
                    for (int i4 = 0; i4 < i2 + i; i4++) {
                        listIterator.previous();
                        listIterator.remove();
                    }
                    Iterator<Diff> it = diffMatchPatch.diffMain(str6, str5, false, j).iterator();
                    while (it.hasNext()) {
                        listIterator.add(it.next());
                    }
                }
                str5 = "";
                str6 = str5;
                i = 0;
                i2 = 0;
            }
            next = listIterator.hasNext() ? listIterator.next() : null;
            diffMatchPatch = this;
        }
        linkedListDiffMain.removeLast();
        return linkedListDiffMain;
    }

    /* renamed from: org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch$1 */
    static /* synthetic */ class C477101 {

        /* renamed from: $SwitchMap$org$bitbucket$cowwoc$diffmatchpatch$DiffMatchPatch$Operation */
        static final /* synthetic */ int[] f7153x3fe1b310;

        static {
            int[] iArr = new int[Operation.values().length];
            f7153x3fe1b310 = iArr;
            try {
                iArr[Operation.INSERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7153x3fe1b310[Operation.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7153x3fe1b310[Operation.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:29:0x0077
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    java.util.LinkedList<org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch.Diff> diffBisect(java.lang.String r26, java.lang.String r27, long r28) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bitbucket.cowwoc.diffmatchpatch.DiffMatchPatch.diffBisect(java.lang.String, java.lang.String, long):java.util.LinkedList");
    }

    private LinkedList<Diff> diffBisectSplit(String str, String str2, int i, int i2, long j) {
        String strSubstring = str.substring(0, i);
        String strSubstring2 = str2.substring(0, i2);
        String strSubstring3 = str.substring(i);
        String strSubstring4 = str2.substring(i2);
        LinkedList<Diff> linkedListDiffMain = diffMain(strSubstring, strSubstring2, false, j);
        linkedListDiffMain.addAll(diffMain(strSubstring3, strSubstring4, false, j));
        return linkedListDiffMain;
    }

    LinesToCharsResult diffLinesToChars(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        arrayList.add("");
        return new LinesToCharsResult(diffLinesToCharsMunge(str, arrayList, map), diffLinesToCharsMunge(str2, arrayList, map), arrayList);
    }

    private String diffLinesToCharsMunge(String str, List<String> list, Map<String, Integer> map) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int iIndexOf = -1;
        while (iIndexOf < str.length() - 1) {
            iIndexOf = str.indexOf(10, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length() - 1;
            }
            int i2 = iIndexOf + 1;
            String strSubstring = str.substring(i, i2);
            if (map.containsKey(strSubstring)) {
                sb.append(String.valueOf((char) map.get(strSubstring).intValue()));
            } else {
                list.add(strSubstring);
                map.put(strSubstring, Integer.valueOf(list.size() - 1));
                sb.append(String.valueOf((char) (list.size() - 1)));
            }
            i = i2;
        }
        return sb.toString();
    }

    void diffCharsToLines(LinkedList<Diff> linkedList, List<String> list) {
        Iterator<Diff> it = linkedList.iterator();
        while (it.hasNext()) {
            Diff next = it.next();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < next.text.length(); i++) {
                sb.append(list.get(next.text.charAt(i)));
            }
            next.text = sb.toString();
        }
    }

    public int diffCommonPrefix(String str, String str2) {
        int iMin = Math.min(str.length(), str2.length());
        for (int i = 0; i < iMin; i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                return i;
            }
        }
        return iMin;
    }

    public int diffCommonSuffix(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int iMin = Math.min(length, length2);
        for (int i = 1; i <= iMin; i++) {
            if (str.charAt(length - i) != str2.charAt(length2 - i)) {
                return i - 1;
            }
        }
        return iMin;
    }

    int diffCommonOverlap(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        if (length == 0 || length2 == 0) {
            return 0;
        }
        if (length > length2) {
            str = str.substring(length - length2);
        } else if (length < length2) {
            str2 = str2.substring(0, length);
        }
        int iMin = Math.min(length, length2);
        if (str.equals(str2)) {
            return iMin;
        }
        int i = 1;
        int i2 = 0;
        while (true) {
            int iIndexOf = str2.indexOf(str.substring(iMin - i));
            if (iIndexOf == -1) {
                return i2;
            }
            i += iIndexOf;
            if (iIndexOf == 0 || str.substring(iMin - i).equals(str2.substring(0, i))) {
                i2 = i;
                i++;
            }
        }
    }

    String[] diffHalfMatch(String str, String str2) {
        if (this.diffTimeout <= 0.0f) {
            return null;
        }
        String str3 = str.length() > str2.length() ? str : str2;
        String str4 = str.length() > str2.length() ? str2 : str;
        if (str3.length() < 4 || str4.length() * 2 < str3.length()) {
            return null;
        }
        String[] strArrDiffHalfMatchI = diffHalfMatchI(str3, str4, (str3.length() + 3) / 4);
        String[] strArrDiffHalfMatchI2 = diffHalfMatchI(str3, str4, (str3.length() + 1) / 2);
        if (strArrDiffHalfMatchI == null && strArrDiffHalfMatchI2 == null) {
            return null;
        }
        if (strArrDiffHalfMatchI2 != null && (strArrDiffHalfMatchI == null || strArrDiffHalfMatchI[4].length() <= strArrDiffHalfMatchI2[4].length())) {
            strArrDiffHalfMatchI = strArrDiffHalfMatchI2;
        }
        return str.length() > str2.length() ? strArrDiffHalfMatchI : new String[]{strArrDiffHalfMatchI[2], strArrDiffHalfMatchI[3], strArrDiffHalfMatchI[0], strArrDiffHalfMatchI[1], strArrDiffHalfMatchI[4]};
    }

    private String[] diffHalfMatchI(String str, String str2, int i) {
        String strSubstring = str.substring(i, (str.length() / 4) + i);
        int i2 = -1;
        String str3 = "";
        int iIndexOf = -1;
        String str4 = "";
        String str5 = str4;
        String str6 = str5;
        String strSubstring2 = str6;
        while (true) {
            iIndexOf = str2.indexOf(strSubstring, iIndexOf + 1);
            if (iIndexOf == i2) {
                break;
            }
            int iDiffCommonPrefix = diffCommonPrefix(str.substring(i), str2.substring(iIndexOf));
            int iDiffCommonSuffix = diffCommonSuffix(str.substring(0, i), str2.substring(0, iIndexOf));
            if (str3.length() < iDiffCommonSuffix + iDiffCommonPrefix) {
                StringBuilder sb = new StringBuilder();
                int i3 = iIndexOf - iDiffCommonSuffix;
                sb.append(str2.substring(i3, iIndexOf));
                int i4 = iIndexOf + iDiffCommonPrefix;
                sb.append(str2.substring(iIndexOf, i4));
                String string2 = sb.toString();
                String strSubstring3 = str.substring(0, i - iDiffCommonSuffix);
                String strSubstring4 = str.substring(i + iDiffCommonPrefix);
                String strSubstring5 = str2.substring(0, i3);
                strSubstring2 = str2.substring(i4);
                str4 = strSubstring3;
                str5 = strSubstring4;
                str6 = strSubstring5;
                str3 = string2;
            }
            i2 = -1;
        }
        if (str3.length() * 2 >= str.length()) {
            return new String[]{str4, str5, str6, strSubstring2, str3};
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ea, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void diffCleanupSemantic(LinkedList<Diff> linkedList) {
        Diff next;
        Diff next2;
        if (linkedList.isEmpty()) {
            return;
        }
        Stack stack = new Stack();
        ListIterator<Diff> listIterator = linkedList.listIterator();
        Diff next3 = listIterator.next();
        String str = null;
        boolean z = false;
        int length = 0;
        int length2 = 0;
        int i = 0;
        int i2 = 0;
        while (next3 != null) {
            Operation operation2 = next3.f10819operation;
            if (operation2 == Operation.EQUAL) {
                stack.push(next3);
                str = next3.text;
                i = length;
                i2 = length2;
                length = 0;
                length2 = 0;
            } else {
                if (operation2 == Operation.INSERT) {
                    length += next3.text.length();
                } else {
                    length2 += next3.text.length();
                }
                if (str != null && str.length() <= Math.max(i, i2) && str.length() <= Math.max(length, length2)) {
                    while (next3 != stack.lastElement()) {
                        next3 = listIterator.previous();
                    }
                    listIterator.next();
                    listIterator.set(new Diff(Operation.DELETE, str));
                    listIterator.add(new Diff(Operation.INSERT, str));
                    stack.pop();
                    if (!stack.empty()) {
                        stack.pop();
                    }
                    if (stack.empty()) {
                        while (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                    } else {
                        while (((Diff) stack.lastElement()) != listIterator.previous()) {
                        }
                    }
                    z = true;
                    str = null;
                    length = 0;
                    length2 = 0;
                    i = 0;
                    i2 = 0;
                }
            }
            next3 = listIterator.hasNext() ? listIterator.next() : null;
        }
        if (z) {
            diffCleanupMerge(linkedList);
        }
        diffCleanupSemanticLossless(linkedList);
        ListIterator<Diff> listIterator2 = linkedList.listIterator();
        if (listIterator2.hasNext()) {
            next = listIterator2.next();
            if (listIterator2.hasNext()) {
                next2 = listIterator2.next();
            }
        } else {
            next = null;
            next2 = null;
        }
        while (next2 != null) {
            Operation operation3 = next.f10819operation;
            Operation operation4 = Operation.DELETE;
            if (operation3 == operation4) {
                Operation operation5 = next2.f10819operation;
                Operation operation6 = Operation.INSERT;
                if (operation5 == operation6) {
                    String str2 = next.text;
                    String str3 = next2.text;
                    int iDiffCommonOverlap = diffCommonOverlap(str2, str3);
                    int iDiffCommonOverlap2 = diffCommonOverlap(str3, str2);
                    if (iDiffCommonOverlap >= iDiffCommonOverlap2) {
                        double d = iDiffCommonOverlap;
                        if (d >= str2.length() / 2.0d || d >= str3.length() / 2.0d) {
                            listIterator2.previous();
                            listIterator2.add(new Diff(Operation.EQUAL, str3.substring(0, iDiffCommonOverlap)));
                            next.text = str2.substring(0, str2.length() - iDiffCommonOverlap);
                            next2.text = str3.substring(iDiffCommonOverlap);
                        }
                    } else {
                        double d2 = iDiffCommonOverlap2;
                        if (d2 >= str2.length() / 2.0d || d2 >= str3.length() / 2.0d) {
                            listIterator2.previous();
                            listIterator2.add(new Diff(Operation.EQUAL, str2.substring(0, iDiffCommonOverlap2)));
                            next.f10819operation = operation6;
                            next.text = str3.substring(0, str3.length() - iDiffCommonOverlap2);
                            next2.f10819operation = operation4;
                            next2.text = str2.substring(iDiffCommonOverlap2);
                        }
                    }
                    next = listIterator2.hasNext() ? listIterator2.next() : null;
                } else {
                    next = next2;
                }
            }
            next2 = listIterator2.hasNext() ? listIterator2.next() : null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x002f, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void diffCleanupSemanticLossless(LinkedList<Diff> linkedList) {
        Diff next;
        ListIterator<Diff> listIterator = linkedList.listIterator();
        Diff next2 = listIterator.hasNext() ? listIterator.next() : null;
        Diff next3 = listIterator.hasNext() ? listIterator.next() : null;
        if (listIterator.hasNext()) {
            next = listIterator.next();
            while (next != null) {
                Operation operation2 = next2.f10819operation;
                Operation operation3 = Operation.EQUAL;
                if (operation2 == operation3 && next.f10819operation == operation3) {
                    String strSubstring = next2.text;
                    String str = next3.text;
                    String str2 = next.text;
                    int iDiffCommonSuffix = diffCommonSuffix(strSubstring, str);
                    if (iDiffCommonSuffix != 0) {
                        String strSubstring2 = str.substring(str.length() - iDiffCommonSuffix);
                        strSubstring = strSubstring.substring(0, strSubstring.length() - iDiffCommonSuffix);
                        str = strSubstring2 + str.substring(0, str.length() - iDiffCommonSuffix);
                        str2 = strSubstring2 + str2;
                    }
                    String strSubstring3 = str2;
                    String str3 = strSubstring3;
                    int iDiffCleanupSemanticScore = diffCleanupSemanticScore(strSubstring, str) + diffCleanupSemanticScore(str, str2);
                    String str4 = str;
                    String str5 = str4;
                    String str6 = strSubstring;
                    while (str4.length() != 0 && strSubstring3.length() != 0 && str4.charAt(0) == strSubstring3.charAt(0)) {
                        str6 = str6 + str4.charAt(0);
                        str4 = str4.substring(1) + strSubstring3.charAt(0);
                        strSubstring3 = strSubstring3.substring(1);
                        int iDiffCleanupSemanticScore2 = diffCleanupSemanticScore(str6, str4) + diffCleanupSemanticScore(str4, strSubstring3);
                        if (iDiffCleanupSemanticScore2 >= iDiffCleanupSemanticScore) {
                            strSubstring = str6;
                            str5 = str4;
                            str3 = strSubstring3;
                            iDiffCleanupSemanticScore = iDiffCleanupSemanticScore2;
                        }
                    }
                    if (!next2.text.equals(strSubstring)) {
                        if (strSubstring.length() != 0) {
                            next2.text = strSubstring;
                        } else {
                            listIterator.previous();
                            listIterator.previous();
                            listIterator.previous();
                            listIterator.remove();
                            listIterator.next();
                            listIterator.next();
                        }
                        next3.text = str5;
                        if (str3.length() != 0) {
                            next.text = str3;
                            next2 = next3;
                            next3 = next;
                        } else {
                            listIterator.remove();
                        }
                    }
                } else {
                    next2 = next3;
                    next3 = next;
                }
                if (listIterator.hasNext()) {
                    next = listIterator.next();
                }
            }
            return;
        }
        next = null;
    }

    private int diffCleanupSemanticScore(String str, String str2) {
        if (str.length() == 0 || str2.length() == 0) {
            return 6;
        }
        char cCharAt = str.charAt(str.length() - 1);
        char cCharAt2 = str2.charAt(0);
        boolean zIsLetterOrDigit = Character.isLetterOrDigit(cCharAt);
        boolean zIsLetterOrDigit2 = Character.isLetterOrDigit(cCharAt2);
        boolean z = !zIsLetterOrDigit && Character.isWhitespace(cCharAt);
        boolean z2 = !zIsLetterOrDigit2 && Character.isWhitespace(cCharAt2);
        boolean z3 = z && Character.getType(cCharAt) == 15;
        boolean z4 = z2 && Character.getType(cCharAt2) == 15;
        boolean z5 = z3 && this.BLANKLINEEND.matcher(str).find();
        boolean z6 = z4 && this.BLANKLINESTART.matcher(str2).find();
        if (z5 || z6) {
            return 5;
        }
        if (z3 || z4) {
            return 4;
        }
        if (!zIsLetterOrDigit && !z && z2) {
            return 3;
        }
        if (z || z2) {
            return 2;
        }
        return (zIsLetterOrDigit && zIsLetterOrDigit2) ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0162 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void diffCleanupMerge(LinkedList<Diff> linkedList) {
        linkedList.add(new Diff(Operation.EQUAL, ""));
        ListIterator<Diff> listIterator = linkedList.listIterator();
        Diff next = listIterator.next();
        String strSubstring = "";
        String strSubstring2 = strSubstring;
        int i = 0;
        int i2 = 0;
        Diff diff = null;
        while (true) {
            if (next == null) {
                break;
            }
            int i3 = C477101.f7153x3fe1b310[next.f10819operation.ordinal()];
            if (i3 == 1) {
                i++;
                strSubstring = strSubstring + next.text;
            } else if (i3 == 2) {
                i2++;
                strSubstring2 = strSubstring2 + next.text;
            } else {
                if (i3 == 3) {
                    if (i2 + i > 1) {
                        boolean z = (i2 == 0 || i == 0) ? false : true;
                        listIterator.previous();
                        while (true) {
                            int i4 = i2 - 1;
                            if (i2 <= 0) {
                                break;
                            }
                            listIterator.previous();
                            listIterator.remove();
                            i2 = i4;
                        }
                        while (true) {
                            int i5 = i - 1;
                            if (i <= 0) {
                                break;
                            }
                            listIterator.previous();
                            listIterator.remove();
                            i = i5;
                        }
                        if (z) {
                            int iDiffCommonPrefix = diffCommonPrefix(strSubstring, strSubstring2);
                            if (iDiffCommonPrefix != 0) {
                                if (listIterator.hasPrevious()) {
                                    listIterator.previous().text += strSubstring.substring(0, iDiffCommonPrefix);
                                    listIterator.next();
                                } else {
                                    listIterator.add(new Diff(Operation.EQUAL, strSubstring.substring(0, iDiffCommonPrefix)));
                                }
                                strSubstring = strSubstring.substring(iDiffCommonPrefix);
                                strSubstring2 = strSubstring2.substring(iDiffCommonPrefix);
                            }
                            int iDiffCommonSuffix = diffCommonSuffix(strSubstring, strSubstring2);
                            if (iDiffCommonSuffix != 0) {
                                Diff next2 = listIterator.next();
                                next2.text = strSubstring.substring(strSubstring.length() - iDiffCommonSuffix) + next2.text;
                                strSubstring = strSubstring.substring(0, strSubstring.length() - iDiffCommonSuffix);
                                strSubstring2 = strSubstring2.substring(0, strSubstring2.length() - iDiffCommonSuffix);
                                listIterator.previous();
                            }
                        }
                        if (strSubstring2.length() != 0) {
                            listIterator.add(new Diff(Operation.DELETE, strSubstring2));
                        }
                        if (strSubstring.length() != 0) {
                            listIterator.add(new Diff(Operation.INSERT, strSubstring));
                        }
                        next = listIterator.hasNext() ? listIterator.next() : null;
                    } else if (diff != null) {
                        diff.text += next.text;
                        listIterator.remove();
                        next = listIterator.previous();
                        listIterator.next();
                    }
                    diff = next;
                    strSubstring = "";
                    strSubstring2 = strSubstring;
                    i = 0;
                    i2 = 0;
                }
                next = !listIterator.hasNext() ? listIterator.next() : null;
            }
            diff = null;
            if (!listIterator.hasNext()) {
            }
        }
        if (linkedList.getLast().text.length() == 0) {
            linkedList.removeLast();
        }
        ListIterator<Diff> listIterator2 = linkedList.listIterator();
        Diff next3 = listIterator2.hasNext() ? listIterator2.next() : null;
        Diff next4 = listIterator2.hasNext() ? listIterator2.next() : null;
        Diff next5 = listIterator2.hasNext() ? listIterator2.next() : null;
        boolean z2 = false;
        while (next5 != null) {
            Operation operation2 = next3.f10819operation;
            Operation operation3 = Operation.EQUAL;
            if (operation2 == operation3 && next5.f10819operation == operation3) {
                if (next4.text.endsWith(next3.text)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(next3.text);
                    String str = next4.text;
                    sb.append(str.substring(0, str.length() - next3.text.length()));
                    next4.text = sb.toString();
                    next5.text = next3.text + next5.text;
                    listIterator2.previous();
                    listIterator2.previous();
                    listIterator2.previous();
                    listIterator2.remove();
                    listIterator2.next();
                    next3 = listIterator2.next();
                    next4 = listIterator2.hasNext() ? listIterator2.next() : null;
                } else {
                    if (next4.text.startsWith(next5.text)) {
                        next3.text += next5.text;
                        next4.text = next4.text.substring(next5.text.length()) + next5.text;
                        listIterator2.remove();
                        Diff diff2 = next4;
                        next4 = listIterator2.hasNext() ? listIterator2.next() : null;
                        next3 = diff2;
                    }
                    next3 = next4;
                    next4 = next5;
                }
                z2 = true;
            } else {
                next3 = next4;
                next4 = next5;
            }
            next5 = listIterator2.hasNext() ? listIterator2.next() : null;
        }
        if (z2) {
            diffCleanupMerge(linkedList);
        }
    }

    public static class Diff {

        /* renamed from: operation, reason: collision with root package name */
        public Operation f10819operation;
        public String text;

        public Diff(Operation operation2, String str) {
            this.f10819operation = operation2;
            this.text = str;
        }

        public String toString() {
            return "Diff(" + this.f10819operation + ",\"" + this.text.replace('\n', (char) 182) + "\")";
        }

        public int hashCode() {
            Operation operation2 = this.f10819operation;
            int iHashCode = operation2 == null ? 0 : operation2.hashCode();
            String str = this.text;
            return iHashCode + ((str != null ? str.hashCode() : 0) * 31);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Diff diff = (Diff) obj;
            if (this.f10819operation != diff.f10819operation) {
                return false;
            }
            String str = this.text;
            if (str == null) {
                if (diff.text != null) {
                    return false;
                }
            } else if (!str.equals(diff.text)) {
                return false;
            }
            return true;
        }
    }
}
