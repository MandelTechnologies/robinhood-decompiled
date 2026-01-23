package com.withpersona.sdk2.inquiry.steps.p423ui.styling.remoteFonts;

import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import kotlin.Metadata;

/* compiled from: RemoteFont.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/styling/remoteFonts/RemoteFont;", "", "fontFamilyName", "", "url", "fontWeight", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;)V", "getFontFamilyName", "()Ljava/lang/String;", "getUrl", "getFontWeight", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class RemoteFont {
    private final String fontFamilyName;
    private final StyleElements.FontWeight fontWeight;
    private final String url;

    public RemoteFont(String str, String str2, StyleElements.FontWeight fontWeight) {
        this.fontFamilyName = str;
        this.url = str2;
        this.fontWeight = fontWeight;
    }

    public final String getFontFamilyName() {
        return this.fontFamilyName;
    }

    public final String getUrl() {
        return this.url;
    }

    public final StyleElements.FontWeight getFontWeight() {
        return this.fontWeight;
    }
}
