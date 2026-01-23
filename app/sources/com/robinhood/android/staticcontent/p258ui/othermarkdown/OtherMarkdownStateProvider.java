package com.robinhood.android.staticcontent.p258ui.othermarkdown;

import com.robinhood.android.staticcontent.p258ui.othermarkdown.OtherMarkdownStateProvider3;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtherMarkdownStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownDataState;", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownViewState;", "<init>", "()V", "reduce", "dataState", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class OtherMarkdownStateProvider implements StateProvider<OtherMarkdownDataState, OtherMarkdownStateProvider3> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public OtherMarkdownStateProvider3 reduce(OtherMarkdownDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getOtherMarkdown() == null) {
            if (dataState.getRequestComplete()) {
                return OtherMarkdownStateProvider3.Error.INSTANCE;
            }
            return OtherMarkdownStateProvider3.Loading.INSTANCE;
        }
        return new OtherMarkdownStateProvider3.Ready(dataState.getOtherMarkdown().getTitle(), dataState.getOtherMarkdown().getMarkdown2());
    }
}
