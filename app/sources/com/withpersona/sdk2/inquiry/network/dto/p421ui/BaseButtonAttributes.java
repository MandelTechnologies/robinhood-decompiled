package com.withpersona.sdk2.inquiry.network.dto.p421ui;

import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Button;
import kotlin.Metadata;

/* compiled from: BaseButtonAttributes.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", "text", "", "getText", "()Ljava/lang/String;", "buttonType", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "getButtonType", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "autoSubmitCountdownText", "getAutoSubmitCountdownText", "autoSubmitIntervalSeconds", "", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "getDisabled", "network-inquiry_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public interface BaseButtonAttributes extends UiComponentAttributes {
    String getAutoSubmitCountdownText();

    Integer getAutoSubmitIntervalSeconds();

    Button.ButtonType getButtonType();

    JsonLogicBoolean getDisabled();

    JsonLogicBoolean getHidden();

    String getText();
}
