package com.withpersona.sdk2.inquiry;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InquiryBuilder.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u00020\u00002\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u0012\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rJ\u0006\u0010\u0014\u001a\u00020\u0015R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "", "<init>", "()V", "inquiryId", "", "oneTimeLinkCode", "theme", "", "Ljava/lang/Integer;", "themeSetId", "sessionToken", "useServerStyles", "", "Ljava/lang/Boolean;", "locale", "consumeExceptions", "themeSource", "Lcom/withpersona/sdk2/inquiry/ThemeSource;", "routingCountry", "build", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "Companion", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class InquiryBuilder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Boolean consumeExceptions;
    private String inquiryId;
    private String locale;
    private String oneTimeLinkCode;
    private String sessionToken;
    private Integer theme;
    private String themeSetId;
    private Boolean useServerStyles;

    @Deprecated
    public final InquiryBuilder routingCountry(String routingCountry) {
        return this;
    }

    /* compiled from: InquiryBuilder.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/InquiryBuilder$Companion;", "", "<init>", "()V", "fromInquiryId", "Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "inquiryId", "", "fromInquiryId$inquiry_dynamic_feature_release", "fromOneTimeLinkCode", "code", "fromOneTimeLinkCode$inquiry_dynamic_feature_release", "inquiry-dynamic-feature_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InquiryBuilder fromInquiryId$inquiry_dynamic_feature_release(String inquiryId) {
            Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
            InquiryBuilder inquiryBuilder = new InquiryBuilder();
            inquiryBuilder.inquiryId = inquiryId;
            return inquiryBuilder;
        }

        public final InquiryBuilder fromOneTimeLinkCode$inquiry_dynamic_feature_release(String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            InquiryBuilder inquiryBuilder = new InquiryBuilder();
            inquiryBuilder.oneTimeLinkCode = code;
            return inquiryBuilder;
        }
    }

    @Deprecated
    public final InquiryBuilder theme(int theme) {
        this.theme = Integer.valueOf(theme);
        this.useServerStyles = Boolean.FALSE;
        return this;
    }

    public final InquiryBuilder theme(ThemeSource themeSource) {
        Intrinsics.checkNotNullParameter(themeSource, "themeSource");
        this.theme = themeSource.getTheme();
        this.useServerStyles = Boolean.valueOf(themeSource instanceof ThemeSource3);
        return this;
    }

    @ExperimentalThemeSetId
    public final InquiryBuilder themeSetId(String themeSetId) {
        Intrinsics.checkNotNullParameter(themeSetId, "themeSetId");
        this.themeSetId = themeSetId;
        return this;
    }

    public final InquiryBuilder sessionToken(String sessionToken) {
        if (sessionToken != null && sessionToken.length() != 0) {
            this.sessionToken = sessionToken;
        }
        return this;
    }

    public final InquiryBuilder locale(String locale) {
        this.locale = locale;
        return this;
    }

    public final InquiryBuilder consumeExceptions(boolean consumeExceptions) {
        this.consumeExceptions = Boolean.valueOf(consumeExceptions);
        return this;
    }

    public final Inquiry build() {
        String str = this.inquiryId;
        String str2 = this.oneTimeLinkCode;
        return new Inquiry(null, null, str, this.sessionToken, str2, null, null, null, this.theme, null, null, null, null, (str == null || !StringsKt.startsWith$default(str, "iqfs", false, 2, (Object) null)) ? FallbackMode.NEVER : FallbackMode.ALWAYS, this.useServerStyles, null, this.themeSetId, this.locale, this.consumeExceptions);
    }
}
