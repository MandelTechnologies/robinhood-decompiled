package com.robinhood.android.equityscreener.table.data;

import com.robinhood.android.equityscreener.C15652R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RowClasses.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/table/data/DisclosureRow;", "Lcom/robinhood/android/equityscreener/table/data/LocalRow;", "contentfulId", "", "previewRes", "Lcom/robinhood/utils/resource/StringResource;", "linkText", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;)V", "getContentfulId", "()Ljava/lang/String;", "getPreviewRes", "()Lcom/robinhood/utils/resource/StringResource;", "getLinkText", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.table.data.DisclosureRow, reason: use source file name */
/* loaded from: classes3.dex */
public final class RowClasses implements RowClasses2 {
    public static final int $stable = StringResource.$stable;
    private final String contentfulId;
    private final StringResource linkText;
    private final StringResource previewRes;

    public RowClasses(String contentfulId, StringResource previewRes, StringResource linkText) {
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        Intrinsics.checkNotNullParameter(previewRes, "previewRes");
        Intrinsics.checkNotNullParameter(linkText, "linkText");
        this.contentfulId = contentfulId;
        this.previewRes = previewRes;
        this.linkText = linkText;
    }

    public final String getContentfulId() {
        return this.contentfulId;
    }

    public /* synthetic */ RowClasses(String str, StringResource stringResource, StringResource stringResource2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? StringResource.INSTANCE.invoke(C15652R.string.disclosure_preview, new Object[0]) : stringResource, (i & 4) != 0 ? StringResource.INSTANCE.invoke(C15652R.string.disclosure_read_more, new Object[0]) : stringResource2);
    }

    public final StringResource getPreviewRes() {
        return this.previewRes;
    }

    public final StringResource getLinkText() {
        return this.linkText;
    }
}
