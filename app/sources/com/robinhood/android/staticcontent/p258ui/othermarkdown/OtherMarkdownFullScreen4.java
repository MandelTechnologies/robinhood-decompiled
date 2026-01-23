package com.robinhood.android.staticcontent.p258ui.othermarkdown;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.staticcontent.p258ui.othermarkdown.OtherMarkdownStateProvider3;
import com.robinhood.shared.common.contracts.OtherMarkdownFragmentKey;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: OtherMarkdownFullScreen.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/staticcontent/ui/othermarkdown/ViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/PreviewState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "readyViewState", "Lcom/robinhood/android/staticcontent/ui/othermarkdown/OtherMarkdownViewState$Ready;", "loremIpsum", "", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.staticcontent.ui.othermarkdown.ViewStateParameterProvider, reason: use source file name */
/* loaded from: classes5.dex */
final class OtherMarkdownFullScreen4 implements PreviewParameterProvider<PreviewState> {
    private final Sequence<PreviewState> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public OtherMarkdownFullScreen4() {
        OtherMarkdownStateProvider3.Loading loading = OtherMarkdownStateProvider3.Loading.INSTANCE;
        this.values = SequencesKt.sequenceOf(new PreviewState(loading, null, null, 6, null), new PreviewState(loading, "Different title", new OtherMarkdownFragmentKey.PrimaryButton("Take control!", "https://127.0.0.1/nowhere")), new PreviewState(OtherMarkdownStateProvider3.Error.INSTANCE, null, null, 6, null), new PreviewState(readyViewState(), null, null, 6, null), new PreviewState(readyViewState(), "Different title", new OtherMarkdownFragmentKey.PrimaryButton("Take control!", "https://127.0.0.1/nowhere")));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<PreviewState> getValues() {
        return this.values;
    }

    private final OtherMarkdownStateProvider3.Ready readyViewState() {
        return new OtherMarkdownStateProvider3.Ready("Hello world", loremIpsum());
    }

    private final String loremIpsum() {
        return CollectionsKt.joinToString$default(RangesKt.until(0, 100), PlaceholderUtils.XXShortPlaceholderText, null, null, 0, null, new Function1() { // from class: com.robinhood.android.staticcontent.ui.othermarkdown.ViewStateParameterProvider$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OtherMarkdownFullScreen4.loremIpsum$lambda$0(((Integer) obj).intValue());
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence loremIpsum$lambda$0(int i) {
        return "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
    }
}
