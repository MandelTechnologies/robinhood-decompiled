package androidx.compose.p011ui.text.font;

import androidx.compose.p011ui.text.font.FontWeight;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FontMatcher.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, m3636d2 = {"Landroidx/compose/ui/text/font/FontMatcher;", "", "<init>", "()V", "", "Landroidx/compose/ui/text/font/Font;", "fontList", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "matchFont-RetOiIg", "(Ljava/util/List;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "matchFont", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class FontMatcher {
    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m7699matchFontRetOiIg(List<? extends Font> fontList, FontWeight fontWeight, int fontStyle) {
        ArrayList arrayList = new ArrayList(fontList.size());
        List<? extends Font> list = fontList;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Font font = fontList.get(i2);
            Font font2 = font;
            if (Intrinsics.areEqual(font2.getWeight(), fontWeight) && FontStyle.m7703equalsimpl0(font2.mo7687getStyle_LCdwA(), fontStyle)) {
                arrayList.add(font);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(fontList.size());
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Font font3 = fontList.get(i3);
            if (FontStyle.m7703equalsimpl0(font3.mo7687getStyle_LCdwA(), fontStyle)) {
                arrayList2.add(font3);
            }
        }
        if (!arrayList2.isEmpty()) {
            fontList = arrayList2;
        }
        List<? extends Font> list2 = fontList;
        FontWeight.Companion companion = FontWeight.INSTANCE;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.getW400()) < 0) {
            List<? extends Font> list3 = list2;
            int size3 = list3.size();
            FontWeight fontWeight3 = null;
            int i4 = 0;
            while (true) {
                if (i4 >= size3) {
                    break;
                }
                FontWeight weight = list2.get(i4).getWeight();
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight2 = weight;
                        fontWeight3 = fontWeight2;
                        break;
                    }
                    if (fontWeight3 == null || weight.compareTo(fontWeight3) < 0) {
                        fontWeight3 = weight;
                    }
                } else if (fontWeight2 == null || weight.compareTo(fontWeight2) > 0) {
                    fontWeight2 = weight;
                }
                i4++;
            }
            if (fontWeight2 == null) {
                fontWeight2 = fontWeight3;
            }
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size4 = list3.size();
            while (i < size4) {
                Font font4 = list2.get(i);
                if (Intrinsics.areEqual(font4.getWeight(), fontWeight2)) {
                    arrayList3.add(font4);
                }
                i++;
            }
            return arrayList3;
        }
        if (fontWeight.compareTo(companion.getW500()) > 0) {
            List<? extends Font> list4 = list2;
            int size5 = list4.size();
            FontWeight fontWeight4 = null;
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    break;
                }
                FontWeight weight2 = list2.get(i5).getWeight();
                if (weight2.compareTo(fontWeight) >= 0) {
                    if (weight2.compareTo(fontWeight) <= 0) {
                        fontWeight2 = weight2;
                        fontWeight4 = fontWeight2;
                        break;
                    }
                    if (fontWeight4 == null || weight2.compareTo(fontWeight4) < 0) {
                        fontWeight4 = weight2;
                    }
                } else if (fontWeight2 == null || weight2.compareTo(fontWeight2) > 0) {
                    fontWeight2 = weight2;
                }
                i5++;
            }
            if (fontWeight4 != null) {
                fontWeight2 = fontWeight4;
            }
            ArrayList arrayList4 = new ArrayList(list2.size());
            int size6 = list4.size();
            while (i < size6) {
                Font font5 = list2.get(i);
                if (Intrinsics.areEqual(font5.getWeight(), fontWeight2)) {
                    arrayList4.add(font5);
                }
                i++;
            }
            return arrayList4;
        }
        FontWeight w500 = companion.getW500();
        List<? extends Font> list5 = list2;
        int size7 = list5.size();
        FontWeight fontWeight5 = null;
        FontWeight fontWeight6 = null;
        int i6 = 0;
        while (true) {
            if (i6 >= size7) {
                break;
            }
            FontWeight weight3 = list2.get(i6).getWeight();
            if (w500 == null || weight3.compareTo(w500) <= 0) {
                if (weight3.compareTo(fontWeight) >= 0) {
                    if (weight3.compareTo(fontWeight) <= 0) {
                        fontWeight5 = weight3;
                        fontWeight6 = fontWeight5;
                        break;
                    }
                    if (fontWeight6 == null || weight3.compareTo(fontWeight6) < 0) {
                        fontWeight6 = weight3;
                    }
                } else if (fontWeight5 == null || weight3.compareTo(fontWeight5) > 0) {
                    fontWeight5 = weight3;
                }
            }
            i6++;
        }
        if (fontWeight6 != null) {
            fontWeight5 = fontWeight6;
        }
        ArrayList arrayList5 = new ArrayList(list2.size());
        int size8 = list5.size();
        for (int i7 = 0; i7 < size8; i7++) {
            Font font6 = list2.get(i7);
            if (Intrinsics.areEqual(font6.getWeight(), fontWeight5)) {
                arrayList5.add(font6);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        FontWeight w5002 = FontWeight.INSTANCE.getW500();
        int size9 = list5.size();
        FontWeight fontWeight7 = null;
        int i8 = 0;
        while (true) {
            if (i8 >= size9) {
                break;
            }
            FontWeight weight4 = list2.get(i8).getWeight();
            if (w5002 == null || weight4.compareTo(w5002) >= 0) {
                if (weight4.compareTo(fontWeight) >= 0) {
                    if (weight4.compareTo(fontWeight) <= 0) {
                        fontWeight2 = weight4;
                        fontWeight7 = fontWeight2;
                        break;
                    }
                    if (fontWeight7 == null || weight4.compareTo(fontWeight7) < 0) {
                        fontWeight7 = weight4;
                    }
                } else if (fontWeight2 == null || weight4.compareTo(fontWeight2) > 0) {
                    fontWeight2 = weight4;
                }
            }
            i8++;
        }
        if (fontWeight7 != null) {
            fontWeight2 = fontWeight7;
        }
        ArrayList arrayList6 = new ArrayList(list2.size());
        int size10 = list5.size();
        while (i < size10) {
            Font font7 = list2.get(i);
            if (Intrinsics.areEqual(font7.getWeight(), fontWeight2)) {
                arrayList6.add(font7);
            }
            i++;
        }
        return arrayList6;
    }
}
