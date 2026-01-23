package com.stripe.android.core.exception;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: APIConnectionException.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0003H\u0017¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/core/exception/APIConnectionException;", "Lcom/stripe/android/core/exception/StripeException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "analyticsValue", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class APIConnectionException extends StripeException {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public APIConnectionException(String str, Throwable th) {
        super(null, null, 0, th, str, 7, null);
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String analyticsValue() {
        return "connectionError";
    }

    /* compiled from: APIConnectionException.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, m3636d2 = {"Lcom/stripe/android/core/exception/APIConnectionException$Companion;", "", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/stripe/android/core/exception/APIConnectionException;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Ljava/io/IOException;", "url", "", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ APIConnectionException create$default(Companion companion, IOException iOException, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.create(iOException, str);
        }

        public final /* synthetic */ APIConnectionException create(IOException e, String url) {
            Intrinsics.checkNotNullParameter(e, "e");
            String str = "(" + url + ")";
            if (url == null || StringsKt.isBlank(url)) {
                str = null;
            }
            return new APIConnectionException("IOException during API request to " + CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{"Stripe", str}), PlaceholderUtils.XXShortPlaceholderText, null, null, 0, null, null, 62, null) + ": " + e.getMessage() + ". Please check your internet connection and try again. If this problem persists, you should check Stripe's service status at https://twitter.com/stripestatus, or let us know at support@stripe.com.", e);
        }
    }
}
