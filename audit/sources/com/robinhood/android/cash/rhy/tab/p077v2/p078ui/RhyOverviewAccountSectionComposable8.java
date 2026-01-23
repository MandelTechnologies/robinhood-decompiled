package com.robinhood.android.cash.rhy.tab.p077v2.p078ui;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: RhyOverviewAccountSectionComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/RhyOverviewAccountSectionPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/RhyOverviewAccountSectionPreview;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.RhyOverviewAccountSectionPreviewParameterProvider, reason: use source file name */
/* loaded from: classes7.dex */
final class RhyOverviewAccountSectionComposable8 implements PreviewParameterProvider<RhyOverviewAccountSectionComposable7> {
    private final Sequence<RhyOverviewAccountSectionComposable7> values = SequencesKt.sequenceOf(new RhyOverviewAccountSectionComposable7(true), new RhyOverviewAccountSectionComposable7(false));

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<RhyOverviewAccountSectionComposable7> getValues() {
        return this.values;
    }
}
