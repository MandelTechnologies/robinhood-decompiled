package androidx.compose.p011ui.text;

import androidx.compose.p011ui.text.style.TextOverflow;
import kotlin.Metadata;

/* compiled from: TextMeasurer.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m3636d2 = {"Landroidx/compose/ui/text/style/TextOverflow;", "", "isEllipsis-MW5-ApA", "(I)Z", "isEllipsis", "ui-text_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: androidx.compose.ui.text.TextMeasurerKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class TextMeasurer4 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isEllipsis-MW5-ApA, reason: not valid java name */
    public static final boolean m7628isEllipsisMW5ApA(int i) {
        TextOverflow.Companion companion = TextOverflow.INSTANCE;
        return TextOverflow.m7955equalsimpl0(i, companion.m7959getEllipsisgIe3tQ8()) || TextOverflow.m7955equalsimpl0(i, companion.m7961getStartEllipsisgIe3tQ8()) || TextOverflow.m7955equalsimpl0(i, companion.m7960getMiddleEllipsisgIe3tQ8());
    }
}
