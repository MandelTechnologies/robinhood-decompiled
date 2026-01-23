package com.robinhood.compose.theme.style;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadingPlaceholderStyle.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/compose/theme/style/LoadingPlaceholderStyle;", "", "headerTextStyle", "Landroidx/compose/ui/text/TextStyle;", "<init>", "(Landroidx/compose/ui/text/TextStyle;)V", "getHeaderTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LoadingPlaceholderStyle {
    public static final int $stable = 0;
    private final androidx.compose.p011ui.text.TextStyle headerTextStyle;

    public static /* synthetic */ LoadingPlaceholderStyle copy$default(LoadingPlaceholderStyle loadingPlaceholderStyle, androidx.compose.p011ui.text.TextStyle textStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            textStyle = loadingPlaceholderStyle.headerTextStyle;
        }
        return loadingPlaceholderStyle.copy(textStyle);
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.compose.p011ui.text.TextStyle getHeaderTextStyle() {
        return this.headerTextStyle;
    }

    public final LoadingPlaceholderStyle copy(androidx.compose.p011ui.text.TextStyle headerTextStyle) {
        Intrinsics.checkNotNullParameter(headerTextStyle, "headerTextStyle");
        return new LoadingPlaceholderStyle(headerTextStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof LoadingPlaceholderStyle) && Intrinsics.areEqual(this.headerTextStyle, ((LoadingPlaceholderStyle) other).headerTextStyle);
    }

    public int hashCode() {
        return this.headerTextStyle.hashCode();
    }

    public String toString() {
        return "LoadingPlaceholderStyle(headerTextStyle=" + this.headerTextStyle + ")";
    }

    public LoadingPlaceholderStyle(androidx.compose.p011ui.text.TextStyle headerTextStyle) {
        Intrinsics.checkNotNullParameter(headerTextStyle, "headerTextStyle");
        this.headerTextStyle = headerTextStyle;
    }

    public final androidx.compose.p011ui.text.TextStyle getHeaderTextStyle() {
        return this.headerTextStyle;
    }
}
