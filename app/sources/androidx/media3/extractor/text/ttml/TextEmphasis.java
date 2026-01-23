package androidx.media3.extractor.text.ttml;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
final class TextEmphasis {
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final ImmutableSet<String> SINGLE_STYLE_VALUES = ImmutableSet.m1013of("auto", ApiRenderablePlatforms.VERSIONS_NONE);
    private static final ImmutableSet<String> MARK_SHAPE_VALUES = ImmutableSet.m1014of("dot", "sesame", "circle");
    private static final ImmutableSet<String> MARK_FILL_VALUES = ImmutableSet.m1013of("filled", "open");
    private static final ImmutableSet<String> POSITION_VALUES = ImmutableSet.m1014of("after", "before", "outside");

    private TextEmphasis(int i, int i2, int i3) {
        this.markShape = i;
        this.markFill = i2;
        this.position = i3;
    }

    public static TextEmphasis parse(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return parseWords(ImmutableSet.copyOf(TextUtils.split(lowerCase, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static TextEmphasis parseWords(ImmutableSet<String> immutableSet) {
        boolean z;
        int i;
        int iHashCode;
        String str = (String) Iterables.getFirst(Sets.intersection(POSITION_VALUES, immutableSet), "outside");
        int iHashCode2 = str.hashCode();
        boolean z2 = false;
        int i2 = -1;
        if (iHashCode2 != -1392885889) {
            if (iHashCode2 != -1106037339) {
                z = (iHashCode2 == 92734940 && str.equals("after")) ? false : -1;
            } else if (str.equals("outside")) {
                z = true;
            }
        } else if (str.equals("before")) {
            z = 2;
        }
        int i3 = z ? !z ? 1 : -2 : 2;
        Sets.SetView setViewIntersection = Sets.intersection(SINGLE_STYLE_VALUES, immutableSet);
        if (!setViewIntersection.isEmpty()) {
            String str2 = (String) setViewIntersection.iterator().next();
            int iHashCode3 = str2.hashCode();
            if (iHashCode3 == 3005871) {
                str2.equals("auto");
            } else if (iHashCode3 == 3387192 && str2.equals(ApiRenderablePlatforms.VERSIONS_NONE)) {
                i2 = 0;
            }
            return new TextEmphasis(i2, 0, i3);
        }
        Sets.SetView setViewIntersection2 = Sets.intersection(MARK_FILL_VALUES, immutableSet);
        Sets.SetView setViewIntersection3 = Sets.intersection(MARK_SHAPE_VALUES, immutableSet);
        if (setViewIntersection2.isEmpty() && setViewIntersection3.isEmpty()) {
            return new TextEmphasis(-1, 0, i3);
        }
        String str3 = (String) Iterables.getFirst(setViewIntersection2, "filled");
        int iHashCode4 = str3.hashCode();
        if (iHashCode4 == -1274499742) {
            str3.equals("filled");
        } else {
            if (iHashCode4 == 3417674 && str3.equals("open")) {
                i = 2;
            }
            String str4 = (String) Iterables.getFirst(setViewIntersection3, "circle");
            iHashCode = str4.hashCode();
            if (iHashCode == -1360216880) {
                if (iHashCode != -905816648) {
                    if (iHashCode != 99657 || !str4.equals("dot")) {
                        z2 = -1;
                    }
                } else if (str4.equals("sesame")) {
                    z2 = true;
                }
            } else if (str4.equals("circle")) {
                z2 = 2;
            }
            return new TextEmphasis(z2 ? !z2 ? 1 : 3 : 2, i, i3);
        }
        i = 1;
        String str42 = (String) Iterables.getFirst(setViewIntersection3, "circle");
        iHashCode = str42.hashCode();
        if (iHashCode == -1360216880) {
        }
        return new TextEmphasis(z2 ? !z2 ? 1 : 3 : 2, i, i3);
    }
}
