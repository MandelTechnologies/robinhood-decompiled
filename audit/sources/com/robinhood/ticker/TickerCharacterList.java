package com.robinhood.ticker;

import com.robinhood.ticker.TickerView;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes12.dex */
class TickerCharacterList {
    private final Map<Character, Integer> characterIndicesMap;
    private final char[] characterList;
    private final int numOriginalCharacters;

    TickerCharacterList(String str) {
        int i = 0;
        if (str.contains(Character.toString((char) 0))) {
            throw new IllegalArgumentException("You cannot include TickerUtils.EMPTY_CHAR in the character list.");
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        this.numOriginalCharacters = length;
        this.characterIndicesMap = new HashMap(length);
        for (int i2 = 0; i2 < length; i2++) {
            this.characterIndicesMap.put(Character.valueOf(charArray[i2]), Integer.valueOf(i2));
        }
        char[] cArr = new char[(length * 2) + 1];
        this.characterList = cArr;
        cArr[0] = 0;
        while (i < length) {
            char[] cArr2 = this.characterList;
            int i3 = i + 1;
            cArr2[i3] = charArray[i];
            cArr2[length + 1 + i] = charArray[i];
            i = i3;
        }
    }

    CharacterIndices getCharacterIndices(char c, char c2, TickerView.ScrollingDirection scrollingDirection) {
        int indexOfChar = getIndexOfChar(c);
        int indexOfChar2 = getIndexOfChar(c2);
        if (indexOfChar < 0 || indexOfChar2 < 0) {
            return null;
        }
        int i = C416451.$SwitchMap$com$robinhood$ticker$TickerView$ScrollingDirection[scrollingDirection.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && c != 0 && c2 != 0) {
                    if (indexOfChar2 < indexOfChar) {
                        int i2 = indexOfChar - indexOfChar2;
                        int i3 = this.numOriginalCharacters;
                        if ((i3 - indexOfChar) + indexOfChar2 < i2) {
                            indexOfChar2 += i3;
                        }
                    } else if (indexOfChar < indexOfChar2) {
                        int i4 = indexOfChar2 - indexOfChar;
                        int i5 = this.numOriginalCharacters;
                        if ((i5 - indexOfChar2) + indexOfChar < i4) {
                            indexOfChar += i5;
                        }
                    }
                }
            } else if (indexOfChar < indexOfChar2) {
                indexOfChar += this.numOriginalCharacters;
            }
        } else if (c2 == 0) {
            indexOfChar2 = this.characterList.length;
        } else if (indexOfChar2 < indexOfChar) {
            indexOfChar2 += this.numOriginalCharacters;
        }
        return new CharacterIndices(indexOfChar, indexOfChar2);
    }

    /* renamed from: com.robinhood.ticker.TickerCharacterList$1 */
    static /* synthetic */ class C416451 {
        static final /* synthetic */ int[] $SwitchMap$com$robinhood$ticker$TickerView$ScrollingDirection;

        static {
            int[] iArr = new int[TickerView.ScrollingDirection.values().length];
            $SwitchMap$com$robinhood$ticker$TickerView$ScrollingDirection = iArr;
            try {
                iArr[TickerView.ScrollingDirection.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$robinhood$ticker$TickerView$ScrollingDirection[TickerView.ScrollingDirection.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$robinhood$ticker$TickerView$ScrollingDirection[TickerView.ScrollingDirection.ANY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    Set<Character> getSupportedCharacters() {
        return this.characterIndicesMap.keySet();
    }

    char[] getCharacterList() {
        return this.characterList;
    }

    private int getIndexOfChar(char c) {
        if (c == 0) {
            return 0;
        }
        if (this.characterIndicesMap.containsKey(Character.valueOf(c))) {
            return this.characterIndicesMap.get(Character.valueOf(c)).intValue() + 1;
        }
        return -1;
    }

    class CharacterIndices {
        final int endIndex;
        final int startIndex;

        public CharacterIndices(int i, int i2) {
            this.startIndex = i;
            this.endIndex = i2;
        }
    }
}
