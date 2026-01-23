package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.singular.sdk.internal.Constants;
import java.io.IOException;

/* loaded from: classes.dex */
class ContentModelParser {
    private static final JsonReader.Options NAMES = JsonReader.Options.m768of("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static ContentModel parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        ContentModel contentModel;
        String strNextString;
        jsonReader.beginObject();
        char c = 2;
        int iNextInt = 2;
        while (true) {
            contentModel = null;
            if (!jsonReader.hasNext()) {
                strNextString = null;
                break;
            }
            int iSelectName = jsonReader.selectName(NAMES);
            if (iSelectName == 0) {
                strNextString = jsonReader.nextString();
                break;
            }
            if (iSelectName == 1) {
                iNextInt = jsonReader.nextInt();
            } else {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        if (strNextString == null) {
            return null;
        }
        switch (strNextString.hashCode()) {
            case 3239:
                if (!strNextString.equals("el")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case 3270:
                if (strNextString.equals("fl")) {
                    c = 1;
                    break;
                }
                break;
            case 3295:
                if (!strNextString.equals("gf")) {
                }
                break;
            case 3307:
                if (strNextString.equals("gr")) {
                    c = 3;
                    break;
                }
                break;
            case 3308:
                if (strNextString.equals("gs")) {
                    c = 4;
                    break;
                }
                break;
            case 3488:
                if (strNextString.equals("mm")) {
                    c = 5;
                    break;
                }
                break;
            case 3633:
                if (strNextString.equals(Constants.RETRY_COUNT)) {
                    c = 6;
                    break;
                }
                break;
            case 3634:
                if (strNextString.equals("rd")) {
                    c = 7;
                    break;
                }
                break;
            case 3646:
                if (strNextString.equals("rp")) {
                    c = '\b';
                    break;
                }
                break;
            case 3669:
                if (strNextString.equals("sh")) {
                    c = '\t';
                    break;
                }
                break;
            case 3679:
                if (strNextString.equals("sr")) {
                    c = '\n';
                    break;
                }
                break;
            case 3681:
                if (strNextString.equals("st")) {
                    c = 11;
                    break;
                }
                break;
            case 3705:
                if (strNextString.equals("tm")) {
                    c = '\f';
                    break;
                }
                break;
            case 3710:
                if (strNextString.equals("tr")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                contentModel = CircleShapeParser.parse(jsonReader, lottieComposition, iNextInt);
                break;
            case 1:
                contentModel = ShapeFillParser.parse(jsonReader, lottieComposition);
                break;
            case 2:
                contentModel = GradientFillParser.parse(jsonReader, lottieComposition);
                break;
            case 3:
                contentModel = ShapeGroupParser.parse(jsonReader, lottieComposition);
                break;
            case 4:
                contentModel = GradientStrokeParser.parse(jsonReader, lottieComposition);
                break;
            case 5:
                contentModel = MergePathsParser.parse(jsonReader);
                lottieComposition.addWarning("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                contentModel = RectangleShapeParser.parse(jsonReader, lottieComposition);
                break;
            case 7:
                contentModel = RoundedCornersParser.parse(jsonReader, lottieComposition);
                break;
            case '\b':
                contentModel = RepeaterParser.parse(jsonReader, lottieComposition);
                break;
            case '\t':
                contentModel = ShapePathParser.parse(jsonReader, lottieComposition);
                break;
            case '\n':
                contentModel = PolystarShapeParser.parse(jsonReader, lottieComposition, iNextInt);
                break;
            case 11:
                contentModel = ShapeStrokeParser.parse(jsonReader, lottieComposition);
                break;
            case '\f':
                contentModel = ShapeTrimPathParser.parse(jsonReader, lottieComposition);
                break;
            case '\r':
                contentModel = AnimatableTransformParser.parse(jsonReader, lottieComposition);
                break;
            default:
                Logger.warning("Unknown shape type " + strNextString);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return contentModel;
    }
}
