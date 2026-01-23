package com.withpersona.sdk2.inquiry.document;

import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling3;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling4;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.ButtonComponentStyling8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Conversions.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"to", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCombinedStepComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonCancelComponentStyle;", "document_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.document.ConversionsKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class Conversions2 {
    /* renamed from: to */
    public static final ButtonComponentStyling4 m3213to(ButtonComponentStyling8 buttonComponentStyling8) {
        Intrinsics.checkNotNullParameter(buttonComponentStyling8, "<this>");
        return new ButtonComponentStyling4(buttonComponentStyling8.getPadding(), buttonComponentStyling8.getMargin(), buttonComponentStyling8.getJustify(), buttonComponentStyling8.getFontFamily(), buttonComponentStyling8.getFontSize(), buttonComponentStyling8.getFontWeight(), buttonComponentStyling8.getLetterSpacing(), buttonComponentStyling8.getLineHeight(), buttonComponentStyling8.getTextColor(), buttonComponentStyling8.getHeight(), buttonComponentStyling8.getWidth(), buttonComponentStyling8.getBackgroundColor(), buttonComponentStyling8.getBorderColor(), buttonComponentStyling8.getBorderRadius(), buttonComponentStyling8.getBorderWidth());
    }

    /* renamed from: to */
    public static final ButtonComponentStyling4 m3212to(ButtonComponentStyling3 buttonComponentStyling3) {
        Intrinsics.checkNotNullParameter(buttonComponentStyling3, "<this>");
        return new ButtonComponentStyling4(buttonComponentStyling3.getPadding(), buttonComponentStyling3.getMargin(), buttonComponentStyling3.getJustify(), buttonComponentStyling3.getFontFamily(), buttonComponentStyling3.getFontSize(), buttonComponentStyling3.getFontWeight(), buttonComponentStyling3.getLetterSpacing(), buttonComponentStyling3.getLineHeight(), buttonComponentStyling3.getTextColor(), buttonComponentStyling3.getHeight(), buttonComponentStyling3.getWidth(), buttonComponentStyling3.getBackgroundColor(), buttonComponentStyling3.getBorderColor(), buttonComponentStyling3.getBorderRadius(), buttonComponentStyling3.getBorderWidth());
    }
}
