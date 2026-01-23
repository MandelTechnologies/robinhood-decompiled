package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLArray;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.constraintlayout.core.parser.CLString;
import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.ChainReference;
import androidx.constraintlayout.core.state.helpers.FlowReference;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class ConstraintSetParser {

    interface GeneratedValue {
        float value();
    }

    public static class LayoutVariables {
        HashMap<String, Integer> mMargins = new HashMap<>();
        HashMap<String, GeneratedValue> mGenerators = new HashMap<>();
        HashMap<String, ArrayList<String>> mArrayIds = new HashMap<>();

        void put(String str, int i) {
            this.mMargins.put(str, Integer.valueOf(i));
        }

        void put(String str, float f, float f2) {
            if (this.mGenerators.containsKey(str)) {
                this.mGenerators.get(str);
            }
            this.mGenerators.put(str, new Generator(f, f2));
        }

        void put(String str, float f, float f2, float f3, String str2, String str3) {
            if (this.mGenerators.containsKey(str)) {
                this.mGenerators.get(str);
            }
            FiniteGenerator finiteGenerator = new FiniteGenerator(f, f2, f3, str2, str3);
            this.mGenerators.put(str, finiteGenerator);
            this.mArrayIds.put(str, finiteGenerator.array());
        }

        float get(Object obj) {
            if (obj instanceof CLString) {
                String strContent = ((CLString) obj).content();
                if (this.mGenerators.containsKey(strContent)) {
                    return this.mGenerators.get(strContent).value();
                }
                if (this.mMargins.containsKey(strContent)) {
                    return this.mMargins.get(strContent).floatValue();
                }
                return 0.0f;
            }
            if (obj instanceof CLNumber) {
                return ((CLNumber) obj).getFloat();
            }
            return 0.0f;
        }

        ArrayList<String> getList(String str) {
            if (this.mArrayIds.containsKey(str)) {
                return this.mArrayIds.get(str);
            }
            return null;
        }

        void put(String str, ArrayList<String> arrayList) {
            this.mArrayIds.put(str, arrayList);
        }
    }

    static class Generator implements GeneratedValue {
        float mCurrent;
        float mIncrementBy;
        float mStart;
        boolean mStop = false;

        Generator(float f, float f2) {
            this.mStart = f;
            this.mIncrementBy = f2;
            this.mCurrent = f;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            if (!this.mStop) {
                this.mCurrent += this.mIncrementBy;
            }
            return this.mCurrent;
        }
    }

    static class FiniteGenerator implements GeneratedValue {
        float mFrom;
        float mInitial;
        float mMax;
        String mPostfix;
        String mPrefix;
        float mStep;
        float mTo;
        boolean mStop = false;
        float mCurrent = 0.0f;

        FiniteGenerator(float f, float f2, float f3, String str, String str2) {
            this.mFrom = f;
            this.mTo = f2;
            this.mStep = f3;
            this.mPrefix = str == null ? "" : str;
            this.mPostfix = str2 == null ? "" : str2;
            this.mMax = f2;
            this.mInitial = f;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public float value() {
            float f = this.mCurrent;
            if (f >= this.mMax) {
                this.mStop = true;
            }
            if (!this.mStop) {
                this.mCurrent = f + this.mStep;
            }
            return this.mCurrent;
        }

        public ArrayList<String> array() {
            ArrayList<String> arrayList = new ArrayList<>();
            int i = (int) this.mInitial;
            int i2 = (int) this.mMax;
            int i3 = i;
            while (i <= i2) {
                arrayList.add(this.mPrefix + i3 + this.mPostfix);
                i3 += (int) this.mStep;
                i++;
            }
            return arrayList;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void populateState(CLObject cLObject, State state, LayoutVariables layoutVariables) throws CLParsingException {
        String next;
        CLElement cLElement;
        char c;
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        Iterator<String> it = arrayListNames.iterator();
        while (it.hasNext()) {
            next = it.next();
            cLElement = cLObject.get(next);
            next.getClass();
            c = 2;
            switch (next) {
                case "Helpers":
                    if (!(cLElement instanceof CLArray)) {
                        break;
                    } else {
                        parseHelpers(state, layoutVariables, (CLArray) cLElement);
                        break;
                    }
                case "Generate":
                    if (!(cLElement instanceof CLObject)) {
                        break;
                    } else {
                        parseGenerate(state, layoutVariables, (CLObject) cLElement);
                        break;
                    }
                case "Variables":
                    if (!(cLElement instanceof CLObject)) {
                        break;
                    } else {
                        parseVariables(state, layoutVariables, (CLObject) cLElement);
                        break;
                    }
                default:
                    if (cLElement instanceof CLObject) {
                        CLObject cLObject2 = (CLObject) cLElement;
                        String strLookForType = lookForType(cLObject2);
                        if (strLookForType != null) {
                            switch (strLookForType.hashCode()) {
                                case -1785507558:
                                    if (!strLookForType.equals("vGuideline")) {
                                        c = 65535;
                                        break;
                                    } else {
                                        c = 0;
                                        break;
                                    }
                                case -1354837162:
                                    if (strLookForType.equals("column")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case -1252464839:
                                    if (!strLookForType.equals("hChain")) {
                                    }
                                    break;
                                case -851656725:
                                    if (strLookForType.equals("vChain")) {
                                        c = 3;
                                        break;
                                    }
                                    break;
                                case -333143113:
                                    if (strLookForType.equals("barrier")) {
                                        c = 4;
                                        break;
                                    }
                                    break;
                                case 113114:
                                    if (strLookForType.equals("row")) {
                                        c = 5;
                                        break;
                                    }
                                    break;
                                case 3181382:
                                    if (strLookForType.equals(SduiFeatureDiscovery3.GRID_TAG)) {
                                        c = 6;
                                        break;
                                    }
                                    break;
                                case 98238902:
                                    if (strLookForType.equals("hFlow")) {
                                        c = 7;
                                        break;
                                    }
                                    break;
                                case 111168196:
                                    if (strLookForType.equals("vFlow")) {
                                        c = '\b';
                                        break;
                                    }
                                    break;
                                case 965681512:
                                    if (strLookForType.equals("hGuideline")) {
                                        c = '\t';
                                        break;
                                    }
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    parseGuidelineParams(1, state, next, cLObject2);
                                    break;
                                case 1:
                                case 5:
                                case 6:
                                    parseGridType(strLookForType, state, next, layoutVariables, cLObject2);
                                    break;
                                case 2:
                                case 3:
                                    parseChainType(strLookForType, state, next, layoutVariables, cLObject2);
                                    break;
                                case 4:
                                    parseBarrier(state, next, cLObject2);
                                    break;
                                case 7:
                                case '\b':
                                    parseFlowType(strLookForType, state, next, layoutVariables, cLObject2);
                                    break;
                                case '\t':
                                    parseGuidelineParams(0, state, next, cLObject2);
                                    break;
                            }
                        } else {
                            parseWidget(state, layoutVariables, next, cLObject2);
                            break;
                        }
                    } else if (!(cLElement instanceof CLNumber)) {
                        break;
                    } else {
                        layoutVariables.put(next, cLElement.getInt());
                        break;
                    }
                    break;
            }
        }
    }

    private static void parseVariables(State state, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        Iterator<String> it = arrayListNames.iterator();
        while (it.hasNext()) {
            String next = it.next();
            CLElement cLElement = cLObject.get(next);
            if (cLElement instanceof CLNumber) {
                layoutVariables.put(next, cLElement.getInt());
            } else if (cLElement instanceof CLObject) {
                CLObject cLObject2 = (CLObject) cLElement;
                if (cLObject2.has("from") && cLObject2.has("to")) {
                    layoutVariables.put(next, layoutVariables.get(cLObject2.get("from")), layoutVariables.get(cLObject2.get("to")), 1.0f, cLObject2.getStringOrNull("prefix"), cLObject2.getStringOrNull("postfix"));
                } else if (cLObject2.has("from") && cLObject2.has("step")) {
                    layoutVariables.put(next, layoutVariables.get(cLObject2.get("from")), layoutVariables.get(cLObject2.get("step")));
                } else if (cLObject2.has("ids")) {
                    CLArray array2 = cLObject2.getArray("ids");
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (int i = 0; i < array2.size(); i++) {
                        arrayList.add(array2.getString(i));
                    }
                    layoutVariables.put(next, arrayList);
                } else if (cLObject2.has("tag")) {
                    layoutVariables.put(next, state.getIdsForTag(cLObject2.getString("tag")));
                }
            }
        }
    }

    static void parseHelpers(State state, LayoutVariables layoutVariables, CLArray cLArray) throws CLParsingException {
        for (int i = 0; i < cLArray.size(); i++) {
            CLElement cLElement = cLArray.get(i);
            if (cLElement instanceof CLArray) {
                CLArray cLArray2 = (CLArray) cLElement;
                if (cLArray2.size() > 1) {
                    String string2 = cLArray2.getString(0);
                    string2.getClass();
                    switch (string2) {
                        case "vGuideline":
                            parseGuideline(1, state, cLArray2);
                            break;
                        case "hChain":
                            parseChain(0, state, layoutVariables, cLArray2);
                            break;
                        case "vChain":
                            parseChain(1, state, layoutVariables, cLArray2);
                            break;
                        case "hGuideline":
                            parseGuideline(0, state, cLArray2);
                            break;
                    }
                }
            }
        }
    }

    static void parseGenerate(State state, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        Iterator<String> it = arrayListNames.iterator();
        while (it.hasNext()) {
            String next = it.next();
            CLElement cLElement = cLObject.get(next);
            ArrayList<String> list = layoutVariables.getList(next);
            if (list != null && (cLElement instanceof CLObject)) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    parseWidget(state, layoutVariables, it2.next(), (CLObject) cLElement);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void parseChain(int i, State state, LayoutVariables layoutVariables, CLArray cLArray) throws CLParsingException {
        String strContent;
        ChainReference chainReferenceHorizontalChain = i == 0 ? state.horizontalChain() : state.verticalChain();
        CLElement cLElement = cLArray.get(1);
        if (cLElement instanceof CLArray) {
            CLArray cLArray2 = (CLArray) cLElement;
            if (cLArray2.size() < 1) {
                return;
            }
            for (int i2 = 0; i2 < cLArray2.size(); i2++) {
                chainReferenceHorizontalChain.add(cLArray2.getString(i2));
            }
            if (cLArray.size() > 2) {
                CLElement cLElement2 = cLArray.get(2);
                if (cLElement2 instanceof CLObject) {
                    CLObject cLObject = (CLObject) cLElement2;
                    Iterator<String> it = cLObject.names().iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        next.getClass();
                        if (next.equals(ResourceTypes.STYLE)) {
                            CLElement cLElement3 = cLObject.get(next);
                            if (cLElement3 instanceof CLArray) {
                                CLArray cLArray3 = (CLArray) cLElement3;
                                if (cLArray3.size() > 1) {
                                    strContent = cLArray3.getString(0);
                                    chainReferenceHorizontalChain.bias(cLArray3.getFloat(1));
                                } else {
                                    strContent = cLElement3.content();
                                }
                                strContent.getClass();
                                if (strContent.equals("packed")) {
                                    chainReferenceHorizontalChain.style(State.Chain.PACKED);
                                } else if (strContent.equals("spread_inside")) {
                                    chainReferenceHorizontalChain.style(State.Chain.SPREAD_INSIDE);
                                } else {
                                    chainReferenceHorizontalChain.style(State.Chain.SPREAD);
                                }
                            }
                        } else {
                            parseConstraint(state, layoutVariables, cLObject, chainReferenceHorizontalChain, next);
                        }
                    }
                }
            }
        }
    }

    private static float toPix(State state, float f) {
        return state.getDpToPixel().toPixels(f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parseChainType(String str, State state, String str2, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        int i;
        CLArray cLArray;
        int i2;
        int i3;
        float f;
        String str3;
        float pix;
        float pix2;
        float f2;
        float f3;
        String strContent;
        int i4 = 0;
        ChainReference chainReferenceHorizontalChain = str.charAt(0) == 'h' ? state.horizontalChain() : state.verticalChain();
        chainReferenceHorizontalChain.setKey(str2);
        Iterator<String> it = cLObject.names().iterator();
        while (it.hasNext()) {
            String next = it.next();
            next.getClass();
            int i5 = 6;
            int i6 = 3;
            int i7 = 2;
            int i8 = 1;
            int i9 = -1;
            switch (next.hashCode()) {
                case -1383228885:
                    if (next.equals("bottom")) {
                        i9 = i4;
                    }
                    switch (i9) {
                        case 0:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            parseConstraint(state, layoutVariables, cLObject, chainReferenceHorizontalChain, next);
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            continue;
                            i4 = 0;
                        case 1:
                            CLElement cLElement = cLObject.get(next);
                            if (cLElement instanceof CLArray) {
                                CLArray cLArray2 = (CLArray) cLElement;
                                if (cLArray2.size() >= 1) {
                                    int i10 = i4;
                                    while (i10 < cLArray2.size()) {
                                        CLElement cLElement2 = cLArray2.get(i10);
                                        if (cLElement2 instanceof CLArray) {
                                            CLArray cLArray3 = (CLArray) cLElement2;
                                            if (cLArray3.size() > 0) {
                                                String strContent2 = cLArray3.get(i4).content();
                                                int size = cLArray3.size();
                                                if (size == i7) {
                                                    float f4 = cLArray3.getFloat(i8);
                                                    CLArray cLArray4 = cLArray2;
                                                    f = f4;
                                                    cLArray = cLArray4;
                                                    i = i10;
                                                    i3 = i8;
                                                    str3 = strContent2;
                                                    pix = Float.NaN;
                                                } else {
                                                    if (size == i6) {
                                                        CLArray cLArray5 = cLArray2;
                                                        f = cLArray3.getFloat(i8);
                                                        cLArray = cLArray5;
                                                        i = i10;
                                                        i3 = i8;
                                                        pix = toPix(state, cLArray3.getFloat(i7));
                                                        str3 = strContent2;
                                                        pix2 = Float.NaN;
                                                        i2 = i7;
                                                        f3 = pix;
                                                        f2 = Float.NaN;
                                                    } else if (size == 4) {
                                                        float f5 = cLArray3.getFloat(i8);
                                                        float pix3 = toPix(state, cLArray3.getFloat(i7));
                                                        i6 = 3;
                                                        CLArray cLArray6 = cLArray2;
                                                        f = f5;
                                                        cLArray = cLArray6;
                                                        i3 = i8;
                                                        pix = toPix(state, cLArray3.getFloat(3));
                                                        f2 = Float.NaN;
                                                        i2 = i7;
                                                        f3 = pix3;
                                                        i = i10;
                                                        str3 = strContent2;
                                                        pix2 = Float.NaN;
                                                    } else if (size != i5) {
                                                        i = i10;
                                                        cLArray = cLArray2;
                                                        i3 = i8;
                                                        str3 = strContent2;
                                                        f = Float.NaN;
                                                        pix = Float.NaN;
                                                    } else {
                                                        float f6 = cLArray3.getFloat(i8);
                                                        float pix4 = toPix(state, cLArray3.getFloat(i7));
                                                        float pix5 = toPix(state, cLArray3.getFloat(i6));
                                                        float pix6 = toPix(state, cLArray3.getFloat(4));
                                                        int i11 = i7;
                                                        f3 = pix4;
                                                        cLArray = cLArray2;
                                                        f = f6;
                                                        i2 = i11;
                                                        i3 = i8;
                                                        pix = pix5;
                                                        i = i10;
                                                        str3 = strContent2;
                                                        pix2 = toPix(state, cLArray3.getFloat(5));
                                                        f2 = pix6;
                                                        i6 = 3;
                                                    }
                                                    chainReferenceHorizontalChain.addChainElement(str3, f, f3, pix, f2, pix2);
                                                }
                                                f2 = pix;
                                                pix2 = f2;
                                                i2 = i7;
                                                f3 = pix2;
                                                chainReferenceHorizontalChain.addChainElement(str3, f, f3, pix, f2, pix2);
                                            } else {
                                                i = i10;
                                                cLArray = cLArray2;
                                                i2 = i7;
                                                i3 = i8;
                                            }
                                        } else {
                                            i = i10;
                                            cLArray = cLArray2;
                                            i2 = i7;
                                            i3 = i8;
                                            chainReferenceHorizontalChain.add(cLElement2.content());
                                        }
                                        i10 = i + 1;
                                        cLArray2 = cLArray;
                                        i7 = i2;
                                        i8 = i3;
                                        i4 = 0;
                                        i5 = 6;
                                    }
                                    break;
                                }
                            }
                            System.err.println(str2 + " contains should be an array \"" + cLElement.content() + "\"");
                            return;
                        case 7:
                            CLElement cLElement3 = cLObject.get(next);
                            if (cLElement3 instanceof CLArray) {
                                CLArray cLArray7 = (CLArray) cLElement3;
                                if (cLArray7.size() > 1) {
                                    strContent = cLArray7.getString(i4);
                                    chainReferenceHorizontalChain.bias(cLArray7.getFloat(1));
                                } else {
                                    strContent = cLElement3.content();
                                }
                                strContent.getClass();
                                if (!strContent.equals("packed")) {
                                    if (strContent.equals("spread_inside")) {
                                        chainReferenceHorizontalChain.style(State.Chain.SPREAD_INSIDE);
                                        break;
                                    } else {
                                        chainReferenceHorizontalChain.style(State.Chain.SPREAD);
                                        break;
                                    }
                                } else {
                                    chainReferenceHorizontalChain.style(State.Chain.PACKED);
                                    break;
                                }
                            }
                            i4 = 0;
                    }
                    i4 = 0;
                case -567445985:
                    if (next.equals("contains")) {
                        i9 = 1;
                    }
                    switch (i9) {
                    }
                    i4 = 0;
                    break;
                case 100571:
                    if (next.equals("end")) {
                        i9 = 2;
                    }
                    switch (i9) {
                    }
                    i4 = 0;
                    break;
                case 115029:
                    if (next.equals("top")) {
                        i9 = 3;
                    }
                    switch (i9) {
                    }
                    i4 = 0;
                    break;
                case 3317767:
                    if (next.equals("left")) {
                        i9 = 4;
                    }
                    switch (i9) {
                    }
                    i4 = 0;
                    break;
                case 108511772:
                    if (next.equals("right")) {
                        i9 = 5;
                    }
                    switch (i9) {
                    }
                    i4 = 0;
                    break;
                case 109757538:
                    if (next.equals("start")) {
                        i9 = 6;
                    }
                    switch (i9) {
                    }
                    i4 = 0;
                    break;
                case 109780401:
                    if (next.equals(ResourceTypes.STYLE)) {
                        i9 = 7;
                    }
                    switch (i9) {
                    }
                    i4 = 0;
                    break;
                default:
                    switch (i9) {
                    }
                    i4 = 0;
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parseGridType(String str, State state, String str2, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        String next;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        GridReference grid = state.getGrid(str2, str);
        Iterator<String> it = cLObject.names().iterator();
        while (it.hasNext()) {
            next = it.next();
            next.getClass();
            i = 0;
            switch (next) {
                case "orientation":
                    grid.setOrientation(cLObject.get(next).getInt());
                    break;
                case "padding":
                    CLElement cLElement = cLObject.get(next);
                    if (cLElement instanceof CLArray) {
                        CLArray cLArray = (CLArray) cLElement;
                        if (cLArray.size() > 1) {
                            f = cLArray.getInt(0);
                            f4 = cLArray.getInt(1);
                            if (cLArray.size() > 2) {
                                f3 = cLArray.getInt(2);
                                try {
                                    f2 = ((CLArray) cLElement).getInt(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    f2 = 0.0f;
                                }
                            } else {
                                f2 = f4;
                                f3 = f;
                            }
                        } else {
                            f = cLElement.getInt();
                            f2 = f;
                            f3 = f2;
                            f4 = f3;
                        }
                        grid.setPaddingStart(Math.round(toPix(state, f)));
                        grid.setPaddingTop(Math.round(toPix(state, f4)));
                        grid.setPaddingEnd(Math.round(toPix(state, f3)));
                        grid.setPaddingBottom(Math.round(toPix(state, f2)));
                        break;
                    }
                case "contains":
                    CLArray arrayOrNull = cLObject.getArrayOrNull(next);
                    if (arrayOrNull == null) {
                        break;
                    } else {
                        while (i < arrayOrNull.size()) {
                            grid.add(state.constraints(arrayOrNull.get(i).content()));
                            i++;
                        }
                        break;
                    }
                case "hGap":
                    grid.setHorizontalGaps(toPix(state, cLObject.get(next).getFloat()));
                    break;
                case "rows":
                    int i2 = cLObject.get(next).getInt();
                    if (i2 <= 0) {
                        break;
                    } else {
                        grid.setRowsSet(i2);
                        break;
                    }
                case "vGap":
                    grid.setVerticalGaps(toPix(state, cLObject.get(next).getFloat()));
                    break;
                case "flags":
                    String strContent = "";
                    try {
                        CLElement cLElement2 = cLObject.get(next);
                        if (cLElement2 instanceof CLNumber) {
                            i = cLElement2.getInt();
                        } else {
                            strContent = cLElement2.content();
                        }
                    } catch (Exception e) {
                        System.err.println("Error parsing grid flags " + e);
                    }
                    if (strContent != null && !strContent.isEmpty()) {
                        grid.setFlags(strContent);
                        break;
                    } else {
                        grid.setFlags(i);
                        break;
                    }
                case "skips":
                    String strContent2 = cLObject.get(next).content();
                    if (strContent2 != null && strContent2.contains(":")) {
                        grid.setSkips(strContent2);
                        break;
                    } else {
                        break;
                    }
                case "spans":
                    String strContent3 = cLObject.get(next).content();
                    if (strContent3 != null && strContent3.contains(":")) {
                        grid.setSpans(strContent3);
                        break;
                    } else {
                        break;
                    }
                case "rowWeights":
                    String strContent4 = cLObject.get(next).content();
                    if (strContent4 != null && strContent4.contains(",")) {
                        grid.setRowWeights(strContent4);
                        break;
                    } else {
                        break;
                    }
                case "columns":
                    int i3 = cLObject.get(next).getInt();
                    if (i3 <= 0) {
                        break;
                    } else {
                        grid.setColumnsSet(i3);
                        break;
                    }
                case "columnWeights":
                    String strContent5 = cLObject.get(next).content();
                    if (strContent5 != null && strContent5.contains(",")) {
                        grid.setColumnWeights(strContent5);
                        break;
                    } else {
                        break;
                    }
                    break;
                default:
                    applyAttribute(state, layoutVariables, state.constraints(str2), cLObject, next);
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x040c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parseFlowType(String str, State state, String str2, LayoutVariables layoutVariables, CLObject cLObject) throws CLParsingException {
        int i;
        float f;
        int i2;
        String strContent;
        String string2;
        String string3;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        String strContent2;
        String string4;
        String string5;
        float f2;
        float f3;
        float f4;
        float f5;
        Float fValueOf4;
        Float fValueOf5;
        Float fValueOf6;
        float f6;
        float pix;
        float f7;
        float f8;
        float f9 = 0.5f;
        Float fValueOf7 = Float.valueOf(0.5f);
        int i3 = 0;
        FlowReference flow = state.getFlow(str2, str.charAt(0) == 'v');
        Iterator<String> it = cLObject.names().iterator();
        while (it.hasNext()) {
            String next = it.next();
            next.getClass();
            int i4 = 4;
            switch (next.hashCode()) {
                case -1254185091:
                    if (!next.equals("hAlign")) {
                        i = -1;
                        break;
                    } else {
                        i = i3;
                        break;
                    }
                case -1237307863:
                    if (next.equals("hStyle")) {
                        i = 1;
                        break;
                    }
                    break;
                case -1198076529:
                    if (next.equals("hFlowBias")) {
                        i = 2;
                        break;
                    }
                    break;
                case -853376977:
                    if (next.equals("vAlign")) {
                        i = 3;
                        break;
                    }
                    break;
                case -836499749:
                    if (next.equals("vStyle")) {
                        i = 4;
                        break;
                    }
                    break;
                case -806339567:
                    if (next.equals("padding")) {
                        i = 5;
                        break;
                    }
                    break;
                case -732635235:
                    if (next.equals("vFlowBias")) {
                        i = 6;
                        break;
                    }
                    break;
                case -567445985:
                    if (next.equals("contains")) {
                        i = 7;
                        break;
                    }
                    break;
                case -488900360:
                    if (next.equals("maxElement")) {
                        i = 8;
                        break;
                    }
                    break;
                case 3169614:
                    if (next.equals("hGap")) {
                        i = 9;
                        break;
                    }
                    break;
                case 3575610:
                    if (next.equals("type")) {
                        i = 10;
                        break;
                    }
                    break;
                case 3586688:
                    if (next.equals("vGap")) {
                        i = 11;
                        break;
                    }
                    break;
                case 3657802:
                    if (next.equals("wrap")) {
                        i = 12;
                        break;
                    }
                    break;
            }
            switch (i) {
                case 0:
                    f = f9;
                    String strContent3 = cLObject.get(next).content();
                    strContent3.getClass();
                    if (strContent3.equals("end")) {
                        i2 = 0;
                        flow.setHorizontalAlign(1);
                    } else if (strContent3.equals("start")) {
                        i2 = 0;
                        flow.setHorizontalAlign(0);
                    } else {
                        flow.setHorizontalAlign(2);
                        i2 = 0;
                    }
                    i3 = i2;
                    f9 = f;
                case 1:
                    f = f9;
                    CLElement cLElement = cLObject.get(next);
                    if (cLElement instanceof CLArray) {
                        CLArray cLArray = (CLArray) cLElement;
                        if (cLArray.size() > 1) {
                            string2 = cLArray.getString(0);
                            strContent = cLArray.getString(1);
                            if (cLArray.size() > 2) {
                                string3 = cLArray.getString(2);
                            } else {
                                string3 = "";
                            }
                        } else {
                            strContent = cLElement.content();
                            string2 = "";
                            string3 = string2;
                        }
                        if (!strContent.equals("")) {
                            flow.setHorizontalStyle(State.Chain.getValueByString(strContent));
                        }
                        if (!string2.equals("")) {
                            flow.setFirstHorizontalStyle(State.Chain.getValueByString(string2));
                        }
                        if (!string3.equals("")) {
                            flow.setLastHorizontalStyle(State.Chain.getValueByString(string3));
                        }
                        i2 = 0;
                    }
                    i3 = i2;
                    f9 = f;
                case 2:
                    f = f9;
                    CLElement cLElement2 = cLObject.get(next);
                    if (cLElement2 instanceof CLArray) {
                        CLArray cLArray2 = (CLArray) cLElement2;
                        if (cLArray2.size() > 1) {
                            fValueOf2 = Float.valueOf(cLArray2.getFloat(0));
                            fValueOf = Float.valueOf(cLArray2.getFloat(1));
                            fValueOf3 = cLArray2.size() > 2 ? Float.valueOf(cLArray2.getFloat(2)) : fValueOf7;
                        } else {
                            fValueOf = Float.valueOf(cLElement2.getFloat());
                            fValueOf2 = fValueOf7;
                            fValueOf3 = fValueOf2;
                        }
                        flow.horizontalBias(fValueOf.floatValue());
                        if (fValueOf2.floatValue() != f) {
                            flow.setFirstHorizontalBias(fValueOf2.floatValue());
                        }
                        if (fValueOf3.floatValue() != f) {
                            flow.setLastHorizontalBias(fValueOf3.floatValue());
                        }
                        i2 = 0;
                    }
                    i3 = i2;
                    f9 = f;
                case 3:
                    f = f9;
                    String strContent4 = cLObject.get(next).content();
                    strContent4.getClass();
                    switch (strContent4) {
                        case "baseline":
                            flow.setVerticalAlign(3);
                            break;
                        case "bottom":
                            flow.setVerticalAlign(1);
                            break;
                        case "top":
                            flow.setVerticalAlign(0);
                            break;
                        default:
                            flow.setVerticalAlign(2);
                            break;
                    }
                    i2 = 0;
                    i3 = i2;
                    f9 = f;
                case 4:
                    f = f9;
                    CLElement cLElement3 = cLObject.get(next);
                    if (cLElement3 instanceof CLArray) {
                        CLArray cLArray3 = (CLArray) cLElement3;
                        if (cLArray3.size() > 1) {
                            string4 = cLArray3.getString(0);
                            strContent2 = cLArray3.getString(1);
                            if (cLArray3.size() > 2) {
                                string5 = cLArray3.getString(2);
                            } else {
                                string5 = "";
                            }
                        } else {
                            strContent2 = cLElement3.content();
                            string4 = "";
                            string5 = string4;
                        }
                        if (!strContent2.equals("")) {
                            flow.setVerticalStyle(State.Chain.getValueByString(strContent2));
                        }
                        if (!string4.equals("")) {
                            flow.setFirstVerticalStyle(State.Chain.getValueByString(string4));
                        }
                        if (!string5.equals("")) {
                            flow.setLastVerticalStyle(State.Chain.getValueByString(string5));
                        }
                        i2 = 0;
                    }
                    i3 = i2;
                    f9 = f;
                case 5:
                    f = f9;
                    CLElement cLElement4 = cLObject.get(next);
                    if (cLElement4 instanceof CLArray) {
                        CLArray cLArray4 = (CLArray) cLElement4;
                        if (cLArray4.size() > 1) {
                            f2 = cLArray4.getInt(0);
                            f5 = cLArray4.getInt(1);
                            if (cLArray4.size() > 2) {
                                f4 = cLArray4.getInt(2);
                                try {
                                    f3 = ((CLArray) cLElement4).getInt(3);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    f3 = 0.0f;
                                }
                            } else {
                                f4 = f2;
                                f3 = f5;
                            }
                        } else {
                            f2 = cLElement4.getInt();
                            f3 = f2;
                            f4 = f3;
                            f5 = f4;
                        }
                        flow.setPaddingLeft(Math.round(toPix(state, f2)));
                        flow.setPaddingTop(Math.round(toPix(state, f5)));
                        flow.setPaddingRight(Math.round(toPix(state, f4)));
                        flow.setPaddingBottom(Math.round(toPix(state, f3)));
                        i2 = 0;
                    }
                    i3 = i2;
                    f9 = f;
                case 6:
                    f = f9;
                    CLElement cLElement5 = cLObject.get(next);
                    if (cLElement5 instanceof CLArray) {
                        CLArray cLArray5 = (CLArray) cLElement5;
                        if (cLArray5.size() > 1) {
                            fValueOf5 = Float.valueOf(cLArray5.getFloat(0));
                            fValueOf4 = Float.valueOf(cLArray5.getFloat(1));
                            fValueOf6 = cLArray5.size() > 2 ? Float.valueOf(cLArray5.getFloat(2)) : fValueOf7;
                        } else {
                            fValueOf4 = Float.valueOf(cLElement5.getFloat());
                            fValueOf5 = fValueOf7;
                            fValueOf6 = fValueOf5;
                        }
                        try {
                            flow.verticalBias(fValueOf4.floatValue());
                            if (fValueOf5.floatValue() != f) {
                                flow.setFirstVerticalBias(fValueOf5.floatValue());
                            }
                            if (fValueOf6.floatValue() != f) {
                                flow.setLastVerticalBias(fValueOf6.floatValue());
                            }
                        } catch (NumberFormatException unused2) {
                        }
                        i2 = 0;
                    }
                    i3 = i2;
                    f9 = f;
                case 7:
                    CLElement cLElement6 = cLObject.get(next);
                    if (cLElement6 instanceof CLArray) {
                        CLArray cLArray6 = (CLArray) cLElement6;
                        if (cLArray6.size() >= 1) {
                            int i5 = i3;
                            while (i5 < cLArray6.size()) {
                                CLElement cLElement7 = cLArray6.get(i5);
                                float f10 = f9;
                                if (cLElement7 instanceof CLArray) {
                                    CLArray cLArray7 = (CLArray) cLElement7;
                                    if (cLArray7.size() > 0) {
                                        String strContent5 = cLArray7.get(i3).content();
                                        int size = cLArray7.size();
                                        if (size == 2) {
                                            f6 = cLArray7.getFloat(1);
                                            pix = Float.NaN;
                                        } else {
                                            if (size == 3) {
                                                f8 = cLArray7.getFloat(1);
                                                pix = toPix(state, cLArray7.getFloat(2));
                                                f7 = pix;
                                            } else if (size != i4) {
                                                f6 = Float.NaN;
                                                pix = Float.NaN;
                                            } else {
                                                f8 = cLArray7.getFloat(1);
                                                float pix2 = toPix(state, cLArray7.getFloat(2));
                                                pix = toPix(state, cLArray7.getFloat(3));
                                                f7 = pix2;
                                            }
                                            f6 = f8;
                                            flow.addFlowElement(strContent5, f6, f7, pix);
                                        }
                                        f7 = pix;
                                        flow.addFlowElement(strContent5, f6, f7, pix);
                                    }
                                } else {
                                    flow.add(cLElement7.content());
                                }
                                i5++;
                                f9 = f10;
                                i3 = 0;
                                i4 = 4;
                            }
                            f = f9;
                            i2 = i3;
                            i3 = i2;
                            f9 = f;
                        }
                    }
                    System.err.println(str2 + " contains should be an array \"" + cLElement6.content() + "\"");
                    break;
                case 8:
                    flow.setMaxElementsWrap(cLObject.get(next).getInt());
                    f = f9;
                    i2 = i3;
                    i3 = i2;
                    f9 = f;
                case 9:
                    flow.setHorizontalGap(cLObject.get(next).getInt());
                    f = f9;
                    i2 = i3;
                    i3 = i2;
                    f9 = f;
                case 10:
                    if (cLObject.get(next).content().equals("hFlow")) {
                        flow.setOrientation(i3);
                    } else {
                        flow.setOrientation(1);
                    }
                    f = f9;
                    i2 = i3;
                    i3 = i2;
                    f9 = f;
                case 11:
                    flow.setVerticalGap(cLObject.get(next).getInt());
                    f = f9;
                    i2 = i3;
                    i3 = i2;
                    f9 = f;
                case 12:
                    flow.setWrapMode(State.Wrap.getValueByString(cLObject.get(next).content()));
                    f = f9;
                    i2 = i3;
                    i3 = i2;
                    f9 = f;
                default:
                    applyAttribute(state, layoutVariables, state.constraints(str2), cLObject, next);
                    f = f9;
                    i2 = i3;
                    i3 = i2;
                    f9 = f;
            }
            return;
        }
    }

    static void parseGuideline(int i, State state, CLArray cLArray) throws CLParsingException {
        CLObject cLObject;
        String stringOrNull;
        CLElement cLElement = cLArray.get(1);
        if ((cLElement instanceof CLObject) && (stringOrNull = (cLObject = (CLObject) cLElement).getStringOrNull("id")) != null) {
            parseGuidelineParams(i, state, stringOrNull, cLObject);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void parseGuidelineParams(int i, State state, String str, CLObject cLObject) throws CLParsingException {
        String next;
        float f;
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        ConstraintReference constraintReferenceConstraints = state.constraints(str);
        if (i == 0) {
            state.horizontalGuideline(str);
        } else {
            state.verticalGuideline(str);
        }
        boolean z = !state.isRtl() || i == 0;
        GuidelineReference guidelineReference = (GuidelineReference) constraintReferenceConstraints.getFacade();
        Iterator<String> it = arrayListNames.iterator();
        float pix = 0.0f;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            while (it.hasNext()) {
                next = it.next();
                next.getClass();
                switch (next) {
                    case "percent":
                        CLArray arrayOrNull = cLObject.getArrayOrNull(next);
                        if (arrayOrNull == null) {
                            pix = cLObject.getFloat(next);
                            z2 = true;
                            z3 = true;
                            break;
                        } else {
                            if (arrayOrNull.size() > 1) {
                                String string2 = arrayOrNull.getString(0);
                                f = arrayOrNull.getFloat(1);
                                string2.getClass();
                                switch (string2) {
                                    case "end":
                                        z3 = !z;
                                        pix = f;
                                        break;
                                    case "left":
                                        z3 = true;
                                        pix = f;
                                        z2 = true;
                                        break;
                                    case "right":
                                        z3 = false;
                                        pix = f;
                                        break;
                                    case "start":
                                        z3 = z;
                                        pix = f;
                                        break;
                                    default:
                                        pix = f;
                                        break;
                                }
                            }
                            z2 = true;
                            break;
                        }
                    case "end":
                        pix = toPix(state, cLObject.getFloat(next));
                        z3 = !z;
                        break;
                    case "right":
                        pix = toPix(state, cLObject.getFloat(next));
                        z3 = false;
                        break;
                    case "start":
                        pix = toPix(state, cLObject.getFloat(next));
                        z3 = z;
                        break;
                }
            }
            if (z2) {
                if (z3) {
                    guidelineReference.percent(pix);
                    return;
                } else {
                    guidelineReference.percent(1.0f - pix);
                    return;
                }
            }
            if (z3) {
                guidelineReference.start(Float.valueOf(pix));
                return;
            } else {
                guidelineReference.end(Float.valueOf(pix));
                return;
            }
            pix = toPix(state, cLObject.getFloat(next));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void parseBarrier(State state, String str, CLObject cLObject) throws CLParsingException {
        String next;
        char c;
        int i;
        boolean zIsRtl = state.isRtl();
        BarrierReference barrierReferenceBarrier = state.barrier(str, State.Direction.END);
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        Iterator<String> it = arrayListNames.iterator();
        while (it.hasNext()) {
            next = it.next();
            next.getClass();
            c = 2;
            switch (next) {
                case "margin":
                    float floatOrNaN = cLObject.getFloatOrNaN(next);
                    if (Float.isNaN(floatOrNaN)) {
                        break;
                    } else {
                        barrierReferenceBarrier.margin(Float.valueOf(toPix(state, floatOrNaN)));
                        break;
                    }
                case "direction":
                    String string2 = cLObject.getString(next);
                    string2.getClass();
                    switch (string2.hashCode()) {
                        case -1383228885:
                            if (string2.equals("bottom")) {
                                c = 0;
                                break;
                            } else {
                                c = 65535;
                                break;
                            }
                        case 100571:
                            if (string2.equals("end")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 115029:
                            if (!string2.equals("top")) {
                            }
                            break;
                        case 3317767:
                            if (string2.equals("left")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 108511772:
                            if (string2.equals("right")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 109757538:
                            if (string2.equals("start")) {
                                c = 5;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            barrierReferenceBarrier.setBarrierDirection(State.Direction.BOTTOM);
                            break;
                        case 1:
                            if (!zIsRtl) {
                                barrierReferenceBarrier.setBarrierDirection(State.Direction.RIGHT);
                                break;
                            } else {
                                barrierReferenceBarrier.setBarrierDirection(State.Direction.LEFT);
                                break;
                            }
                        case 2:
                            barrierReferenceBarrier.setBarrierDirection(State.Direction.TOP);
                            break;
                        case 3:
                            barrierReferenceBarrier.setBarrierDirection(State.Direction.LEFT);
                            break;
                        case 4:
                            barrierReferenceBarrier.setBarrierDirection(State.Direction.RIGHT);
                            break;
                        case 5:
                            if (!zIsRtl) {
                                barrierReferenceBarrier.setBarrierDirection(State.Direction.LEFT);
                                break;
                            } else {
                                barrierReferenceBarrier.setBarrierDirection(State.Direction.RIGHT);
                                break;
                            }
                    }
                case "contains":
                    CLArray arrayOrNull = cLObject.getArrayOrNull(next);
                    if (arrayOrNull != null) {
                        for (i = 0; i < arrayOrNull.size(); i++) {
                            barrierReferenceBarrier.add(state.constraints(arrayOrNull.get(i).content()));
                        }
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    static void parseWidget(State state, LayoutVariables layoutVariables, String str, CLObject cLObject) throws CLParsingException {
        parseWidget(state, layoutVariables, state.constraints(str), cLObject);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void applyAttribute(State state, LayoutVariables layoutVariables, ConstraintReference constraintReference, CLObject cLObject, String str) throws CLParsingException {
        char c;
        ConstraintReference constraintReferenceConstraints;
        str.getClass();
        c = 2;
        switch (str) {
            case "centerVertically":
                String string2 = cLObject.getString(str);
                boolean zEquals = string2.equals("parent");
                Object obj = string2;
                if (zEquals) {
                    obj = State.PARENT;
                }
                ConstraintReference constraintReferenceConstraints2 = state.constraints(obj);
                constraintReference.topToTop(constraintReferenceConstraints2);
                constraintReference.bottomToBottom(constraintReferenceConstraints2);
                break;
            case "center":
                String string3 = cLObject.getString(str);
                if (string3.equals("parent")) {
                    constraintReferenceConstraints = state.constraints(State.PARENT);
                } else {
                    constraintReferenceConstraints = state.constraints(string3);
                }
                constraintReference.startToStart(constraintReferenceConstraints);
                constraintReference.endToEnd(constraintReferenceConstraints);
                constraintReference.topToTop(constraintReferenceConstraints);
                constraintReference.bottomToBottom(constraintReferenceConstraints);
                break;
            case "custom":
                parseCustomProperties(cLObject, constraintReference, str);
                break;
            case "rotationX":
                constraintReference.rotationX(layoutVariables.get(cLObject.get(str)));
                break;
            case "rotationY":
                constraintReference.rotationY(layoutVariables.get(cLObject.get(str)));
                break;
            case "rotationZ":
                constraintReference.rotationZ(layoutVariables.get(cLObject.get(str)));
                break;
            case "translationX":
                constraintReference.translationX(toPix(state, layoutVariables.get(cLObject.get(str))));
                break;
            case "translationY":
                constraintReference.translationY(toPix(state, layoutVariables.get(cLObject.get(str))));
                break;
            case "translationZ":
                constraintReference.translationZ(toPix(state, layoutVariables.get(cLObject.get(str))));
                break;
            case "height":
                constraintReference.setHeight(parseDimension(cLObject, str, state, state.getDpToPixel()));
                break;
            case "motion":
                parseMotionProperties(cLObject.get(str), constraintReference);
                break;
            case "pivotX":
                constraintReference.pivotX(layoutVariables.get(cLObject.get(str)));
                break;
            case "pivotY":
                constraintReference.pivotY(layoutVariables.get(cLObject.get(str)));
                break;
            case "scaleX":
                constraintReference.scaleX(layoutVariables.get(cLObject.get(str)));
                break;
            case "scaleY":
                constraintReference.scaleY(layoutVariables.get(cLObject.get(str)));
                break;
            case "hRtlBias":
                float f = layoutVariables.get(cLObject.get(str));
                if (state.isRtl()) {
                    f = 1.0f - f;
                }
                constraintReference.horizontalBias(f);
                break;
            case "vWeight":
                constraintReference.setVerticalChainWeight(layoutVariables.get(cLObject.get(str)));
                break;
            case "alpha":
                constraintReference.alpha(layoutVariables.get(cLObject.get(str)));
                break;
            case "hBias":
                constraintReference.horizontalBias(layoutVariables.get(cLObject.get(str)));
                break;
            case "vBias":
                constraintReference.verticalBias(layoutVariables.get(cLObject.get(str)));
                break;
            case "width":
                constraintReference.setWidth(parseDimension(cLObject, str, state, state.getDpToPixel()));
                break;
            case "hWeight":
                constraintReference.setHorizontalChainWeight(layoutVariables.get(cLObject.get(str)));
                break;
            case "centerHorizontally":
                String string4 = cLObject.getString(str);
                boolean zEquals2 = string4.equals("parent");
                Object obj2 = string4;
                if (zEquals2) {
                    obj2 = State.PARENT;
                }
                ConstraintReference constraintReferenceConstraints3 = state.constraints(obj2);
                constraintReference.startToStart(constraintReferenceConstraints3);
                constraintReference.endToEnd(constraintReferenceConstraints3);
                break;
            case "visibility":
                String string5 = cLObject.getString(str);
                string5.getClass();
                switch (string5.hashCode()) {
                    case -1901805651:
                        if (!string5.equals("invisible")) {
                            c = 65535;
                            break;
                        } else {
                            c = 0;
                            break;
                        }
                    case 3178655:
                        if (string5.equals("gone")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 466743410:
                        if (!string5.equals("visible")) {
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        constraintReference.visibility(4);
                        constraintReference.alpha(0.0f);
                        break;
                    case 1:
                        constraintReference.visibility(8);
                        break;
                    case 2:
                        constraintReference.visibility(0);
                        break;
                }
            default:
                parseConstraint(state, layoutVariables, cLObject, constraintReference, str);
                break;
        }
    }

    static void parseWidget(State state, LayoutVariables layoutVariables, ConstraintReference constraintReference, CLObject cLObject) throws CLParsingException {
        if (constraintReference.getWidth() == null) {
            constraintReference.setWidth(Dimension.createWrap());
        }
        if (constraintReference.getHeight() == null) {
            constraintReference.setHeight(Dimension.createWrap());
        }
        ArrayList<String> arrayListNames = cLObject.names();
        if (arrayListNames == null) {
            return;
        }
        Iterator<String> it = arrayListNames.iterator();
        while (it.hasNext()) {
            applyAttribute(state, layoutVariables, constraintReference, cLObject, it.next());
        }
    }

    static void parseCustomProperties(CLObject cLObject, ConstraintReference constraintReference, String str) throws CLParsingException {
        ArrayList<String> arrayListNames;
        CLObject objectOrNull = cLObject.getObjectOrNull(str);
        if (objectOrNull == null || (arrayListNames = objectOrNull.names()) == null) {
            return;
        }
        Iterator<String> it = arrayListNames.iterator();
        while (it.hasNext()) {
            String next = it.next();
            CLElement cLElement = objectOrNull.get(next);
            if (cLElement instanceof CLNumber) {
                constraintReference.addCustomFloat(next, cLElement.getFloat());
            } else if (cLElement instanceof CLString) {
                long colorString = parseColorString(cLElement.content());
                if (colorString != -1) {
                    constraintReference.addCustomColor(next, (int) colorString);
                }
            }
        }
    }

    private static int indexOf(String str, String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parseMotionProperties(CLElement cLElement, ConstraintReference constraintReference) throws CLParsingException {
        String next;
        if (cLElement instanceof CLObject) {
            CLObject cLObject = (CLObject) cLElement;
            TypedBundle typedBundle = new TypedBundle();
            ArrayList<String> arrayListNames = cLObject.names();
            if (arrayListNames == null) {
                return;
            }
            Iterator<String> it = arrayListNames.iterator();
            while (it.hasNext()) {
                next = it.next();
                next.getClass();
                switch (next) {
                    case "stagger":
                        typedBundle.add(600, cLObject.getFloat(next));
                        break;
                    case "easing":
                        typedBundle.add(603, cLObject.getString(next));
                        break;
                    case "quantize":
                        CLElement cLElement2 = cLObject.get(next);
                        if (cLElement2 instanceof CLArray) {
                            CLArray cLArray = (CLArray) cLElement2;
                            int size = cLArray.size();
                            if (size <= 0) {
                                break;
                            } else {
                                typedBundle.add(610, cLArray.getInt(0));
                                if (size <= 1) {
                                    break;
                                } else {
                                    typedBundle.add(611, cLArray.getString(1));
                                    if (size <= 2) {
                                        break;
                                    } else {
                                        typedBundle.add(602, cLArray.getFloat(2));
                                        break;
                                    }
                                }
                            }
                        } else {
                            typedBundle.add(610, cLObject.getInt(next));
                            break;
                        }
                    case "pathArc":
                        String string2 = cLObject.getString(next);
                        int iIndexOf = indexOf(string2, ApiRenderablePlatforms.VERSIONS_NONE, "startVertical", "startHorizontal", "flip", "below", "above");
                        if (iIndexOf == -1) {
                            System.err.println(cLObject.getLine() + " pathArc = '" + string2 + "'");
                            break;
                        } else {
                            typedBundle.add(607, iIndexOf);
                            break;
                        }
                    case "relativeTo":
                        typedBundle.add(605, cLObject.getString(next));
                        break;
                }
            }
            constraintReference.mMotionProperties = typedBundle;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x00d4. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0131  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void parseConstraint(State state, LayoutVariables layoutVariables, CLObject cLObject, ConstraintReference constraintReference, String str) throws CLParsingException {
        ConstraintReference constraintReferenceConstraints;
        String stringOrNull;
        ConstraintReference constraintReferenceConstraints2;
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        ?? r16;
        boolean z4;
        boolean zIsRtl = state.isRtl();
        boolean z5 = !zIsRtl;
        CLArray arrayOrNull = cLObject.getArrayOrNull(str);
        if (arrayOrNull != null && arrayOrNull.size() > 1) {
            String string2 = arrayOrNull.getString(0);
            stringOrNull = arrayOrNull.getStringOrNull(1);
            float pix = arrayOrNull.size() > 2 ? toPix(state, layoutVariables.get(arrayOrNull.getOrNull(2))) : 0.0f;
            float pix2 = arrayOrNull.size() > 3 ? toPix(state, layoutVariables.get(arrayOrNull.getOrNull(3))) : 0.0f;
            if (string2.equals("parent")) {
                constraintReferenceConstraints2 = state.constraints(State.PARENT);
            } else {
                constraintReferenceConstraints2 = state.constraints(string2);
            }
            str.getClass();
            float f = pix;
            switch (str) {
                case "baseline":
                    z = true;
                    c = 2;
                    stringOrNull.getClass();
                    switch (stringOrNull) {
                        case "baseline":
                            state.baselineNeededFor(constraintReference.getKey());
                            state.baselineNeededFor(constraintReferenceConstraints2.getKey());
                            constraintReference.baselineToBaseline(constraintReferenceConstraints2);
                            break;
                        case "bottom":
                            state.baselineNeededFor(constraintReference.getKey());
                            constraintReference.baselineToBottom(constraintReferenceConstraints2);
                            break;
                        case "top":
                            state.baselineNeededFor(constraintReference.getKey());
                            constraintReference.baselineToTop(constraintReferenceConstraints2);
                            break;
                    }
                    z2 = z;
                    z3 = false;
                    break;
                case "circular":
                    z = true;
                    c = 2;
                    constraintReference.circularConstraint(constraintReferenceConstraints2, layoutVariables.get(arrayOrNull.get(1)), arrayOrNull.size() > 2 ? toPix(state, layoutVariables.get(arrayOrNull.getOrNull(2))) : 0.0f);
                    z2 = z;
                    z3 = false;
                    break;
                case "bottom":
                    stringOrNull.getClass();
                    switch (stringOrNull) {
                        case "baseline":
                            state.baselineNeededFor(constraintReferenceConstraints2.getKey());
                            constraintReference.bottomToBaseline(constraintReferenceConstraints2);
                            break;
                        case "bottom":
                            constraintReference.bottomToBottom(constraintReferenceConstraints2);
                            break;
                        case "top":
                            constraintReference.bottomToTop(constraintReferenceConstraints2);
                            break;
                    }
                    z = true;
                    c = 2;
                    z2 = z;
                    z3 = false;
                    break;
                case "end":
                    z2 = zIsRtl;
                    z = true;
                    c = 2;
                    z3 = true;
                    break;
                case "top":
                    stringOrNull.getClass();
                    switch (stringOrNull) {
                        case "baseline":
                            state.baselineNeededFor(constraintReferenceConstraints2.getKey());
                            constraintReference.topToBaseline(constraintReferenceConstraints2);
                            break;
                        case "bottom":
                            constraintReference.topToBottom(constraintReferenceConstraints2);
                            break;
                        case "top":
                            constraintReference.topToTop(constraintReferenceConstraints2);
                            break;
                    }
                    z = true;
                    c = 2;
                    z2 = z;
                    z3 = false;
                    break;
                case "left":
                    z2 = true;
                    z = true;
                    c = 2;
                    z3 = true;
                    break;
                case "right":
                    z2 = false;
                    z = true;
                    c = 2;
                    z3 = true;
                    break;
                case "start":
                    z2 = z5;
                    z = true;
                    c = 2;
                    z3 = true;
                    break;
                default:
                    z = true;
                    c = 2;
                    z2 = z;
                    z3 = false;
                    break;
            }
            if (z3) {
                stringOrNull.getClass();
                switch (stringOrNull.hashCode()) {
                    case 100571:
                        if (!stringOrNull.equals("end")) {
                            r16 = -1;
                            break;
                        } else {
                            r16 = 0;
                            break;
                        }
                    case 3317767:
                        if (stringOrNull.equals("left")) {
                            r16 = z;
                            break;
                        }
                        break;
                    case 108511772:
                        if (stringOrNull.equals("right")) {
                            r16 = c;
                            break;
                        }
                        break;
                    case 109757538:
                        if (stringOrNull.equals("start")) {
                            r16 = 3;
                            break;
                        }
                        break;
                }
                switch (r16) {
                    case 0:
                        z4 = zIsRtl;
                        break;
                    case 1:
                    default:
                        z4 = z;
                        break;
                    case 2:
                        z4 = false;
                        break;
                    case 3:
                        z4 = z5;
                        break;
                }
                if (z2) {
                    if (z4) {
                        constraintReference.leftToLeft(constraintReferenceConstraints2);
                    } else {
                        constraintReference.leftToRight(constraintReferenceConstraints2);
                    }
                } else if (z4) {
                    constraintReference.rightToLeft(constraintReferenceConstraints2);
                } else {
                    constraintReference.rightToRight(constraintReferenceConstraints2);
                }
            }
            constraintReference.margin(Float.valueOf(f)).marginGone(Float.valueOf(pix2));
        }
        String stringOrNull2 = cLObject.getStringOrNull(str);
        if (stringOrNull2 != null) {
            if (stringOrNull2.equals("parent")) {
                constraintReferenceConstraints = state.constraints(State.PARENT);
            } else {
                constraintReferenceConstraints = state.constraints(stringOrNull2);
            }
            str.getClass();
            switch (str) {
                case "baseline":
                    state.baselineNeededFor(constraintReference.getKey());
                    state.baselineNeededFor(constraintReferenceConstraints.getKey());
                    constraintReference.baselineToBaseline(constraintReferenceConstraints);
                    break;
                case "bottom":
                    constraintReference.bottomToBottom(constraintReferenceConstraints);
                    break;
                case "end":
                    if (!zIsRtl) {
                        constraintReference.rightToRight(constraintReferenceConstraints);
                        break;
                    } else {
                        constraintReference.leftToLeft(constraintReferenceConstraints);
                        break;
                    }
                case "top":
                    constraintReference.topToTop(constraintReferenceConstraints);
                    break;
                case "start":
                    if (!zIsRtl) {
                        constraintReference.leftToLeft(constraintReferenceConstraints);
                        break;
                    } else {
                        constraintReference.rightToRight(constraintReferenceConstraints);
                        break;
                    }
            }
        }
    }

    static Dimension parseDimensionMode(String str) {
        Dimension dimensionCreateFixed;
        dimensionCreateFixed = Dimension.createFixed(0);
        str.getClass();
        switch (str) {
            case "preferWrap":
                return Dimension.createSuggested(Dimension.WRAP_DIMENSION);
            case "parent":
                return Dimension.createParent();
            case "spread":
                return Dimension.createSuggested(Dimension.SPREAD_DIMENSION);
            case "wrap":
                return Dimension.createWrap();
            default:
                if (str.endsWith("%")) {
                    return Dimension.createPercent(0, Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f).suggested(0);
                }
                return str.contains(":") ? Dimension.createRatio(str).suggested(Dimension.SPREAD_DIMENSION) : dimensionCreateFixed;
        }
    }

    static Dimension parseDimension(CLObject cLObject, String str, State state, CorePixelDp corePixelDp) throws CLParsingException {
        CLElement cLElement = cLObject.get(str);
        Dimension dimensionCreateFixed = Dimension.createFixed(0);
        if (cLElement instanceof CLString) {
            return parseDimensionMode(cLElement.content());
        }
        if (cLElement instanceof CLNumber) {
            return Dimension.createFixed(state.convertDimension(Float.valueOf(corePixelDp.toPixels(cLObject.getFloat(str)))));
        }
        if (cLElement instanceof CLObject) {
            CLObject cLObject2 = (CLObject) cLElement;
            String stringOrNull = cLObject2.getStringOrNull("value");
            if (stringOrNull != null) {
                dimensionCreateFixed = parseDimensionMode(stringOrNull);
            }
            CLElement orNull = cLObject2.getOrNull("min");
            if (orNull != null) {
                if (orNull instanceof CLNumber) {
                    dimensionCreateFixed.min(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull).getFloat()))));
                } else if (orNull instanceof CLString) {
                    dimensionCreateFixed.min(Dimension.WRAP_DIMENSION);
                }
            }
            CLElement orNull2 = cLObject2.getOrNull(AnalyticsStrings.MAX_WELCOME_TAG);
            if (orNull2 != null) {
                if (orNull2 instanceof CLNumber) {
                    dimensionCreateFixed.max(state.convertDimension(Float.valueOf(corePixelDp.toPixels(((CLNumber) orNull2).getFloat()))));
                    return dimensionCreateFixed;
                }
                if (orNull2 instanceof CLString) {
                    dimensionCreateFixed.max(Dimension.WRAP_DIMENSION);
                }
            }
        }
        return dimensionCreateFixed;
    }

    static long parseColorString(String str) {
        if (!str.startsWith("#")) {
            return -1L;
        }
        String strSubstring = str.substring(1);
        if (strSubstring.length() == 6) {
            strSubstring = "FF" + strSubstring;
        }
        return Long.parseLong(strSubstring, 16);
    }

    static String lookForType(CLObject cLObject) throws CLParsingException {
        Iterator<String> it = cLObject.names().iterator();
        while (it.hasNext()) {
            if (it.next().equals("type")) {
                return cLObject.getString("type");
            }
        }
        return null;
    }
}
