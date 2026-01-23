package com.robinhood.android.signature;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SimpleSvgBuilder.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\rJ)\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0019\"\u00020\rH\u0002¢\u0006\u0002\u0010\u001aR\u0012\u0010\t\u001a\u00060\nj\u0002`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/signature/SimpleSvgBuilder;", "", "viewBoxWidth", "", "viewBoxHeight", "svgWidth", "svgHeight", "<init>", "(IIII)V", "stringBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "stroke", "", "strokeWidth", "fill", "moveTo", "x", "", "y", "lineTo", "buildSvg", "createAttribute", "field", "values", "", "(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "lib-signature_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SimpleSvgBuilder {
    private final String fill;
    private final StringBuilder stringBuilder;
    private final String stroke;
    private final String strokeWidth;

    public SimpleSvgBuilder(int i, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        this.stringBuilder = sb;
        this.stroke = createAttribute("stroke", "#000000");
        this.strokeWidth = createAttribute("stroke-width", "10");
        this.fill = createAttribute("fill", ApiRenderablePlatforms.VERSIONS_NONE);
        sb.append("<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" " + createAttribute("viewBox", "0", "0", String.valueOf(i), String.valueOf(i2)) + PlaceholderUtils.XXShortPlaceholderText + createAttribute("width", String.valueOf(i3)) + PlaceholderUtils.XXShortPlaceholderText + createAttribute("height", String.valueOf(i4)) + PlaceholderUtils.XXShortPlaceholderText + createAttribute("preserveAspectRatio", "xMinYMid meet") + "><path d=\"");
    }

    public final SimpleSvgBuilder moveTo(float x, float y) {
        this.stringBuilder.append("M" + x + "," + y + PlaceholderUtils.XXShortPlaceholderText);
        return this;
    }

    public final SimpleSvgBuilder lineTo(float x, float y) {
        this.stringBuilder.append("L" + x + "," + y + PlaceholderUtils.XXShortPlaceholderText);
        return this;
    }

    public final String buildSvg() {
        StringBuilder sb = this.stringBuilder;
        return ((Object) sb) + "\" " + this.stroke + PlaceholderUtils.XXShortPlaceholderText + this.strokeWidth + PlaceholderUtils.XXShortPlaceholderText + this.fill + "/></svg>";
    }

    private final String createAttribute(String field, String... values) {
        StringBuilder sb = new StringBuilder();
        sb.append(field + "=\"");
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            sb.append(values[i]);
            if (i2 != ArraysKt.getLastIndex(values)) {
                sb.append(PlaceholderUtils.XXShortPlaceholderText);
            }
            i++;
            i2 = i3;
        }
        sb.append("\"");
        return sb.toString();
    }
}
