package com.robinhood.android.lib.webview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.view.ErrorView;
import com.robinhood.android.lib.webview.C20684R;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WebErrorView.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/view/WebErrorView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "errorView", "Lcom/robinhood/android/common/view/ErrorView;", "setErrorType", "", "type", "Lcom/robinhood/android/lib/webview/view/WebErrorView$ErrorViewType;", "onRetry", "Lkotlin/Function0;", "ErrorViewType", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class WebErrorView extends FrameLayout {
    private final ErrorView errorView;

    /* compiled from: WebErrorView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorViewType.values().length];
            try {
                iArr[ErrorViewType.RETRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ErrorViewType.ROUTE_TO_EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C20684R.layout.merge_web_error_view, true);
        View viewFindViewById = findViewById(C20684R.id.error_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.errorView = (ErrorView) viewFindViewById;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WebErrorView.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/webview/view/WebErrorView$ErrorViewType;", "", "<init>", "(Ljava/lang/String;I)V", "RETRY", "ROUTE_TO_EMAIL", "lib-webview_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ErrorViewType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorViewType[] $VALUES;
        public static final ErrorViewType RETRY = new ErrorViewType("RETRY", 0);
        public static final ErrorViewType ROUTE_TO_EMAIL = new ErrorViewType("ROUTE_TO_EMAIL", 1);

        private static final /* synthetic */ ErrorViewType[] $values() {
            return new ErrorViewType[]{RETRY, ROUTE_TO_EMAIL};
        }

        public static EnumEntries<ErrorViewType> getEntries() {
            return $ENTRIES;
        }

        private ErrorViewType(String str, int i) {
        }

        static {
            ErrorViewType[] errorViewTypeArr$values = $values();
            $VALUES = errorViewTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(errorViewTypeArr$values);
        }

        public static ErrorViewType valueOf(String str) {
            return (ErrorViewType) Enum.valueOf(ErrorViewType.class, str);
        }

        public static ErrorViewType[] values() {
            return (ErrorViewType[]) $VALUES.clone();
        }
    }

    public final void setErrorType(ErrorViewType type2, Function0<Unit> onRetry) {
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(onRetry, "onRetry");
        this.errorView.setOnPrimaryButtonClick(onRetry);
        int i = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
        if (i == 1) {
            this.errorView.setTitle(ViewsKt.getString(this, C20684R.string.web_error_header_connection));
            this.errorView.setDescription(ViewsKt.getString(this, C20684R.string.web_error_description_connection));
            this.errorView.setPrimaryButtonText(ViewsKt.getString(this, C11048R.string.error_try_again));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.errorView.setTitle(ViewsKt.getString(this, C20684R.string.web_error_header_generic));
            this.errorView.setDescription(ViewsKt.getString(this, C20684R.string.web_error_description_email));
            this.errorView.setPrimaryButtonText(ViewsKt.getString(this, C20684R.string.web_error_cta_got_it));
        }
    }
}
