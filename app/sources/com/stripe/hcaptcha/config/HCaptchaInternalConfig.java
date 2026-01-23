package com.stripe.hcaptcha.config;

import com.stripe.hcaptcha.HCaptchaHtml;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HCaptchaInternalConfig.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m3636d2 = {"Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;", "Ljava/io/Serializable;", "Lkotlin/Function0;", "", "htmlProvider", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/jvm/functions/Function0;", "getHtmlProvider", "()Lkotlin/jvm/functions/Function0;", "Companion", "hcaptcha_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class HCaptchaInternalConfig implements Serializable {
    private final Function0<String> htmlProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public HCaptchaInternalConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HCaptchaInternalConfig) && Intrinsics.areEqual(this.htmlProvider, ((HCaptchaInternalConfig) other).htmlProvider);
    }

    public int hashCode() {
        return this.htmlProvider.hashCode();
    }

    public String toString() {
        return "HCaptchaInternalConfig(htmlProvider=" + this.htmlProvider + ")";
    }

    public HCaptchaInternalConfig(Function0<String> htmlProvider) {
        Intrinsics.checkNotNullParameter(htmlProvider, "htmlProvider");
        this.htmlProvider = htmlProvider;
    }

    public /* synthetic */ HCaptchaInternalConfig(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HCaptchaHtml.getHCAPTCHA_WEBVIEW_HTML_PROVIDER() : function0);
    }

    public final Function0<String> getHtmlProvider() {
        return this.htmlProvider;
    }
}
